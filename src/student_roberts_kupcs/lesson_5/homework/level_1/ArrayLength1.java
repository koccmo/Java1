package student_roberts_kupcs.lesson_5.homework.level_1;

class ArrayLength1 {
    public static void main(String[] args) {
        //int numbers = new int[2]; Ошибка: (5, 23) Java: несовместимые типы: int [] не может быть преобразовано в int
        //System.out.println(numbers[-1]);Ошибка: (6, 35) Java: массив требуется, но int найден

        int[] numbers = new int[2];
        System.out.println(numbers[0]);
    }
}
