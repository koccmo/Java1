package roman.lesson_11.day_6.task_32;

public class FindByIdUIActionDemo {
    public static void main(String[] args) {
        Book garden = new Book("James", "Garden", "2000");
        Book porch = new Book("John", "Porch", "1999");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        FindByIdUIAction findByIdUIAction = new FindByIdUIAction(bookDatabase);

        bookDatabase.save(garden);
        bookDatabase.save(porch);

        findByIdUIAction.execute();
    }
}
