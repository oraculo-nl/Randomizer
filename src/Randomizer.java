import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Randomizer
 * each round, randomly pick a number from 0 to 9 (10 numbers to choose from)
 * do this 100 times and count each pick
 * perform 20 rounds
 * add up totals
 */
public class Randomizer {
    public static void main(String[] args) {
        var random = new Random();
        var count = new int[20][10];
        var total = new int[10];

        System.out.println("00 01 02 03 04 05 06 07 08 09");
        System.out.println("-----------------------------");
        for (var x = 0; x < 20; x++) {
            for (var i = 0; i < 100; i++) {
                var num = random.nextInt(10);
                count[x][num]++;
            }
            for (var c : count[x]) {
                System.out.printf("%02d ", +c);
            }
            System.out.println();
        }
        for (var x = 0; x < 20; x++) {
            for (var i = 0; i < 10; i++) {
                total[i] += count[x][i];
            }
        }
        System.out.println(Arrays.toString(total));

    }
}
