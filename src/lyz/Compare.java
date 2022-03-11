package lyz;

import java.util.ArrayList;

public class Compare {
    public  static int compare(ArrayList<Student> students, String string) {
        int flag = -1;
        //在删除学生学号之前先进行判断，如果该学号不存在，则给出提示否则执行删除操作
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            if (stu.getId().equals(string)) {
                flag = i;
                break;
            }
        }
        return flag;
    }
    public static boolean isUsed(ArrayList<Student> students, String string){
        boolean flog=false;
        for (int i = 0; i < students.size(); i++) {
            Student student1=students.get(i);
            if (student1.getId().equals(string)) {
                flog = true;
                break;
            }
        }
        return flog;
    }
}
