package com.Money2Flow;

public class movimientoDinero {

    //------------
    // Atributos
    //-------------

    private Double monto;
    private String concepto;
    private Empleado usuario;
    // private Boolean output;

    //---------------
    // Constructores
    //---------------

    /**
     * Constructor de la clase movimientoDinero con todos los atributos dados
     *
     * @param monto    Cantidad de la transacción de dinero
     * @param concepto Razón de la transacción
     * @param usuario  Empleado que registra la transacción
     */


    public movimientoDinero(Double monto, String concepto, Empleado usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    // ----------------------
    // Métodos
    // -----------------------


    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
}
