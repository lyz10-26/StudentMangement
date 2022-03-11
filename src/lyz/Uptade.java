package lyz;

import java.util.ArrayList;
import java.util.Scanner;

import static lyz.Compare.compare;

public class Uptade {
    public static void updateStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        String id ;
        while (true) {
            System.out.println("请输入需要修改的学生学号：");
            id = scanner.nextLine();
        /*int flag=-1;
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            if (stu.getId().equals(id)) {
                flag = i;
                break;
            }
        }*/
            int a = compare(students, id);
            if (a==-1) {
                System.out.println("学生学号不存在！请重新输入：");
            }
            else {
                break;
            }
        }
        System.out.println("请输入新学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生修改后的年龄：");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("请输入学生修改后居住地：");
        String address = scanner.nextLine();
        //实例化学生对象
        Student student1 = new Student();
        student1.setId(id);
        student1.setName(name);
        student1.setAge(age);
        student1.setAddress(address);
        //遍历学生对象
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(id)) {
                students.set(i, student1);
                break;
            }
        }
        System.out.println("修改成功");
    }
}
