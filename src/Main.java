public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int bonusPercent;
        int refill = 1100;
        if (refill >= 1100) {
            bonusPercent = 1;
        } else {
            bonusPercent = 0;
        }
        int totalbalance = startBalance + refill + refill * bonusPercent / 100;
        System.out.println(totalbalance);
    }
}
