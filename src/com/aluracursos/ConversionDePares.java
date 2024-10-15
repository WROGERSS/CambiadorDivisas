package com.aluracursos;

import com.google.gson.Gson;



        import java.net.URI;
        import java.net.http.HttpClient;
        import java.net.http.HttpRequest;
        import java.net.http.HttpResponse;

public class ConversionDePares {
    public TasaDeConversion nuevaConversion(String opcionDeMenuConMonto) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b897dc885a1b67d7916f6de8/pair/"+opcionDeMenuConMonto);

        // https://v6.exchangerate-api.com/v6/b897dc885a1b67d7916f6de8/pair/USD/ARS/1000.2

        //Configuracion API REST
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TasaDeConversion.class);
        } catch (Exception e ) {
            //throw new RuntimeException(e);
            throw new RuntimeException("Valor de Monto a Convertir erroneo, los decimales del Monto van separados por un punto");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
