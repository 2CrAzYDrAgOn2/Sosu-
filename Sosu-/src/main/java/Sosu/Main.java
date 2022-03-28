package Sosu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daun&Down
 */
public class Main {
    public static void main(String[] args) {
        Random s = new Random();
        int count = 0;
        ArrayList<String> random = new ArrayList<>();
        Scanner n = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            random.add(String.valueOf(s.nextInt(10)));
            System.out.println(random.get(i));
            if(random.get(i).equals(n.nextLine())) {
                count++;
            System.out.println("Yes, Your score: "+count);
            
            }
            else {
                System.out.println("No, Your score: "+count);
                break;
            }
        }
    }
}