package student_anvars_intezars.home_tasks.lesson_7.day_1;

import java.util.Arrays;

public class WordService {

    public String findMostFrequentWord(String text) {

        // Полученую строку текста разобьем на слова.
        //Слова запишем в массив, чтобы можно было каждое слово посчитать в дальнейшем.
        String [] lineOfTextToWords = text.split(" ");
        Arrays.sort(lineOfTextToWords);
            //System.out.println(Arrays.toString(lineOfTextToWords));

            int mostFrequentWord = 0;
            int count = 0;
            String word = lineOfTextToWords[0];
            String current = lineOfTextToWords[0];
            for (int i = 1; i < lineOfTextToWords.length; i++) {
                if (lineOfTextToWords[i].equals(current)) {
                    count++;
                }
                else {
                    count = 1;
                    current = lineOfTextToWords[i];
                }
                if ( mostFrequentWord < count) {
                    mostFrequentWord = count;
                    word = lineOfTextToWords[i];
                }
            }
                System.out.println("Most frequent word is " + word + ", found " + mostFrequentWord +" times in the text");
        return word;
    }
    }


