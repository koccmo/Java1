package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_1;

public class Disk {

    private char name;
    private int sizeInByte;
    private ObjectOnDisk [] placeOfDisk;
    private int freeIndex = 0;

    public Disk (char name, int size){
        this.name = name;
        this.sizeInByte = size;
        this.placeOfDisk = new ObjectOnDisk [sizeInByte];
    }

    public int firstFreeIndex(){
        return freeIndex;
    }

    public boolean enoughSpaceOnDisk (ObjectOnDisk objectOnDisk){
        return (objectOnDisk.getSizeInByte() <= (placeOfDisk.length - firstFreeIndex()));
    }

    public boolean validSubFolderName(String name){
        return ((name.indexOf("\\") != -1) && (subFolderName(name).matches("[a-zA-Z0-9_]*")));
    }

    public boolean validName(String name){

        return ((validSubFolderName(name)) || ((name.length()<=20) && (name.matches("[a-zA-Z0-9_]*"))));
    }

    public void addObjectOnDisk(ObjectOnDisk objectOnDisk) {
        if (validName(objectOnDisk.getName()))
        {
            if (enoughSpaceOnDisk(objectOnDisk)) {
                int freeIndex = firstFreeIndex();
                for (int i = 0; i < objectOnDisk.getSizeInByte(); i++) {
                    placeOfDisk[freeIndex + i] = objectOnDisk;
                }
            } else {
                System.out.println("Not enough place on disk! Please try another disk! Operation cancelled!");
            }
            freeIndex += objectOnDisk.getSizeInByte();
        }
        else{
            System.out.println("Not valid name for object "+objectOnDisk.getName()+". Operation cancelled!");
        }
    }

    public String parentFolderName(String name){
        String [] bothNames = name.split("[^a-zA-Z0-9 _]+");
        String result = bothNames[0];
        return result;
    }

    public String subFolderName(String name){
        String [] bothNames = name.split("[^a-zA-Z0-9 _]+");
        String result = bothNames[1];
        return result;
    }

    public boolean matchName(String name, ObjectOnDisk objectOnDisk){
        return ((objectOnDisk.getName().equals(name)) || (parentFolderName(objectOnDisk.getName()).equals(name)));
    }

    public void deleteFolderOrFileFromDisk(String name){
        for (int i = 0; i < freeIndex; i++){
            if (matchName(name, placeOfDisk[i])){
                for ( int j = i; j < freeIndex-1; j++){
                    placeOfDisk[j] = placeOfDisk[j+1];
                }
                i--;
                freeIndex --;
            }
        }
    }

    public char getName(){
        return name;
    }

    public int getSizeInByte(){
        return sizeInByte;
    }

    public ObjectOnDisk [] getPlaceOfDisk(){
        return placeOfDisk;
    }


    public void printArrayOfDisk(String name) {
        System.out.println(name);
        for (int i = 0; i < freeIndex; i++) {
            System.out.println(placeOfDisk[i].getName());
        }
    }
}
