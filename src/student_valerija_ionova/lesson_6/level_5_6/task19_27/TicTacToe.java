package student_valerija_ionova.lesson_6.level_5_6.task19_27;

/*Task19
-1 - это пустая клетка,
0 - это клетка в которую сделал ход первый игрок,
1 - это клетка в которую сделал ход второй игрок.
Создайте класс TicTacToe и в этом классе реализуйте
метод для определения является ли данная позиция
победной по горизонталям для указанного игрока.

Task20
метод для определения является ли данная позиция победной по вертикалям для указанного игрока.

public boolean isWinPositionForVerticals(int[][] field, int playerToCheck).

Task21
метод для определения является ли данная позиция победной по диагоналям для указанного игрока.

Task22
метод для определения является ли данная позиция победной для указанного игрока.

Task23
метод для определения является ли данная позиция ничейной.

Task24
public int[][] createField(). Метод должен создавать двумерный массив целых чисел

Task25
public Move getNextMove() {
    // запросите у пользователя с консоли две координаты
    // клетки куда хочет походить игрок
    // создайте экземпляр класса Move и передайте ему
    // в конструктор введённые пользователем координаты
    // верните созданный объект Move из метода.
}

Task26
public void printFieldToConsole(int[][] field) {
    // распечатайте поле на консоль в читаемом формате
}
*/

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    public int[][] createField(){
        int [][] game = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        return game;
    }



    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean answer =false;
        for (int i=0; i<3; i++){
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                answer = true;
            }

        }
        return answer;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        boolean answer = false;
        for (int i=0; i<3; i++){
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                answer = true;
            }

        }
        return answer;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        boolean answer = false;
        if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)){
            answer = true;
        }else{
            if ((field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)){
                answer = true;
            }
        }
        return answer;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){
        return (isWinPositionForHorizontals(field, playerToCheck)) || (isWinPositionForDiagonals(field, playerToCheck)) ||
                (isWinPositionForVerticals(field, playerToCheck));
    }

    public boolean fullField( int [] [] arr){
        boolean answer = true;
        for(int i=0; i<3; i++){
            for (int j = 0; j< 3; j++){
                if (arr[i][j] == -1){
                    answer = false;
                }
            }
        }
        return answer;
    }

    public boolean isDrawPosition(int[][] field){
        if ((!isWinPosition(field, 0)) && (!isWinPosition(field, 1)) && fullField(field)) {
            return true;
        }else
        return false;
    }

    public Move getNextMove(int player) {

        int x;
        int y;
        Scanner input = new Scanner(System.in);

        //Input of coordinate x
        do {
            System.out.println("Please input coordinates: x y (0-2) for player "+player+":");
            x = input.nextInt();
            y = input.nextInt();
            if (((x<0)||(x>2)) || ((y<0)||(y>2))){
                System.out.println("Not correct coordinates!");
            }
        }while(((x<0)||(x>2)) || ((y<0)||(y>2)));

        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field){
        //int [] array = new int [3];
        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                System.out.print(field[i][j]+" ");
                //array[j] = field[i][j];
            }
            System.out.println();
            //System.out.println(Arrays.toString(array));
        }
    }

    public void play() {
        int[][] field = createField();
        System.out.println("Let's start game:");
        printFieldToConsole(field);
        while(true) {
            Move move0;
            boolean freeField = false;
            do {
                move0 = getNextMove(0);
                if (field[move0.getY()][move0.getX()] == -1){
                    freeField = true;
                }else{
                    System.out.println("It's not free field! Please try one more time!");
                }
            }while(!freeField);

            field[move0.getY()][move0.getX()] = 0;
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1;
            freeField = false;
            do {
                move1 = getNextMove(1);
                if (field[move1.getY()][move1.getX()] == -1){
                    freeField = true;
                }else{
                    System.out.println("It's not free field! Please try one more time!");
                }
            }while(!freeField);

            field[move1.getY()][move1.getX()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
