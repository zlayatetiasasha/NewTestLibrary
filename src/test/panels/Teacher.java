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
public class Teacher implements Serializable {

    private BigInteger id;
    private List<Test> tests = new ArrayList<Test>();

    public Teacher() { }
    
    public Teacher(BigInteger id) {
        this.id = id;
    }
      
    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }
    
     public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public List<Test> getTests() {
        return tests;
    }
}
