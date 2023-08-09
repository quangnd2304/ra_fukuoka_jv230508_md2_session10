package stack;

import entity.Student;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        Stack<Student> stackStudent = new Stack<>();
        stackStudent.push(student1);
        stackStudent.push(student2);
        stackStudent.push(student3);
        System.out.println("Lấy phần tử trên cùng của stack và không xóa: "+stackStudent.peek());
        System.out.println("Lấy phần tủ trên cùng của stack và xóa PT: "+stackStudent.pop());
        System.out.println("Tìm phần tử student1 trong ngăn xếp: "+stackStudent.search(student1));
        System.out.println("Các phần tử trong stack: "+stackStudent);

    }
}
