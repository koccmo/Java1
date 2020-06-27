package student_aleksandra_maksimovic.lesson_3.homeworks.day_4.task_15;


/*
    Найти ошибку в коде.
    Исправить и запустить программу.
    Менять можно только класс Phone.
*/
    class Phone {

        private String model;

        public Phone(String newModel) {
            this.model = newModel;
        }

        public String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }


