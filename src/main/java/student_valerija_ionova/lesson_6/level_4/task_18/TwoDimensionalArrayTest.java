package student_valerija_ionova.lesson_6.level_4.task_18;

/*Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.*/


class TwoDimensionalArrayTest {
    public static void main(String[] args){
        TwoDimensionalArrayTest arrayTest = new TwoDimensionalArrayTest();
        arrayTest.testSumOfTwoDimensionalArray();
    }

    public void testSumOfTwoDimensionalArray(){
        TwoDimensionalArray new2Array = new TwoDimensionalArray();
        int [] [] arrayForTest = { { 1, 2 , 0, 4, -6, 9}, { 3, 4, 6, 3, 33, 7 }, { 3, 4, 6, 3, 33, 7 },
                { 3, 4, 6, 3, 33, 7 }, { 3, 4, 6, 3, 33, 7 } };
        if (new2Array.sumOfTwoDimensionalArray(arrayForTest) == 234){
            System.out.println("test testSumOfTwoDimensionalArray OK");
        }else{
            System.out.println("test testSumOfTwoDimensionalArray FAIL");
        }

    }
}
