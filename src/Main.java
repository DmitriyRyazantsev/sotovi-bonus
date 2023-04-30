public class Main {
    public static void main(String[] args) {
        int score = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;

        if (replenishment <= 1000) {
            bonus = 0;
        } else {
            bonus = replenishment / 100;
        }
        System.out.println(bonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}