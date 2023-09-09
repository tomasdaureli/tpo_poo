package model;

import java.time.LocalDate;

public class Cheque {

    private static Long contador = 0L;

    private Long nroCheque;
    
    private LocalDate emision;

    private LocalDate vencimiento;

    private String firmante;

    private double importe;

    public Cheque() {
        contador++;
        nroCheque = contador;
    }

    public Long getNroCheque() {
        return nroCheque;
    }

    public LocalDate getEmision() {
        return emision;
    }

    public void setEmision(LocalDate emision) {
        this.emision = emision;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFirmante() {
        return firmante;
    }

    public void setFirmante(String firmante) {
        this.firmante = firmante;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
