package student_alexey_tretyakov.lesson_9.homework.level_2;

class Task_10 {
    static class ConstructorChaining {

        private String constructorName;
        private int parameterCount;

        private ConstructorChaining(String constructorName) {
            this.constructorName = constructorName;
        }
        public ConstructorChaining(  String constructorName,int parameterCount) {
            ConstructorChaining constructor = new ConstructorChaining( constructorName );
            this.constructorName = constructor.constructorName;
            this.parameterCount = parameterCount;
        }
    }

    public static void main(String[] args) {

        ConstructorChaining constructor = new ConstructorChaining("Constructor",10);
        System.out.println(constructor.constructorName + " --- " + constructor.parameterCount);
    }
}
