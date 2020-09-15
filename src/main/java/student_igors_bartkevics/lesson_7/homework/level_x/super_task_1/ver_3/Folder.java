package student_igors_bartkevics.lesson_7.homework.level_x.super_task_1.ver_3;

import java.util.ArrayList;
import java.util.List;

class Folder {
    private String name;
    private int size = 5;
    private VirtualHardDisk disk;
    private int unitID;
    public Folder(String name, VirtualHardDisk disk) {
        this.name = name;
        this.disk = disk;
    }

    private List<Folder> folders = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    public int getSize() {
        return size;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public int getUnitID() {
        return unitID;
    }

    void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public void createFolder(String name) {
        Folder folder = new Folder(name, disk);
        if (disk.getFreeSpace() >= folder.getSize()) {
            if (NameValidator.isFolderNameValid(name)) {
                //Folder folder = new Folder(name);
                folders.add(folder);
                saveFolderInDiskMemory(folder, disk);
                folder.setUnitID(disk.getUnitIDToUse());
                disk.increaseDataUnitIDToUse();
            }
            else System.out.println("Entered name is invalid");
        }
        else System.out.println("It's not enough free space on disk");
    }

    public void createFile(String name, int size, String fileExtension) {
        File file = new File(name, disk, size, fileExtension);
        if (disk.getFreeSpace() >= file.getSize()) {
            if (NameValidator.isFolderNameValid(name)) {
                files.add(file);
                saveFileInDiskMemory(file);
                file.setUnitID(disk.getUnitIDToUse());
                disk.increaseDataUnitIDToUse();
            }
            else System.out.println("Entered name is invalid");
        }
        else System.out.println("It's not enough free space on disk to create this file");
    }

    public void saveFolderInDiskMemory(Folder folder, VirtualHardDisk disk) {
        int[] memory = disk.getMemory();
        for (int i = 0; i < folder.getSize(); i++) {
            for (int j = 0; j < disk.getMemory().length; j++) {
                if (memory[j] == 0) {
                    memory[j] = disk.getUnitIDToUse();
                    break;
                }
            }
        }
    }

    public void saveFileInDiskMemory(File file) {
        int[] memory = disk.getMemory();
        for (int i = 0; i < file.getSize(); i++) {
            for (int j = 0; j < memory.length; j++) {
                if (memory[j] == 0) {
                    memory[j] = disk.getUnitIDToUse();
                    break;
                }
            }
        }
    }


}
