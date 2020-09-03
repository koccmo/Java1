package student_valerija_ionova.lesson_11.level_3.task_15;

/*Этот метод предназначен для сохранения книг в базу данных.
При сохранении каждой книге даётся уникальный номер (id).
Id это целое число. Первая в базе книга получает значение id = 1,
вторая id = 2 и так далее (автоинкремент - для каждой следующей книги
значение id просто увеличивается на единицу). Id присваивается в момент
сохранения книги в базу данных и больше никогда не меняется.*/

import java.util.List;
import java.util.Optional;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);


}
