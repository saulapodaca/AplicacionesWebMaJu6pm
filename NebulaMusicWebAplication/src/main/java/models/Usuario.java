package models;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.time.LocalDate;


public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private String pseudonimo;
    private String estado;
    private String tipoCuenta;
    private LocalDate fechaNacimiento;
    private boolean aceptarTerminos;

    public Usuario(String nombre, String correo, String contrasena, String pseudonimo, String estado, String tipoCuenta, LocalDate fechaNacimiento, boolean aceptarTerminos) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.pseudonimo = pseudonimo;
        this.estado = estado;
        this.tipoCuenta = tipoCuenta;
        this.fechaNacimiento = fechaNacimiento;
        this.aceptarTerminos = aceptarTerminos;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isAceptarTerminos() {
        return aceptarTerminos;
    }

    public void setAceptarTerminos(boolean aceptarTerminos) {
        this.aceptarTerminos = aceptarTerminos;
    }
    
    
    
}
