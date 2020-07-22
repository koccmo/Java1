package student_valerija_ionova.lesson_6.level_x.super_task_1.second_variant;

import java.util.ArrayList;
import java.util.Arrays;

public class Policy {

    private ArrayList <ObjectForPolicy> objectsForPolicy;

    public Policy (ObjectForPolicy ... objectsForPolicy){
        this.objectsForPolicy = new ArrayList<ObjectForPolicy> (Arrays.asList(objectsForPolicy));
    }

    public ArrayList <ObjectForPolicy> getObjectsForPolicy(){
        return objectsForPolicy;
    }

}
