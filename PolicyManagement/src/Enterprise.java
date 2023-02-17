public class Enterprise extends Account {
    private String companyName;

    public Enterprise(User user, String companyName) {
        super(user);
        this.companyName = companyName;
    }


    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getPrice() * 1.31;
        insurance.setPrice(price);
        super.insurances.add(insurance);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
