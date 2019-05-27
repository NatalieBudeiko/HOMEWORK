package homework24;

public class AppliencesSample {
    public static void main(String[] args) {
        Computer computer = new Computer("Bosch", "2017");
        System.out.println(computer);
        computer.plugIn();
    }
}
