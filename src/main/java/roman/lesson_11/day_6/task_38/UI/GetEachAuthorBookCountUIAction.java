package roman.lesson_11.day_6.task_38.UI;

import roman.lesson_11.day_6.task_38.BookDatabase;
import roman.lesson_11.day_6.task_38.UIAction;

import java.util.Iterator;
import java.util.Map;

public class GetEachAuthorBookCountUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> eachAuthorBookCount = bookDatabase.getEachAuthorBookCount();
        if (eachAuthorBookCount.isEmpty()) {
            System.out.println("Library is Empty");
        } else {
            eachAuthorBookCount.forEach((author, integer) -> System.out.println("Author : " + author
            + ", Book Number : " + integer));
//            Iterator<Map.Entry<String, Integer>> author = eachAuthorBookCount.entrySet().iterator();
//            while (author.hasNext()) {
//                Map.Entry<String, Integer> entry = author.next();
//                System.out.println("Author : " + entry.getKey() + ", Book Nr: " + entry.getValue());
            }
        }

    }

