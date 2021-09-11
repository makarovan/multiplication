/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author estel
 */
public class Multiplication {
    //цвета для изменения цвета стринг
        public static final String ANSI_RESET = "\u001B[0m"; //обязателен иначе следующая строчка будет предыдущего цвета
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int right_answers = 0;
        for (int number=0; number<5; number++){
            Random random = new Random();
            int number1=random.nextInt(21);
            int number2=random.nextInt(21);
            System.out.println(number1+"*"+number2+"=");
            Scanner scanner = new Scanner(System.in);
            int solution = scanner.nextInt();
            if (solution == number1*number2){
                System.out.println(ANSI_GREEN + "Right answer!" + ANSI_RESET);
                right_answers++;
            }
            else{
                System.out.println(ANSI_RED + "Wrong answer! Right answer is "+number1*number2 + ANSI_RESET);
            }
        }
        
        switch (right_answers) {
            case 5:
                System.out.println(right_answers);
                System.out.println("Well done!");
                break;
            case 4: case 3:
                System.out.println(right_answers);
                System.out.println("You need to learn more");
                break;
            default:
                System.out.println(right_answers);
                System.out.println("Start learning RIGHT NOW!!!!");
                break;
        }
    }
}

