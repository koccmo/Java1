package student_valerija_ionova.lesson_10.level_x.super_task_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class MyListImpl implements  MyList{

	@CodeReviewComment(teacher = "Must be private!")
    String [] array;

    MyListImpl (String [] array){
        this.array = array;
    }

    String [] getArray(){
        return array;
    }

    @Override
    public void addElement(String string) {
        String [] newArray = new String [array.length+1];
        for (int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = string;
        array = newArray;
    }

    @Override
    public void insertElement(int index, String string) {
        String [] newArray = new String [array.length+1];

        for (int i = 0; i< index; i++){
            newArray[i] = array[i];
        }
        newArray[index] = string;
        for (int i = index; i< array.length; i++){
            newArray[i+1] = array[i];
        }
        array = newArray;
    }

    @Override
    public void deleteElement(int index) {
        if (array.length > 0){
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        array = newArray;
    }
    }
}
