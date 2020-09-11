package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//Task30

import java.util.Objects;

class ValidationException extends Exception{

    private String ruleName;

    private String description;

    private String fieldName;

    ValidationException (String ruleName,String description, String fieldName){
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    String getRuleName(){
        return ruleName;
    }

    String getDescription(){
        return description;
    }

    String getFieldName(){
        return fieldName;
    }

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
