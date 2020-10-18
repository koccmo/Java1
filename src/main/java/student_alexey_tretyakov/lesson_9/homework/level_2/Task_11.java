package student_alexey_tretyakov.lesson_9.homework.level_2;

public class Task_11 {

    protected static class Table {
         String color;
         int weight;
         protected Table(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }
    }
     static class AluTable extends Table{
         String material = "aluminium";
        protected AluTable(String color, int weight) {
            super(color, weight);
        }
    }

    public static void main(String[] args) {
        Table table = new Table("White",5);
        System.out.println(table.weight + " " +table.color);
        AluTable aluTable = new AluTable("Black",7);
        System.out.println(aluTable.weight + " " +aluTable.color + " " +aluTable.material);
    }

}
