package student_jaroslav_brutan.lesson_11.day_2.task_6;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase{


        private List<Book> listOfBooks = new ArrayList<>();
        private Long id = 1L;

        @Override
        public Long save(Book book){
            listOfBooks.add(book);
            book.setId(id);
            id++;
            return id;
        }
}
