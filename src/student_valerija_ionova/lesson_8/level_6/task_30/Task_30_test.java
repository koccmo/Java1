package student_valerija_ionova.lesson_8.level_6.task_30;

class Task_30_test {

    public static void main(String [] args){

        Task_30_test demo = new Task_30_test();


        demo.testSumOfFiveNumbers();
        demo.testSumOfTenNumbers();
    }

    public void testSumOfFiveNumbers(){
        Task_30 task = new Task_30();
        if (task.sumOfNumbers(1, 5, 12, 0, 10) == 28){
            System.out.println("testSumOfFiveNumbers OK");
        }else{
            System.out.println("testSumOfFiveNumbers FAIL");
        }
    }

    public void testSumOfTenNumbers(){
        Task_30 task = new Task_30();
        if (task.sumOfNumbers(1, 5, 12, 0, 10, 10, 30, 25, 8.2, 99) == 200.2){
            System.out.println("testSumOfTenNumbers OK");
        }else{
            System.out.println("testSumOfTenNumbers FAIL");
        }
    }
}
