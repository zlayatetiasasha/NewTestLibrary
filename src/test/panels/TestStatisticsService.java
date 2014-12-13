/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.panels;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author hp
 */
public interface TestStatisticsService {
    BigInteger registerAnsweredTest(AnsweredTest answt);
    BigInteger getResultForAnsweredTest(BigInteger answd_test_id);
    List<AnswersStudent> getAllAnsweredInfoForTest(BigInteger test_id);
    List<BigInteger> getAllResultsForTest(BigInteger test_id);
    
}
