public class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    public void addInsurance(Insurance insurance) {
        double price = insurance.getPrice() * 1.69;
        insurance.setPrice(price);
        super.insurances.add(insurance);
    }
}
