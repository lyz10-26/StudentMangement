package lyz;

import java.util.ArrayList;
import java.util.Scanner;

import static lyz.Compare.compare;

public class Delete {
    public static void deleteStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);

        String str;
        //将键盘中读取的数据保存到字符串str中
        while (true) {
            System.out.println("请输入需要删除的学生ID：");
            str = scanner.nextLine();
            //构造判断函数减少代码的冗余
            /*int flag=-1;
            //在删除学生学号之前先进行判断，如果该学号不存在，则给出提示否则执行删除操作
            for (int i = 0; i < students.size(); i++) {
                Student stu = students.get(i);
                if (stu.getId().equals(str)) {
                    flag = i;
                    break;
                }*/
            int flag = compare(students, str);
            if (flag == -1) {
                System.out.println("学生学号不存在！请重新输入：");
            } else {
                students.remove(flag);
                System.out.println("删除成功");
                break;
            }
        }
    }
}
