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
public class QuestionType implements Serializable {
    
    private BigInteger id;
    /*variants - single, multiple, open*/
    private String name;
    
    public QuestionType() {
        name = "";
    }
    
    public QuestionType(BigInteger id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public QuestionType(BigInteger id) {
        this.id = id;
    }
    
    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
