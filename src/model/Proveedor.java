package model;

import java.time.LocalDate;

public class Proveedor {

    private static Long contador = 0L;

    private Long id;
    
    private String cuit;

    private CondicionIVA iva;

    private String razonSocial;

    private String nombreFantasia;

    private String direccion;

    private String telefono;

    private String correoElectronico;

    private double ingresosBrutos;

    private LocalDate inicioActividades;
    
    public Proveedor() {
        contador++;
        id = contador;
    }

    public Long getId() {
        return id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public CondicionIVA getIva() {
        return iva;
    }

    public void setIva(CondicionIVA iva) {
        this.iva = iva;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public double getIngresosBrutos() {
        return ingresosBrutos;
    }

    public void setIngresosBrutos(double ingresosBrutos) {
        this.ingresosBrutos = ingresosBrutos;
    }

    public LocalDate getInicioActividades() {
        return inicioActividades;
    }

    public void setInicioActividades(LocalDate inicioActividades) {
        this.inicioActividades = inicioActividades;
    }
}
