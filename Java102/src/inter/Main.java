package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar girin: ");
        double price = scanner.nextDouble();
        System.out.print("Kart no girin: ");
        String cardNumber = scanner.next();
        System.out.print("Son kullanım tarihi girin: ");
        String expireDate = scanner.next();
        System.out.print("Güvenlik kodu: ");
        String cvc = scanner.next();

        System.out.print("1. A bankası: ");
        System.out.print("2. A bankası: ");
        System.out.print("3. A bankası: ");
        System.out.print("Banka seçin: ");
        int selectBank = scanner.nextInt();
        switch (selectBank) {
            case 1 -> {
                ABankasi aPos = new ABankasi("A Bankası", "34234324", "13332");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, expireDate, cvc);
            }
            case 2 -> {
                BBankasi bPos = new BBankasi("B Bankası", "21312", "2321");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber, expireDate, cvc);
            }
            default -> {
                System.out.println("Geçerli banka giriniz! ");
            }
        }
    }
}
