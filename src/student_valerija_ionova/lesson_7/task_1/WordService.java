package student_valerija_ionova.lesson_7.task_1;

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
        return numberOfWords;
    }

    public String [] createArrayOfWords(String text){

        int numberOfWords = countNumberOfWords(text);

        String [] arrayOfWords = new String [numberOfWords];
        String word = "";
        int wordsNumber = 0;
        boolean isWord = true;
        for (int i=0; i< text.length(); i++){
            //System.out.println("char(i) "+text.charAt(i));
            if ((Character.isLetter(text.charAt(i))) || (text.charAt(i) == '\'')){
                word += text.charAt(i);
                //System.out.println("word: "+word);
                //isWord = true;
            }else{
                if (word.length() != 0) {
                    arrayOfWords[wordsNumber] = word;
                    word = "";
                    wordsNumber++;
                }
            }
        }
        //System.out.println(Arrays.toString(arrayOfWords));
        return arrayOfWords;
    }

    public String [] arrayToLowerCase(String [] array){
        String [] newArray = new String [array.length];
        for (int i= 0; i< array.length; i++){
            newArray[i] = array[i].toLowerCase();
        }
        return newArray;
    }

    public int [] countOfWords(String [] array){
        int [] countOfWords = new  int [array.length];
        for (int i=0; i < array.length; i++){
            String word = array[i];
            int numberOfWord = 1;
            if (i != array.length-1){
                for (int j=i+1; j<array.length; j++){
                    if (array[j].equals(word)) {
                        numberOfWord++;
                    }
                }
                countOfWords[i] = numberOfWord;
            }else{
                countOfWords[i] = numberOfWord;
            }
        }
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
        return word;
    }


}
