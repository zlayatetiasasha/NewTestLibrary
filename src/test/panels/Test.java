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
public class Test implements Serializable {
    
    private BigInteger id;    
    private BigInteger t_id;   
    private List<Question> questions = new ArrayList<Question>();
    private String title;
    private String author;
    private String theme;
    private Integer passScore;
    private String date;
    private String instructions;
    private Integer access;
    private Integer timeToPass;
    private Integer poor;
    private Integer unsat;
    private Integer sat;
    private Integer good;
    private Integer exc;
    
        
    public Test() {}
    
    public Test(BigInteger id, BigInteger t_id, List<Question> questions, String title, String author, String theme, Integer passScore, String date,
                    String instructions, Integer timeToPass, Integer poor, Integer unsat, Integer sat, Integer good, Integer exc, Integer access) {
        this.id = id;
        this.author = author;
        this.questions = questions;
        this.title = title;
        this.theme = theme;
        this.passScore = passScore;
        this.date = date;
        this.instructions = instructions;
        this.timeToPass = timeToPass;
        this.poor = poor;
        this.unsat = unsat;
        this.sat = sat;
        this.good = good;
        this.exc = exc;
        this.access = access;
    }
    
    public Test(BigInteger t_id, List<Question> questions, String title, String author, String theme,  Integer passScore, String date,
                    String instructions, Integer timeToPass, Integer poor, Integer unsat, Integer sat, Integer good, Integer exc, Integer access) {
        this.t_id = t_id;
        this.questions = questions;
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.passScore = passScore;
        this.date = date;
        this.instructions = instructions;
        this.timeToPass = timeToPass;
        this.poor = poor;
        this.unsat = unsat;
        this.sat = sat;
        this.good = good;
        this.exc = exc;
        this.access = access;
    }
    
    public Test(String title, String author, String theme,  Integer passScore, String date,
                    String instructions, Integer timeToPass, Integer poor, Integer unsat, Integer sat, Integer good, Integer exc, Integer access) {
        this.t_id = t_id;
        this.questions = questions;
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.passScore = passScore;
        this.date = date;
        this.instructions = instructions;
        this.timeToPass = timeToPass;
        this.poor = poor;
        this.unsat = unsat;
        this.sat = sat;
        this.good = good;
        this.exc = exc;
        this.access = access;
    }
    
    public Test(BigInteger id) {
        this.id = id;
    } 

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }
    
    public void setTId(BigInteger t_id) {
        this.t_id = t_id;
    }

    public BigInteger getTId() {
        return t_id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getNumberOfQuestions() {
        return questions.size();
    }

    public Question getQuestion(int index) {
        return questions.get(index);
    }

    public void setQuestion(int index, Question question) {
        questions.set(index, question);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getPassScore() {
        return passScore;
    }

    public void setPassScore(Integer passScore) {
        this.passScore = passScore;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
    public void setTimeToPass(Integer timeToPass) {
        this.timeToPass = timeToPass;
    }

    public Integer getTimeToPass() {
        return timeToPass;
    }
    
    public Integer getPoor() {
        return poor;
    }

    public void setPoor(Integer poor) {
        this.poor = poor;
    }
    
    public Integer getUnsat() {
        return unsat;
    }

    public void setUnsat(Integer unsat) {
        this.unsat = unsat;
    }
    
    public Integer getSat() {
        return sat;
    }

    public void setSat(Integer sat) {
        this.sat = sat;
    }

    public Integer getGood() {
        return good;
    }

    public void setGood(Integer good) {
        this.good = good;
    }
    
    public Integer getExc() {
        return exc;
    }

    public void setEXc(Integer exc) {
        this.exc = exc;
    }
    
    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }
}
