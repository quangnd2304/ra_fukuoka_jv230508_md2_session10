package set;

import entity.Student;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        //Khởi tạo đối tượng từ Set Interface
        Set<Student> setListStudent = new HashSet<>();
        setListStudent.add(student1);
        setListStudent.add(student2);
        setListStudent.add(student3);
        setListStudent.add(student1);
        //Thông tin danh sách sinh viên
        for (Student student : setListStudent) {
            System.out.println(student);
        }

    }
}
