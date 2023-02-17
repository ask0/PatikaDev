package PatikaStore;

import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<Brand> brands;
    private ArrayList<Product> products;

    public Store() {
        this.brands = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addBrand(Brand brand) {
        if (brand == null) {
            System.out.println("Brand cannot be null!");
            return;
        }
        for (Brand b : brands) {
            if (b.getId() == brand.getId()) {
                System.out.println("Brand already exists!");
                return;
            }
        }
        brands.add(brand);
    }

    public void addProduct(Product product) {
        if (product == null) {
            System.out.println("Product cannot be null!");
            return;
        }
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("Product already exists!");
                return;
            }
        }
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void removeProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                System.out.println("Product removed successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("There is no product in the store!");
            return;
        }
        String format = "%-5s%-20s%-10s%-10s%-10s%-10s%-10s\n";
        System.out.format(format, "ID", "NAME", "PRICE", "DISCOUNT", "STOCK", "BRAND", "TYPE");
        for (Product p : products) {
            System.out.format(format, p.getId(), p.getName(), p.getPrice(), p.getDiscount(), p.getStock(), p.getBrand().getName(), p.getClass().getSimpleName());
        }
    }

    public void listNotebooks() {
        if (products.isEmpty()) {
            System.out.println("There is no product in the store!");
            return;
        }
        String format = "%-5s%-20s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n";
        System.out.format(format, "ID", "NAME", "PRICE", "DISCOUNT", "STOCK", "BRAND", "RAM", "STORAGE", "SCREEN SIZE");
        for (Product p : products) {
            if (p instanceof Notebook) {
                Notebook n = (Notebook) p;
                System.out.format(format, n.getId(), n.getName(), n.getPrice() + " TL", n.getDiscount(), n.getStock(), n.getBrand().getName(), n.getRam(), n.getStorage(), n.getScreenSize());
            }
        }
    }

    public void listMobilePhones() {
        if (products.isEmpty()) {
            System.out.println("There is no product in the store!");
            return;
        }
        String format = "%-5s%-20s%-10s%-10s%-10s%-10s%-10s%-20s%-10s%-10s%-10s\n";
        System.out.format(format, "ID", "NAME", "PRICE", "DISCOUNT", "STOCK", "BRAND", "MEMORY", "SCREEN SIZE", "BATTERY", "RAM", "COLOR");
        for (Product p : products) {
            if (p instanceof MobilePhone) {
                MobilePhone m = (MobilePhone) p;
                System.out.format(format, m.getId(), m.getName(), m.getPrice() + " TL", m.getDiscount(), m.getStock(), m.getBrand().getName(), m.getMemory(), m.getScreenSize(), m.getBatteryPower(), m.getRam(), m.getColor());
            }
        }
    }

    public void filterProducts(String brandName) {
        if (brandName == null || brandName.isBlank()) {
            System.out.println("Brand name cannot be null or empty!");
            return;
        }

        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getBrand().getName().equalsIgnoreCase(brandName)) {
                filteredProducts.add(p);
            }
        }
        if (products.isEmpty()) {
            System.out.println("There is no product in the store!");
            return;
        }
        String format = "%-5s%-20s%-10s%-10s%-10s%-10s%-10s\n";
        System.out.format(format, "ID", "NAME", "PRICE", "DISCOUNT", "STOCK", "BRAND", "TYPE");
        for (Product p : products) {
            if (p.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.format(format, p.getId(), p.getName(), p.getPrice(), p.getDiscount(), p.getStock(), p.getBrand().getName(), p.getClass().getSimpleName());
            }
        }
    }

    public void listBrands() {
        if (brands.isEmpty()) {
            System.out.println("There is no brand in the store!");
            return;
        }
        Collections.sort(brands, (b1, b2) -> b1.getName().compareTo(b2.getName()));
        String format = "%-5s%-15s\n";
        System.out.format(format, "ID", "NAME");
        for (Brand b : brands) {
            System.out.format(format, b.getId(), b.getName());
        }
    }

    public void displayMenu() {
        System.out.println("PatikaStore Menu");
        System.out.println("1- Notebook Operations");
        System.out.println("2- Mobile Phone Operations");
        System.out.println("3- List Brands");
        System.out.println("4- List Products");
        System.out.println("5- Filter by brandName");
        System.out.println("6- Exit");
        System.out.print("Enter your choice: ");
    }


    public ArrayList<Brand> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Brand getBrandById(int brandId) {
        for (Brand b : brands) {
            if (b.getId() == brandId) {
                return b;
            }
        }
        return null;
    }
}
