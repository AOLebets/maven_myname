package myname;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Gson gb = new GsonBuilder().setPrettyPrinting().create();
        ArrayList jsonArray = new ArrayList();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name", "Albina");
        linkedHashMap.put("surname", "Lebets");
        jsonArray.add(linkedHashMap);

        System.out.println(gb.toJson(jsonArray));
    }
}