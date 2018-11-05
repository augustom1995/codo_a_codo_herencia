/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto
 */
public class principal {
    
    public static void main (String [] args){
        
        magolvl1 jugador1 = new magolvl1();
        
        //Super clase humano
        jugador1.nombre = "Chaos";
        jugador1.equipo= "Dark";
        
        //clase padre mago
        jugador1.puntosdemagia= 256;
        jugador1.cantidaddealmas=3;
        jugador1.comer();
        
        //clase magolvl1
        jugador1.concentracion();
        
        System.out.println("El nombre del mago es: "+jugador1.nombre);
        
    }
}
