package com.Codegym.weed4.debug;

import java.util.Scanner;


public class TriangleException {

    public static void main(String[] args) {
        boolean isTrue;
        do {
            isTrue = false;
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter edge1: ");
            double edge1 = scanner.nextDouble();
            System.out.print("enter edge2: ");
            double edge2 = scanner.nextDouble();
            System.out.print("enter edge3: ");
            double edge3 = scanner.nextDouble();
            try {
                if (edge1 > 0 && edge2 > 0 && edge3 > 0 && (edge1 + edge2) > edge3 &&
                        (edge2 + edge3) > edge1 && (edge1 + edge3) > edge2) {
                    System.out.println(" la 3 canh tam giac");
                }
                throw new IllegalTriangleException();
            } catch (IllegalTriangleException e) {
                System.out.println("xay ra ngoai- le:" + e.getMessage());
                isTrue = true;
            }
        } while (isTrue);
    }

    public static class IllegalTriangleException extends Exception {
        public IllegalTriangleException() {
            super("khong phai tam giac");
        }
    }
}
