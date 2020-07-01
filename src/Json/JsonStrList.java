package Json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lifei
 * @date 2020/7/1 10:38
 */
public class JsonStrList {
    public static void main(String[] args) {
        List<Student> stuList=new ArrayList<>();
        stuList.add(new Student("aa",22));
        stuList.add(new Student("cc",20));
        //stuList->jsonString
        Gson gson=new Gson();
        String s = gson.toJson(stuList);
        System.out.println(s);
        //jsonString->stuList
//        List<Student> list = gson.fromJson(s, List.class);
//        System.out.println(list.get(0));
        //使用typeToken
        List<Student> list = gson.fromJson(s, new TypeToken<List<Student>>() {}.getType());
        System.out.println(list);
    }
}
