package at.ac.htl.bhitm3.model;

public class Teacher extends Person {
    double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }   

    public Object getSalary() {
        return this.salary;
    }
}