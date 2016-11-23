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
public class principal {
    public principal() {
        
        IArCondicionado sitio = new casa();
        IArCondicionado carro = new carro();
        IArCondicionado sala = new salaAula();
        
        IArCondicionado [] anjosAc = new IArCondicionado [3];
        anjosAc[0] = sitio;
        anjosAc[1] = sitio;
        anjosAc[2] = sitio;
        
        for (IArCondicionado ac : anjosAc){
            ac.ligarArCondicionado ();
        
    }
        
        
        /*
        sitio.ligarArCondicionado();
        sitio.desligarArCondicionado();
        carro.ligarArCondicionado();
        carro.desligarArCondicionado();
        sala.ligarArCondicionado();  

        */

    }

}
