package comparable;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Sắp xếp danh sách với Comparable interface
        //B1. Lớp của đối tượng sắp xếp phải kế thừa từ Comparable
        //B2. Cài đặt sắp xếp qua phương thức compareTo
        //B3. Sử dụng phương thức sort của Collections để sắp xếp
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        //Sắp xếp listStudent theo tên sinh viên giảm dần
        Collections.sort(listStudent);
        //Danh sách sau khi sắp xếp
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
