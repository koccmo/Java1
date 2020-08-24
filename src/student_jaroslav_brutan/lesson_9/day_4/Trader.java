package student_jaroslav_brutan.lesson_9.day_4;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public void rogueOrNot(){
        if (this.fullName.equals("Pokemon")){
            System.out.println("Access denied!");
        } else {
            System.out.println("Hello! What's your transaction amount?");
        }
    }
}
