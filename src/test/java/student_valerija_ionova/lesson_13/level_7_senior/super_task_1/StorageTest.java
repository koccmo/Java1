package student_valerija_ionova.lesson_13.level_7_senior.super_task_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StorageTest {

    Storage storage = new Storage("C");
    File file1 = new File("File1.mp3", 2);
    File file2 = new File("File2.mp3", 5);
    File file3 = new File("File3.mp3", 2);
    File file4 = new File("File4.jpg", 1);
    File file5 = new File("File5.txt", 3);
    File file6 = new File("File6.jpg", 4);
    Directory directory1 = new Directory("Directory1");
    Directory directory2 = new Directory("Directory2");

    @Before
    public void init() {
        storage.addResource(file1);
        storage.addResource(file6);
        directory1.addResource(file2);
        directory1.addResource(file3);
        directory1.addResource(directory2);
        storage.addResource(directory1);
        directory2.addResource(file4);
        directory2.addResource(file5);
    }

    @Test
    public void testRootDirectoryName(){
        assertEquals("C:/", storage.rootDirectory().getName());
    }

    @Test
    public void testCanAddFileToStorage(){
        assertEquals(true, storage.getRootDirectory().getResourceList().contains(file1));
        assertEquals(3, storage.getRootDirectory().getResourceList().size());
    }

    @Test
    public void testCanAddDirectoryToStorage(){
        assertEquals(true, storage.getRootDirectory().getResourceList().contains(directory1));
        assertEquals(3, storage.getRootDirectory().getResourceList().size());
    }

    @Test
    public void testCanDeleteFileFromStorage(){
        storage.deleteResources(file1);
        assertEquals(false, storage.getRootDirectory().getResourceList().contains(file1));
        assertEquals(2, storage.getRootDirectory().getResourceList().size());
    }

    @Test
    public void testCanDeleteDirectoryFromStorage(){
        storage.deleteResources(directory1);
        assertEquals(false, storage.getRootDirectory().getResourceList().contains(directory1));
        assertEquals(2, storage.getRootDirectory().getResourceList().size());
    }

    @Test
    public void canAddDirectoryToDirectory(){
        assertEquals(true, directory1.getResourceList().contains(directory2));
        assertEquals(3, directory1.getResourceList().size());
    }

    @Test
    public void canAddFileToDirectory(){
        assertEquals(true, directory1.getResourceList().contains(file3));
        assertEquals(3, directory1.getResourceList().size());
    }

    @Test
    public void testCanDeleteFileFromDirectory(){
        directory1.deleteResource(file3);
        assertEquals(false, directory1.getResourceList().contains(file3));
        assertEquals(2, directory1.getResourceList().size());
    }

    @Test
    public void testCanDeleteDirectoryFromDirectory(){
        assertEquals(true, directory1.deleteResource(directory2));
        assertEquals(false, directory1.getResourceList().contains(directory2));
        assertEquals(2, directory1.getResourceList().size());
    }

    @Test
    public void testTotalSize(){
        assertEquals(17, storage.totalSize());
    }

    @Test
    public void testTotalSize2(){
        File fileNew = new File("Picture.jpg", 3);
        directory1.addResource(fileNew);
        assertEquals(20, storage.totalSize());
    }

    @Test
    public void testTotalCountMP3(){
        assertEquals(3, storage.totalMP3("mp3"));
    }

    @Test
    public void testTotalCountMP3AddedMP3(){
        File fileNew = new File("File35.mp3", 15);
        directory2.addResource(fileNew);
        assertEquals(4, storage.totalMP3("mp3"));
    }


}