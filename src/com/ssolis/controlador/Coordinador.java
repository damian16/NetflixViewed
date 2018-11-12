package com.ssolis.controlador;

import com.ssolis.modelo.Punto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Coordinador {
    ArrayList<Punto> puntos= new ArrayList<Punto>();
    
    public void almacenarPuntos(Punto p){
        p.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingresa X:")));
         p.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingresa Y:")));
         puntos.add(p);
    }
    
     public void imprimirPuntos(){
        String datos="";
        for (Punto punto : puntos) {
            datos +="\n"+punto.toString();
        }
        JOptionPane.showMessageDialog(null, datos);
    }
     
     public void menu(){
        int op=0;
        
        do{
        try{
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n"
                 + "1.- Ingresar Punto\n"
                 + "2.- Calcular Distancia entre dos puntos\n"
                 + "3.- Calcular distancia a la torre de control"
                 + "4.- Imprimir Puntos\n"
                 + "5.- Salir"));
            switch (op) {
                case 1:
                    almacenarPuntos(new Punto());
                    break;
                case 2:
                    System.out.println("CAso 2");
                    break;
                case 3:
                    System.out.println("CAso 3");
                    break; 
                case 4:
                    imprimirPuntos();
                    break;
                case 5:
                    System.out.println("CAso 5");
                    break;
            } 
        }catch(Exception e){
            System.out.println("error");
            
        }
           
            
        }while(op!=5);
                 
     }
    
}













