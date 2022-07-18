package com.mycompany.proyecto1;

import java.util.Scanner;

public class CuotaVariable {
    
    public static void main(String[] args) {
    
        double amortizacion;
        double cuota;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto del crédito: ");
        double monto = sc.nextDouble();
       
        System.out.println("Ingrese el plazo del crédito en meses: ");
        double plazo = sc.nextDouble();
       
        System.out.println("Ingrese la tasa de interés mensual del crédito: ");
        double tasa = sc.nextDouble();

        amortizacion = monto / plazo;

        for (int i = 1; i <= plazo; i++){
            double interes = monto * tasa / 100;
            cuota = amortizacion + interes;
            monto -= amortizacion;
            System.out.println("La cuota " + i + " es de $" + Math.round(cuota));
        }
    }
}
