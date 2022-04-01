package sosu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Daun&Down
 */
public class GameThread extends Thread {
    public void threadStart() throws InterruptedException {
        Random s = new Random();
        int count = 0;
        ArrayList<String> random = new ArrayList<>();
        Scanner n = new Scanner(System.in);
        for (int i = 0; i < 2137483647; i++) {
            random.add(String.valueOf(s.nextInt(4)));
            System.out.println(random.get(i));
            GameThread ret = new GameThread();
            Timer timer = new Timer(true);
            Thread.sleep(1);
            if(random.get(i).equals(n.nextLine())) {
                count++;
                Thread.sleep(1);
                System.out.println("Yes, Your score: "+count);
            }
            else {
                Thread.sleep(1);
                System.out.println("No, Your score: "+count);
                break;
            }
        }
    }
}
