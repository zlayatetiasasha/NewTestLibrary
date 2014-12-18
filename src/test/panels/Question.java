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
public class Question implements Serializable {

    private BigInteger id;
    private BigInteger qtId;
    private BigInteger tId;
    private String text;
    private Integer value;
    private Test test;
    private QuestionType type;
    private List<Answer> answers = new ArrayList<Answer>();

    public Question() {
        text = "";
    }

    public Question(BigInteger id, BigInteger qtId, BigInteger tId, String text, Integer value) {
        this.id = id;
        this.text = text;
        this.qtId = qtId;
        this.value = value;
    }

    public Question(BigInteger qtId, BigInteger tId, String text, Integer value) {
        this.text = text;
        this.value = value;
        this.qtId = qtId;
    }

    public Question(BigInteger qtId, String text, Integer value) {
        this.text = text;
        this.qtId = qtId;
        this.value = value;
    }

    public Question(BigInteger id) {
        this.id = id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Answer getAnswer(int index) {
        return answers.get(index);
    }

    public void setAnswer(int index, Answer answer) {
        answers.set(index, answer);
    }

    public int getNumAnswers() {
        return answers.size();
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Test getTest() {
        return test;
    }

    public void setQuestionTypeId(BigInteger qtId) {
        this.qtId = qtId;
    }

    public BigInteger getQuestionTypeId() {
        return qtId;
    }

    public void setTestId(BigInteger tId) {
        this.tId = tId;
    }

    public BigInteger getTestId() {
        return tId;
    }

    public void setQuestionType(QuestionType qtype) {
        this.type = qtype;
    }

    public QuestionType getQuestionType() {
        return type;
    }
}
