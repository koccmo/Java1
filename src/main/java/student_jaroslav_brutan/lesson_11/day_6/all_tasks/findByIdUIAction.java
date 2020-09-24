package student_jaroslav_brutan.lesson_11.day_6.all_tasks;

import java.util.Optional;
import java.util.Scanner;

public class findByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public findByIdUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
        }

        public void execute(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your books id number:");
            Long id = scanner.nextLong();

            Optional<Book> bookOpt = bookDatabase.findById(id);
            if (bookOpt.isPresent()){
                Book yourFoundedBook = bookOpt.get();
                System.out.println("We found your book " + yourFoundedBook);
            } else {
                System.out.println("We can't find your book with this id " + id);
            }
        }

}
