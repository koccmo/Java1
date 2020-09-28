package student_valerija_ionova.lesson_16.level_4_junior.task_4;

public class MarsRover {

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);
            if (instruction == 'L') {
                return turnLeft(instructions, direction, x, y);
            } else if (instruction == 'R') {
                return turnRight(instructions, direction, x, y);
            } else if (instruction == 'M') {
                return continueMovement(instructions, direction, x, y);
            }
        }
        return x + " " + y + " " + direction;
    }

    private static String turnLeft (String instructions, char direction, int x, int y){
        if (direction == 'N') {
            return move(x, y, 'W', instructions.substring(1));
        } else if (direction == 'W') {
            return move(x, y, 'S', instructions.substring(1));
        } else if (direction == 'S') {
            return move(x, y, 'E', instructions.substring(1));
        } else
            return move(x, y, 'N', instructions.substring(1));
    }

    private static String turnRight (String instructions, char direction, int x, int y){
        if (direction == 'N') {
            return move(x, y, 'E', instructions.substring(1));
        } else if (direction == 'W') {
            return move(x, y, 'N', instructions.substring(1));
        } else if (direction == 'S') {
            return move(x, y, 'W', instructions.substring(1));
        } else
            return move(x, y, 'S', instructions.substring(1));
    }

    private static String continueMovement (String instructions, char direction, int x, int y){
        if (direction == 'N') {
            return move(x, y + 1, 'N', instructions.substring(1));
        } else if (direction == 'S') {
            return move(x, y - 1, 'S', instructions.substring(1));
        } else if (direction == 'W') {
            return move(x - 1, y, 'W', instructions.substring(1));
        } else
            return move(x + 1, y, 'E', instructions.substring(1));
    }

}
