/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotpsit;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class Bancone {
    
    public static Semaphore pieno = new Semaphore(0);
    public static Semaphore vuoto = new Semaphore(1);
    public static int buffer = 0;
}
