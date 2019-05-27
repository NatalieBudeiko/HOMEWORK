package homework24;

public interface HasSocket {
    default void plugIn () {
        System.out.println(this.getClass().getSimpleName() + " is plugged in");
    }
}
