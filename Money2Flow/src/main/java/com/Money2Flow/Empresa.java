package com.Money2Flow;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    //---------------
    // Constructores
    //---------------

    /**
    *Constructor de la clase Empresa con todos los campos dados
     * @param nombre Nombre de la empresa
     * @param direccion Ubicación de la empresa
     * @param telefono Telefono de la empresa
     * @param nit Identificación tributaria de la empresa
     */

    public Empresa(String nombre, String direccion, String telefono, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    // ----------------------
    // Métodos
    // -----------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
