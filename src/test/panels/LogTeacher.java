/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.panels;

import java.math.BigInteger;

/**
 *
 * @author Asus
 */
public class LogTeacher {
    
    private BigInteger id;
    private BigInteger t_id;
    private String login;
    private String password;
    
    public LogTeacher() { }
    
    public LogTeacher(BigInteger id, BigInteger t_id, String login, String password) { 
        this.id = id;
        this.t_id = t_id;
        this.login = login;
        this.password = password;
    }
    
    public LogTeacher(BigInteger t_id, String login, String password) { 
        this.t_id = t_id;
        this.login = login;
        this.password = password;
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
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
}
