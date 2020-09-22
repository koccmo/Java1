package student_valerija_ionova.lesson_13.level_7_senior.super_task_1;


import java.util.List;

class Storage{

    private String name;
    private Directory rootDirectory;

    Storage (String name){
        this.name = name + ":/";
        rootDirectory = new Directory(this.name);
    }

    public Directory rootDirectory(){
        return rootDirectory;
    }

    void addResource (Resources resources){
        rootDirectory.addResource(resources);
    }

    boolean deleteResources (Resources resources){
        if (rootDirectory.getResourceList().contains(resources)){
            rootDirectory.getResourceList().remove(resources);
            return true;
        }
        return false;
    }

    Directory getRootDirectory(){
        return rootDirectory;
    }

    int totalSize(){
        int sum = 0;
        return sumSizesInList(sum, rootDirectory.getResourceList());
    }

    int totalMP3(String fileExtension){
        int count = 0;
        return totalFileOfSpecificExtensions(count, fileExtension, rootDirectory.getResourceList());
    }

    int sumSizesInList(int sumToStart, List<Resources> listOfResources){
        int sum = sumToStart;
        for (int i = 0; i < listOfResources.size(); i++){
            if (listOfResources.get(i).getClass() == File.class){
                File file = (File) listOfResources.get(i);
                sum += file.getSize();
            }else{
                Directory d = (Directory) listOfResources.get(i);
                sum = sumSizesInList(sum, d.getResourceList());
            }
        }
        return sum;
    }

    int totalFileOfSpecificExtensions(int count, String fileExtension, List<Resources> listOfResources){
        int countInMethod = count;
        for (int i = 0; i < listOfResources.size(); i++){
            if (listOfResources.get(i).getClass() == File.class){
                File file = (File) listOfResources.get(i);
                if (file.getName().endsWith(fileExtension)) {
                    countInMethod ++;
                }
            }else{
                Directory d = (Directory) listOfResources.get(i);
                countInMethod = totalFileOfSpecificExtensions(countInMethod, fileExtension, d.getResourceList());
            }
        }
        return countInMethod;
    }
}
