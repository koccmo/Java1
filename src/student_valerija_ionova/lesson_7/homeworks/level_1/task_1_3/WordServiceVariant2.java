package student_valerija_ionova.lesson_7.homeworks.level_1.task_1_3;

class WordServiceVariant2 {

    private String [] testToWordsArray(String text){
        return text.split(" ");
    }

    private String mostFrequentWord(String [] wordsArray){
        int maxNumberOfWords = 0;
        int currentNumberOfWords = 0;
        String mostFrequentWord = "";
        for (int i = 0; i < wordsArray.length; i++){
            for (int j = 0; j < wordsArray.length; j++){
                if (wordsArray[i].equalsIgnoreCase(wordsArray[j])){
                    currentNumberOfWords ++;
                }
            }
            if (currentNumberOfWords > maxNumberOfWords){
                maxNumberOfWords = currentNumberOfWords;
                mostFrequentWord = wordsArray[i];
            }
            currentNumberOfWords = 0;
        }
        return mostFrequentWord;
    }

    String wordService(String text){
        return mostFrequentWord(testToWordsArray(text));
    }


}
