/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotpsit;

/**
 *
 * @author informatica
 */
public class Dipendente extends Thread{
    
    public int dato = 0;

    @Override
    public void run() {
        while(Bancone.buffer < 10){
            try{
                Bancone.pieno.acquire();
                dato = Bancone.buffer; //sezione critica (consuma)
                System.out.println("Il piatto numero " + dato + " è stato consumato");
                Thread.sleep(500); //tempo per prelevare il piatto dal bancone
                Bancone.vuoto.release();
            }catch(InterruptedException e){
                
            }
        }   
        System.out.println("Termine pausa pranzo.");
    }
}
