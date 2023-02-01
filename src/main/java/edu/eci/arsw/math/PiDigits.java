package edu.eci.arsw.math;

import edu.eci.arsw.threads.Calculadora;

import java.util.ArrayList;
import java.util.List;

///  <summary>
///  An implementation of the Bailey-Borwein-Plouffe formula for calculating hexadecimal
///  digits of pi.
///  https://en.wikipedia.org/wiki/Bailey%E2%80%93Borwein%E2%80%93Plouffe_formula
///  *** Translated from C# code: https://github.com/mmoroney/DigitsOfPi ***
///  </summary>
public class PiDigits{

    private static int DigitsPerSum = 8;
    private static double Epsilon = 1e-17;

    static String res = "";

    
    /**
     * Returns a range of hexadecimal digits of pi.
     * @param start The starting location of the range.
     * @param count The number of digits to return
     * @return An array containing the hexadecimal digits.
     */
    public static void getDigits(int start, int count, int threads) {

        List<Calculadora> hilos = new ArrayList<>();



        int ini = start;
        int fin = count/threads;
        for(int i =0;i<threads;i++) {
            Calculadora calculadora = new Calculadora(ini,fin);
            hilos.add(calculadora);
            calculadora.start();
            ini = fin*(i+1);
        }
        for (Calculadora hilo : hilos) {
            try {
                hilo.join();
                res += hilo.getDigitos();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(res);
    }
}