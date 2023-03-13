/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_rfc;

/**
 *
 * @author Doan Escobar
 */
public class EVA1_18_SOBRECARGA_RFC {
    public static void main(String[] args) {
    String  rfc = generarRFC("CRISTIAN DOAN","TRUCIOS","ESCOBAR", 2000,02,14);
        System.out.println(rfc);
    
    }
public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia){
String ap1 = nombre.charAt(0) +"";
String ap2= apPat.charAt(1)+"";
String apM= apMat.charAt(0)+ "";
String nom= nombre.charAt(0)+"";
String rfc = ap1 + ap2 + apM + nom + año + mes + dia +"";
return rfc;


}
}

