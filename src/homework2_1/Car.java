package homework2_1;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void drive() {
        System.out.println(make + " is driving to a gas station");
    }

    void park() {
        System.out.println(make + " is parking. Please look in the rear view mirror.");
    }

    void beep() {
        System.out.println("Get out of my way!");
    }

    void changeColor(String color) {
        this.color = color;
        System.out.println(make + " color is changed to " + color);
    }

    void carCrash() {
        System.out.println(make + " need to be repaired");
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year + " " + color;
    }
}
