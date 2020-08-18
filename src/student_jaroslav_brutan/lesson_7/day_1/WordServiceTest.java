package student_jaroslav_brutan.lesson_7.day_1;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.mostFrequentWordTest();
    }

    void mostFrequentWordTest(){
        WordService wordService = new WordService();
        String text = "privet privet kak dela";
        String result = wordService.findMostFrequentWord(text);
        if (result.equals("privet")){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FALSE");
        }
    }
}
