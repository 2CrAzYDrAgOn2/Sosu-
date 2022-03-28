/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradleproject2;

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
        ArrayList<String> mas = new ArrayList<>();
        Scanner n = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            mas.add(String.valueOf(s.nextInt(10)));
            System.out.println(mas.get(i));
            if(mas.get(i).equals(n.nextLine())) {
            System.out.println("yes");
            }
            else {
                System.out.println("no");
                break;
            }
        }
    }
    
}
