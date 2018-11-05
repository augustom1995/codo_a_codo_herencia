/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto
 */
public class mago extends humano {
    
    public int puntosdemagia;
    public int cantidaddealmas;
    
    public void quemar(){
    }
    
    public void comer(){
    }
    
    public static void main (String[]args){
        
        mago jugador1= new mago();
        
        jugador1.nombre= "Natsu";
        jugador1.equipo= "Fairy Tail";
        jugador1.salud= 100;
        
        jugador1.atacar();
        jugador1.defender();
    }
    
}
