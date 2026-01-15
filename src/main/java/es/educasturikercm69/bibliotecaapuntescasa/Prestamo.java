/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.educasturikercm69.bibliotecaapuntescasa;

import java.time.LocalDate;

/**
 *
 * @author Iker
 */
public class Prestamo {
    private Libro LibroPrest;
    private Usuario UsuarioPrest;
    private LocalDate fechaPrest;
    private LocalDate fechaDev;

    public Prestamo(Libro LibroPrest, Usuario UsuarioPrest, LocalDate fechaPrest, LocalDate fechaDev) {
        this.LibroPrest = LibroPrest;
        this.UsuarioPrest = UsuarioPrest;
        this.fechaPrest = fechaPrest;
        this.fechaDev = fechaDev;
    }

    public Libro getLibroPrest() {
        return LibroPrest;
    }

    public void setLibroPrest(Libro LibroPrest) {
        this.LibroPrest = LibroPrest;
    }

    public Usuario getUsuarioPrest() {
        return UsuarioPrest;
    }

    public void setUsuarioPrest(Usuario UsuarioPrest) {
        this.UsuarioPrest = UsuarioPrest;
    }

    public LocalDate getFechaPrest() {
        return fechaPrest;
    }

    public void setFechaPrest(LocalDate fechaPrest) {
        this.fechaPrest = fechaPrest;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    @Override
    public String toString() {
        return LibroPrest + " - " + UsuarioPrest + " - " + fechaPrest + " - " + fechaDev;
    }
}
