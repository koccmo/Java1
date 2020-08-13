package student_eduards_jasvins.lesson_8.day_6;

public class Varags {

    public int sumNumbers (int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++)
        {
            sum = sum + numbers[i];
            System.out.println("Adding " + numbers[i] + ", get " + sum);
        }
        return sum;
    }

}
