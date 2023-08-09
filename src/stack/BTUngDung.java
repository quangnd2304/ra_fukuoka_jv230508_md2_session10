package stack;

import java.util.Scanner;
import java.util.Stack;

public class BTUngDung {
    public static void main(String[] args) {
        /*
         * Bài tập ứng dụng stack:
         * Nhập các số từ bàn phím cho đến khi nhập 0 thì in ra các số đảo ngược         *
         * */
        Scanner scanner = new Scanner(System.in);
        boolean isExit = true;
        Stack<Integer> stackInteger = new Stack<>();
        do {
            System.out.println("Nhập vào một số: ");
            int number =Integer.parseInt(scanner.nextLine());
            if (number==0){
                isExit = false;
            }else {
                stackInteger.push(number);
            }
        }while(isExit);
        //In ra các số đảo ngược
        System.out.println("Các số đảo ngược:");
        while (!stackInteger.isEmpty()){
            System.out.printf("%d\t",stackInteger.pop());
        }
        System.out.printf("\n");
    }
}
