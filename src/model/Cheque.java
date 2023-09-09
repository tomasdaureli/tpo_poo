package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cheque {
    
    private LocalDate emision;

    private LocalDate vencimiento;

    private String firmante;

    private BigDecimal importe;

    public Cheque() {
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

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }
    
}
