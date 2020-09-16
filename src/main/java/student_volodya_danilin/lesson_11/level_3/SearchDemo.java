package student_volodya_danilin.lesson_11.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SearchDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Писатель", "Книга");
        Book book2 = new Book("Автор2-3", "Книга");

        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(book1);
        database.save(book2);


        System.out.print("\nTest 1 (Task_16) : ");
        System.out.println("AuthorSearchCriteria boolean match(Book book)");
        AuthorSearchCriteria authorSearch = new AuthorSearchCriteria("Писатель");
        if (authorSearch.match(book1)
        && !authorSearch.match(book2)) {
            System.out.println("Test 1 OK");
        }
        else {
            System.out.println("Test 1 FAIL");
        }


        System.out.println("\nTest 2 (Task_17)");
        System.out.println("TitleSearchCriteria boolean match(Book book)");
        Book book4 = new Book("Стивен Кинг", "Зелёная миля");
        database.save(book4);
        TitleSearchCriteria titleSearch = new TitleSearchCriteria("миля");
        if (titleSearch.match(book4)
        && !titleSearch.match(book2)) {
            System.out.println("Test 2 OK");
        }
        else {
            System.out.println("Test 2 FAIL");
        }


        System.out.println("\nTest 3 (Task_18)");
        System.out.println("YearOfIssueSearchCriteria boolean match(Book book)");

        Book book5 = new Book("Джордж Мартин", "Буря мечей", "2018");
        Book book6 = new Book("Марио Пьюзо", "Крестный отец", "2009");
        database.save(book5);
        database.save(book6);

        YearOfIssueSearchCriteria yearSearch = new YearOfIssueSearchCriteria("2018");
        if (yearSearch.match(book5)
        && !yearSearch.match(book6)) {
            System.out.println("Test 3 OK");
        }
        else {
            System.out.println("Test 3 FAIL");
        }


        System.out.println("\nTest 4 (Task_19)");
        System.out.println("AndSearchCriteria boolean match(Book book)");

        Book book7 = new Book("Марио Пьюзо", "Последний дон", "1996");
        database.save(book7);

        authorSearch = new AuthorSearchCriteria("Марио Пьюзо");
        titleSearch = new TitleSearchCriteria("Последний дон");
        AndSearchCriteria andSearch = new AndSearchCriteria(authorSearch, titleSearch);

        if (andSearch.match(book7)
        && !andSearch.match(book6)) {
            System.out.println("Test 4 OK");
        }
        else {
            System.out.println("Test 5 FAIL");
        }


        System.out.println("\nTest 5 (Task_20)");
        System.out.println("OrSearchCriteria boolean match(Book book)");

        book5 = new Book("Джордж Мартин", "Буря мечей", "2018");
        book6 = new Book("Марио Пьюзо", "Крестный отец", "2009");
        book7 = new Book("Марио Пьюзо", "Последний дон", "1996");


        authorSearch = new AuthorSearchCriteria("Марио Пьюзо");
        AuthorSearchCriteria authorSearch2 = new AuthorSearchCriteria("Джордж Мартин");
        OrSearchCriteria orSearch = new OrSearchCriteria(authorSearch, authorSearch2);

        if (orSearch.match(book5)
        && orSearch.match(book6)
        && orSearch.match(book7)) {
            if (!orSearch.match(book2)) {
                System.out.println("Test 5 OK");
            }
            else {
                System.out.println("Test 5 FAIL in !orSearch.match");
            }
        }
        else {
            System.out.println("Test 5 FAIL in orSearch.match");
        }

    }
}
