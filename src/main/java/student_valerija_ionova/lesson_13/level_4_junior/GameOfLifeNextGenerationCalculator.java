package student_valerija_ionova.lesson_13.level_4_junior;

//Task10
//Task11 Rule1 Правило 1: Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        //System.out.println("calculate");
        boolean [][] newField = new boolean [currentGeneration.length][currentGeneration[0].length];
        for (int y = 0; y < currentGeneration.length; y++){
            for (int x = 0; x < currentGeneration[0].length; x++){
                //System.out.println("calculate : x = "+x + " y = " + y);
                newField[y][x] = updateCell(currentGeneration, x, y);
            }
        }
        return newField;
    }

    private boolean updateCell(boolean[][] currentGeneration, int x, int y){
        //System.out.println("updateCell : x = " +x + " y = " + y);
        int neighborsTrue = neighborsTrue(currentGeneration, x, y);
        //System.out.println("updateCell neighbors counted = " + neighborsTrue);
        if (currentGeneration[y][x]){
            if ((neighborsTrue == 2) || (neighborsTrue == 3)){
                return true;
            }
            else{
                return false;
            }
        }
        if (neighborsTrue == 3) {
            return true;
        }else {
            return false;
        }
    }

    private int neighborsTrue(boolean[][] currentGeneration, int x, int y){
        int trueCount = 0;
        //System.out.println("x start of neighborsTrue= "+ x+ " y= "+y);
        for (int i = Math.max(0, (y-1)); i <= Math.min((y+1), (currentGeneration.length-1)); i++){
            for (int j = Math.max(0, (x-1)); j <= Math.min((x+1), (currentGeneration[0].length-1)); j++){
                //System.out.println("x = " + j + " y= "+i + " " + currentGeneration[i][j]);
                if (!((i==y) && (j==x))) {
                    //System.out.println("(i!=y) " + (i!=y) + " (j!=x) " + (j!=x));
                    //System.out.println("currentGeneration[i][j]" + currentGeneration[i][j]);
                    if (currentGeneration[i][j]) {
                        trueCount++;
                        //System.out.println("trueCount = " + trueCount);
                    }
                }
            }
        }
        //System.out.println("TrueCount" + trueCount + " for x= "+x+" y= "+y);
        return trueCount;
    }

}