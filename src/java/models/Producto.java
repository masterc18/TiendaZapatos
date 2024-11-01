package java.models;

public class Producto {
    private String id_producto;
    private String nombre_producto;
    private double precio;
    private double impuesto;

    public Producto(String id_producto, String nombre_producto, double precio, double impuesto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.impuesto = impuesto;
    }

    public Producto() {
        id_producto = "";
        nombre_producto = "";
        precio = 0.0;
        impuesto = 0.0;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

}
