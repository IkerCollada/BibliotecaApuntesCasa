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
            System.out.println("\t\t1- LISTADOS");
            System.out.println("\t\t2- MENÚ DE LIBROS");
            System.out.println("\t\t3- MENÚ DE USUARIOS");
            System.out.println("\t\t4- MENÚ DE PRÉSTAMOS");
            System.out.println("\t\t9-  SALIR");
            
            switch (opcion) {
                case 1:
                    menuListados();
                    break;
                case 2:
                    menuLibro();
                    break;
                case 3:
                    menuUsuario();
                    break;
                case 4:
                    menuPrestamo();
                    break;    
                    
            }
            
        } while (opcion != 9);
    }
    
    public static void menuListados(){
        int opcion;
        do {
            System.out.println("\t\t\t\n\nMENÚ DE LISTADOS");
            System.out.println("\t\t1- LISTADO DE LIBROS");
            System.out.println("\t\t3- LISTADO DE USUARIOS");
            System.out.println("\t\t4- LISTADO DE PRÉSTAMOS");
            System.out.println("\t\t9-  VOLVER AL MENÚ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    listadoLibros();
                    break;
                case 2:
                    listadoUsuarios();
                    break;
                case 3:
                    listadoPrestamos();
                    break;
            }
        } while (opcion != 9);
    }
    
    public static void menuLibro(){
        int opcion = 0;
        do {            
            System.out.println("\t\t\t\n\nMENÚ DE LIBROS");
            System.out.println("\t\t1- AÑADIR LIBRO");
            System.out.println("\t\t2- MODIFICAR LIBRO");
            System.out.println("\t\t3- ELIMINAR LIBRO");
            System.out.println("\t\t9-  VOLVER AL MENÚ PRINCIPAL");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    añadirLibro();
                    break;
                case 2:
                    modificarLibro();
                    break;
                case 3:
                    eliminarLibro();
                    break;
            }
            
        } while (opcion != 9);
    }
    
    public static void menuUsuario(){
        int opcion;
        do {            
            System.out.println("\t\t\t\n\nMENÚ DE USUARIOS");
            System.out.println("\t\t1- AÑADIR USUARIO");
            System.out.println("\t\t2- MODIFICAR USUARIO");
            System.out.println("\t\t3- ELIMINAR USUARIO");
            System.out.println("\t\t9-  VOLVER AL MENÚ PRINCIPAL");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    añadirUsuario();
                    break;
                case 2:
                    modificarUsuario();
                    break;
                case 3:
                    eliminarUsuario();
                    break;
            }
            
            
        } while (opcion != 9);
    }
    
    public static void menuPrestamo(){
        int opcion;
        do {            
            System.out.println("\t\t\t\n\nMENÚ DE PRESTAMOS");
            System.out.println("\t\t1- AÑADIR PRESTAMO");
            System.out.println("\t\t2- MODIFICAR PRESTAMO");
            System.out.println("\t\t3- ELIMINAR PRESTAMO");
            System.out.println("\t\t9-  VOLVER AL MENÚ PRINCIPAL");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    añadirPrestamo();
                    break;
                case 2:
                    //modificarPrestamo();
                    break;
                case 3:
                    //eliminarPrestamo();
                    break;
            }
            
            
        } while (opcion != 9);
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="LISTADOS (De menuListados)">
    public static void listadoLibros(){
        //mas adelante le añadiremos organizaciones con streams.
        for (Libro l : libros) {
            System.out.println(l);
        }
        System.out.println("Mas tarde podrá ordenarlos");
    }
    
    public static void listadoUsuarios(){
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
        System.out.println("Mas tarde podrá ordenarlos");
    }
    
    public static void listadoPrestamos(){
        System.out.println("\n\n\t\t1- Prestamos");
        System.out.println("\n\n\t\t2- Prestamos históricos");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                for (Prestamo p : prestamos) {
            System.out.println(p);
        }
        System.out.println("Mas tarde podrá ordenarlos");
                break;
            case 2:
                for (Prestamo pHist : prestamosHist) {
            System.out.println(pHist);
        }
        System.out.println("Mas tarde podrá ordenarlos");
                break;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="AÑADIR">
    public static void añadirLibro(){
        System.out.print("\n\nisbn: ");
        String isbn = sc.next();
        System.out.print("Titulo: ");
        String titulo = sc.next();
        System.out.print("Autor: ");
        String autor = sc.next();
        System.out.print("Género: ");
        String genero = sc.next();
        System.out.print("Ejemplares");
        int ejemplares = sc.nextInt();
        
        libros.add(new Libro(isbn, titulo, autor, genero, ejemplares));
        System.out.println("Libro añadido. Listado de libros para confirmarlo:");
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
    
    public static void añadirUsuario(){
        System.out.print("\n\nDNI: ");
        String dni = sc.next();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefono: ");
        String telefono = sc.next();
        
        usuarios.add(new Usuario(dni, nombre, email, telefono));
        System.out.println("\n\nUsuario añadido. Comprobando listado");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
    
    public static void añadirPrestamo(){
        System.out.println("");
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="MODIFICAR">
    public static void modificarLibro(){
        System.out.print("\n\nISBN del libro: ");
        String isbn = sc.next();
        
        int p = buscaIsbn(isbn);
        
        if (p == -1) {
            System.out.println("\nISBN no encontrado");
        }else{
            System.out.println("\nISBN localizado");
            
            System.out.print("\n\nNuevo isbn: ");
            isbn = sc.next();
            System.out.print("Título: ");
            String titulo = sc.next();
            System.out.print("Autor: ");
            String autor = sc.next();
            System.out.print("Género: ");
            String genero = sc.next();
            System.out.print("Ejemplares: ");
            int ejemplares = sc.nextInt();
            
            libros.get(p).setIsbn(isbn);
            libros.get(p).setTitulo(titulo);
            libros.get(p).setAutor(autor);
            libros.get(p).setGenero(genero);
            libros.get(p).setEjemplares(ejemplares);
            
            System.out.println("Modificaciones hechas, poniendo el listado para confirmar");
            for (Libro l : libros) {
                System.out.println(l);
            }
        }
    }
    
    public static void modificarUsuario(){
        System.out.print("\n\nDNI del usuario: ");
        String dni = sc.next();
        int p = buscaDni(dni);
        
        if (p == -1) {
            System.out.println("DNI no encontrado");
        } else {
            System.out.print("\n\nNuevo dni: ");
            dni = sc.next();
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.println("Telefono: ");
            String telefono = sc.next();
            
            usuarios.get(p).setDni(dni);
            usuarios.get(p).setNombre(nombre);
            usuarios.get(p).setEmail(email);
            usuarios.get(p).setTelefono(telefono);
            
            System.out.println("Comprobando listado");
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
        }
    }
    
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="ELIMINAR">
    public static void eliminarLibro(){
        System.out.print("\n\nISBN del libro a eliminar: ");
        String isbn = sc.next();
        int p = buscaIsbn(isbn);
        
        if (p == -1) {
            System.out.println("ISBN no encontrado");
        } else {
            System.out.println("\nEliminando libro...");
            libros.remove(p);
            
            System.out.println("\nPoniendo el listado para comprobar que se ha eliminado");
            
            for (Libro l : libros) {
                System.out.println(l);
            }
        }
    }
    
    public static void eliminarUsuario(){
        System.out.print("\n\nDNI usuario: ");
        String dni = sc.next();
        
        int p = buscaDni(dni);
        
        if (p == -1) {
            System.out.println("DNI no encontrado");
        } else {
            System.out.println("Eliminando usuario...");
            usuarios.remove(p);
            
            System.out.println("Comprobando listado");
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
        }
    }
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="BÚSQUEDAS">
    public static int buscaIsbn(String isbn){
        int pos = -1;
        int p = 0;
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                p = pos;
            }
            pos++;
        }
        return p;
    }
    
    public static int buscaDni(String dni){
        int pos = -1;
        int p = 0;
        for (Usuario u : usuarios) {
            if (u.getDni().equalsIgnoreCase(dni)) {
                p = pos;
            }
            pos++;
        }
        return p;
    }
//</editor-fold>
}
