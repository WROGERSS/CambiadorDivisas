package com.aluracursos;

import java.util.Scanner;

public class MenuConversionMoneda {

    public static void main(String[] args) {
        Scanner lecturaMenu = new Scanner(System.in);
        Scanner lecturaMonto = new Scanner(System.in);

        ComparacionMonedaSwitch conversor = new ComparacionMonedaSwitch();

        while (true) {
            System.out.println("""
                    ********************************************************
                    [= Sea bienvenido/a al conversor de Moneda =]
                    Opcion    Moneda Base    Conversion     Moneda Destino     
                      1)      Dólar              =>>>       Peso Argentino
                      2)      Peso Argentino     =>>>       Dólar
                      3)      Dólar              =>>>       Real Brasilero
                      4)      Real Brasilero     =>>>       Dólar
                      5)      Dólar              =>>>       Peso Colombiano
                      6)      Peso Colombiano    =>>>       Dolar
                      7) =>Salir ...
                    Elija una opción válida
                    ********************************************************""");

            try {
                int opcionMenuConversion = Integer.parseInt(lecturaMenu.nextLine());
                System.out.println("Valor digitado: " + opcionMenuConversion);

                // Invocacion del método que maneja el switch
                if (!conversor.realizarConversion(opcionMenuConversion, lecturaMonto)) {
                    break; // Terminar el ciclo si la opción fue 7 (Salir)
                }
            } catch (NumberFormatException e) {
                System.out.println("*********************************************************");
                System.out.println("Error en el valor ingresado. " + "(" + e.getMessage() + ")");
                System.out.println("*********************************************************");
            }
        }

        lecturaMenu.close();
        lecturaMonto.close();
    }
}
