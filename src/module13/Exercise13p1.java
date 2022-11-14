package module13;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Exercise13p1 {
    public static void main(String[] args) throws IOException, InterruptedException {

        UserRegisterDto user = CreateUser();

        Gson gson = new Gson();
        String json = gson.toJson(user);

        String url = "https://jsonplaceholder.typicode.com/users";
        methodPOST(url, json);

        String url2 = "https://jsonplaceholder.typicode.com/users10";
        methodPUT(url2, json);

        methodDELETE(url2, json);

        methodGETall(url, json);

        Scanner in = new Scanner(System.in);
        System.out.print("Input id: ");
        int id = in.nextInt();

        String url5 = "https://jsonplaceholder.typicode.com/users/"+"?"+id;
        methodGETid(url5, json);

        String userName = "Delphine";
        String url6 = "https://jsonplaceholder.typicode.com/users/"+"?username="+userName;
        methodGETuserName(url6, json);
     }
    public static UserRegisterDto CreateUser(){
        UserRegisterDto user = new UserRegisterDto();
        user.setName("Nataliia Mishina");
        user.setUsername("Misha_tatka");
        user.setEmail("Misha@gmail.com");
        user.setAdress(new Adress("Ukrainska", "61", "Kryviy Ryh", "50000",
                new Geo (23.3456, 43.3455)));
        user.setPhone("098-234-54-45");
        user.setWebsite("Misha.net");
        user.setCompany(new Company("Misha&Co", "Proactive didactic contingency", "synergize scalable supply-chains"));
        return user;
    }
    public static void methodPOST(String url, String json) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_POST.statusCode() = " + response.statusCode());

        System.out.println("response_POST.body() = " + response.body());
    }
    public static void methodPUT(String url, String json) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(json))
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_PUT.statusCode() = " + response.statusCode());

        System.out.println("response_PUT.body() = " + response.body());
    }
    public static void methodDELETE(String url, String json) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .DELETE()
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_Delete.statusCode() = " + response.statusCode());
    }
    public static void methodGETall(String url, String json) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .GET()
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_GET.statusCode() = " + response.statusCode());

        System.out.println("response_GET.body() = " + response.body());
    }
    public static void methodGETid(String url, String json) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .GET()
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_GET_id.statusCode() = " + response.statusCode());

        System.out.println("response_GET_id.body() = " + response.body());
    }
    public static void methodGETuserName(String url, String json) throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .GET()
                .build();
        HttpClient client6 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client6.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response_GET_username.statusCode() = " + response.statusCode());

        System.out.println("response_GET_username.body() = " + response.body());

    }
}
