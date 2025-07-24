/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elapsedtime_9_3;
import java.util.Date;

/**
 *
 * @author maaly
 */
public class ElapsedTime_9_3 {

    public static void main(String[] args) {
        long[] times = {
            10000L,
            100000L, 
            1000000L, 
            10000000L, 
            100000000L, 
            1000000000L,
            10000000000L,
            100000000000L 
        };
        
        for(long e : times) {
            Date date = new Date();
            date.setTime(e);
            System.out.println("Elaps time " + e + " ms is " + date.toString());
        }
                
    }
}
