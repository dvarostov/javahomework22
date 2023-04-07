// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int topup = 1100;
        int bonus = 0;

        if (topup > 1000) {
            bonus = (topup / 100);
        }

        int totalbalance = balance + topup + bonus;


        System.out.println(" Общий счет: " + totalbalance + " рублей ");
        System.out.println("Бонусные рубли: " + bonus + " рублей ");

    }
}
