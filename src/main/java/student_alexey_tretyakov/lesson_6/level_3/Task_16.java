package student_alexey_tretyakov.lesson_6.level_3;

public class Task_16 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Бесконечный цикл for с выходом после 5 итераций");
            i--;
            j++;
            if ( j == 5 ) { break;}

        }
        j = 0;
        do {
            System.out.println("Бесконечный цикл while с выходом после 3-х итераций");
            j++;
        } while (j != 3);
    }
}
