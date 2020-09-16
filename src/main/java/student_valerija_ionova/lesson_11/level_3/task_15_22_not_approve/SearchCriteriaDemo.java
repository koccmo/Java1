package student_valerija_ionova.lesson_11.level_3.task_15_22_not_approve;

/*Task21 Создайте класс SearchCriteriaDemo
- автор книги "Kuper" и название "Zveroboi"
- автор книги "Kuper" и год выпуска 1890
- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"*/

public class SearchCriteriaDemo {

    public static void main (String [] args){

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        //- автор книги "Kuper" и название "Zveroboi"
        AndSearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        //- автор книги "Kuper" и год выпуска 1890
        AndSearchCriteria andSearchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        //- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
        OrSearchCriteria orSearchCriteria1 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(orSearchCriteria1, titleSearchCriteria);

    }

}
