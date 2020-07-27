package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_1;

class ObjectOnDiskFactoryTest {

    public static void main (String [] args){
        ObjectOnDiskFactoryTest objectOnDiskFactoryTest = new ObjectOnDiskFactoryTest();

        objectOnDiskFactoryTest.testCreateNewFileExtension();
        objectOnDiskFactoryTest.testCreateNewFileSize();
        objectOnDiskFactoryTest.testCreateNewFileName();

        objectOnDiskFactoryTest.testCreateNewSubFolderSize();
        objectOnDiskFactoryTest.testCreateNewSubFolderName();

        objectOnDiskFactoryTest.testCreateNewFolderSize();
        objectOnDiskFactoryTest.testCreateNewFolderName();

    }

    public void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkString(String name, String methodsResult, String expectedResult){
        printResult(name, methodsResult.equals(expectedResult));
    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void checkExtension(String name, ExtensionOfFile methodsResult, ExtensionOfFile expectedResult){
        printResult(name, methodsResult.equals(expectedResult));
    }

    public void testCreateNewFileExtension(){
        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFile("CV", ExtensionOfFile.exe);

        checkExtension("testCreateNewFileSize", objectOnDisk1.getExtension(), ExtensionOfFile.exe);
    }

    public void testCreateNewFileSize(){
        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFile("CV", ExtensionOfFile.exe);

        checkInt("testCreateNewFileSize", objectOnDisk1.getSizeInByte(), 5);
    }

    public void testCreateNewFileName(){
        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFile("CV", ExtensionOfFile.exe);

        checkString("testCreateNewFileName", objectOnDisk1.getName(), "CV");
    }

    public void testCreateNewSubFolderSize(){
        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewSubFolder("Documents", "PC");

        checkInt("testCreateNewSubFolderSize", objectOnDisk1.getSizeInByte(), 5);
    }

    public void testCreateNewSubFolderName(){
        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewSubFolder("Documents", "PC");

        checkString("testCreateNewSubFolderName", objectOnDisk1.getName(), "PC\\Documents");
    }


    public void testCreateNewFolderName(){
        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFolder("Documents");

        checkString("testCreateNewFolderName", objectOnDisk1.getName(), "Documents");
    }

    public void testCreateNewFolderSize(){
        ObjectOnDiskFactory objectOnDiskFactory = new ObjectOnDiskFactory();

        ObjectOnDisk objectOnDisk1 = objectOnDiskFactory.createNewFolder("Documents");

        checkInt("testCreateNewFolderName", objectOnDisk1.getSizeInByte(), 5);
    }

}
