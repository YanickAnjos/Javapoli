/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoli;

/**
 *
 * @author UserPL022Pc07
 */
public class carro implements IArCondicionado {
    
     @Override
    public void ligarArCondicionado() {
        System.out.println("Ar condicionado ligado do CARRO");
    }

     @Override
    public void desligarArCondicionado() {
        System.out.println("Ar condicionado do CARRO desligado");
    }

    public void ligarIArCondicionado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void desligarIArCondicionado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

 

