package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_7;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray =convertStringToWordArray(text);

        int [] wordCountArray = createWordCountArray(textArray);

        int [] filledWordCountArray = fillWordCountArray(textArray, wordCountArray);

        return textArray[indexOfMostFrequentWordInArray(filledWordCountArray)];
    }

	@CodeReviewComment(teacher = "public really? May be private?")
    private int [] createWordCountArray(String [] arrayOfWords){
        return (new int[arrayOfWords.length]);
    }

	@CodeReviewComment(teacher = "public really? May be private?")
    private int countWords(String [] textArray, int wordCount){
        int wordCounter = 0;
        for (String s : textArray) {
            if (textArray[wordCount].equals(s)) {
                wordCounter++;
            }
        }
        return wordCounter;
    }

	@CodeReviewComment(teacher = "public really? May be private?")
    private int [] fillWordCountArray (String [] textArray, int [] wordCountArray){
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            wordCountArray[wordCount] = countWords(textArray, wordCount);
        }
    return wordCountArray;
    }

	@CodeReviewComment(teacher = "public really? May be private?")
    private int indexOfMostFrequentWordInArray(int [] wordCountArray){
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



    @CodeReviewComment(teacher = "public really? May be private?")
    private String[] convertStringToWordArray(String text) {
        return  text.split(" ");
    }

    static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("?????? ?????? ???????? ?????????? ?????????? ?????? ?????? ?????? ?????????? ???????????? ???????????? ?????????? ???????????? ???????????? ?????? ?????? ?????? ??????");
        System.out.println(result);
    }

}
