import java.time.LocalDate;

public class ResidenceInsurance extends Insurance {

    private double buildingValue;
    private double contentValue;

    public ResidenceInsurance(double buildingValue, double contentValue) {
        super("Residence Insurance", 700, LocalDate.now(), LocalDate.now().plusMonths(5));
        this.buildingValue = buildingValue;
        this.contentValue = contentValue;
    }

    public double getBuildingValue() {
        return buildingValue;
    }

    public void setBuildingValue(double buildingValue) {
        this.buildingValue = buildingValue;
    }

    public double getContentValue() {
        return contentValue;
    }

    public void setContentValue(double contentValue) {
        this.contentValue = contentValue;
    }


    @Override
    public void calculate() {
        double basePrice = getPrice();
        double buildingValue = getBuildingValue();
        double contentValue = getContentValue();

        double premium = basePrice + (buildingValue * 0.005) + (contentValue * 0.002);
        setPrice(premium);
    }

    @Override
    public String toString() {
        return "ResidenceInsurance [name=" + getName() + ", price=" + getPrice() + ", startDate=" + getStartDate()
                + ", endDate=" + getEndDate() + ", buildingValue=" + buildingValue + ", contentValue=" + contentValue
                + "]";
    }
}
