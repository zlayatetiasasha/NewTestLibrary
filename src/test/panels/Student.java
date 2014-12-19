/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.panels;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Student implements Serializable {

    private BigInteger id;    
    private String name;    
    private String email;    
    private Integer course;
    private String grnum;    
    private String faculty;    
    private List<AnswersStudent> answersStudent = new ArrayList<AnswersStudent>();
    
    public Student() {}
    
    public Student(BigInteger id, String name, String email, Integer course, String grnum, String faculty) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.grnum = grnum;
        this.faculty = faculty;
    }
    
    public Student(String name, String email, Integer course, String grnum, String faculty) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.grnum = grnum;
        this.faculty = faculty;
    }
     
    public Student(String name) {
        this.name=name;
    }
    
    
    public Student(BigInteger id) {
        this.id = id;
    } 
    
    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setGrnum(String grnum) {
        this.grnum = grnum;
    }

    public String getGrnump() {
        return grnum;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }
}
