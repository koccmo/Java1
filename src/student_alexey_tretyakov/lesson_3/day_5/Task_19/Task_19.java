package student_alexey_tretyakov.lesson_3.day_5.Task_19;



    class Dog {
        private String dogName;
        private int dogAge;
        public Dog ( String dogName, int dogAge ){
            this.dogName = dogName;
            this.dogAge = dogAge;
        }
        public void getVoice (){
            if ( dogAge <= 1 ) {
                System.out.println(dogName + " , " + dogAge + " year");
            } else {
                System.out.println(dogName + " , " + dogAge + " years");
            }
        }
    }

    class DogDemo {

        public static void main(String[] args) {
            Dog pappyDog = new Dog("Darky", 1 );
            System.out.println("What is your name pappy?");
            pappyDog.getVoice();
        }

    }

