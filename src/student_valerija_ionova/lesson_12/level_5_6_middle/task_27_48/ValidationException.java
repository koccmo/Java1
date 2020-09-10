package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//Task30

class ValidationException extends RuntimeException{

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

}
