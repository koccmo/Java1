package student_roberts_kupcs.lesson_7.homework.level_1;

class WorldServiceTest {
    public static void main(String[] args) {
        WorldServiceTest worldServiceTest = new WorldServiceTest();
        worldServiceTest.testWord();
    }

    public void testWord() {
        WorldService worldService = new WorldService();

        String text = "find find find Most Frequent Word";
        System.out.println("Most frequent word in \"" + text + "\" is = " + worldService.findMostFrequentWord(text));
    }

}
