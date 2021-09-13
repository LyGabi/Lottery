import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Lottery {

    public static void main(String[] args)
    {
        int[] random = new int[5];
        Random randomizer = new Random();
            for(int i = 0; i < random.length; i++){
                random[i] = randomizer.nextInt(16);
            }

        Scanner numbers = new Scanner(System.in);
        System.out.println("Please input 5 numbers between 0 and 15: ");

        int[] picked = new int[5];

        for (int i = 0; i < picked.length; i++){
            picked[i] = numbers.nextInt();
        }
        Arrays.sort(random);
        Arrays.sort(picked);
        System.out.println(Arrays.toString(random));
        System.out.println(Arrays.toString(picked));

        if (random == picked){
            System.out.println("You have won the lottery! Congratulations! :)");
        }
        else{
            System.out.println("Better Luck Next Time");
        }
    }
}
