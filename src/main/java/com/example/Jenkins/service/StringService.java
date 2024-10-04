package com.example.Jenkins.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public int findLength(String input){
        return input.length();
    }
    public int findASCIISum(String input){
        int total=0;
        for(int i=0;i<input.length();i++)
        {
            total+=(int)input.charAt(i);
        }
        return total;
    }

}
