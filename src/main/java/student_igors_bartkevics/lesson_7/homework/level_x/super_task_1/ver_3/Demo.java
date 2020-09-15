package student_igors_bartkevics.lesson_7.homework.level_x.super_task_1.ver_3;

import java.util.Arrays;
import java.util.List;

class Demo {
    public static void main(String[] args) {
        FileSystem system = new FileSystem();
        system.createVirtualHardDisk('C', 50);
        VirtualHardDisk disk = system.getVirtualHardDisks().get(0);
        if (disk != null) System.out.println("Disk created");
        System.out.println(disk.getFreeSpace());
        disk.createFolder("folder0");
        disk.createFolder("folder1");
        List<Folder> diskFolders = disk.getFolders();
        diskFolders.get(0).createFolder("folder00");
        diskFolders.get(1).createFolder("folder01");
        disk.getFolders().get(1).getFolders().get(0).createFolder("folder010");
        disk.getFolders().get(1).getFolders().get(0).getFolders().get(0).createFile("folder01000",3, "exl");
        disk.createFile("file0", 1, "doc");
        disk.createFile("file1", 3, "doc");
        System.out.println(disk.getFreeSpace());
        System.out.println(Arrays.toString(disk.getMemory()));
        int unitID = disk.getFolders().get(1).getUnitID();
        disk.removeFolder(unitID);
        System.out.println(disk.getFreeSpace());
        System.out.println(Arrays.toString(disk.getMemory()));




    }
}
