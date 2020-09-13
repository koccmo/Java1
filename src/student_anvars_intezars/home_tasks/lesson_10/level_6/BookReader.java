package student_anvars_intezars.home_tasks.lesson_10.level_6;

interface BookReader {

    boolean isAddedBook(Book book);

    void save(Book book);

    boolean booksEqualByAuthorAndTitle(Book book);

    boolean booksHaveTitleAndAuthor(Book book);

}
