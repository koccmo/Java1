package roman.lesson_9.homework.day_2.task_10;

 class ConstructorChaining {
     private String constructorName;
     private int parameterCount;

     private ConstructorChaining(String constructorName) {
         this.constructorName = constructorName;
     }

     public ConstructorChaining(String constructorName, int parameterCount) {
         this(constructorName);
         this.parameterCount = parameterCount;

     }


 }
