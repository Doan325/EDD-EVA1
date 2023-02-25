/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_sobrecarga_ares;

/**
 *
 * @author Doan Escobar
 */
public class EVA1_17_SOBRECARGA_ARES {

    public static void main(String[] args) {
        System.out.println("AREA CIRCULO");
    }

public static double area(double radio) {
    return Math.PI * radio * radio;
}
public static double area(double base, double altura) {
return (base * altura) /2.0;
}

public static double area(double altura, double baseMay, double baseMen) {
    return altura * (baseMay + baseMen)/2.0;
    }

}
