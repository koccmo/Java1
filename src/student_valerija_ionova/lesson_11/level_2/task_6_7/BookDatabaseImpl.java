package student_valerija_ionova.lesson_11.level_2.task_6_7;

/*Создайте класс BookDatabaseImpl, который реализует интерфейс BookDatabase.
Task6
Реализуйте в нём метод  Long save(Book book). Книги внутри класса BookDatabaseImpl
храните в списке.

Task7
Данный метод предназначен для удаления книги с указанным id в качестве параметра метода
из базы данных.*/

import java.util.ArrayList;
import java.util.List;


class BookDatabaseImpl implements  BookDatabase{

    private List<BookAndId> bookDataBase = new ArrayList<>();
    private Long number = 0L;

    List <BookAndId> getBookDataBase(){
        return bookDataBase;
    }

    @Override
    public Long save(Book book) {
        number ++;
        bookDataBase.add(new BookAndId(book, number));
        return (number);
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 1; i <= bookDataBase.size(); i++){
            if (bookDataBase.get(i-1).getNumber().equals(bookId)){
                bookDataBase.remove(i-1);
                return true;
            }
        }
        return false;
    }

    BookAndId getBookAndId (Long index){
        return bookDataBase.get(index.intValue());
    }


}
