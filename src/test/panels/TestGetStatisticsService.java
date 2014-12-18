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
public interface TestGetStatisticsService {

    BigInteger getAverageResultForTest(BigInteger test_id);

    /*  BigInteger getNumberOfFailedResultsForTest(BigInteger test_id);

     BigInteger getNumberOfPassedResultsForTest(BigInteger test_id);

     BigInteger getNumberOfAllPassingStudentsForTest(BigInteger test_id);

     BigInteger getMaximumResultForTest(BigInteger test_id);

     List<BigInteger> getAllResultsForTest(BigInteger test_id);
    
     HashMap<BigInteger, BigInteger> getNumberOfAnswersOnQuestionsForTest (BigInteger test_id);
    
     */
}
