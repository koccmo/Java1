package student_valerija_ionova.lesson_11.level_4.task_23_27;

//Task 18 Создайте класс YearOfIssueSearchCriteria:

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (book.getYearOfIssue() == yearOfIssueToSearch){
            return true;
        }else{
            return false;
        }
    }

}