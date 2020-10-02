package student_anvars_intezars.home_tasks.lesson_11.level_4_tasks;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {

    @Test
    public void finUniqueWordsTest() {

        String randomText = " My My name is Morpheus. Neo ne sucks, but bu NoT me.";
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> result = uniqueWordFinder.find(randomText);
        System.out.println(result);
        assertTrue(result.contains("NoT"));
    }

}