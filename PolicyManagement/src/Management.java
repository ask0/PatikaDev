import java.util.TreeSet;

public class Management {
    private AccountManager accountManager;

    public Management() {
        accountManager = new AccountManager();
    }

    public void displayMenu() {
        System.out.println("###########################");
        System.out.println("Policy Management Panel");
        System.out.println("1. Add user (Individual or Enterprise)");
        System.out.println("2. Login");
        System.out.println("3. Show List Accounts");
        System.out.println("0. Exit");
        System.out.println("###########################");
        System.out.print("Enter your choice: ");
    }

    public void addUser(String userType, String name, String surname, String email, String password, String proffession, int age, String companyName) {
        User user = new User(name, surname, email, password, proffession, age);
        if (userType.equalsIgnoreCase("I")) {
            Account account = new Individual(user);
            accountManager.addAccount(account);
            System.out.println("User added successfully");
        } else if (userType.equalsIgnoreCase("E")) {
            Account account = new Enterprise(user, companyName);
            accountManager.addAccount(account);
            System.out.println("User added successfully");
        } else {
            System.out.println("Invalid user type, please try again!");
        }
    }

    public Account login(String userEmail, String userPassword) {
        Account account = accountManager.login(userEmail, userPassword);
        if (account != null) {
            account.showUserInfo();
        }
        return account;
    }

    public void afterLoginMenu() {
        System.out.println("############################");
        System.out.println("1. Add address");
        System.out.println("2. Add insurance");
        System.out.println("3. Show user info");
        System.out.println("0. Logout");
        System.out.println("#############################");
        System.out.print("Enter your choice: ");
    }

    public void addHomeAddress(User user, String streetAddress, String city, String state, String zip) {
        Address homeAddress = new HomeAddress(streetAddress, city, state, zip);
        AddressManager.addAddress(user, homeAddress);
        System.out.println("Successfully added home address");
    }

    public void addBusinessAddress(User user, String companyName, String streetAddress, String city, String state, String zip) {
        Address businessAddress = new BusinessAddress(companyName, streetAddress, city, state, zip);
        AddressManager.addAddress(user, businessAddress);
        System.out.println("Successfully added business address");
    }

    public void showUserInfo(Account account) {
        account.showUserInfo();
    }

    public void listAccounts() {
        TreeSet<Account> accountList = accountManager.getAccountList();
        if (accountList.isEmpty()) {
            System.out.println("No accounts found");
            return;
        }
        String format = "| %-15s | %-15s | %-25s |%-15s | %-20s | %-8s | %-25s | %-15s |\n";
        System.out.format(format, "Name", "Surname", "Email", "Password", "Profession", "Age", "Last login date",
                "Type");
        for (Account a : accountList) {
            System.out.format(format, a.getUser().getName(), a.getUser().getSurname(), a.getUser().getEmail(),
                    a.getUser().getPassword(), a.getUser().getProfession(), a.getUser().getAge(),
                    a.getUser().getLastLogin(), a.getClass().getSimpleName());
        }
    }

    public boolean isHaveAccount() {
        return accountManager.getAccountList().isEmpty();
    }


}
