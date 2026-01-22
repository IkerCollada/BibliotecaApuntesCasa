/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.educasturikercm69.bibliotecaapuntescasa;

import java.time.LocalDate;
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
        cargaDatos();
        //menuGeneral();
        
        //cargaDatosPrueba();
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
    }
    //<editor-fold defaultstate="collapsed" desc="MENÚS">
    public static void menuGeneral(){
        int opcion;
        do {
            System.out.println("\t\t\t\n\nMENÚ GENERAL");
            System.out.println("\t\t1- LISTADOS");
            System.out.println("\t\t2- MENÚ DE LIBROS");
            System.out.println("\t\t3- MENÚ DE USUARIOS");
            System.out.println("\t\t4- MENÚ DE PRÉSTAMOS");
            System.out.println("\t\t9-  SALIR");
            opcion = sc.nextInt();
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
            System.out.println("\t\t2- LISTADO DE USUARIOS");
            System.out.println("\t\t3- LISTADO DE PRÉSTAMOS");
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
            System.out.println("\t\t2- DEVOLVER PRESTAMO");
            System.out.println("\t\t3- PRORROGAR PRESTAMO");
            System.out.println("\t\t9-  VOLVER AL MENÚ PRINCIPAL");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    añadirPrestamo();
                    break;
                case 2:
                    devolucionPrestamo();
                    break;
                case 3:
                    prorrogarPrestamo();
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
        System.out.print("Ejemplares: ");
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
        System.out.println("DNI del usuario: ");
        String dni = sc.next();
        System.out.println("ISBN del lirbo: ");
        String isbn = sc.next();
        
        int pU = buscaDni(dni);
        int pL = buscaIsbn(isbn);
        
        if (pU == -1 || pL == -1) {
            System.out.println("Dni y/o isbn no encontrado");
        } else {
            LocalDate hoy = LocalDate.now();
            prestamos.add(new Prestamo(libros.get(pL), usuarios.get(pL),hoy, hoy.plusDays(15)));
            libros.get(pL).setEjemplares(libros.get(pL).getEjemplares()-1);
            System.out.println("Préstamo realizado y grabado en el ArrayList");
        }
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
            System.out.print("Telefono: ");
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
    
    public static void devolucionPrestamo(){
        System.out.print("\n\nISBN: ");
        String isbn = sc.next();
        System.out.print("DNI: ");
        String dni = sc.next();
        int posPrest = buscaPrestamo(isbn, dni);
        
        if (posPrest == -1) {
            System.out.println("Prestamo no encontrado");
        } else {
            System.out.println("Añadiendo el prestamo a prestamosHist");
            prestamos.get(posPrest).setFechaDev(LocalDate.now());
            libros.get(buscaIsbn(isbn)).setEjemplares(libros.get(buscaIsbn(isbn)).getEjemplares()+1);            
            prestamosHist.add(prestamos.get(posPrest));
            prestamos.remove(posPrest);
        }
    }
    
    public static void prorrogarPrestamo(){
        System.out.print("\n\nISBN: ");
        String isbn = sc.next();
        System.out.print("DNI: ");
        String dni = sc.next(); 
        int posPrest = buscaPrestamo(isbn, dni);
        
        if (posPrest == -1) {
            System.out.println("Prestamo no encontrado");
        } else {
            System.out.println("Vamos a añadir otros 15 días de devolución");
            LocalDate hoy = LocalDate.now();
            prestamos.get(posPrest).setFechaDev(prestamos.get(posPrest).getFechaDev().plusDays(15));
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
        int pos = 0;
        int p = -1;
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                p = pos;
            }
            pos++;
        }
        return p;
    }
    
    public static int buscaDni(String dni){
        int pos = 0;
        int p = -1;
        for (Usuario u : usuarios) {
            if (u.getDni().equalsIgnoreCase(dni)) {
                p = pos;
            }
            pos++;
        }
        return p;
    }
    
    public static int buscaPrestamo(String isbn, String dni){
        int pos = 0;
        int p1 = -1;
        
        for (Prestamo p : prestamos) {
            if (p.getLibroPrest().getIsbn().equalsIgnoreCase(isbn) && 
                p.getUsuarioPrest().getDni().equalsIgnoreCase(dni)) {
                p1 = pos;
            }
            pos++;
        }
        return p1;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CARGA DATOS">
    public static void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Medico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chaman","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraiso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudu","A.M.Matute","Aventuras",0)); 
        libros.add(new Libro("1-88","El ultimo barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",0)); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now(); //OBTENEMOS LA FECHA DE HOY CON EL MÉTODO now()
        
	//PRESTAMOS "NORMALES" REALIZADOS HOY Y QUE SE HAN DE DEVOLVER EN 15 DÍAS
	prestamos.add(new Prestamo(libros.get(0),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(1), hoy,hoy.plusDays(15)));
	//PRESTAMOS QUE YA TENIAN QUE HABER SIDO DEVUELTOS PORQUE SU FECHA DE DEVOLUCIÓN ES ANTERIOR A HOY
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(1), hoy.minusDays(17),hoy.minusDays(2))); 
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(4), hoy.minusDays(18),hoy.minusDays(3)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        
        //PRESTAMOS HISTORICOS QUE YA HAN SIDO DEVUELTOS Y POR TANTO ESTÁN EN LA COLECCION prestamosHist
	prestamosHist.add(new Prestamo(libros.get(0),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(2),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(7),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(5),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(1),usuarios.get(1), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(7),usuarios.get(2), hoy.minusDays(15),hoy));
        prestamosHist.add(new Prestamo(libros.get(6),usuarios.get(3), hoy.minusDays(15),hoy));
    }
    
    public static void cargaDatosPrueba() {
        libros.add(new Libro("1-11", "El Hobbit", "JRR Tolkien", "Aventuras", 3));
        libros.add(new Libro("1-22", "El Silmarillon", "JRR Tolkien", "Aventuras", 3));
        libros.add(new Libro("1-33", "El Medico", "N. Gordon", "Aventuras", 4));
        libros.add(new Libro("1-44", "Chaman", "N. Gordon", "Aventuras", 3));
        libros.add(new Libro("1-55", "Momo", "M. Ende", "Aventuras", 2));
        libros.add(new Libro("1-66", "Paraiso inhabitado", "A.M.Matute", "Aventuras", 2));
        libros.add(new Libro("1-77", "Olvidado Rey Gudu", "A.M.Matute", "Aventuras", 0));
        libros.add(new Libro("1-88", "El ultimo barco", "D.Villar", "Novela Negra", 3));
        libros.add(new Libro("1-99", "Ojos de agua", "D.Villar", "Novela Negra", 0));

        usuarios.add(new Usuario("11", "Ana", "ana@email.com", "621111111"));
        usuarios.add(new Usuario("22", "David", "david@email.com", "622222222"));
        usuarios.add(new Usuario("33", "Bea", "bea@email.com", "623333333"));
        usuarios.add(new Usuario("44", "Lucas", "lucas@email.com", "624444444"));
        usuarios.add(new Usuario("55", "Carlota", "carlota@email.com", "625555555"));
        usuarios.add(new Usuario("66", "Juan", "juan@email.com", "626666666"));

        LocalDate hoy = LocalDate.now(); //OBTENEMOS LA FECHA DE HOY CON EL MÉTODO now()

        //PRESTAMOS "NORMALES" REALIZADOS HOY Y QUE SE HAN DE DEVOLVER EN 15 DÍAS
        prestamos.add(new Prestamo(libros.get(0), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(1), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(0), usuarios.get(4), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(0), usuarios.get(1), hoy, hoy.plusDays(15)));
        //PRESTAMOS QUE YA TENIAN QUE HABER SIDO DEVUELTOS PORQUE SU FECHA DE DEVOLUCIÓN ES ANTERIOR A HOY
        prestamos.add(new Prestamo(libros.get(5), usuarios.get(1), hoy.minusDays(17), hoy.minusDays(2)));
        prestamos.add(new Prestamo(libros.get(1), usuarios.get(4), hoy.minusDays(18), hoy.minusDays(3)));
        prestamos.add(new Prestamo(libros.get(2), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(5)));

        //PRESTAMOS HISTORICOS QUE YA HAN SIDO DEVUELTOS Y POR TANTO ESTÁN EN LA COLECCION prestamosHist
        prestamosHist.add(new Prestamo(libros.get(0), usuarios.get(0), hoy.minusDays(30), hoy.minusDays(15)));
        prestamosHist.add(new Prestamo(libros.get(2), usuarios.get(0), hoy.minusDays(30), hoy.minusDays(15)));
        prestamosHist.add(new Prestamo(libros.get(7), usuarios.get(4), hoy.minusDays(30), hoy.minusDays(15)));
        prestamosHist.add(new Prestamo(libros.get(5), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(15)));
        prestamosHist.add(new Prestamo(libros.get(1), usuarios.get(1), hoy.minusDays(20), hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(7), usuarios.get(2), hoy.minusDays(10), hoy));
        prestamosHist.add(new Prestamo(libros.get(6), usuarios.get(3), hoy.minusDays(10), hoy));
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="EJERCICIOS EXAMEN">
    public static void ejercicio1(){
        System.out.print("ISBN del libro para consultar prestamos: ");
        String isbn = sc.next();
        int pLibro = buscaIsbn(isbn);
        if (pLibro == -1) {
            System.out.println("ISBN no encontrado");
        } else {
            System.out.println("Prestamos activos del libro: " + libros.get(pLibro).getTitulo());
            int total = 0;
            for (Prestamo p : prestamos) {
                if (p.getLibroPrest().getIsbn().equalsIgnoreCase(isbn)) {
                    System.out.println(p);
                    total++;
                }
            }
            System.out.println(libros.get(pLibro).getTitulo() + " tiene " + total + " prestamos actualmente.");
        }
    }
    
    public static void ejercicio2(){
        System.out.println("Libros que NUNCA fueron prestados: ");
        
        for (Libro l : libros) {
            boolean tienePrest = false;
            for (Prestamo p : prestamos) {
                if (p.getLibroPrest() == l) {
                    tienePrest = true;
                    break;
                }
            }
            if (tienePrest == false) {
                for (Prestamo pHist : prestamosHist) {
                    if (pHist.getLibroPrest() == l) {
                    tienePrest = true;
                    break;
                    }
                }
            }
            if (tienePrest == false) {
                System.out.println(l);
            }
        }
    }
    
    public static void ejercicio3(){
        System.out.println("Usuarios que tienen AL MENOS 1 PRESTAMO ACTIVO");
        
        for (Usuario u : usuarios) {
            boolean noTienePrest = true;
            for (Prestamo p : prestamos) {
                if (p.getUsuarioPrest().getDni().equalsIgnoreCase(u.getDni())) {
                    noTienePrest = false;
                    break;
                }
            }
            if (noTienePrest == false) {
               System.out.println(u);
            }
        }
    }
    
    public static void ejercicio4(){
        System.out.println("Usuarios que tienen prestamos FUERA DE PLAZO:");
    }
//</editor-fold>
}