package student_dmitrijs_jasvins.lesson_7.day_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WorldServiceTest {
    public static void main(String[] args) {
        WorldServiceTest worldServiceTest = new WorldServiceTest();
        worldServiceTest.shouldFindMostFrequentWord();
    }
    public void assertResult (String name, String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }
    public void shouldFindMostFrequentWord(){
        WordService worldService = new WordService();
        String actualResult = worldService.findMostFrequentWord("Don't trouble trouble until troubles trouble you");
        assertResult("Most frequent word", actualResult,"trouble");
    }
}
