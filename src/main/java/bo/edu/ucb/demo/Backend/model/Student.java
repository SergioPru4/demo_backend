package bo.edu.ucb.demo.Backend.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    @Column(name = "student_id")
    private Integer student_id;
    @Column(name = "full_name")
    private String fullname;

    public Student(){
        this.student_id=student_id;
        this.fullname=fullname;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
