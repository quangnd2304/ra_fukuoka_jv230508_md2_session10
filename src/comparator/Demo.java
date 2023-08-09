package comparator;

import entity.Student;
import entity.Student1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student1 student1 = new Student1("SV001", "Nguyễn Văn A", 20);
        Student1 student2 = new Student1("SV002", "Nguyễn Văn B", 25);
        Student1 student3 = new Student1("SV003", "Nguyễn Văn C", 22);
        List<Student1> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        //Sắp xếp danh sách với Comparator interface
        //B1: Sử dụng phương thức sort của Collections để sắp xếp
        //B2: Cài đặt phương thức compare của interface Comparator để sắp xếp
        //Sắp xếp sinh viên theo mã sinh viên tăng dần
        Collections.sort(listStudent, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return -o1.getStudentId().compareTo(o2.getStudentId());
            }
        });
        for (Student1 student : listStudent) {
            System.out.println(student);
        }
        Collections.sort(listStudent, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (Student1 student : listStudent) {
            System.out.println(student);
        }
    }
}
