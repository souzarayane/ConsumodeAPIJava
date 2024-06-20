package desafioPratico;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.io.IOException;

public class ConsultaLivroOpenLibrary {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        try {
            System.out.println("Digite o título do livro para busca: ");
            String tituloLivro = leitura.nextLine();
            
            // Endpoint da Open Library API
            String endereco = "https://openlibrary.org/search.json?title=" + tituloLivro.replace(" ", "+");
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            leitura.close();
        }
    }
}
