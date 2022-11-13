package module13;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise13_3  {
    public static void main(String[] args) throws IOException {
        String url = "https://jsonplaceholder.typicode.com/users/1/todos";
        String response = Jsoup.connect(url)
                .ignoreContentType(true)
                .get()
                .body()
                .text();

        Type type = TypeToken
                .getParameterized(List.class, Task.class)
                .getType();
        List<Task> tasksResponses = new Gson().fromJson(response, type);

        tasksResponses = tasksResponses.stream()
                .filter(item -> item.isCompleted() == false)
                .collect(Collectors.toList());
        System.out.println("tasksResponses = " + tasksResponses);

    }
}
