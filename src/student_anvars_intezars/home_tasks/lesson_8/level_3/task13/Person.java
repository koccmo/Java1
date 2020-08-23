package student_anvars_intezars.home_tasks.lesson_8.level_3.task13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Person {

    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
    public abstract void display();

    class Employee extends Person {
        private String bank;

        public Employee(String name, String company) {
            super(name);
            this.bank = company;
        }
        public void display() {
        }
    }

    class Client extends Person {
        private String bank;

        public Client(String name, String company) {
            super(name);
            this.bank = company;
        }
        public void display() {

        }
    }

}


