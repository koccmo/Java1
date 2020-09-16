package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_21;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("1890");

        //- автор книги "Kuper" и название "Zveroboi"
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        //- автор книги "Kuper" и год выпуска 1890
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);

        //- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
        SearchCriteria searchCriteria2 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(searchCriteria2, titleSearchCriteria);
    }

}
