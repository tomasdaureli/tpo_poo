package model;

public class OrdenPago {

    private static Long contador = 0L;

    private Long nroOrden;
    
    private double totalPagar;

    private FormaPago formaPago;

    private double totalRetenciones;

    public OrdenPago() {
        contador++;
        nroOrden = contador;
    }

    public Long getNroOrden() {
        return nroOrden;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotalRetenciones() {
        return totalRetenciones;
    }

    public void setTotalRetenciones(double totalRetenciones) {
        this.totalRetenciones = totalRetenciones;
    }

}
