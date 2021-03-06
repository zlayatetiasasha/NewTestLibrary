/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.panels;

import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author Asus
 */
public class AnsweredTest implements Serializable {

    private BigInteger id;
    private Test test;
    private BigInteger result;
    private Student student;

    public AnsweredTest() {
    }

    public AnsweredTest(BigInteger id, Test test, BigInteger result, Student student) {
        this.id = id;
        this.test = test;
        this.result = result;
        this.student = student;
        name = student.getName();
        course = student.getCourse();
        grnum = student.getGrnump();
    }

    public AnsweredTest(Test test, BigInteger result, Student student) {
        this.test = test;
        this.result = result;
        this.student = student;
        name = student.getName();
        course = student.getCourse();
        grnum = student.getGrnump();
    }

    public AnsweredTest(Test test, Student student) {
        this.test = test;
        this.student = student;
        name = student.getName();
        course = student.getCourse();
        grnum = student.getGrnump();
    }
        
    public AnsweredTest(BigInteger id) {
        this.id = id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Test getTest() {
        return test;
    }

    public void setResult(BigInteger result) {
        this.result = result;
    }

    public BigInteger getResult() {
        return result;
    }

    public void setStudent(Student student) {
        this.student = student;
        name = student.getName();
        course = student.getCourse();
        grnum = student.getGrnump();
    }

    public Student getStudent() {
        return student;
    }
    
    public void setGrnum(String grnum) {
        this.grnum = grnum;
    }

    public String getGrnump() {
        return grnum;
    }
    
    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    private String name;    
    private Integer course;
    private String grnum; 
}
