package student_alexey_tretyakov.lesson_3.day_5.Task_20;

    class Dog {
        private String dogName;
        private int dogAge;
        public Dog ( String dogName, int dogAge ){
            this.dogName = dogName;
            this.dogAge = dogAge;
        }
        public void getVoice (){
            for (int i=1; i<=3 ; i++ ){

                if (dogAge <= 1) {
                    System.out.println("My name is " + dogName + " , " + dogAge + " year");
                } else {
                    System.out.println("My name is " + dogName + " , " + dogAge + " years");
                }
            }
        }
        public void happyBirthday() {
            dogAge = dogAge + 1;
            System.out.println("\nToday is my Birthday !!!" );
            System.out.println("My name is " + dogName + " , " + dogAge + " years");
        }
    }

    class DogDemo {

        public static void main(String[] args) {
            Dog pappyDog = new Dog("Darky", 2 );
            System.out.println("What is your name pappy?");
            pappyDog.getVoice();
            pappyDog.happyBirthday();
        }

    }


