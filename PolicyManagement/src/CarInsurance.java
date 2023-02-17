import java.time.LocalDate;

public class CarInsurance extends Insurance {

    private String carMake;
    private String carModel;
    private int carAge;
    private boolean coverageForDrivers;
    private boolean coverageForPassengers;

    public CarInsurance(String carMake, String carModel, int carAge, boolean coverageForDrivers, boolean coverageForPassengers) {
        super("Car Insurance", 1000, LocalDate.now(), LocalDate.now().plusWeeks(3));
        this.carMake = carMake;
        this.carModel = carModel;
        this.carAge = carAge;
        this.coverageForDrivers = coverageForDrivers;
        this.coverageForPassengers = coverageForPassengers;
    }

    public String getCarMake() {
        return this.carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarAge() {
        return this.carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public boolean isCoverageForDrivers() {
        return coverageForDrivers;
    }

    public void setCoverageForDrivers(boolean coverageForDrivers) {
        this.coverageForPassengers = coverageForDrivers;
    }

    public boolean isCoverageForPassengers() {
        return coverageForPassengers;
    }

    public void setCoverageForPassengers(boolean coverageForPassengers) {
        this.coverageForPassengers = coverageForPassengers;
    }


    @Override
    public void calculate() {
        double basePrice = getPrice();
        String carMake = getCarMake();
        String carModel = getCarModel();
        int carAge = getCarAge();
        boolean coverageForDrivers = isCoverageForDrivers();
        boolean coverageForPassengers = isCoverageForPassengers();

        double premium = basePrice;
        if (carMake.equals(carModel)) {
            premium += (basePrice * 0.5);
        }
        if (carAge > 10) {
            premium += (basePrice * 0.3);
        }
        if (coverageForPassengers && coverageForPassengers) {
            premium += (basePrice * 0.2);
        }
        setPrice(premium);
    }

    @Override
    public String toString() {
        return "CarInsurance [name=" + getName() + ", price=" + getPrice() + ", startDate=" + getStartDate()
                + ", endDate=" + getEndDate()
                + ", carMake=" + carMake + ", carModel=" + carModel + ", carAge=" + carAge
                + ", coverageForDrivers=" + coverageForDrivers + ", coverageForPassengers=" + coverageForPassengers
                + "]";
    }
}
