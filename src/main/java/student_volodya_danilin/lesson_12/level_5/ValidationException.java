package student_volodya_danilin.lesson_12.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ValidationException extends Exception{

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

    String getRuleName() {
        return ruleName;
    }

    void printExceptionInfo() {
        System.out.println(ruleName + description + fieldName);
    }
}
