package homework24;


public abstract class HomeAppliences {
    protected final String brand;
    protected final String year;

    @Override
    public String toString() {
        return "HomeAppliences{" +
                "brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    protected HomeAppliences(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }
}


