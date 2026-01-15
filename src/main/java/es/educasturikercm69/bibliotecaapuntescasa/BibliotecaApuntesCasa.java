/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.educasturikercm69.bibliotecaapuntescasa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Iker
 */
public class BibliotecaApuntesCasa {
    
    private static Scanner sc = new Scanner (System.in);
    private static ArrayList <Libro> libros = new ArrayList();
    private static ArrayList <Usuario> usuarios = new ArrayList();
    private static ArrayList <Prestamo> prestamos = new ArrayList();
    private static ArrayList <Prestamo> prestamosHist = new ArrayList();
    
    public static void main(String[] args) {
        menuGeneral();
    }
    //<editor-fold defaultstate="collapsed" desc="MENÚS">
    public static void menuGeneral(){
        int opcion = 0;
        do {            
            System.out.println("\t\t\t\n\nMENÚ GENERAL");
            System.out.println("\t\t\1- ");
            System.out.println("\t\t\2- ");
            System.out.println("\t\t\3- ");
            System.out.println("\t\t\4- ");
            System.out.println("\t\t\5-  ");
        } while (opcion != 9);
    }
//</editor-fold>
}
