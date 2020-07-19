package student_valerija_ionova.lesson_7.level_x.super_task_1;

public class FileSystemTest {

    public static void  main(String [] args){

        FileSystemTest fileSystemTest = new FileSystemTest();

        fileSystemTest.testCreateDiskOK();
        fileSystemTest.testCreateDiskNotValidName();
        fileSystemTest.testCreateDiskNotValidSize();
    }
    public void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+ " OK\n");
        }else{
            System.out.println(name+" FAIL\n");
        }
    }

    public void checkChar(String name, char methodsResult, char expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void checkBoolean (String name, boolean methodsResult, boolean expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void checkInt (String name, int methodsResult, int expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void testCreateDiskOK(){

        FileSystem fileSystem = new FileSystem();

        Disk disk;
        if (fileSystem.createDisk('a', 10)){
            disk = fileSystem.getListOfDisks().get(0);

            checkChar("testCreateDiskOK", disk.getName(), 'A');
        }
    }

    public void testCreateDiskNotValidName(){

        FileSystem fileSystem = new FileSystem();

        checkBoolean("testCreateDiskNotValidName", fileSystem.createDisk('+', 10), false);
    }

    public void testCreateDiskNotValidSize(){

        FileSystem fileSystem = new FileSystem();

        if (fileSystem.createDisk('d', 10)) {
            checkInt("testCreateDiskNotValidSize", fileSystem.getListOfDisks().get(0).getSizeInByte(), 10);
        }
    }

}
