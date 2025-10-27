import java.util.Locale;
import java.util.Scanner;

public class CarritoSuma {

    /**
     * Representa un producto del catálogo.
     */
    static class Producto {
        private final String nombre;
        private final double precio;

        /**
         * Crea un producto con nombre y precio base.
         * 
         * @param nombre nombre comercial
         * @param precio precio en euros (>= 0)
         */
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        /** @return nombre del producto */
        public String getNombre() {
            return nombre;
        }

        /** @return precio del producto */
        public double getPrecio() {
            return precio;
        }

        @Override
        public String toString() {
            return String.format("%s - %.2f €", nombre, precio);
        }
    }

    /**
     * Suma los precios de todos los productos del carrito.
     * 
     * @param carrito array de productos (no nulo)
     * @return suma total en euros
     */
    public static double totalCarrito(Producto[] carrito) {
        // 1) Inicializa la variable total
        double total = 0.0;

        // 2) Recorre cada producto del carrito y acumula su precio
        for (Producto p : carrito) {
            total += p.getPrecio();
        }

        // 3) Devuelve la suma total
        return total;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // TODO (opción teclado): pedir N, crear array, leer nombre y precio por cada
        // producto.

        // TODO (opción fija):
        // Creamos un carrito con productos predefinidos
        Producto[] carrito = {
                new Producto("Teclado", 24.99),
                new Producto("Ratón", 15.50),
                new Producto("Auriculares", 39.90)
        };

        // TODO: llamar a totalCarrito(carrito) y mostrar el total
        double total = totalCarrito(carrito);
        System.out.printf("Total: %.2f €%n", total);

        // sc.close(); // se usaría si activamos la entrada por teclado
    }
}
