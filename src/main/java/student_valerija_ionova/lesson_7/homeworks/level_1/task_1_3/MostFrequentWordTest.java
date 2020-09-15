package student_valerija_ionova.lesson_7.homeworks.level_1.task_1_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MostFrequentWordTest {

    public static void main (String [] args){

        MostFrequentWordTest mostFrequentWordTest = new MostFrequentWordTest();

        mostFrequentWordTest.testOneWord();
        mostFrequentWordTest.testTwoWords();
        mostFrequentWordTest.testTwoWordDifferentCase();
        mostFrequentWordTest.testSameNumberOfWords();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testOneWord(){
        WordServiceVariant2 wordServiceVariant2 = new WordServiceVariant2();
        String text = "Bob and John";
        printResult("testOneWord", wordServiceVariant2.wordService(text).equals("Bob"));
    }

    void testTwoWords(){
        WordServiceVariant2 wordServiceVariant2 = new WordServiceVariant2();
        String text = "Bob and Bob";
        printResult("testTwoWords", wordServiceVariant2.wordService(text).equals("Bob"));
    }

    void testTwoWordDifferentCase(){
        WordServiceVariant2 wordServiceVariant2 = new WordServiceVariant2();
        String text = "Tree and tree";
        printResult("testTwoWordDifferentCase", wordServiceVariant2.wordService(text).equals("Tree"));
    }

    void testSameNumberOfWords(){
        WordServiceVariant2 wordServiceVariant2 = new WordServiceVariant2();
        String text = "Tree and tree and bird";
        printResult("testSameNumberOfWords", wordServiceVariant2.wordService(text).equals("Tree"));
    }

}
