package student_valerija_ionova.lesson_16.level_7_senior;

import java.util.ArrayList;
import java.util.List;

class SkylineProblem {

    private int [][] skylineCoordinates;
    private List <InputCoordinates> skylineCoordinatesList = new ArrayList<>();
    private int xRight;
    private int currentXCoordinates;
    private int maxHeight;
    private int lastCoordinate;


    SkylineProblem (int [][] skylineCoordinates){
        this.skylineCoordinates = skylineCoordinates;
        createSkylineCoordinatesList();
        xRight = skylineCoordinates[0][1];
        currentXCoordinates = skylineCoordinates[0][0];
        maxHeight = skylineCoordinates[0][2];
        lastCoordinate = lastCoordinate();
    }

    List<ResultCoordinates> getSilhouetteOfSkylines (){

        List <ResultCoordinates> resultCoordinates = createListOfResultCoordinates();
        InputCoordinates currentInformation = new InputCoordinates(currentXCoordinates, xRight, maxHeight);

        do{
            currentXCoordinates++;
            boolean updatedResultCoordinates = false;

            if (highestBuildingEnds(currentInformation.getXRight())){
                currentInformation.update(currentXCoordinates, currentXCoordinates, 0);

            }

                int numberOfSkyline = 0;

                while(numberOfSkyline < skylineCoordinatesList.size()){

                    if (SkylineContainsCurrentXCoordinates(numberOfSkyline)){

                        if (currentSkylineIsHigher(numberOfSkyline, currentInformation.getHeight())){

                            if (currentSkylineXRightIsBigger(skylineCoordinatesList.get(numberOfSkyline).getXRight())){
                                xRight = skylineCoordinatesList.get(numberOfSkyline).getXRight();
                            }

                                currentInformation.update(currentXCoordinates,
                                        skylineCoordinatesList.get(numberOfSkyline).getXRight(),
                                        skylineCoordinatesList.get(numberOfSkyline).getHeight());

                                updatedResultCoordinates = true;
                        }

                    }else if(noSkylinesOnHorizon()){

                        currentInformation.update(currentXCoordinates, currentXCoordinates, 0);

                        updatedResultCoordinates = true;
                    }
                    numberOfSkyline++;

                }

            if (updatedResultCoordinates && currentInformation.getHeight() != resultCoordinates.get(resultCoordinates.size()-1).getH()) {

                resultCoordinates.add(new ResultCoordinates(currentInformation.getXLeft(), currentInformation.getHeight()));
            }

        }while (currentXCoordinates < lastCoordinate);

        return resultCoordinates;
    }

    private List <ResultCoordinates> createListOfResultCoordinates (){
        List <ResultCoordinates> resultCoordinates = new ArrayList<>();
        resultCoordinates.add(new ResultCoordinates(currentXCoordinates, maxHeight));
        return resultCoordinates;
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

    private boolean SkylineContainsCurrentXCoordinates (int numberOfSkyline){
        return ((skylineCoordinatesList.get(numberOfSkyline).getXLeft() <= currentXCoordinates) &&
                (skylineCoordinatesList.get(numberOfSkyline).getXRight() > currentXCoordinates ));
    }

    private boolean highestBuildingEnds(int highestBuildingRightXCoordinates){
        return currentXCoordinates >= highestBuildingRightXCoordinates;
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
