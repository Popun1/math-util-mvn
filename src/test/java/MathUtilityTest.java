/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.brian.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Popun
 */
public class MathUtilityTest {
    
    //Test case #1: Verify getFactorial with n = 0
    //Steps/Prodecures:
    //          1. Given n = 0
    //          2. Call/invoke getFactorial(n=0)
    //Expected result:
    //          The method must return 1 as the result of 0! = 1
    //Status: PASSED | FAILED chờ lúc chạy hàm mới biết trạng thái đúng sai
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRightArgument2ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
 }
