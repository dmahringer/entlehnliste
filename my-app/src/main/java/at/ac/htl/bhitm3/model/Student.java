package at.ac.htl.bhitm3.model;

public class Student extends Person {
    String studentID;

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public Object getStudentID(){

        return this.studentID;
    
    }
}
