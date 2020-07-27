package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_1;

class DiskTest {

    public static void main (String[] args){

        DiskTest diskTest = new DiskTest();

        diskTest.testAddObjectOnDiskOneObjectName();
        diskTest.testAddObjectOnDiskOneObjectSize();
        diskTest.testAddObjectOnDiskTwoObjects();
        diskTest.testEnoughSpaceOnDiskTrue();
        diskTest.testEnoughSpaceOnDiskFalse();
        diskTest.parentFolderName();
        diskTest.testDeleteFolderOrFileFromDisk();
        diskTest.testValidNameTrue();
        diskTest.testValidNameFalse();
        diskTest.testAddFolderAddSubFolderDeleteBothAddNewFile();
        diskTest.testAddFolderAddSubFolderDeleteBothAddTwoNewFiles();
    }

    public void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+ " OK\n");
        }else{
            System.out.println(name+" FAIL\n");
        }
    }

    public void checkString(String name, String methodsResult, String expectedResult){
        printResult(name, methodsResult.equals(expectedResult));
    }

    public void checkBoolean (String name, boolean methodsResult, boolean expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void checkInt (String name, int methodsResult, int expectedResult){
        printResult(name, methodsResult == expectedResult);
    }


    public void testAddObjectOnDiskOneObjectName(){
        Disk disk = new Disk('A', 20);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);
        disk.addObjectOnDisk(objectOnDisk);

        checkString("testAddObjectOnDiskOneObjectName", disk.getPlaceOfDisk()[0].getName(), "Good_File");
    }


    public void testAddObjectOnDiskOneObjectSize(){
        Disk disk = new Disk('A', 20);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);
        disk.addObjectOnDisk(objectOnDisk);

        checkInt("testAddObjectOnDiskOneObjectSize", disk.getPlaceOfDisk()[0].getSizeInByte(), 5);
    }

    public void testAddObjectOnDiskTwoObjects(){
        Disk disk = new Disk('A', 20);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);
        disk.addObjectOnDisk(objectOnDisk1);

        ObjectOnDisk objectOnDisk2 = objectOnDiskFactory.createNewFolder("Bad_Folder");
        disk.addObjectOnDisk(objectOnDisk2);

        checkString("testAddObjectOnDiskTwoObjects", disk.getPlaceOfDisk()[0].getName(), "Good_File");
    }

    public void testEnoughSpaceOnDiskTrue(){
        Disk disk = new Disk('A', 20);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);
        disk.addObjectOnDisk(objectOnDisk);

        ObjectOnDisk newObjectOnDisk = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);

        checkBoolean("testEnoughSpaceOnDiskTrue", disk.enoughSpaceOnDisk(newObjectOnDisk), true);
    }

    public void testEnoughSpaceOnDiskFalse(){
        Disk disk = new Disk('A', 5);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);
        disk.addObjectOnDisk(objectOnDisk);

        ObjectOnDisk newObjectOnDisk = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);

        checkBoolean("testEnoughSpaceOnDiskFalse", disk.enoughSpaceOnDisk(newObjectOnDisk), false);
    }

    public void parentFolderName(){
        Disk disk = new Disk('A', 10);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk = objectOnDiskFactory.createNewFolder("Parent_Folder");
        disk.addObjectOnDisk(objectOnDisk);

        ObjectOnDisk newObjectOnDisk = objectOnDiskFactory.createNewSubFolder("Good_File", "Parent_Folder");
        disk.addObjectOnDisk(newObjectOnDisk);

        checkString("parentFolderName", disk.parentFolderName(newObjectOnDisk.getName()), "Parent_Folder");
    }

    public void testDeleteFolderOrFileFromDisk(){

        Disk disk = new Disk('A', 10);


        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFile("Good_File", ExtensionOfFile.java);
        disk.addObjectOnDisk(objectOnDisk1);

        ObjectOnDisk objectOnDisk2 = objectOnDiskFactory.createNewFolder("Bad_Folder");
        disk.addObjectOnDisk(objectOnDisk2);

        disk.deleteFolderOrFileFromDisk("Bad_Folder");

        ObjectOnDisk objectOnDisk3 = objectOnDiskFactory.createNewFile("New_File", ExtensionOfFile.txt);
        disk.addObjectOnDisk(objectOnDisk3);

        checkString("testDeleteFolderOrFileFromDisk", disk.getPlaceOfDisk()[5].getName(), "New_File");
    }

    public void testValidNameTrue(){
        Disk disk = new Disk('A', 10);

        checkBoolean("testValidNameTrue", disk.validName("Ab_1"), true);
    }

    public void testValidNameFalse(){
        Disk disk = new Disk('A', 10);

        checkBoolean("testValidNameFalse", disk.validName("A-b_+1"), false);
    }

    public void testAddFolderAddSubFolderDeleteBothAddNewFile(){

        Disk disk = new Disk('A', 10);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFolder("Big_Folder");
        disk.addObjectOnDisk(objectOnDisk1);

        ObjectOnDisk objectOnDisk2 = objectOnDiskFactory.createNewSubFolder("Small_Folder", "Big_Folder");
        disk.addObjectOnDisk(objectOnDisk2);

        disk.deleteFolderOrFileFromDisk("Big_Folder");

        ObjectOnDisk objectOnDisk3 = objectOnDiskFactory.createNewFile("New_File", ExtensionOfFile.txt);
        disk.addObjectOnDisk(objectOnDisk3);

        checkString("testAddFolderAddSubFolderDeleteBothAddNewFile", disk.getPlaceOfDisk()[0].getName(), "New_File");
    }

    public void testAddFolderAddSubFolderDeleteBothAddTwoNewFiles(){

        Disk disk = new Disk('A', 10);

        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFolder("Big_Folder");
        disk.addObjectOnDisk(objectOnDisk1);

        ObjectOnDisk objectOnDisk2 = objectOnDiskFactory.createNewSubFolder("Small_Folder", "Big_Folder");
        disk.addObjectOnDisk(objectOnDisk2);

        disk.deleteFolderOrFileFromDisk("Big_Folder");

        ObjectOnDisk objectOnDisk3 = objectOnDiskFactory.createNewFile("New_File", ExtensionOfFile.txt);
        disk.addObjectOnDisk(objectOnDisk3);

        ObjectOnDisk objectOnDisk4 = objectOnDiskFactory.createNewFile("Newest_File", ExtensionOfFile.java);
        disk.addObjectOnDisk(objectOnDisk4);

        checkString("testAddFolderAddSubFolderDeleteBothAddTwoNewFiles", disk.getPlaceOfDisk()[5].getName(), "Newest_File");
        //disk.printArrayOfDisk("testAddFolderAddSubFolderDeleteBothAddTwoNewFiles");
    }



}
