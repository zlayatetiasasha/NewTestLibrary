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
public class Answer implements Serializable {

    private BigInteger id;
    private Integer isRight;
    private String text;
    private BigInteger qId;
    private Question question;

    private String answeredText;

    public Answer() {
    }

    public Answer(BigInteger id, BigInteger qId, Integer isRight, String text) {
        this.id = id;
        this.isRight = isRight;
        this.text = text;
        this.qId = qId;
    }

    public Answer(BigInteger qId, Integer isRight, String text) {
        this.isRight = isRight;
        this.text = text;
        this.qId = qId;
    }

    public Answer(Integer isRight, String text) {
        this.isRight = isRight;
        this.text = text;
        this.qId = qId;
    }

    public Answer(String answeredText, BigInteger qId) {
        this.answeredText =  answeredText;
        this.qId=qId;
       
    }

    public Answer(BigInteger id) {
        this.id = id;
    }

    public int compareTo(Object obj) {
        Answer answer = (Answer) obj;

        if (this.getId().intValue() < answer.getId().intValue()) {
            /* текущее меньше полученного */
            return -1;
        } else if (this.getId().intValue() > answer.getId().intValue()) {
            /* текущее больше полученного */
            return 1;
        }
        /* текущее равно полученному */
        return 0;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public void setQId(BigInteger qId) {
        this.qId = qId;
    }

    public BigInteger getQId() {
        return qId;
    }

    public void setIsRight(Integer isRight) {
        this.isRight = isRight;
    }

    public Integer getIsRight() {
        return isRight;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }
    
     public void setAnsweredText(String text) {
        this.answeredText = text;
    }

    public String getAnsweredText() {
        return answeredText;
    }
}
