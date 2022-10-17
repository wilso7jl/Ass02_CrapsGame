import java.util.concurrent.ThreadLocalRandom;

public class CrapsGame {
    public static void main(String[] args) {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        int die1 = rand.nextInt(1, 7);
        int die2 = rand.nextInt(1, 7);
        final int firstSum = die1 + die2;
        System.out.printf("%d + %d = %d .%n", die1, die2, firstSum);

        if (firstSum == 7 || firstSum == 11) {
            System.out.println("You Win.");
            return;
        }
        if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
            System.out.println("You Win.");
            return;
        }

        int newSum = 0;
        while(newSum != firstSum && newSum != 7) {
            die1 = rand.nextInt(1, 7);
            die2 = rand.nextInt(1, 7);
            newSum = die1 + die2;
            System.out.printf("%d + %d = %d .%n", die1, die2, newSum);
        }

        if (newSum == firstSum) {
            System.out.println("You win.");
        } else {
            System.out.println("You lose.");
        }
    }
}
