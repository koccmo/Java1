package student_valerija_ionova.lesson_13.level_7_senior.super_task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Directory implements Resources{

    String name;

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", resourceList=" + resourceList +
                '}';
    }

    private List<Resources> resourceList;

    Directory(String name,File...fileList) {
        this.name = name;
        this.resourceList = new ArrayList <> (Arrays.asList(fileList));
    }

    public List <Resources> getResourceList(){
        return resourceList;
    }

    @Override
    public String getName() {
        return this.name;
    }

    void addResource (Resources resource){
        resourceList.add(resource);
    }

    boolean deleteResource (Resources resource){
        if (resourceList.contains(resource)){
            resourceList.remove(resource);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(name, directory.name) &&
                Objects.equals(resourceList, directory.resourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, resourceList);
    }
}
