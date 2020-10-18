package student_valerija_ionova.lesson_11.level_3_approved.task_15_22_not_approve;

class TitleSearchCriteria implements  SearchCriteria{

    private String titleToSearch;

    TitleSearchCriteria (String titleToSearch){
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getTitle().equals(titleToSearch)){
            return true;
        }else {
            return false;
        }
    }
}
