package student_igors_bartkevics.lesson_13.homework.level_3_junior;

import java.util.ArrayList;
import java.util.List;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {

        boolean [][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];

        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                List<Cell> neighbours = getNeighboursOfCell(currentGeneration, new Cell(i, j));
                int liveNeighbourCellCount = countLiveNeighbourCells(currentGeneration,neighbours);
                //rule1: any live cell with less than two live neighbours dies in next generation
                if (liveNeighbourCellCount < 2) {
                    nextGeneration[i][j] = false;
                }
                //rule2: any live cell with more than three live neighbours dies in next generation
                else if (liveNeighbourCellCount > 3) {
                    nextGeneration[i][j] = false;
                }

                else nextGeneration[i][j] = currentGeneration[i][j];
            }

        }
        return nextGeneration;
    }

    private int countLiveNeighbourCells(boolean[][] field, List<Cell> neighbours) {
        int liveCellCount = 0;
        for (Cell cell : neighbours) {
            if (field[cell.getCoordinateX()][cell.getGetCoordinateY()]) {
                liveCellCount += 1;
            }
        }
        return liveCellCount;
    }

    private List<Cell> getNeighboursOfCell(boolean[][] field, Cell cell) {

        List<Cell> neighbours = new ArrayList<>();
        int coordinateX = cell.getCoordinateX();
        int coordinateY = cell.getGetCoordinateY();

        //top left position of neighbour
        if (cellExists(field, coordinateX - 1, coordinateY - 1)) {
            neighbours.add(new Cell(coordinateX - 1, coordinateY - 1));
        }

        //top center position of neighbour
        if (cellExists(field, coordinateX, coordinateY - 1)) {
            neighbours.add(new Cell(coordinateX, coordinateY - 1));
        }

        //top right position of neighbour
        if (cellExists(field, coordinateX + 1, coordinateY - 1)) {
            neighbours.add(new Cell(coordinateX + 1, coordinateY - 1));
        }

        //middle right position of neighbour
        if (cellExists(field, coordinateX + 1, coordinateY)) {
            neighbours.add(new Cell(coordinateX + 1, coordinateY));
        }

        //bottom right position of neighbour
        if (cellExists(field, coordinateX + 1, coordinateY + 1)) {
            neighbours.add(new Cell(coordinateX + 1, coordinateY + 1));
        }

        //bottom middle position of neighbour
        if (cellExists(field, coordinateX, coordinateY + 1)) {
            neighbours.add(new Cell(coordinateX, coordinateY + 1));
        }

        //bottom left position of neighbour
        if (cellExists(field, coordinateX - 1, coordinateY + 1)) {
            neighbours.add(new Cell(coordinateX -1, coordinateY + 1));
        }

        //middle left position of neighbour
        if (cellExists(field, coordinateX - 1, coordinateY)) {
            neighbours.add(new Cell(coordinateX -1, coordinateY));
        }

        return neighbours;
    }

    private boolean cellExists(boolean[][] field, int coordinateX, int coordinateY) {

        return (coordinateX > -1) && (coordinateX < field.length) &&
        (coordinateY > -1) && (coordinateY < field[0].length);
    }

}
