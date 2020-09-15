package student_vladislav_zagrebin.lesson_5.lessonExamples;

public class StringArrayExample {

    public static void main(String[] args) {
        String str = new String("Lower Case");

        System.out.println(str);

        str = str.toLowerCase();

        System.out.println(str);

        String[] words = new String [3];

        words[0] = "A";
        words[1] = "B";
        words[2] = "C";

        System.out.println(words[0]);

        words[0] = words[0].toLowerCase(); // на выходе будет -> "a"

        System.out.println(words[0]);

    }
}
