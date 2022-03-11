package lyz;

import java.util.ArrayList;
import java.util.Scanner;

import static lyz.Compare.isUsed;

public class Add {
    public static void addStudent(ArrayList<Student> arrays) {
        Scanner scanner = new Scanner(System.in);
        String id;
        //判断学生学号是否已经被使用
        while (true) {
            System.out.println("请输入学生学号：");
            id= scanner.nextLine();
            boolean flag = isUsed(arrays, id);
            if (flag) {
                System.out.println("你输入的学生学号已经被使用，请重新输入：");
            } else break;
        }
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("请输入学生居住地：");
        String address = scanner.nextLine();
        //创建学生对象，将键盘录入的信息添加到学生的成员变量
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        arrays.add(student);

        System.out.println("添加成功");

    }
}
