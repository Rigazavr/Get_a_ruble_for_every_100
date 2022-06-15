public class Main {
    public static void main(String[] args) {

        int balance = 10;
        int refill = 5000;
        int bonus = 1;
        if(refill > balance) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}
