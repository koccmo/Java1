package student_jaroslav_brutan.lesson_3.day_6.task_24;

public class EmployeeDemo {
    public static void main(String []args){
        Employee employee = new Employee();
        employee.setName("Jarik");
        employee.setProfession("Warehouse worker");
        employee.setAge(28);
        employee.setSalary(1000.47);
        System.out.println("My name is " + employee.getName());
        System.out.println("I'm " + employee.getAge() + "years old.");
        employee.whatIDo();
        employee.mySalary();



    }
}
