package lyz;

import java.util.ArrayList;

public class Select {
    public static void selectStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("没有学生信息，请先进行添加！");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t居住的\t\t\t");
        //将集合中的元素打印
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getId() + "\t\t"
                    + student.getName() + "\t\t"
                    + student.getAge() + "\t\t"
                    + student.getAddress());
        }
    }
}
