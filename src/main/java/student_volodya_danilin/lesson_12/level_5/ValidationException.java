package student_volodya_danilin.lesson_12.level_5;

class ValidationException extends Throwable{

    private String ruleName;

    private String description;

    private String fieldName;

    ValidationException(String ruleName,
                        String description,
                        String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    void printException() {
        System.out.println(ruleName
        + " " + description + " "
        + "[" + fieldName + "]\n");

    }

    String getRuleName() {
        return ruleName;
    }

}
