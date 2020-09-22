package student_valerija_ionova.lesson_13.level_7_senior.super_task_1;


import java.util.Objects;

class File implements   Resources{

    private int size;
    private String name;


    File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName(){
        return name;
    }

    int getSize(){
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size &&
                Objects.equals(name, file.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
