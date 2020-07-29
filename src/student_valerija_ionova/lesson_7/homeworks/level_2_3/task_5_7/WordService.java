package student_valerija_ionova.lesson_7.homeworks.level_2_3.task_5_7;

/*Task 5
Попробовать применить на практике знания о функциях
полученные из третьей главы ("Функции") книги Роберта Мартина "Чистый код" (Clean code).

Task7
Попробовать применить на практике знания
полученные из второй главы ("Содержательные имена") книги Роберта Мартина "Чистый код" (Clean code).*/

class WordService {

    public boolean isCharacterLetter(char symbol){
        return ((Character.isLetter(symbol)) || (symbol == '\''));
    }

    public int countNumberOfWordsInString(String text){
        int numberOfWords = 0;
        boolean isWord = false;
        for (int i=0; i< text.length(); i++){
            if (isCharacterLetter(text.charAt(i))) {
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

    public String [] addLastWord(String [] arrayOfWords, String word){
        if (word.length() != 0) {
            arrayOfWords[arrayOfWords.length-1] = word;
        }
        return arrayOfWords;
    }


    public String [] createArrayOfWords(String text){

        String [] arrayOfWords = new String [countNumberOfWordsInString(text)];

        String word = "";
        int wordsNumber = 0;
        for (int i=0; i< text.length(); i++){
            if (isCharacterLetter(text.charAt(i))){
                word += text.charAt(i);
            }else{
                if (word.length() != 0) {
                    arrayOfWords[wordsNumber] = word;
                    word = "";
                    wordsNumber++;
                }
            }
        }
        addLastWord(arrayOfWords, word);
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
        return word.toLowerCase();
    }

    public String wordServiceFull (String text){

        String [] wordsArray = createArrayOfWords(text);
        int [] countOfWords = countOfWords(wordsArray);
        return findMostFrequentWord(wordsArray, countOfWords);

    }


}
