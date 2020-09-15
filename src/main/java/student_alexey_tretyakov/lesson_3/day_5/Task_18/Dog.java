package student_alexey_tretyakov.lesson_3.day_5.Task_18;


    class Dog {

        private String dogName;

        public Dog(String dogName) {
            this.dogName = dogName;
        }

        public void getVoice() {
            for (int i=1; i<=3 ; i++ ) {
                System.out.println(dogName);
            }
        }

    }
    class DogDemo {
        public static void main(String[] args) {
            Dog pappyDog = new Dog ("Darky" );
            System.out.println("What is your name pappy?");
            pappyDog.getVoice();
        }
    }

