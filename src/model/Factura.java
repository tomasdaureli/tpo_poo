package model;

import java.util.List;

public class Factura {
    
    private OrdenCompra ordenCompra;

    private List<ItemProducto> items;

    public Factura() {
    }

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public List<ItemProducto> getItems() {
        return items;
    }

    public void setItems(List<ItemProducto> items) {
        this.items = items;
    }
    
}
