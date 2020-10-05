package student_anvars_intezars.home_tasks.lesson_12.level_2;

class AccessDeniedException extends RuntimeException{

    private String invalidUid;

    public AccessDeniedException(String message, String invalidUid) {
        super(message);
        this.invalidUid = invalidUid;
    }

    public String getInvalidUid() {
        return invalidUid;
    }
}


