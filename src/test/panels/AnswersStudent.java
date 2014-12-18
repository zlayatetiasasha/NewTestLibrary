/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.panels;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import test.panels.Answer;
import test.panels.Answer;
import test.panels.Question;
import test.panels.Question;
import test.panels.Student;
import test.panels.Student;
import test.panels.Test;
import test.panels.Test;

/**
 *
 * @author Asus
 */
public class AnswersStudent implements Serializable {

    private BigInteger id;

    private Test test;

    private Student student;

    private Question question;

    private List<Answer> answers;
    

    /*@OneToMany(fetch = FetchType.EAGER, mappedBy = "answersstudent")
     @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
     private List<Student> students = new ArrayList<Student>();
    
     @OneToMany(fetch = FetchType.EAGER, mappedBy = "id")
     @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
     private List<Test> tests = new ArrayList<Test>();
    
     @OneToMany(fetch = FetchType.EAGER, mappedBy = "answersstudent")
     @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
     private List<Question> questions = new ArrayList<Question>();
    
     @OneToMany(fetch = FetchType.EAGER, mappedBy = "answersstudent")
     @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
     private List<Answer> answers = new ArrayList<Answer>();
    
     */
    /*@ManyToMany(mappedBy="id")
     private Student student;
     
     @ManyToMany(mappedBy="id")
     private Test test;
    
     @ManyToMany(mappedBy="id")
     private Question question;
     
     @ManyToMany(mappedBy="id")
     private Answer answer;*/
    /* @OneToMany(fetch = FetchType.EAGER, mappedBy = "answersstudent")
     @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
     private List<Answer> answers = new ArrayList<Answer>();
    
     @OneToMany(fetch = FetchType.EAGER, mappedBy = "answersstudent")
     @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
     private List<Question> questions = new ArrayList<Question>();
     */
    public AnswersStudent() {
    }

    public AnswersStudent(BigInteger id, Student student, Test test, Question question, List<Answer> answers) {
        this.id = id;
        this.test = test;
        this.student = student;
        this.answers = answers;
        this.question = question;
    }

    public AnswersStudent(Student student, Test test, Question question, List<Answer> answers) {
        this.test = test;
        this.student = student;
        this.answers = answers;
        this.question = question;
    }

    public AnswersStudent(BigInteger id) {
        this.id = id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Test getTest() {
        return test;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Answer> getAnswer() {
        return answers;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }

}
