/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto
 */
public class guerrero extends humano {
    
    public int puntosdefuerza;
    public int estadoarmadura;
    
    public void cortar(){
    }
    
    public void bloquear(){
    }
    
    public static void main (String[]args){
        
        guerrero jugador2= new guerrero();
        
        jugador2.nombre= "Erza";
        jugador2.equipo= "Fairy Tail";
        jugador2.salud= 120;
        
        jugador2.atacar();
        jugador2.defender();
    }
    
}
