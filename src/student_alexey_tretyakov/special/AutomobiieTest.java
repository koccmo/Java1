package student_alexey_tretyakov.special;

//public class AutomobiieTest {
// Static
    class Automobile {
        private static int number;
         Automobile(){
            number++;
            System.out.println("From Automobile constructor:"+
                    " number = "+ number);
        }
    }
    public class AutomobiieTest{
        public static void main(String[] args){
            Automobile lada2105 = new Automobile(),
                        fordScorpio = new Automobile(),
                        oka = new Automobile();
        }
    }

