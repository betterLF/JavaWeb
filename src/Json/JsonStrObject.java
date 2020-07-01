package Json;

import com.google.gson.Gson;

/**
 * @author lifei
 * @date 2020/7/1 10:26
 */
public class JsonStrObject {
    public static void main(String[] args) {
     Gson gson=new Gson();
     Student stu=new Student("aa",18);
     //student->jsonString
        String s = gson.toJson(stu);
        System.out.println(s);
        //jsonString->Student
        Student student = gson.fromJson(s, Student.class);
        System.out.println(student.toString());
    }
}
