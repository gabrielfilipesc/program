package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {


            int cod1, numPecas1, cod2, numPecas2;
            double valor1, valor2, valorTotal;

            cod1 = sc.nextInt();
            numPecas1 = sc.nextInt();
            valor1 = sc.nextDouble();

            cod2 = sc.nextInt();
            numPecas2 = sc.nextInt();
            valor2 = sc.nextDouble();

            valorTotal = (numPecas1 * valor1) + (numPecas2 * valor2);


            System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
            sc.close();
        }
    }

}
