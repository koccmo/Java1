package student_alexey_tretyakov.lesson_7.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

//@CodeReview(approved = false)
class WordService {

    public String findMostFrequentWord( String inText) {
		//@CodeReviewComment(teacher = "Зачем тут создавать новую инстанцию WordService?")
        //WordService wordService = new WordService();
        String[] stringArray = splitString( inText );
        int[] wordCount=  wordCounter( stringArray );
        int maxTimes = findIndexOfMaxTimes(wordCount);
        return stringArray[ maxTimes ];
    }

    public String [] splitString (String inString) {
        return inString.split(" ");
    }

    public int [] wordCounter ( String[] splitString){
        int [] wordCount = new int[splitString.length];
        for (int i=0; i < splitString.length; i++ ) {
            String findString = splitString[i];
            for (String s : splitString) {
                if (s.equals( findString )) {
                    wordCount[i]++;
                }
            }
        }
        return wordCount;
    }

    public int findIndexOfMaxTimes(int[] inArray) {
        int maxInt = inArray[0];
        int maxIndex = 0;
        for (int i = 0; i< inArray.length; i++) {
            if (inArray[i] > maxInt)  { maxIndex = i;}
        }
        return maxIndex;
    }


}
