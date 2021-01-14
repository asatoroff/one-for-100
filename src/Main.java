public class Main {
    public static void main(String[] args) {
        int startbalance = 100;
        int bonuspercent;
        int refill = 1100;
        if (refill >= 1100) {
            bonuspercent = 1;
        } else {
            bonuspercent = 0;
        }
        int totalbalance = startbalance + refill + refill * bonuspercent / 100;
        System.out.println(totalbalance);
    }
}
