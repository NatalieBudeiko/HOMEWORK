package homework2_1;

public class CarTestDrive {

    public static void main(String[] args) {

        Car car1 = new Car("Lexus", "RX270", 2013, "black");
        Car car2 = new Car("Lamborghini", "Diablo", 1991, "red");
        Car car3 = new Car("BMW", "X6", 2019, "blue");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.changeColor("gold!!!!!");
        System.out.println(car1);

        car1.changeColor("silver!!!!!");
        System.out.println(car1);

        car2.carCrash();
        car2.beep();
        car2.changeColor("yellow");
        car3.drive();
        car3.park();
    }

}
