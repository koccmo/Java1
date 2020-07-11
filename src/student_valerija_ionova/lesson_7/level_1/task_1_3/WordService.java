package student_valerija_ionova.lesson_7.level_1.task_1_3;

/*Дана строка с текстом.
Написать метод, который найдёт слово, которое в тексте встречается больше всего раз.

Если несколько слов в тексте встречаются одинаково максимальное число раз,
то возвращаем то слово, которое стоит в тексте первым.

Подумайте на какие подзадачи можно разбить эту задачу?
Распишите на бумаге каждую подзадачу в отдельности:
- как она называется,
- что её надо передать на вход (параметры),
- что будет возвращать в качестве результата.


- посчитать количество слов
- создать массив слов из строки
- Нижний регистр
- создать массив кол-ва слов
- создать два массива: слово - количество
- определить какое слово встречается чаще всего
*/

import java.util.Arrays;

public class WordService {

    public int countNumberOfWords(String text){
        int numberOfWords = 0;
        boolean isWord = false;
        for (int i=0; i< text.length(); i++){
            if ((Character.isLetter(text.charAt(i))) || (text.charAt(i) == '\'')){
                if (!isWord){
                    numberOfWords++;
                }
                isWord = true;
            }else{
                isWord = false;
            }
        }
        //System.out.println("Number of words: "+numberOfWords);
        return numberOfWords;
    }

    public String [] createArrayOfWords(String text){

        int numberOfWords = countNumberOfWords(text);

        String [] arrayOfWords = new String [numberOfWords];
        String word = "";
        int wordsNumber = 0;
        for (int i=0; i< text.length(); i++){
            //System.out.println("char(i) "+text.charAt(i));
            if ((Character.isLetter(text.charAt(i))) || (text.charAt(i) == '\'')){
                word += text.charAt(i);
            }else{
                if (word.length() != 0) {
                    arrayOfWords[wordsNumber] = word;
                    word = "";
                    wordsNumber++;
                }
            }
        }
        if (word.length() != 0) {
            arrayOfWords[arrayOfWords.length-1] = word;
        }
        //System.out.println("Array of words"+Arrays.toString(arrayOfWords));
        return arrayOfWords;
    }

    public int [] countOfWords(String [] array){
        int [] countOfWords = new  int [array.length];
        for (int i=0; i < array.length; i++){
            String word = array[i];
            int numberOfWord = 1;
            if (i != array.length-1){
                for (int j=i+1; j<array.length; j++){
                    if (array[j].toLowerCase().equals(word.toLowerCase())) {
                        numberOfWord++;
                    }
                }
                countOfWords[i] = numberOfWord;
            }else{
                countOfWords[i] = numberOfWord;
            }
        }
        //System.out.println("Count of words "+Arrays.toString(countOfWords));
        return countOfWords;
    }

    public String findMostFrequentWord(String [] words, int [] countOfWords) {

        String word ="";
        int max = 0;
        for (int i = 0; i< countOfWords.length; i++){
            if (countOfWords[i] > max){
                max = countOfWords[i];
                word = words[i];
            }
        }
        //System.out.println("Word: "+word);
        return word.toLowerCase();
    }

    public String wordServiceFull (String text){

        String [] wordsArray = createArrayOfWords(text);
        //String [] wordsArrayToLowerCase = arrayToLowerCase(wordsArray);
        int [] countOfWords = countOfWords(wordsArray);
        return findMostFrequentWord(wordsArray, countOfWords);

    }

}
