package student_roberts_kupcs.lesson_11.homework.level_3;

import java.util.List;

interface BookDatabase {

    List<Book> find(SearchCriteria searchCriteria);

}
