package student_jaroslav_brutan.lesson_7.day_1;

import java.util.Arrays;

public class WordService {

    String text = "Hello hello from Latvia with love";

    public String[] textToArray(String text){
        /* метод для создания массива из строки */

        String[] arrayText = text.split(" ");
        /* делим каждое слово на индекс в массиве */

        return arrayText;
        /* возвращаем уже готовый массив со строками в каждом индексе */
    }

    public String countWords(String[] arrayText){
        /* создаем метод для того, чтобы посчитать какое слово самое частое */

         int wordQuantity = 0;
         int count = 0;
         String word = arrayText[0];
         String currentWord = arrayText[0];
         /* объявил переменные и слова которые будут считать в процессе цикла */

        for (int i = 1; i < arrayText.length; i++){
            if (arrayText[i] == currentWord){
                count++;
            } else {
                count = 1;
                currentWord = arrayText[i];
            } if (wordQuantity < count){
                wordQuantity = count;
                word = arrayText[i];
            }
        }
        System.out.println("Most frequent word is " + word + " it's in the text " + wordQuantity + " times");
        return word;
    }

    public String findMostFrequentWord(String text){

        String[] textArray = textToArray(text);
        String result = countWords(textArray);
        return result;
    }
}
