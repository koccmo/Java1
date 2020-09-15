package student_igors_bartkevics.lesson_7.homework.level_x.super_task_1.ver_3;

import java.util.ArrayList;
import java.util.List;

class FileSystem {

    private List<VirtualHardDisk> virtualHardDisks = new ArrayList<>();

    void createVirtualHardDisk(char name, int size) {
        if (NameValidator.isDiskNameValid(name)) {
            virtualHardDisks.add(new VirtualHardDisk(name, size));
        }
        else System.out.println("You entered invalid disk name");
    }

    public List<VirtualHardDisk> getVirtualHardDisks() {
        return virtualHardDisks;
    }
}
