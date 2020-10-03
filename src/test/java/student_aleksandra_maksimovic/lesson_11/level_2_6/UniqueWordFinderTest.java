package student_aleksandra_maksimovic.lesson_11.level_2_6;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {
    @Test
    public void findTest() {
        UniqueWordFinder finder = new UniqueWordFinder();

        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("aaa");
        expectedResult.add("bbb");
        expectedResult.add("ccc");
        expectedResult.add("xxx");

        Set<String> result = finder.find("aaa bbb ccc aaa xxx ccc");

        assertEquals(result, expectedResult);
    }
}