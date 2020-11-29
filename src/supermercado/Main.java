/*
para resolver este ejercicio use esta pag
https://dzone.com/articles/sorting-java-arraylist#:~:text=Sorting%20an%20ArrayList%20using%20Comparable,override%20the%20compareTo()%20method
 */
package supermercado;

import clases.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alexander Graus
 */
public class Main {

    static ArrayList<Producto> prods = new ArrayList<>();

    public static void main(String[] args) {
        cargarProductos();
        imprimir();

    }

    private static void cargarProductos() {
        prods.add(new Bebida("Coca-Cola Zero", 20, 1.5f));
        prods.add(new Bebida("Coca-Cola", 18, 1.5f));
        prods.add(new Cosmetico("Shampoo Sedal", 19, 500));
        prods.add(new Fruta("Frutillas", 64, "kilo"));

    }

    private static void imprimir() {
        prods.forEach((p) -> {
            System.out.println(p.toString());
        });
        
        //ordeno los productos del mas barato al mas caro
        Collections.sort(prods);
        
        System.out.println("=============================");
        System.out.println("Producto mas caro: " + prods.get(prods.size() - 1).getNombre());
        System.out.println("Producto mas barato: " + prods.get(0).getNombre());
    }

}
