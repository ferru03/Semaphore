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
public class Cuoco extends Thread{
    
    @Override
    public void run() {
        
        System.out.println("Inizio pausa pranzo:");
        
        while(Bancone.buffer < 10){
            try{
                Bancone.vuoto.acquire();
                Bancone.buffer ++; //sezione critica (produce)
                System.out.println("Il piatto numero " + Bancone.buffer + " è pronto");
                Thread.sleep(500); //tempo per preparare il piatto
                Bancone.pieno.release();
            }catch(InterruptedException e){
                
            }
        }
    }
}
