package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main (String [] args){
        WordServiceTest wordServiceTest = new WordServiceTest();

        wordServiceTest.testFindMostFrequentWordThreeWords();
        wordServiceTest.testFindMostFrequentWordFourWord();
        wordServiceTest.testtestFindMostFrequentWordFourWordSameCount();

    }

    public void printResultOfTest(String name,boolean ifTestPassed){
        if (ifTestPassed){
            System.out.println(name+" OK\n");
        }else{
            System.out.println(name+" FAIL\n");
        }
    }

    public void checkString(String name, String methodsResult, String expectedResult){
        printResultOfTest(name, methodsResult.equals(expectedResult));
    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        printResultOfTest(name, methodsResult == expectedResult);
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        printResultOfTest(name, methodsResult == expectedResult);
    }



    public void testFindMostFrequentWordThreeWords(){
        WordService wordService = new WordService();

        checkString("testFindMostFrequentWordThreeWords", wordService.findMostFrequentWord("Bob found Bob"), "Bob");
    }

    public void testFindMostFrequentWordFourWord(){
        WordService wordService = new WordService();
        //System.out.println(wordService.findMostFrequentWord("Bob found John"));
        checkString("testFindMostFrequentWordFourWord", wordService.findMostFrequentWord("Bob found John Alla"), "Bob");
    }

    public void testtestFindMostFrequentWordFourWordSameCount(){
        WordService wordService = new WordService();

        checkString("testtestFindMostFrequentWordFourWordSameCount", wordService.findMostFrequentWord("Bob found Bob and foun Robert and"), "Bob");
    }

}
