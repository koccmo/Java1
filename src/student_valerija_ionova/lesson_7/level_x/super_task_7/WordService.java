package student_valerija_ionova.lesson_7.level_x.super_task_7;

public class WordService {

    public int [] createWordCountArray(String [] arrayOfWords){
        return (new int[arrayOfWords.length]);
    }

    public int countWords(String [] textArray, int wordCount){
        int wordCounter = 0;
        for (String s : textArray) {
            if (textArray[wordCount].equals(s)) {
                wordCounter++;
            }
        }
        return wordCounter;
    }

    public int [] fillWordCountArray (String [] textArray, int [] wordCountArray){
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            wordCountArray[wordCount] = countWords(textArray, wordCount);
        }
    return wordCountArray;
    }


    public int indexOfMostFrequentWordInArray(int [] wordCountArray){
        int maxIndex = 0;
        int maxCountOfWords = 0;
        for (int count =0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > maxCountOfWords) {
                maxIndex = count;
                maxCountOfWords = wordCountArray[count];
            }
        }
        return maxIndex;
    }

    public String findMostFrequentWord(String text) {
        String[] textArray =convertStringToWordArray(text);

        int [] wordCountArray = createWordCountArray(textArray);

        int [] filledWordCountArray = fillWordCountArray(textArray, wordCountArray);

        return textArray[indexOfMostFrequentWordInArray(filledWordCountArray)];
    }

    public String[] convertStringToWordArray(String text) {
        return  text.split(" ");
    }

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Это луч гном пузик текст нос нос нос текст просто просто текст просто просто рот рот рот пуз");
        System.out.println(result);
    }

}
