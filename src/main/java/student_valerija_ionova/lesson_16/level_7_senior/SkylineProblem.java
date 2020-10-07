package student_valerija_ionova.lesson_16.level_7_senior;

import java.util.ArrayList;
import java.util.List;

class SkylineProblem {

    private int [][] skylineCoordinates;
    private List <InputCoordinates> skylineCoordinatesList = new ArrayList<>();


    SkylineProblem (int [][] skylineCoordinates){
        this.skylineCoordinates = skylineCoordinates;
        createSkylineCoordinatesList();
    }

    List<ResultCoordinates> getSilhouetteOfSkylines (){

        int currentXCoordinates = skylineCoordinates[0][0];
        int maxHeight = skylineCoordinates[0][2];
        int xRight = skylineCoordinates[0][1];

        List <ResultCoordinates> resultCoordinates = new ArrayList <>();
        resultCoordinates.add(new ResultCoordinates(currentXCoordinates, maxHeight));

        InputCoordinates currentInformation = new InputCoordinates(currentXCoordinates, xRight, maxHeight);

        //System.out.println("\n Start currentInformation " + currentInformation + "\n");

        do{
            currentXCoordinates++;
            boolean updatedResultCoordinates = false;

            if (highestBuildingEnds(currentXCoordinates, currentInformation.getXRight())){
                currentInformation.update(currentXCoordinates, currentXCoordinates, 0);
                //System.out.println("Ends skyline");
            }

                int numberOfSkyline = 0;

                while(numberOfSkyline < skylineCoordinatesList.size()){

                    //System.out.println("currentXCoordinates in while2 " + currentXCoordinates +
                            //" numberOfSkyline " + numberOfSkyline);

                    if (SkylineContainsCurrentXCoordinates(numberOfSkyline, currentXCoordinates)){

                        //System.out.println("if1 newInfo");

                        if (currentSkylineIsHigher(numberOfSkyline, currentInformation.getHeight())){
                            //System.out.println("if1 new Height ");

                            if (Math.max(currentInformation.getXRight(),
                                    skylineCoordinatesList.get(numberOfSkyline).getXRight()) > xRight) {
                                xRight = Math.max(currentInformation.getXRight(),
                                        skylineCoordinatesList.get(numberOfSkyline).getXRight());
                            }
                                currentInformation.update(currentXCoordinates,
                                        skylineCoordinatesList.get(numberOfSkyline).getXRight(),
                                        skylineCoordinatesList.get(numberOfSkyline).getHeight());
                            //System.out.println("\n New Height currentInformation " + currentInformation + "\n");
                                updatedResultCoordinates = true;
                        }

                    }else if((currentXCoordinates == xRight)){
                        //System.out.println("else if all ends in currentXCoordinates = " + currentXCoordinates);

                        currentInformation.update(currentXCoordinates, currentXCoordinates, 0);
                        //System.out.println("\nNo Skylines currentInformation " + currentInformation+"\n");
                        //resultCoordinates.add(new ResultCoordinates(currentXCoordinates, 0));
                        updatedResultCoordinates = true;
                    }
                    numberOfSkyline++;

                }

            if (updatedResultCoordinates && currentInformation.getHeight() != resultCoordinates.get(resultCoordinates.size()-1).getH()) {
                //System.out.println("\nAdd coordinates: " + new ResultCoordinates(currentInformation.getXLeft(), currentInformation.getHeight()) + "\n");
                resultCoordinates.add(new ResultCoordinates(currentInformation.getXLeft(), currentInformation.getHeight()));
            }

        }while (currentXCoordinates < lastCoordinate());

        return resultCoordinates;
    }

    private boolean currentSkylineIsHigher (int numberOfSkyline, int currentSkylineHeight){
        return skylineCoordinatesList.get(numberOfSkyline).getHeight() > currentSkylineHeight;
    }

    private boolean SkylineContainsCurrentXCoordinates (int numberOfSkyline, int currentXCoordinates){
        return ((skylineCoordinatesList.get(numberOfSkyline).getXLeft() <= currentXCoordinates) &&
                (skylineCoordinatesList.get(numberOfSkyline).getXRight() > currentXCoordinates ));
    }

    private boolean highestBuildingEnds(int currentXCoordinates, int highestBuildingRightXCoordinates){
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
