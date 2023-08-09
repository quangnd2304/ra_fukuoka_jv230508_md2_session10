package linkedList;

import entity.Student;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        //Khởi tạo đối tươợng từ lớp LinkedList
        LinkedList<Student> linkedListStudent = new LinkedList<>();
        linkedListStudent.add(student1);
        linkedListStudent.addFirst(student2);
        linkedListStudent.addLast(student3);
        //Lấy thông tin phần tử đầu danh sách
        System.out.println("Thông tin phần tử đầu danh sách:"+linkedListStudent.getFirst());
        System.out.println("Thông tin phần tử cuối danh sách:"+linkedListStudent.getLast());
        //Xóa phần tử đầu danh sách
        linkedListStudent.removeFirst();
        //In thông tin danh sách sinh viên
        for (Student student : linkedListStudent) {
            System.out.println(student);
        }
    }
}
