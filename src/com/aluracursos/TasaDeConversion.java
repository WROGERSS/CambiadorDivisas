package com.aluracursos;

public record TasaDeConversion(String time_last_update_utc,
                               String base_code,
                               String target_code,
                               Double conversion_rate,
                               Double conversion_result
)
{

    @Override
    public String toString() {
        return  " " + base_code
                +" Corresponde al valor final de ==> " + conversion_result + " " + target_code + "\n"
                + "(Tasa representativa del Mercado: " + String.valueOf(conversion_rate).substring(0, 6)  + " )"
                + " a Fecha: " + time_last_update_utc.substring(0,12) + "\n" +
                "===============================================================" +
                "\n"

                ;

    }
}
