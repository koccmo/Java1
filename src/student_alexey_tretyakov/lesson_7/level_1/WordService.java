package student_alexey_tretyakov.lesson_7.level_1;

class WordService {

    public String findMostFrequentWord(String inText) {

        WordService wordService = new WordService();
        String[] stringArray = wordService.splitString( inText );
        int[] wordCount=  wordService.wordCounter( stringArray );
        int maxTimes = wordService.findIndexOfMaxTimes(wordCount);

        return stringArray[maxTimes];
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
        for (int i=0; i< inArray.length;i++) {
            if (inArray[i] > maxInt)  { maxIndex = i;}
        }
        return maxIndex;
    }


}
