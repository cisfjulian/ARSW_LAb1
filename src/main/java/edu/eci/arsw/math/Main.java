/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import java.lang.Runtime;
/**
 *
 * @author hcadavid
 */
public class Main {

    private static Runtime runtime = Runtime.getRuntime();

    public static void main(String a[]) {

        int procesadores = runtime.availableProcessors();

        PiDigits.getDigits(0, 100000, 200);

//    boolean running = true;
//    while (running) {
//
//    }


//        long endTime = System.nanoTime();
//        System.out.println("-------------------------------------------");
//        System.out.println(endTime - startTime);
//
//        System.out.println("-------------------------------------------");


//        System.out.println(bytesToHex(PiDigits.getDigits(0, 10)));
//        System.out.println(bytesToHex(PiDigits.getDigits(1, 100)));
//        System.out.println(bytesToHex


    }
}
