package student_vladislav_zagrebin.lesson_3.homeWork.day_6.Task_24;

public class Game {

    // Свойства: название, платформа, жанр, издатель, стоимость
    // Поведение: запустить, выключить, обновить, удалить

    private String platform;
    private String name;
    private String publisher;

    public Game (String name, String publisher) {
        this.platform = "Xbox";
        this.name = name;
        this.publisher = publisher;

    }

    public void runGame() {
        System.out.println("Welcome to " + this.platform + "!");
        System.out.println("Loading " + this.name + ", please wait...");
        System.out.println("Loading complete!");
        System.out.println(this.publisher + " proudly presents: " + this.name);
        System.out.println("Press any key to proceed.");
    }

    public void endGame() {
        System.out.println("Exiting " + this.name);
        System.out.println(this.platform + " shutting down...");
        System.out.println("Good bye!");
    }
}

