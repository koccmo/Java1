package student_roberts_kupcs.lesson_11.homework.level_3_4_5_6;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        // запросите все данные о книге с консоли у пользолвателя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
        Scanner scanner = new Scanner(System.in);

        System.out.println("данные о книге Autor = ");
        String author = scanner.nextLine();

        System.out.println("данные о книге Title = ");
        String title = scanner.nextLine();

        Book book = new Book(author, title);

        bookDatabase.save(book);
    }
}
