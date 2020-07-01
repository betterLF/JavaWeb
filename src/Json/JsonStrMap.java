package Json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lifei
 * @date 2020/7/1 11:52
 */
public class JsonStrMap {
    public static void main(String[] args) {
        Map<String,Student> map=new HashMap<>();
        map.put("aa",new Student("aa",18));
        map.put("bb",new Student("bb",16));
        //map->jsonString
        Gson gson=new Gson();
        String s = gson.toJson(map);//{"aa":{"name":"aa","age":18},"bb":{"name":"bb","age":16}}
        System.out.println(s);
        //jsonString->map
        Map<String,Student> c= gson.fromJson(s, new TypeToken<Map<String, Student>>() {}.getType());
        System.out.println(c.get("aa"));
    }
}
