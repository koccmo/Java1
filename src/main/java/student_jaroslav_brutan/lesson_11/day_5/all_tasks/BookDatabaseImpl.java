package student_jaroslav_brutan.lesson_11.day_5.all_tasks;

import java.util.*;

public abstract class BookDatabaseImpl implements BookDatabase{
// не понимаю почему не имплементировалось, просила сделать класс абстрактным, сделал, но не знаю правильно ли
    @Override
    public Map<String, List<Book>> getAuthorToBooksMap(){
        Map<String, List<Book>> authorToBookMap = new HashMap<>();
        for (String author : findUniqueAuthors()) {
            authorToBookMap.put(author,findByAuthor(author));
        }
        return authorToBookMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount(){
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        for (String author : findUniqueAuthors()) {
            List<Book> authorBooks = findByAuthor(author);
            Set<Book> uniqueBook = new HashSet<>(authorBooks);
            eachAuthorBookCount.put(author,uniqueBook.size());
        }
        return eachAuthorBookCount;
    }
}
