package rainJob.com.exercise;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.JSONWriter;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExerciseJson {
    @Test
    public void test(){
        System.out.println("2%2 = " + 2 % 2);
    }
    @Test
    public void writeJson() throws IOException {
        FileWriter fileWriter = new FileWriter("xi.json");
        JSONArray jsonArray = new JSONArray();
//        JSONArray.toJSON()
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("xcz", "asd");
        jsonObject.put("xczxc", "asd");
        jsonArray.add(jsonObject);
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("xcz", "asd");
        jsonObject1.put("xczxc", "asd");
        jsonArray.add(jsonObject1);
        JSONWriter jsonWriter = new JSONWriter(fileWriter);
        jsonWriter.writeObject(jsonArray);
        jsonWriter.close();
    }

    @Test
    public void readJson() throws FileNotFoundException {
        FileReader fileReader = new FileReader("xi.json");
        JSONReader jsonReader = new JSONReader(fileReader);
        JSONArray o = (JSONArray) jsonReader.readObject();
        System.out.println("o = " + o.getString(1));
    }
}
