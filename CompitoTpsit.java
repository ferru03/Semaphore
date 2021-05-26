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
public class CompitoTpsit {  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuoco cuoco = new Cuoco();
        Dipendente dipendente = new Dipendente();
        
        cuoco.start();
        dipendente.start();
    }
}
