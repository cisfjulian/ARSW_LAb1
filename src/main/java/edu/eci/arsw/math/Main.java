/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import edu.eci.arsw.threads.Calculadora;
import edu.eci.arsw.math.PiDigits.*;
import java.util.Arrays;

/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String a[]) {

        long startTime = System.nanoTime();

        PiDigits.getDigits(0, 30, 3);

        long endTime = System.nanoTime();
        System.out.println("-------------------------------------------");
        System.out.println(endTime - startTime);

        System.out.println("-------------------------------------------");


//        System.out.println(bytesToHex(PiDigits.getDigits(0, 10)));
//        System.out.println(bytesToHex(PiDigits.getDigits(1, 100)));
//        System.out.println(bytesToHex


    }
}
