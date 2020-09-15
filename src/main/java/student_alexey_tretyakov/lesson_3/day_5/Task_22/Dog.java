package student_alexey_tretyakov.lesson_3.day_5.Task_22;

class Dog {
        private String dogName;
        private int dogAge;
        private String dogColor;
        public Dog ( String dogName,
                     int dogAge,
                     String dogColor){
            this.dogName = dogName;
            this.dogAge = dogAge;
            this.dogColor = dogColor;
        }
        public void getVoice (){
            for (int i=1; i<=3 ; i++ ){

                if (dogAge <= 1) {
                    System.out.println("My name is " + dogName + " , " + dogAge + " year," + " my color is " + dogColor + ".");
                } else {
                    System.out.println("My name is " + dogName + " , " + dogAge + " years," + " my color is " + dogColor + ".");
                }
            }
        }
        public void happyBirthday() {
            dogAge = dogAge + 1;
            System.out.println("\n Today is my Birthday !!!" );
            System.out.println("My name is " + dogName + " , " + dogAge + " years," + " my color is " + dogColor + ".");
        }
    }

class DogDemo {

    public static void main(String[] args) {
        Dog pappyDog = new Dog("Darky", 2, "black" );
        System.out.println("\n What is your name pappy?\n");
        pappyDog.getVoice();

        System.out.println("\n Dog want to change color !!! \n New color will be white. \n");
        pappyDog = new Dog("Darky", 2, "white" );
        pappyDog.getVoice();
        }

}


