package model;

import java.util.List;

public class CuentaCorriente {
    
    private Proveedor proveedor;

    private List<OrdenCompra> compras;

    private List<OrdenPago> pagos;

    private double saldo;

    public CuentaCorriente() {
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<OrdenCompra> getCompras() {
        return compras;
    }

    public void setCompras(List<OrdenCompra> compras) {
        this.compras = compras;
    }

    public List<OrdenPago> getPagos() {
        return pagos;
    }

    public void setPagos(List<OrdenPago> pagos) {
        this.pagos = pagos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
