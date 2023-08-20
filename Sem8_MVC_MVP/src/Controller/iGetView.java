package Controller;

import java.util.List;

import Model.Domen.Student;

public interface iGetView {
    public void printAllStudents(List<Student> students);

    public void setController(iGetController contr);
}
