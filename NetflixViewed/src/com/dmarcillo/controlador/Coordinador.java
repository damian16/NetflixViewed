/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmarcillo.controlador;


import com.dmarcillo.vista.JFrameMovie;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LAB5-PC8-USUARIO
 */
public class Coordinador {
    
    public static void showMenu(){
        int exit=0;
        do {            
            System.out.println("Bienvenidos a la Netflis Viewer");
            System.out.println("Seleccioná una opcion :\n"
            +"1.- Book\n"
            +"2.- Magazine\n"
            +"3.- Movies\n"
            +"4.- Series\n"
            +"\n-----------------------\n"
            +"5.- Report\n"
            +"6.- Report today\n"
            +"0.- Exit");
            Scanner input =new Scanner(System.in);
            int response=input.nextInt();
            switch(response){
                case 0:
                    break;
                case 1:
                    showBook();
                    
                    break;
                case 2:
                    showMagazine();
                    break;
                case 3:
                    //showMovies
                    showMovies();
                    break;
                case 4:
                    showSeries();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                default:
                    System.out.println("");
                    System.out.println("....¡Seleccioná una opcion...!");
                    System.out.println("");
                    break;
                    
            }
        } while (exit !=0);
    }
    private static void showMovies(){
        int exit =0;
        do {            
            System.out.println("");
            
            JFrameMovie movie=new JFrameMovie();
            movie.setVisible(true);
            
            System.out.println("");
        } while (exit !=0);
    }
    private static void showSeries(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println("::SERIES::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void showBook(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println("::BOOK::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void showChapter(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println("::CHAPTER::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void showMagazine(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println("::MAGAZINE::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void makeReport(){
        
    }
    private static void makeReport(Date date){
        
    }
}
