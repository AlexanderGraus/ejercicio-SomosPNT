
package clases;

public class Bebida extends Producto {
    private float litros;
    
    public Bebida(){
        
    }
    public Bebida(String nombre, float precio, float litros){
        super(nombre, precio);
        this.litros = litros;
    }

    
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// " +
                "Litros: " + litros + " /// " +
                "Precio: $" + this.getPrecio();
    }
  
}
