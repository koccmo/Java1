package student_valerija_ionova.lesson_11.level_3.task_15_22;

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
