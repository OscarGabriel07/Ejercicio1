package com.sofka.test;

public class Test {
    public static void main(String[] args) {
        /*1. Declara 2 variables numéricas (con el valor que desees), he indica cual
        es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los
        valores para comprobar que funciona.*/

        calcularNumeroMayor(8, 10);
    }

    public static void calcularNumeroMayor(int numero1, int numero2){
        if(numero1 > numero2){
            System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero1);
        }else {
            System.out.println("Los números son iguales");
        }
    }
}
