package Controller;

import java.util.List;

import Model.Model;
import Model.Domen.Student;
import View.View;

public class Controller implements iGetController{
    private iGetModel model;
    private iGetView view;

    private List<Student> students;
    
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs){
        if(studs.size()>0){
            return true;
        }
        else{
            return false;
        }
    }

    public void update(){

        // MVP
        students = model.getAllStudents();
        if(testData(students)){
            view.printAllStudents(students);
        }
        else{
            System.out.println("Student's list is empty");
        }

        // MVC
        //view.printAllStudents(model.getAllStudents());
    }
}
