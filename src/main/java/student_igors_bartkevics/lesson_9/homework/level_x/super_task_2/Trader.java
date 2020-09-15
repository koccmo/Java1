package student_igors_bartkevics.lesson_9.homework.level_x.super_task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;
    private String country;

    private Trader() {
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "Full name: " + fullName +
                ", city: " + city +
                ", country: " + country +
                '}';
    }

    public static class TraderBuilder {
        private String fullName;
        private String city;
        private String country;

        public TraderBuilder(String fullName) {
            this.fullName = fullName;
        }

        public  TraderBuilder city(String city) {
            this.city = city;
            return this;
        }

        public  TraderBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Trader build() {
            Trader trader = new Trader();
            trader.fullName = this.fullName;
            trader.city = this.city;
            trader.country = this.country;
            return trader;
        }
    }
}
