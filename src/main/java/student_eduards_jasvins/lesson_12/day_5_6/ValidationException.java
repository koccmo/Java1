package student_eduards_jasvins.lesson_12.day_5_6;

import java.util.Objects;

class ValidationException extends Exception {

    private String ruleName;

    private String description;

    private String fieldName;


    ValidationException (String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getDescription() { return description; }

    public String getRuleName() { return ruleName; }

    public String getFieldName() { return fieldName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(ruleName, that.ruleName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }
}
