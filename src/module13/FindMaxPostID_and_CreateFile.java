package module13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxPostID_and_CreateFile {

    public FindMaxPostID_and_CreateFile(int userId) throws IOException {

        String url = "https://jsonplaceholder.typicode.com/users/"+userId+"/posts";
        String response = Jsoup.connect(url)
                .ignoreContentType(true)
                .get()
                .body()
                .text();

        Type type = TypeToken
                .getParameterized(List.class, Posts.class)
                .getType();

        List<Posts> PostsResponses = new Gson().fromJson(response, type);

        PostsResponses = PostsResponses.stream()
                .sorted((s1, s2) -> s2.getId() - s1.getId())
                .limit(1)
                .collect(Collectors.toList());

        CreateFile(userId, PostsResponses.get(0).getId());

    }

    public void CreateFile(int userId, int postID) throws IOException {

        String url = "https://jsonplaceholder.typicode.com/posts/"+postID+"/comments";
        String response = Jsoup.connect(url)
                .ignoreContentType(true)
                .get()
                .body()
                .text();

        Type type = TypeToken
                .getParameterized(List.class, Comments.class)
                .getType();

        List<Comments> CommentsResponses = new Gson().fromJson(response, type);

        CommentsResponses = CommentsResponses.stream()
                .filter(item -> item.getPostId() == postID)
                .collect(Collectors.toList());


        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter fileWriter = new FileWriter("user-"+userId+"-post-"+postID+"-comments.json");
        gson.toJson(CommentsResponses, fileWriter);
        fileWriter.flush();
        fileWriter.close();
   }
}
