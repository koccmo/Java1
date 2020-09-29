package student_valerija_ionova.lesson_11.level_4_approved.task_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Создайте класс UniqueWordFinder и метод:

    Set<String> find(String text);*/

public class UniqueWordFinder {


    Set<String> find (String text){
        return (new HashSet<>(Arrays.asList(text.split(" "))));
    }

}
