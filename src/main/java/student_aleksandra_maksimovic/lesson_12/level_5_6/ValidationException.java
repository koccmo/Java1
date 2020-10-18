package student_aleksandra_maksimovic.lesson_12.level_5_6;

import java.util.Objects;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class ValidationException extends Exception {

    // название валидационного правила, которое создало эту ошибку
    private String ruleName;

    // описание ошибки, которое можно показать на UI
    private String description;

    // название поля при проверке которого произошла эта ошибка
    // (Product: title, price, description),
    // UI сможет по этому названию показать ошибку рядом с нужным полем
    private String fieldName;


    public ValidationException(String ruleName, String description, String fieldName)
    {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }


    public String getRuleName() {
        return ruleName;
    }

    @CodeReviewComment(teacher = "Do not create unused setter methods!")
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getDescription() {
        return description;
    }

	@CodeReviewComment(teacher = "Do not create unused setter methods!")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getFieldName() {
        return fieldName;
    }

	@CodeReviewComment(teacher = "Do not create unused setter methods!")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ValidationException e = (ValidationException) o;
        return Objects.equals(ruleName, e.ruleName) &&
                Objects.equals(description, e.description) &&
                Objects.equals(fieldName, e.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }

}
