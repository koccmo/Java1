package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

/*объект Policy - этот объект должет содержать полное описание страхового полюса и всех его деталей, которые нужны для
расчёта стоимости страховки). */

public class Policy {

    private ObjectForPolicy [] objectsForPolicy;

    public Policy (ObjectForPolicy [] objectsForPolicy){
        this.objectsForPolicy = objectsForPolicy;
    }

    public ObjectForPolicy [] getObjectsForPolicy(){
        return objectsForPolicy;
    }

}
