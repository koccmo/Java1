package student_dmitrijs_jasvins.lessoncode;

public class Wallet {
    public static void main(String[] args) {
        int [] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        int max = number[0];
        for (int value: number) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
