package student_anvars_intezars.home_tasks.lesson_11.level_5_tasks;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        Book newBook = new Book("Kuper","Zveroboi","1890");


        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria andSearchCriteria2 = new AndSearchCriteria(authorSearchCriteria,yearOfIssueCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria,yearOfIssueCriteria);
    }
}
