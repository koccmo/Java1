package student_alexey_tretyakov.lesson_3.day_6.Task_24;

class LedLamp {
        private String lampType;
        private String lampColor;
        private boolean switchOn;

        public LedLamp ( String lampType,
                         String lampColor,
                         boolean switchOn){
            this.lampType = lampType;
            this.lampColor = lampColor;
            this.switchOn = switchOn;
        }
        public void getBright(){

            System.out.println("My led type is " + lampType + " , "  + " my color is " + lampColor + ".");

        }

    }

class LedLampDemo {

    public static void main(String[] args) {
        LedLamp led1 = new LedLamp("E27", "yellow", false );
        System.out.println("\n Now switch is OFF.");
        led1.getBright();

        System.out.println("\n Now switch is ON and lamp change color !!! \n New color will be white. \n");
        led1 = new LedLamp("E27", "white", true );
        led1.getBright();
        }

}


