package model;

import java.math.BigDecimal;

public class CuentaCorriente {
    
    private BigDecimal saldo;

    private BigDecimal debe;

    private BigDecimal haber;

    public CuentaCorriente() {
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getDebe() {
        return debe;
    }

    public void setDebe(BigDecimal debe) {
        this.debe = debe;
    }

    public BigDecimal getHaber() {
        return haber;
    }

    public void setHaber(BigDecimal haber) {
        this.haber = haber;
    }
    
}
