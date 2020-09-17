package student_volodya_danilin.lesson_11.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SearchCriteriaDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Kuper", "Zveroboi");
        Book book2 = new Book("Kuper", "", "1890");
        Book book3 = new Book("", "", "1890");

        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);

        SearchCriteria authorSearch = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearch = new TitleSearchCriteria("Zveroboi");


        System.out.println("\nTest 1");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearch, titleSearch);

        if (searchCriteria.match(book1)) {
            if (!searchCriteria.match(book2)
            && !searchCriteria.match(book3)) {
                System.out.println("Test 1 OK");
            }
            else {
                System.out.println("Test 1 FAIL in !searchCriteria.match");
            }
        }
        else {
            System.out.println("Test 1 FAIL in searchCriteria.match");
        }

        System.out.println("\nTest 2");
        searchCriteria = new OrSearchCriteria(authorSearch, titleSearch);

        if (searchCriteria.match(book1)
        && searchCriteria.match(book2)) {
            if (!searchCriteria.match(book3)) {
                System.out.println("Test 2 OK");
            }
            else {
                System.out.println("Test 2 FAIL in !searchCriteria.match");
            }
        }
        else {
            System.out.println("Test 2 FAIL is searchCriteria.match");
        }


    }
}