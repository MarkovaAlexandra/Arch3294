import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetController;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Model;
import Model.Domen.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("John", 21, 101);
        Student s2 = new Student("Fred", 22,102);
        Student s3 = new Student("Ted", 22, 103);
        Student s4 = new Student("Bed", 21, 104);
        Student s5 = new Student("Red", 20, 105);
        Student s6 = new Student("Qwe", 23, 106);
        Student s7 = new Student("Asd", 26, 107);
        Student s8 = new Student("Zxc", 21, 108);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);

        iGetModel model = new Model(students);
        iGetView view = new View();
        iGetController contr = new Controller(model, view);
        contr.update();
    
        System.out.println("___________________________________");
        //iGetController control = new Controller(model, view);
        //view.setController(control);
        
        
    }
}
