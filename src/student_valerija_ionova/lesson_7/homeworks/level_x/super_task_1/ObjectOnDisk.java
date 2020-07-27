package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_1;

class ObjectOnDisk {

    private String name;
    private int sizeInByte;
    private ExtensionOfFile extension;

    public ObjectOnDisk (String name, ExtensionOfFile extension){
        this.name = name;
        this.sizeInByte = 5;
        this.extension = extension;
    }

    public ObjectOnDisk (String name){
        this.name = name;
        this.sizeInByte = 5;
        this.extension = null;
    }

    public ObjectOnDisk (String folderName, String parentFolderName){
        this.name = parentFolderName+"\\"+folderName;
        this.sizeInByte = 5;
        this.extension = null;
    }

    public String getName(){
        return name;
    }

    public int getSizeInByte(){
        return this.sizeInByte;
    }

    public ExtensionOfFile getExtension(){
        return extension;
    }

    public boolean isFile(){
        return (extension != null);
    }

}
