package student_aleksandra_maksimovic.lesson_13.level_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StringCalculator {
    public int add(String str)
    {
        Pattern r = Pattern.compile("(//(.+)\n)?([\\s\\S]*)");

        String numbers = "";
        String delimiters = ",\n";

        Matcher m = r.matcher(str);
        if (m.find()) {

            String additionalDelimiters = m.group(2);
            if (additionalDelimiters != null) {
                // "[;][&]" -> ";&"
                delimiters += additionalDelimiters.replaceAll("[\\[\\]]", "");
            }

            numbers = m.group(3);
        }


        if (numbers == null || numbers.length() == 0)
            return 0;


        String[] words = numbers.split("[" + delimiters + "]");

        int result = 0;
        for (String word : words) {
            result += Integer.parseInt(word);
        }

        return result;
    }


    public static void main(String[] args) {
        var calculator = new StringCalculator();
        System.out.println(calculator.add("//[;][&]\n10,2\n5;8&6"));
    }
}
