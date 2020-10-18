package student_roberts_kupcs.lesson_11.homework.level_3_4_5_6;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите id книги с консоли у пользолвателя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // вывелите на консоль результаты поиска
        Scanner scanner = new Scanner(System.in);
        System.out.println("id книги = ");
        Long bookId = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(bookId);
        //if () {

        //}

    }
}
