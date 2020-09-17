package student_volodya_danilin.lesson_11.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task22_Demo {

    public static void main(String[] args) {

        Book book1 = new Book("Binco", "San Andreas", "2000");
        Book book2 = new Book("Binco", "Vice City", "2010");
        Book book3 = new Book("Klaus", "Travel Guide", "2000");
        Book book4 = new Book("Klaus", "Vice City", "2000");
        Book book5 = new Book("", "", "2005");

        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);


        System.out.println("\nTest 1");
        SearchCriteria titleSearch = new TitleSearchCriteria("Vice City");
        SearchCriteria yearSearch = new YearOfIssueSearchCriteria("2000");
        SearchCriteria searchCriteria = new AndSearchCriteria(titleSearch, yearSearch);

        if (searchCriteria.match(book4)) {
            if (!searchCriteria.match(book1)
            && !searchCriteria.match(book2)
            && !searchCriteria.match(book3)
            && !searchCriteria.match(book5)) {
                System.out.println("Test OK");
            }
            else {
                System.out.println("Test 2 FAIL in !searchCriteria.match");
            }
        }
        else {
            System.out.println("Test 2 FAIL in searchCriteria.match");
        }


        System.out.println("\nTest 2");
        yearSearch = new YearOfIssueSearchCriteria("2005");
        titleSearch = new TitleSearchCriteria("Travel Guide");
        searchCriteria = new OrSearchCriteria(yearSearch, titleSearch);

        if (searchCriteria.match(book3)
        && searchCriteria.match(book5)) {
            if (!searchCriteria.match(book1)
            && !searchCriteria.match(book2)
            && !searchCriteria.match(book4)) {
                System.out.println("Test 2 OK");
            }
            else {
                System.out.println("Test 2 FAIL in !searchCriteria.match");
            }
        }
        else {
            System.out.println("Test 2 FAIL in searchCriteria.match");
        }
    }
}
