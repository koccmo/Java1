package student_jaroslav_brutan.lesson_11.day_4.all_tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookDatabase = new ArrayList<>();
    List<Book> getDatabase(){
        return bookDatabase;
    }
    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> setOfAuthors = new HashSet<>();
        for (int i = 0; i < bookDatabase.size();i++){
            setOfAuthors.add(bookDatabase.get(i).getAuthor());
        } return setOfAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> setOfTitles = new HashSet<>();
        for (int i = 0; i < bookDatabase.size();i++){
            setOfTitles.add(bookDatabase.get(i).getTitle());
        } return setOfTitles;
    }

	@Override
	public Set<Book> findUniqueBooks() {
		return null;
	}

}
