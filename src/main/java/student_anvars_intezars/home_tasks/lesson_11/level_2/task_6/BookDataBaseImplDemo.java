package student_anvars_intezars.home_tasks.lesson_11.level_2.task_6;

class BookDataBaseImplDemo {

    public static void main(String[] args) {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();
        Book firstBook = new Book("Nassim Talleb","Antifragile");
        bookDataBase.save(firstBook);
        Long ID = firstBook.getId();
        System.out.println(ID);
    }
}
