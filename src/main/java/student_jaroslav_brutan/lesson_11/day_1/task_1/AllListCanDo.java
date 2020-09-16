package student_jaroslav_brutan.lesson_11.day_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllListCanDo {

    public static void main(String[] args) {

        List<String> citiesInLatvia = new ArrayList<>();
        citiesInLatvia.add("Riga");
        citiesInLatvia.add("Daugavpils");
        citiesInLatvia.add("Liepaja");
        System.out.println("Latvia have " + citiesInLatvia.size() + " big cities!");
        System.out.println(citiesInLatvia);
    } // Можно добавлять и распечатывать

      /*  List <String> sentence = new LinkedList<>();

    public void setSentence(List<String> sentence) {
        this.sentence = sentence;
        sentence.add("Hello there!");
        sentence.add("My name is Jaroslav :)");
        System.out.println(sentence);
    }*/
}

