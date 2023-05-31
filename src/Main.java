
public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int refill = 900;
        int oneBonus = 100;
        int added = (initialAccount + refill);
        int bonus = (refill / oneBonus);
        int result = (initialAccount + refill + bonus);

        if (refill >= 1000) {
            System.out.println(" Сумма на Вашем счете: " + result);
            System.out.println(" Зачисленно бонусных рублей: " + bonus);
        } else {
            System.out.println(" Сумма на Вашем счете: " + added);
            System.out.println(" Бонусных рублей не зачислено ");
        }
    }
}
