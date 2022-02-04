package roman.lesson_7.homework.day_x.task_7;

public class WordService {

    // Такие методы надо разбивать на более мелкие методы!
    public String findMostFrequentWord(String text) {
        String[] textArray = convertStringToWordArray(text);
        return getMostRepetitiveWordFromArray(textArray);
    }
    public String getMostRepetitiveWordFromArray(String[] textArray) {
        int[] wordCountArray = createWithValueWordCountArray(textArray);
        int highestValue = getArrayHighestValue(wordCountArray);
        return textArray[getIndexMostRepetitiveWord(wordCountArray, highestValue)];
    }
    public int getIndexMostRepetitiveWord(int[]wordCountArray, int arrayHighestValue) {
        int indexMostRepetitiveWord = 0;
        for (int i = 0; i < wordCountArray.length; i++) {
            if (wordCountArray[i] == arrayHighestValue) {
                indexMostRepetitiveWord = i;
                break;
            }
        }
        return indexMostRepetitiveWord;
    }

    public int getArrayHighestValue(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = wordCountArray[count];
            }
        }
        return max;
    }

    public int[] createWithValueWordCountArray(String[] textArray) {
        int[] wordCountArray = new int[textArray.length];
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            int wordCounter = 0;
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
        }
        return wordCountArray;
    }

    public String[] convertStringToWordArray(String text) {
        return  text.split(" ");
    }

    public void printArray(int[] toPrint) {
        for (int i : toPrint) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Это текст просто Это текст просто");
        System.out.println(result);

    }
}

