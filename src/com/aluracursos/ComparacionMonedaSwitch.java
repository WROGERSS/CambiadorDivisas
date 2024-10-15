package com.aluracursos;

        import java.util.Scanner;
                import com.aluracursos.ConversionDePares;
                import com.aluracursos.TasaDeConversion;

public class ComparacionMonedaSwitch{

    private ConversionDePares conversionNueva;

    public ComparacionMonedaSwitch() {
        this.conversionNueva = new ConversionDePares();
    }

    public boolean realizarConversion(int opcionMenuConversion, Scanner lecturaMonto) {
        String cadenaParMonto;
        double montoConversion;

        switch (opcionMenuConversion) {
            case 1:
                System.out.println("Introduzca por favor el Valor a Convertir:");
                montoConversion = Double.parseDouble(lecturaMonto.nextLine());
                cadenaParMonto = "/USD/ARS/" + montoConversion;
                TasaDeConversion conversionRealizadaUno = conversionNueva.nuevaConversion(cadenaParMonto);
                imprimirResultado(montoConversion, conversionRealizadaUno);
                break;
            case 2:
                System.out.println("Introduzca por favor el Valor a Convertir:");
                montoConversion = Double.parseDouble(lecturaMonto.nextLine());
                cadenaParMonto = "/ARS/USD/" + montoConversion;
                TasaDeConversion conversionRealizadaDos = conversionNueva.nuevaConversion(cadenaParMonto);
                imprimirResultado(montoConversion, conversionRealizadaDos);
                break;
            case 3:
                System.out.println("Introduzca por favor el Valor a Convertir:");
                montoConversion = Double.parseDouble(lecturaMonto.nextLine());
                cadenaParMonto = "/USD/BRL/" + montoConversion;
                TasaDeConversion conversionRealizadaTres = conversionNueva.nuevaConversion(cadenaParMonto);
                imprimirResultado(montoConversion, conversionRealizadaTres);
                break;
            case 4:
                System.out.println("Introduzca por favor el Valor a Convertir:");
                montoConversion = Double.parseDouble(lecturaMonto.nextLine());
                cadenaParMonto = "/BRL/USD/" + montoConversion;
                TasaDeConversion conversionRealizadaCuatro = conversionNueva.nuevaConversion(cadenaParMonto);
                imprimirResultado(montoConversion, conversionRealizadaCuatro);
                break;
            case 5:
                System.out.println("Introduzca por favor el Valor a Convertir:");
                montoConversion = Double.parseDouble(lecturaMonto.nextLine());
                cadenaParMonto = "/USD/COP/" + montoConversion;
                TasaDeConversion conversionRealizadaCinco = conversionNueva.nuevaConversion(cadenaParMonto);
                imprimirResultado(montoConversion, conversionRealizadaCinco);
                break;
            case 6:
                System.out.println("Introduzca por favor el Valor a Convertir:");
                montoConversion = Double.parseDouble(lecturaMonto.nextLine());
                cadenaParMonto = "/COP/USD/" + montoConversion;
                TasaDeConversion conversionRealizadaSeis = conversionNueva.nuevaConversion(cadenaParMonto);
                imprimirResultado(montoConversion, conversionRealizadaSeis);
                break;
            case 7:
                System.out.println("=====================================================");
                System.out.println("Salir");
                System.out.println("Gracias por utilizar la Aplicacion. Hasta Pronto");
                System.out.println("=====================================================");
                return false; // Retornar false para indicar que debe terminar
            default:
                System.out.println("**********************************************");
                System.out.println("Opcion inválida, no está incluida en el Menu ");
                System.out.println("**********************************************");
        }
        return true; // Retornar true para continuar el programa
    }

    private void imprimirResultado(double monto, TasaDeConversion conversion) {
        System.out.println("===============================================================");
        System.out.println(String.valueOf(monto) + conversion);
        System.out.println("===============================================================");
    }
}

