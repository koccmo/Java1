package student_valerija_ionova.lesson_7.homeworks.level_1.task_1_3;

class WordServiceVariant2 {

    private String [] testToWordsArray(String text){
        return text.split(" ");
    }

    private String mostFrequentWord(String [] wordsArray){
        int maxNumberOfWords = 0;
        String mostFrequentWord = "";
        for (String word : wordsArray){
            int currentNumberOfWords = countNumberOfCurrentWord(word, wordsArray);
            if (currentNumberOfWords > maxNumberOfWords){
                mostFrequentWord = updateMostFrequentWord(word);
                maxNumberOfWords = updateNumberOfMostFrequentWord(currentNumberOfWords);
            }
        }
        return mostFrequentWord;
    }

    private String updateMostFrequentWord(String word){
        return word;
    }

    private int updateNumberOfMostFrequentWord(int number){
        return number;
    }

    private int countNumberOfCurrentWord(String word, String [] wordsArray){
        int currentNumberOfWords = 0;
        for (String currentWord : wordsArray){
            if (word.equalsIgnoreCase(currentWord)){
                currentNumberOfWords ++;
            }
        }
        return currentNumberOfWords;
    }

    String wordService(String text){
        return mostFrequentWord(testToWordsArray(text));
    }
}
