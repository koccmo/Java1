package student_alexey_tretyakov.lesson_7.level_1;

//@CodeReview(approved = false)
class WordService {

    protected String findMostFrequentWord( String inText) {
		//@CodeReviewComment(teacher = "Зачем тут создавать новую инстанцию WordService?")
        //WordService wordService = new WordService();
        String[] stringArray = splitString( inText );
        int[] wordCount=  wordCounter( stringArray );
        int maxTimes = findIndexOfMaxTimes(wordCount);
        return stringArray[ maxTimes ];
    }

    private String [] splitString (String inString) {
        return inString.split(" ");
    }

    protected int [] wordCounter ( String[] splitString){
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

    protected int findIndexOfMaxTimes(int[] inArray) {
        int maxInt = inArray[0];
        int maxIndex = 0;
        for (int i = 0; i< inArray.length; i++) {
            if (inArray[i] > maxInt)  { maxIndex = i;}
        }
        return maxIndex;
    }


}
