package student_igors_bartkevics.lesson_7.homework.level_x.super_task_1.ver_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class VirtualHardDisk {
    private int unitIDToUse = 1;
    private char name;
    private int volume;
    private int[] memory;
    private List<Folder> folders = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    VirtualHardDisk(char name, int volume) {
        this.name = name;
        this.volume = volume;
        this.memory = new int[volume];
        Arrays.fill(memory, 0);
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public List<File> getFiles() {
        return files;
    }

    public int[] getMemory() {
        return memory;
    }

    public int getUnitIDToUse() {
        return unitIDToUse;
    }

    protected void increaseDataUnitIDToUse() {
        this.unitIDToUse ++;
    }

    public int getFreeSpace() {
        int sum = 0;
        for (int cell : memory) {
            if (cell == 0) {
                sum ++;
            }
        }
        return sum;
    }

    public void createFolder(String name) {
        Folder folder = new Folder(name, this);
        if (getFreeSpace() >= folder.getSize()) {
            if (NameValidator.isFolderNameValid(name)) {
                folders.add(folder);
                saveFolderInDiskMemory(folder);
                folder.setUnitID(unitIDToUse); // I don't like this implementation, looking for different way
                increaseDataUnitIDToUse();
            }
            else System.out.println("Entered name is invalid");
        }
        else System.out.println("It's not enough free space on disk");
    }

    public void removeFolder(int ID) {
        removeFolderFromList(ID);
        removeDataFromDiskMemory(ID);
    }

    private void removeFolderFromList(int ID) {
        if (!folders.isEmpty()) {
            for (int i = 0; i < folders.size(); i++) {
                if (folders.get(i).getUnitID() == ID) {
                    folders.remove(folders.get(i));
                }
            }
        }
    }

    private void removeDataFromDiskMemory(int ID) {
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == ID) {
                memory[i] = 0;
            }
        }
    }

    public void createFile(String name, int size, String fileExtension) {
        File file = new File(name, this, size, fileExtension);
        if (getFreeSpace() >= file.getSize()) {
            if (NameValidator.isFolderNameValid(name)) {
                files.add(file);
                saveFileInDiskMemory(file);
                file.setUnitID(unitIDToUse);
                increaseDataUnitIDToUse();
            }
            else System.out.println("Entered name is invalid");
        }
        else System.out.println("It's not enough free space on disk to create this file");
    }

    private void saveFolderInDiskMemory(Folder folder) {
        for (int i = 0; i < folder.getSize(); i++) {
            for (int j = 0; j < memory.length; j++) {
                if (memory[j] == 0) {
                    memory[j] = unitIDToUse;
                    break;
                }
            }
        }
    }

    private void saveFileInDiskMemory(File file) {
        for (int i = 0; i < file.getSize(); i++) {
            for (int j = 0; j < memory.length; j++) {
                if (memory[j] == 0) {
                    memory[j] = unitIDToUse;
                    break;
                }
            }
        }
    }

    public void removeFile(int ID) {
        removeFileFromList(ID);
        removeDataFromDiskMemory(ID);
    }

    private void removeFileFromList(int ID) {
        for (int i = 0; i < files.size(); i ++) {
            if (files.get(i).getUnitID() == ID) {
                files.remove(files.get(i));
            }
        }
    }

}
