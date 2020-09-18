package student_valerija_ionova.lesson_11.level_2_7_v2;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (yearOfIssueToSearch.equals(book.getYear())){
            return true;
        }else{
            return false;
        }
    }

}
