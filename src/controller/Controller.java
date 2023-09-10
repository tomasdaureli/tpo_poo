package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.CondicionIVA;
import model.ItemProducto;
import model.OrdenCompra;
import model.Producto;
import model.Proveedor;
import model.TipoIVA;
import model.TipoUnidad;

public class Controller {

    private List<Proveedor> proveedores;
    private List<Producto> productos;
    private List<OrdenCompra> ordenesCompra;

    
    public Proveedor createProveedor(String cuit, CondicionIVA iva, String razonSocial, String nombreFantasia, 
            String direccion, String telefono, String correoElectronico, double iibb, LocalDate inicioActividades) {

        Proveedor proveedor = new Proveedor();

        proveedor.setCuit(cuit);
        proveedor.setIva(iva);
        proveedor.setRazonSocial(razonSocial);
        proveedor.setNombreFantasia(nombreFantasia);
        proveedor.setDireccion(direccion);
        proveedor.setTelefono(telefono);
        proveedor.setCorreoElectronico(correoElectronico);
        proveedor.setIngresosBrutos(iibb);
        proveedor.setInicioActividades(inicioActividades);

        proveedores.add(proveedor);

        return proveedor;
    }

    public Proveedor getProveedor(String cuit) {
        for (Proveedor p : proveedores) {
            if (p.getCuit().equals(cuit)) {
                return p;
            }
        }
        return null;
    }

    public List<Proveedor> getAllProveedores() {
        return proveedores;
    }

    public Producto createProducto(Proveedor proveedor, String nombre,TipoUnidad tipoUnidad,
            double precioUnitario, TipoIVA iva) {
        
        Producto producto = new Producto();

        producto.setProveedor(proveedor);
        producto.setNombre(nombre);
        producto.setTipoUnidad(tipoUnidad);
        producto.setPrecioUnitario(precioUnitario);
        producto.setTipoIva(iva);

        productos.add(producto);

        return producto;
    }

    public Producto getProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> getAllProductos() {
        return productos;
    }

    public OrdenCompra generarOrdenCompra() {
        OrdenCompra ordenCompra = new OrdenCompra();
        List<ItemProducto> items = new ArrayList<>();

        ordenCompra.setItems(items);

        ordenesCompra.add(ordenCompra);

        return ordenCompra;
    }

    public ItemProducto addItem(Producto producto, float cantidad, double precioUnitario, Long nroOrden) {
        ItemProducto item = new ItemProducto();

        item.setProducto(producto);
        item.setCantidad(cantidad);
        item.setPrecio(precioUnitario);

        OrdenCompra ordenCompra = getOrdenCompra(nroOrden);

        ordenCompra.getItems().add(item);

        return item;
    }

    public OrdenCompra getOrdenCompra(Long nroOrden) {
        for (OrdenCompra orden : ordenesCompra) {
            if (orden.getNroOrden().equals(nroOrden)) {
                return orden;
            }
        }
        return null;
    }

    public List<OrdenCompra> getAllOrdenesCompra() {
        return ordenesCompra;
    }
}