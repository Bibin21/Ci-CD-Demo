package com.example.Jenkins;

import com.example.Jenkins.service.StringService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaseTest {
   static StringService stringService;

    @Test
    void testLength(){
        assertEquals(3,stringService.findLength("abc"));
    }
    @Test
    void testAscii_sum(){
        assertEquals(294,stringService.findASCIISum("abc"));
    }
    @Test
    void testAscii_sum_1(){
        assertEquals(394,stringService.findASCIISum("abcd"));
    }
    @BeforeAll
    static void setup(){
        stringService=new StringService();
    }
}
