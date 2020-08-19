package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ObjectOnDiskFactory {

    public static ObjectOnDisk createNewFile(String name, ExtensionOfFile extension){
        return new ObjectOnDisk (name, extension);
    }

    public static ObjectOnDisk createNewFolder (String name){
        return new ObjectOnDisk (name);
    }

    public static ObjectOnDisk createNewSubFolder (String folderName, String parentFolderName){
        return new ObjectOnDisk (folderName, parentFolderName);
    }

}


