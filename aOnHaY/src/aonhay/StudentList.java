
package aonhay;

import java.util.ArrayList;

public abstract class StudentList{
    ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void deleteStudentById(String id){
        studentList.removeIf(student -> student.getId().equals(id));
    }
    public Student findStudentByID(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
    void displayAllStudent(){
        for(Student student : studentList){
            student.displayInfor();
            System.out.println();
        }
    }
}
