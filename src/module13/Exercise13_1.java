package module13;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exercise13_1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://jsonplaceholder.typicode.com/users";

        UserRegisterDto user1 = new UserRegisterDto();
        user1.setName("Nataliia Mishina");
        user1.setUsername("Misha_tatka");
        user1.setEmail("Misha@gmail.com");
        user1.setAdress(new Adress("Ukrainska", "61", "Kryviy Ryh", "50000",
                new Geo (23.3456, 43.3455)));
        user1.setPhone("098-234-54-45");
        user1.setWebsite("Misha.net");
        user1.setCompany(new Company("Misha&Co", "Proactive didactic contingency", "synergize scalable supply-chains"));

        //////////////////////__1__///////////////////////////
        Gson gson1 = new Gson();
        String json1 = gson1.toJson(user1);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json1))
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_POST.statusCode() = " + response.statusCode());

        System.out.println("response_POST.body() = " + response.body());

        //////////////////////__2__///////////////////////////
        String url2 = "https://jsonplaceholder.typicode.com/users/10";
        user1.setUsername("mishatatka");
        Gson gson2 = new Gson();
        String json2 = gson2.toJson(user1);

        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create(url2))
                .header("Content-Type","application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(json2))
                .build();
        HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_PUT.statusCode() = " + response2.statusCode());

        System.out.println("response_PUT.body() = " + response2.body());

        //////////////////////__3__///////////////////////////
        String url3 = "https://jsonplaceholder.typicode.com/users/10";

        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create(url3))
                .header("Content-Type","application/json")
                .DELETE()
                .build();
        HttpResponse<String> response3 = client.send(request3, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_Delete.statusCode() = " + response3.statusCode());

        //////////////////////__4__///////////////////////////
        HttpRequest request4 = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .GET()
                .build();
        HttpClient client4 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response4 = client4.send(request4, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_GET.statusCode() = " + response4.statusCode());

        //System.out.println("response_GET.body() = " + response4.body());

        //////////////////////__5__///////////////////////////
        String url5 = "https://jsonplaceholder.typicode.com/users/"+"?id=7";
        HttpRequest request5 = HttpRequest.newBuilder()
                .uri(URI.create(url5))
                .header("Content-Type","application/json")
                .GET()
                .build();
        HttpClient client5 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response5 = client5.send(request5, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_GET_id.statusCode() = " + response5.statusCode());

        System.out.println("response_GET_id.body() = " + response5.body());

        //////////////////////__6__///////////////////////////
        String url6 = "https://jsonplaceholder.typicode.com/users/"+"?username=Delphine";
        HttpRequest request6 = HttpRequest.newBuilder()
                .uri(URI.create(url6))
                .header("Content-Type","application/json")
                .GET()
                .build();
        HttpClient client6 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response6 = client6.send(request6, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_GET_username.statusCode() = " + response6.statusCode());

        System.out.println("response_GET_username.body() = " + response6.body());
    }
}
