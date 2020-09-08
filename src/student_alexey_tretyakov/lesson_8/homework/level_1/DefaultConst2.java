package student_alexey_tretyakov.lesson_8.homework.level_1;

class DefaultConst2 {

        private String str;

        void setStr (String str) {
            this.str = str;
        }

    public static void main(String[] args) {

            DefaultConst2 defaultConstr = new DefaultConst2();
            defaultConstr.setStr("Hello people");
            System.out.println( defaultConstr.str );
    }
}
