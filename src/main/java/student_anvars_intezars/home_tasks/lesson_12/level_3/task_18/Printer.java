package student_anvars_intezars.home_tasks.lesson_12.level_3.task_18;

/*
NullPointerExceptionDemo
 */

class Printer {

    private String name;

    public void setName(String name) {
        this.name = name;
}

    public void print() {
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
        /*
        В данно примере исключение создается в 20 строке, в самом методе printString.
        s - является null, и вызов метода length обращает на нем исключение.
        Так что можно сказать, что программа перестает вызывать исключение в тот момнет, когда
        s.length() удаляется из самого метода.
         */
    }
}
