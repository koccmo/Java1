package student_valerija_ionova.lesson_16.level_7_senior;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
        resultCoordinates.add(new ResultCoordinates(currentXCoordinates, maxHeight));
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
        updateResultCoordinatesIfNewElementCreatedAndHeightDifferent(updatedResultCoordinates, currentInformation);
    }

    private void updateResultCoordinatesIfNewElementCreatedAndHeightDifferent(boolean updatedResultCoordinates,
                                                                                InputCoordinates currentInformation){
        if (updatedResultCoordinates && (currentInformation.getHeight() != resultCoordinates.get(resultCoordinates.size()-1).getH())) {
            resultCoordinates.add(new ResultCoordinates(currentInformation.getXLeft(), currentInformation.getHeight()));
        }
    }

    private void updateXRightIfNecessary (int numberOfSkyline){
        if (skylineCoordinatesList.get(numberOfSkyline).getXRight() > xRight){
            xRight = skylineCoordinatesList.get(numberOfSkyline).getXRight();
        }
    }

    private InputCoordinates updateCurrentInformationIfHighestSkylineEnds (InputCoordinates currentInformation){
        if (currentXCoordinates >= currentInformation.getXRight()){
            currentInformation.update(currentXCoordinates, currentXCoordinates, 0);
        }
        return currentInformation;
    }

    private boolean noSkylinesOnHorizon (){
        return (currentXCoordinates == xRight);
    }

    private boolean currentSkylineIsHigher (int numberOfSkyline, int currentSkylineHeight){
        return skylineCoordinatesList.get(numberOfSkyline).getHeight() > currentSkylineHeight;
    }

    private boolean skylineContainsCurrentXCoordinates(int numberOfSkyline){
        return ((skylineCoordinatesList.get(numberOfSkyline).getXLeft() <= currentXCoordinates) &&
                (skylineCoordinatesList.get(numberOfSkyline).getXRight() > currentXCoordinates ));
    }

    private int lastCoordinate (){
        return skylineCoordinatesList.stream()
                .map(InputCoordinates::getXRight)
                .max(Comparator.comparing(Integer::valueOf)).get();
    }

    private void createSkylineCoordinatesList(){
        for (int[] skylineCoordinate : skylineCoordinates) {
            skylineCoordinatesList.add(new InputCoordinates(skylineCoordinate[0], skylineCoordinate[1],
                    skylineCoordinate[2]));
        }
    }
}