package iterator;

import entity.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        //Chuyển từ List sang iterator
        Iterator<Student> studentIterator = listStudent.iterator();
        //Duyệt với interator
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println(student);
        }
    }
}
