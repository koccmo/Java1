package student_alexey_tretyakov.lesson_7.level_1;

public class WordServiceMain {
    public static void main(String[] args) {
        String string = "Привет ! Привет всем ! Привет всем программистам ! Привет всем программистам Java !";
        WordService wordService = new WordService();
        System.out.println( wordService.findMostFrequentWord(string) );
        //for ( int i=0; i<stringArray.length;i++) {System.out.println(stringArray[i]);}

        //    System.out.println("Cлово \"" + stringArray[ maxTimes]
        //          + "\" встретилось : " + wordCount[maxTimes] + " раз");

    }
}
