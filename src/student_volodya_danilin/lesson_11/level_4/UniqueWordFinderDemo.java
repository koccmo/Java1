package student_volodya_danilin.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderDemo {

    public static void main(String[] args) {

        UniqueWordFinder wordFinder = new UniqueWordFinder();

        String text = "1 22 22 333 333 333";
        Set<String> stringSet;

        stringSet = wordFinder.find(text);
        for (String value : stringSet) {
            System.out.println(value);
        }
        if (stringSet.size() == 3) {
            System.out.println("Test OK");
        }
    }
}
