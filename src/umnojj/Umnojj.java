/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umnojj;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roblo
 */
public class Umnojj {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int prav = 0;
        System.out.print("Пять примеров для проверки таблицы умножения: ");
        
        for(int i = 0; i<5; i++){
            int n1 = random.nextInt(10);
            int n2 = random.nextInt(10);
            int otvet = n1*n2;
            System.out.printf("%n%d * %d = ", n1,n2);
            int ans = scanner.nextInt();
            
            if(ans == otvet){
                prav=prav+1;
                System.out.println(GREEN + "Правильно!"+RESET);
            }else{
                System.out.println(RED + "Ошибка!"+RESET);
            }
        }
        if (prav == 5){
            System.out.println(PURPLE + "Молодец!"+RESET);
        }
        else if (prav >= 3){
            System.out.println(PURPLE + "Надо бы еще поучить!"+RESET);
        }   
        else{
            System.out.println(PURPLE + "Срочно нужно учить таблицу умножения!"+RESET);
        
        }
}
} 