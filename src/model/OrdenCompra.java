package model;

import java.util.List;

public class OrdenCompra {
    
    private List<ItemProducto> items;

    public OrdenCompra() {
    }

    public List<ItemProducto> getItems() {
        return items;
    }

    public void setItems(List<ItemProducto> items) {
        this.items = items;
    }

}
