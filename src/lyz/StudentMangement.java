package lyz;

import java.util.ArrayList;
import java.util.Scanner;

import static lyz.Add.addStudent;
import static lyz.Delete.deleteStudent;
import static lyz.Select.selectStudent;
import static lyz.Uptade.updateStudent;

public class StudentMangement {
    public static void main(String[] args) {

        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        //这是学生信息管理系统的主界面
        while (true) {
            System.out.println("--------欢迎来到学生信息管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.修改学生");
            System.out.println("3.删除学生");
            System.out.println("4.查询所有学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你选择：");
            //用scanner实现数据的录入
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            switch (str) {

                case "1":
                    /*  System.out.println("添加学生");*/
                    addStudent(array);
                    break;
                case "2":
                    // System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "3":
                    //  System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "4":
                    // System.out.println("查看所有学生");
                    selectStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用!");
                    System.exit(0);
                default:
                    System.out.println("输入无效，重新输入：");
            }
        }

    }
    
}
