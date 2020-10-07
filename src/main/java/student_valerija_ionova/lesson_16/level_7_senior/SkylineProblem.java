package student_valerija_ionova.lesson_16.level_7_senior;

import java.util.ArrayList;
import java.util.List;

class SkylineProblem implements SilhouetteOfSkylines{

    private int [][] skylineCoordinates;
    private List <InputCoordinates> skylineCoordinatesList = new ArrayList<>();
    private int xRight;
    private int currentXCoordinates;
    private int maxHeight;
    private List <ResultCoordinates> resultCoordinates = new ArrayList<>();


    SkylineProblem (int [][] skylineCoordinates){
        this.skylineCoordinates = skylineCoordinates;
        createSkylineCoordinatesList();
        xRight = skylineCoordinates[0][1];
        currentXCoordinates = skylineCoordinates[0][0];
        maxHeight = skylineCoordinates[0][2];
        createListOfResultCoordinates();
    }

    @Override
    public List <ResultCoordinates> getSilhouetteOfSkylines (){
        int lastCoordinate = lastCoordinate();
        InputCoordinates currentInformation = new InputCoordinates(currentXCoordinates, xRight, maxHeight);
        do{
            currentXCoordinates++;
            ifNecessaryUpdateResultCoordinatesListForCurrentX(currentInformation);
        }while (currentXCoordinates < lastCoordinate);
        return resultCoordinates;
    }

    private void ifNecessaryUpdateResultCoordinatesListForCurrentX (InputCoordinates currentInformation){
        boolean updatedResultCoordinates = false;
        currentInformation = updateCurrentInformationIfHighestSkylineEnds(currentInformation);
        int numberOfSkyline = 0;
        while(numberOfSkyline < skylineCoordinatesList.size()){
            if (skylineContainsCurrentXCoordinates(numberOfSkyline) && currentSkylineIsHigher(numberOfSkyline, currentInformation.getHeight())){
                updateXRightIfNecessary(numberOfSkyline);
                currentInformation.update(currentXCoordinates, skylineCoordinatesList.get(numberOfSkyline).getXRight(),
                            skylineCoordinatesList.get(numberOfSkyline).getHeight());
                updatedResultCoordinates = true;
            }else if(noSkylinesOnHorizon()){
                currentInformation.update(currentXCoordinates, currentXCoordinates, 0);
                updatedResultCoordinates = true;
            }
            numberOfSkyline++;
        }
        updateResultCoordinatesIfNewElementCreated(updatedResultCoordinates, currentInformation);
    }

    private void updateResultCoordinatesIfNewElementCreated(boolean updatedResultCoordinates,
                                                                                InputCoordinates currentInformation){
        if (updatedResultCoordinates && newSkylinesHeightIsDifferent(currentInformation.getHeight(),
                heightOfLastElement())) {
            resultCoordinates.add(new ResultCoordinates(currentInformation.getXLeft(), currentInformation.getHeight()));
        }
    }

    private int heightOfLastElement (){
        return resultCoordinates.get(resultCoordinates.size()-1).getH();
    }

    private boolean newSkylinesHeightIsDifferent(int newSkylineHeight, int lastSkyLineHeight){
        return newSkylineHeight != lastSkyLineHeight;
    }

    private void updateXRightIfNecessary (int numberOfSkyline){
        if (currentSkylineXRightIsBigger(skylineCoordinatesList.get(numberOfSkyline).getXRight())){
            xRight = skylineCoordinatesList.get(numberOfSkyline).getXRight();
        }
    }

    private InputCoordinates updateCurrentInformationIfHighestSkylineEnds (InputCoordinates currentInformation){
        if (currentXCoordinates >= currentInformation.getXRight()){
            currentInformation.update(currentXCoordinates, currentXCoordinates, 0);
        }
        return currentInformation;
    }

    private void createListOfResultCoordinates (){
        resultCoordinates.add(new ResultCoordinates(currentXCoordinates, maxHeight));
    }

    private boolean noSkylinesOnHorizon (){
        return (currentXCoordinates == xRight);
    }

    private boolean currentSkylineXRightIsBigger(int currentSkylineXCoordinate){
        return currentSkylineXCoordinate > xRight;
    }

    private boolean currentSkylineIsHigher (int numberOfSkyline, int currentSkylineHeight){
        return skylineCoordinatesList.get(numberOfSkyline).getHeight() > currentSkylineHeight;
    }

    private boolean skylineContainsCurrentXCoordinates(int numberOfSkyline){
        return ((skylineCoordinatesList.get(numberOfSkyline).getXLeft() <= currentXCoordinates) &&
                (skylineCoordinatesList.get(numberOfSkyline).getXRight() > currentXCoordinates ));
    }

    private int lastCoordinate (){
        int max = 0;
        for (InputCoordinates inputCoordinates: skylineCoordinatesList){
            if (inputCoordinates.getXRight() > max){
                max = inputCoordinates.getXRight();
            }
        }
        return max;
    }

    private void createSkylineCoordinatesList(){
        for (int i = 0; i < skylineCoordinates.length; i++){
            skylineCoordinatesList.add(new InputCoordinates(skylineCoordinates[i][0], skylineCoordinates[i][1],
                    skylineCoordinates[i][2]));
        }
    }
}