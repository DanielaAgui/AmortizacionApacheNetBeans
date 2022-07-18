package com.mycompany.proyecto1;

import java.util.Scanner;

public class CuotaFija {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto del crédito: ");
        double monto = sc.nextDouble();
       
        System.out.println("Ingrese el plazo del crédito en meses: ");
        double plazo = sc.nextDouble();
       
        System.out.println("Ingrese la tasa de interés mensual del crédito: ");
        double tasa = sc.nextDouble();
       
        double numerador = monto * (tasa / 100);
        double denominador = 1 - (Math.pow((1 + (tasa / 100)), -plazo));
        double cuota = numerador / denominador;
       
        System.out.println("La cuota mensual es de $" + Math.round(cuota));

        /*for (int i = 1; i <= plazo; i++){
            double interes;
            double amortizacion;
            double saldo = monto;
            interes = monto * tasa / 100;
            amortizacion = cuota - interes;
            monto -= amortizacion;
            System.out.println(Math.round(amortizacion));
        }
        */     
    }
    
}
