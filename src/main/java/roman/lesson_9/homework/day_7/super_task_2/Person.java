package roman.lesson_9.homework.day_7.super_task_2;

public class Person {
    private String name;
    private String surname;
    private String address;
    private String nationality;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.address = personBuilder.address;
        this.nationality = personBuilder.nationality;
        this.age = personBuilder.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }

    static class PersonBuilder {
        private String name;
        private String surname;
        private String address;
        private String nationality;
        private int age;


        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
