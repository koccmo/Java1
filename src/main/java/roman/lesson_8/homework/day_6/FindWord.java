package roman.lesson_8.homework.day_6;


public class FindWord {
    private static Object String;

    public static void main(String[] args) {
        FindWord findWord = new FindWord();
        findWord.printArray("many", "word");
        System.out.println(findWord.findWordInArrayList("many", "many", "word"));
    }


    public void printArray(String ... arrayList) {
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println("Array[" + i + "] " + arrayList[i]);
        }
    }
    public String findWordInArrayList(String wordNeedFind, String ... arrayList) {
        String result = "";
        for (String word : arrayList) {
            if(word.equals(wordNeedFind)) {
                result = word;
                break;
            } else {
                result = "No this word in Array";
            }
        }
        return result;
    }
}
