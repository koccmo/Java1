package student_dmitrijs_jasvins.lesson_7.day_1;

public class WorldServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "Don't trouble trouble until troubles trouble you";
        wordService.convertStringToArray(text);
        String result = wordService.findMostFrequentWord(text);
        System.out.println(result);
    }
}
