package student_roberts_kupcs.lesson_11.homework.level_3;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueToSearch = new YearOfIssueSearchCriteria("1890");

        //- автор книги "Kuper" и название "Zveroboi"
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        //- автор книги "Kuper" и год выпуска 1890
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueToSearch);

        //- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
        SearchCriteria searchCriteria2 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueToSearch);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);



    }
}
