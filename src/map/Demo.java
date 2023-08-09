package map;

import entity.Student;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        //Key duy nhất
        Map<Integer, Student> mapStudent = new HashMap<>();
        mapStudent.put(1, student1);
        mapStudent.put(2, student2);
        mapStudent.put(3, student3);
        //get(key): V
        System.out.println("Thông tin sinh viên có key=3:"+mapStudent.get(3));
        //isEmpty(): kiểm tra map có phần tử chưa
        System.out.println("Kiểm tra map có chứa phần tử chưa: "+mapStudent.isEmpty());
        //Xóa phần tử có key =1
        mapStudent.remove(1);
        //size(): trả ra số phần tủ của map
        System.out.println("Số phần tử của map:"+mapStudent.size());
        System.out.println("Kiểm tra key=2 đã tồn tại trong map chưa: "+mapStudent.containsKey(2));
        System.out.println("Kiểm tra student3 đã tồn tại trong map chưa: "+mapStudent.containsValue(student3));
        System.out.println("Các value trong map:"+mapStudent.values());
        //Xóa các phần tử trong map
        mapStudent.clear();
        System.out.println(mapStudent);
    }
}
