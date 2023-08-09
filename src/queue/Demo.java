package queue;

import entity.Student;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        Queue<Student> queueStudent = new LinkedList<>();
        queueStudent.offer(student1);
        queueStudent.offer(student2);
        queueStudent.offer(student3);
        System.out.println("Lấy phần tử đầu tiên và không xóa: "+queueStudent.element());//rỗng thì trả exception
        System.out.println("Lấy phần tử đầu tiên và không xóa: "+queueStudent.peek());//rỗng thì trả về null
        System.out.println("Lấy phần tử đầu tiền và xóa:"+queueStudent.poll());//rỗng thì trả về null
        System.out.println("Lấy phần tử đầu tiên và xóa phần tử đầu tiên: "+queueStudent.remove());//rỗng thì trả về exception
        System.out.println(queueStudent);
    }
}
