package com.Money2Flow;

public class Empleado {
    //------------
    // Atributos
    //-------------

    private String nombreEmpleado;
    private String correoEmpleado;
    private Empresa empresa;
    private String rolEmpleado;
    //private String pasword;
    //private Date lastLogin;

    //---------------
    // Constructores
    //---------------

    /**
     *Constructor de la clase Empleado con todos los atributos dados
     * @param nombreEmpleado Nombre del empleado
     * @param correoEmpleado Correo electrónico del empleado
     * @param empresa Empresa a la que esta adscrito el empleado
     * @param rolEmpleado Rol asignado al empleado (Administrador u Operativo)
     */

    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa empresa, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresa = empresa;
        this.rolEmpleado = rolEmpleado;
    }

    // ----------------------
    // Métodos
    // -----------------------


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
