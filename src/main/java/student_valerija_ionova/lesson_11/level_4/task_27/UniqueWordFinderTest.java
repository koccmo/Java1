package student_valerija_ionova.lesson_11.level_4.task_27;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinderTest {

    public static void main (String [] args){

        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();

        uniqueWordFinderTest.testFindOneWord();
        uniqueWordFinderTest.testFindThreeWords();
    }

    void checkResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testFindOneWord(){
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> result = new HashSet<>();
        result.add("Bob");
        checkResult("testFindOneWord", uniqueWordFinder.find("Bob Bob Bob Bob").equals(result));
    }

    void testFindThreeWords(){
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> result = new HashSet<>();
        result.add("Bob");
        result.add("John");
        result.add("Anna");
        checkResult("testFindThreeWords", uniqueWordFinder.find("Bob Bob John Anna Bob Bob Anna").equals(result));
    }

}
