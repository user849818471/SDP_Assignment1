public class Car {
    private final String brand;
    private final String model;
    private final String engine;
    private final int doors;
    private final boolean hasSunroof;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.engine = builder.engine;
        this.doors = builder.doors;
        this.hasSunroof = builder.hasSunroof;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getEngine() { return engine; }
    public int getDoors() { return doors; }
    public boolean hasSunroof() { return hasSunroof; }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model +
                ", Engine: " + engine +
                ", Doors: " + doors +
                ", Sunroof: " + hasSunroof;
    }

    public static class Builder {
        private String brand;
        private String model;
        private String engine;
        private int doors;
        private boolean hasSunroof;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder addSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build() {
            validate();
            return new Car(this);
        }

        private void validate() {
            if (brand == null || model == null) {
                throw new IllegalStateException("Brand and Model are required!");
            }
        }
    }
}
