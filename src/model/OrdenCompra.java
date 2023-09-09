package model;

import java.util.List;

public class OrdenCompra {

    private static Long contador = 0L;

    private Long nroOrden;
    
    private List<ItemProducto> items;

    public OrdenCompra() {
        contador++;
        nroOrden = contador;
    }

    public Long getNroOrden() {
        return nroOrden;
    }

    public List<ItemProducto> getItems() {
        return items;
    }

    public void setItems(List<ItemProducto> items) {
        this.items = items;
    }

}
