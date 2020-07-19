package student_valerija_ionova.lesson_7.level_x.super_task_1;

public class ObjectOnDiskFactory {

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


