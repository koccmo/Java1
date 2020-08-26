package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

class GameField {

    private int [][] board = new int [15][42];

    private int [][] bonusBoard = createNewFieldManually();

    // 0 - point
    // 1 - wall
    // 2 - monster
    // 3 - packman
    // 4 - free field

    int [][] createNewFieldManually(){
        int [][] field = new int [] []{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 4, 4, 1, 0, 1, 4, 4, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 4, 4, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 4, 4, 1, 0, 1, 4, 4, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 4, 4, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 4, 4, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 4, 4, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        this.board = field;
        System.out.println();
        return field;
    }

    void printBoard (){
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 42; j++){
                if (board[i][j] == 4){
                    System.out.print("  ");
                }else{
                    if (board[i][j] == 0){
                        System.out.print("  "); //должно быть *
                    }else{
                        System.out.print(board[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    int getElementOfField(Coordinates coordinates){
        return board[coordinates.getY()][coordinates.getX()];
    }

    int getElementOfBonusField(Coordinates coordinates){
        return bonusBoard[coordinates.getY()][coordinates.getX()];
    }

    void updateField (int number, Coordinates coordinates){
        board[coordinates.getY()][coordinates.getX()] = number;
    }

    void updateFieldOfBonuses (int number, Coordinates coordinates){
        bonusBoard[coordinates.getY()][coordinates.getX()] = number;
    }

    boolean gameEndNoBonuses(){
        return numberOfBonuses() == 0;
    }

    int numberOfBonuses(){
        int result = 0;
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 42; j++) {
                    if (bonusBoard[i][j] == 0)
                        result ++;
                }
            }
        return result;
    }

}
