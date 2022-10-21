package module10;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CreateJson {
    public static void main(String[] args) throws IOException {
        ArrayList <UserReg> list = new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream("fileUser.txt");
            Scanner scanner = new Scanner(inputStream);
            int i = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String [] data = line.split(" ");
                if(data[0].equals("name") == false){
                    list.add(new UserReg(data[0], data[1]));
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("userJson.json");
        gson.toJson(list,fw);
        fw.flush();
        fw.close();
    }
}
