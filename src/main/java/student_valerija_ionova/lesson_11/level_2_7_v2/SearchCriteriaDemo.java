package student_valerija_ionova.lesson_11.level_2_7_v2;

//классов OrSearchCriteria и AndSearchCriteria составьте сложные условия:
//- автор книги "Kuper" и название "Zveroboi"
//- автор книги "Kuper" и год выпуска 1890
//- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SearchCriteriaDemo {

    SearchCriteria authorSC = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSC = new TitleSearchCriteria("Zveroboi");
    SearchCriteria yearSC = new YearOfIssueSearchCriteria("1890");

    SearchCriteria sc1 = new AndSearchCriteria(authorSC, titleSC);
    SearchCriteria sc2 = new AndSearchCriteria(authorSC, yearSC);
    SearchCriteria sc3 = new OrSearchCriteria(authorSC, new OrSearchCriteria(titleSC, yearSC));
}
