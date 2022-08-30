
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ariel
 */
public class Principal {
    public static void main(String[] args) {
        int unEntero = 10;
        float unFlotante = 2.5f;
        double unDoble = 12.34;
        String unaCadena = "esto es una cadena";
                
        System.out.println(unEntero);
        System.out.println(unFlotante);
        System.out.println(unDoble);
        System.out.println(unaCadena);
        
        ArrayList<Float> listaFlotante = new ArrayList();
        
        listaFlotante.add(2.5f);
        System.out.println(listaFlotante);
    }
}
