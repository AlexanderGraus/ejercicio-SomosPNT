
package clases;

public class Cosmetico extends Producto{
    private float contenido;
    
    public Cosmetico() {
    }
    public Cosmetico(String nombre, float precio,float contenido){
        super(nombre,precio);
        this.contenido = contenido;
        
    }
    
    @Override
    public String toString() {
        //en caso que contenido sea un numero entero le saco los ceros luego de la coma
        
        final float res = contenido - (int)contenido;
        final String cont;
        if(res == 0){
            //es un numero entero, lo redondeo
            cont = String.valueOf(Math.round(contenido));
        }else{
            cont = String.valueOf(contenido);
        }

        return "Nombre: "+this.getNombre()+" /// " +
                "Conenido: " + cont+"ml" + " /// " +
                "Precio: $" + this.getPrecio();
    }
}
