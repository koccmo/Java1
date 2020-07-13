package student_svjatoslavs_cernobrivecs.lesson_5.level_4;

public class Task_30 {

    public static void main(String[] args){

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = 1 + (int)(Math.random() * 30);
            System.out.println("[" + i + "]" + array[i]);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                System.out.println("Odd numbers:" + array[i]);
            }
        }
    }
}
