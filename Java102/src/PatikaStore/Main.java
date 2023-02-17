package PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        String[] brandNames = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        for (int i = 0; i < brandNames.length; i++) {
            store.addBrand(new Brand(i + 1, brandNames[i]));
        }


        int choice = -1;
        while (choice != 6) {
            store.displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1- Add notebook");
                    System.out.println("2- Remove notebook by id");
                    System.out.println("3- List notebooks");
                    System.out.print("Enter your choice: ");
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Enter notebook brand id: ");
                            int brandId = scanner.nextInt();
                            Brand notebookBrand = store.getBrandById(brandId);
                            if (notebookBrand == null) {
                                System.out.println("Invalid brand id!");
                                break;
                            }
                            System.out.println("Enter notebook name: ");
                            String notebookName = scanner.next();
                            System.out.println("Enter notebook price: ");
                            double notebookPrice = scanner.nextDouble();
                            System.out.println("Enter notebook discount: ");
                            double notebookDiscount = scanner.nextDouble();
                            System.out.println("Enter notebook stock: ");
                            int notebookStock = scanner.nextInt();
                            System.out.println("Enter notebook ram: ");
                            int notebookRam = scanner.nextInt();
                            System.out.println("Enter notebook storage: ");
                            int notebookStorage = scanner.nextInt();
                            System.out.println("Enter notebook screen size: ");
                            double notebookScreenSize = scanner.nextDouble();
                            store.addProduct(new Notebook(store.getProducts().size() + 1, notebookName, notebookPrice, notebookDiscount, notebookStock, notebookBrand, notebookRam, notebookStorage, notebookScreenSize));
                            break;
                        case 2:
                            System.out.println("Enter notebook id: ");
                            int notebookId = scanner.nextInt();
                            store.removeProduct(notebookId);
                            break;
                        case 3:
                            store.listNotebooks();
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1- Add mobile phone");
                    System.out.println("2- Remove mobile phone by id");
                    System.out.println("3- List mobile phones");
                    System.out.print("Enter your choice: ");
                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Enter mobile phone brand id: ");
                            int brandId = scanner.nextInt();
                            Brand mobilePhoneBrand = store.getBrandById(brandId);
                            if (mobilePhoneBrand == null) {
                                System.out.println("Invalid brand id!");
                                break;
                            }
                            System.out.println("Enter mobile phone name: ");
                            String mobilePhoneName = scanner.next();
                            System.out.println("Enter mobile phone price: ");
                            double mobilePhonePrice = scanner.nextDouble();
                            System.out.println("Enter mobile phone discount: ");
                            double mobilePhoneDiscount = scanner.nextDouble();
                            System.out.println("Enter mobile phone stock: ");
                            int mobilePhoneStock = scanner.nextInt();
                            System.out.println("Enter mobile phone memory: ");
                            int mobilePhoneMemory = scanner.nextInt();
                            System.out.println("Enter mobile phone screen size: ");
                            double mobilePhoneScreenSize = scanner.nextDouble();
                            System.out.println("Enter mobile phone battery power: ");
                            int mobilePhoneBatteryPower = scanner.nextInt();
                            System.out.println("Enter mobile phone ram: ");
                            int mobilePhoneRam = scanner.nextInt();
                            System.out.println("Enter mobile phone color: ");
                            String mobilePhoneColor = scanner.next();
                            store.addProduct(new MobilePhone(store.getProducts().size() + 1, mobilePhoneName, mobilePhonePrice, mobilePhoneDiscount, mobilePhoneStock, mobilePhoneBrand, mobilePhoneMemory, mobilePhoneScreenSize, mobilePhoneBatteryPower, mobilePhoneRam, mobilePhoneColor));
                            break;
                        case 2:
                            System.out.println("Enter mobile phone id: ");
                            int mobilePhoneId = scanner.nextInt();
                            store.removeProduct(mobilePhoneId);
                            break;
                        case 3:
                            store.listMobilePhones();
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;
                case 3:
                    store.listBrands();
                    break;

                case 4:
                    store.listProducts();
                    break;
                case 5:
                    System.out.print("Enter brand name: ");
                    String brandName = scanner.next();
                    store.addBrand(new Brand(store.getBrands().size() + 1, brandName));
                    store.filterProducts(brandName);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;

            }
        }
    }

}
