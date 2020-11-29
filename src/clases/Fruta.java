
package clases;

public class Fruta extends Producto{
    String unidad;
    public Fruta(){
        
    }
    public Fruta(String nombre, float precio, String unidad){
        super(nombre,precio);
        this.unidad = unidad;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// " +
                "Precio: $" + this.getPrecio()+ " /// " +
                "Unidad de venta: " + unidad;
    }
}
