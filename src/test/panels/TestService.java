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
public interface TestService {
    boolean addTest(Test t);
    Test getTestById(BigInteger id);
}
