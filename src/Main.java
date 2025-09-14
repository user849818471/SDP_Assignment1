
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setBrand("Toyota")
                .setModel("Supra")
                .setEngine("3.0L Turbo Ultra Pro Max")
                .setDoors(4)
                .addSunroof(true)
                .build();

        System.out.println(car);
    }
}
