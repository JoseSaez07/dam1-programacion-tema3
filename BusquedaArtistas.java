import java.util.Locale;
import java.util.Scanner;

public class BusquedaArtistas {
}
    /**
     * Representa a un artista con nombre y número de seguidores (en miles).
     */
    static class Artista {
        private final String nombre;
        private final int seguidoresMiles;

        public Artista(String nombre, int seguidoresMiles) {
            this.nombre = nombre;
            this.seguidoresMiles = seguidoresMiles;
        }

        public String getNombre() {
            return nombre;
        }

        public int getSeguidoresMiles() {
            return seguidoresMiles;
        }

        @Override
        public String toString() {
            return String.format("%s (%,dK seguidores)", nombre, seguidoresMiles);
        }
    }

    // ------------------------------------------------------------
    // MÉTODOS IMPLEMENTADOS
    // ------------------------------------------------------------

    /**
     * Devuelve el índice de la primera coincidencia por nombre (ignora mayúsculas).
     */
    public static int indiceDe(Artista[] cartel, String nombreBuscado) {
<<<<<<< HEAD
        for (int i = 0; i < cartel.length; i++) {
            if (cartel[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                return i; // Devuelve el primer índice que coincide
            }
        }
        return -1; // No hay coincidencias
=======
     for (int i= 0;i < cartel.length; i++ ){
     if(nombreBuscado.equalsIgnoreCase(cartel[i].getNombre())) {
     return i;
     }
     }
      return -1;
        
        // Recorre el array 'cartel' y compara cartel[i].getNombre()
        // con 'nombreBuscado' usando equalsIgnoreCase.
        // Si coincide, devuelve i. Si terminas el bucle sin encontrarlo, devuelve -1.
        
       
>>>>>>> 65c72bc154550c99d859a4b9eb5b22dc03b864cd
    }

    /**
     * Indica si existe un artista con el nombre dado.
     */
    public static boolean existe(Artista[] cartel, String nombreBuscado) {
<<<<<<< HEAD
        // True si el índice de la primera coincidencia no es -1
        return indiceDe(cartel, nombreBuscado) != -1;
=======
        // TODO:
        // Devuelve true si indiceDe(cartel, nombreBuscado) es distinto de -1.
        // En caso contrario, false.
       
       return indiceDe(cartel, nombreBuscado) != -1;
      
>>>>>>> 65c72bc154550c99d859a4b9eb5b22dc03b864cd
    }

    /**
     * Devuelve un array con todos los índices donde el nombre coincide.
     */
    public static int[] indicesDeTodos(Artista[] cartel, String nombreBuscado) {
<<<<<<< HEAD
        // Contar coincidencias
        int contador = 0;
        for (int i = 0; i < cartel.length; i++) {
            if (cartel[i].getNombre().equalsIgnoreCase(nombreBuscado))
                contador++;
        }

        // Crear array del tamaño adecuado
        int[] indices = new int[contador];
        int pos = 0;

        // Rellenar array con los índices que coinciden
        for (int i = 0; i < cartel.length; i++) {
            if (cartel[i].getNombre().equalsIgnoreCase(nombreBuscado))
                indices[pos++] = i;
        }

        return indices;
    }

=======
        // TODO:
        // 1) Recorre el array y cuenta cuántas coincidencias hay (equalsIgnoreCase).
        // 2) Crea un nuevo int[] del tamaño contado.
        // 3) Recorre de nuevo y rellena ese array con los índices encontrados.
        // 4) Devuélvelo.
        
    
    
>>>>>>> 65c72bc154550c99d859a4b9eb5b22dc03b864cd
    /**
     * Devuelve un array con los índices de artistas cuyo nombre empieza por la
     * inicial dada.
     */
    public static int[] indicesPorInicial(Artista[] cartel, char inicial) {
        char ini = Character.toLowerCase(inicial);
        int contador = 0;

        // Contar coincidencias por inicial
        for (int i = 0; i < cartel.length; i++) {
            if (Character.toLowerCase(cartel[i].getNombre().charAt(0)) == ini)
                contador++;
        }

        // Crear array y rellenarlo
        int[] indices = new int[contador];
        int pos = 0;
        for (int i = 0; i < cartel.length; i++) {
            if (Character.toLowerCase(cartel[i].getNombre().charAt(0)) == ini)
                indices[pos++] = i;
        }

        return indices;
    }

    /**
     * Devuelve los índices de artistas cuyo nombre empieza por la inicial dada
     * y cuyo número de seguidores está entre min y max (inclusive).
     */
    public static int[] indicesPorInicialYSeguidores(Artista[] cartel, char inicial, int min, int max) {
        char ini = Character.toLowerCase(inicial);
        int contador = 0;

        // Contar coincidencias que cumplan ambas condiciones
        for (int i = 0; i < cartel.length; i++) {
            Artista a = cartel[i];
            if (Character.toLowerCase(a.getNombre().charAt(0)) == ini &&
                    a.getSeguidoresMiles() >= min && a.getSeguidoresMiles() <= max) {
                contador++;
            }
        }

        // Crear array y rellenarlo
        int[] indices = new int[contador];
        int pos = 0;
        for (int i = 0; i < cartel.length; i++) {
            Artista a = cartel[i];
            if (Character.toLowerCase(a.getNombre().charAt(0)) == ini &&
                    a.getSeguidoresMiles() >= min && a.getSeguidoresMiles() <= max) {
                indices[pos++] = i;
            }
        }

        return indices;
    }

    /**
     * Imprime por pantalla los artistas indicados por sus índices.
     */

    // ------------------------------------------------------------
    // MAIN de pruebas
    // ------------------------------------------------------------
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        // Cartel inicial de artistas
        Artista[] cartel = {
                new Artista("Aitana", 1200),
                new Artista("Quevedo", 2500),
                new Artista("Bad Gyal", 900),
                new Artista("Rosalía", 3100),
                new Artista("Bizarrap", 5400),
                new Artista("Lola Índigo", 850),
                new Artista("Rels B", 2000),
                new Artista("Saiko", 1500),
                new Artista("Feid", 4200),
                new Artista("Karol G", 6800),
                new Artista("Rauw Alejandro", 3600),
                new Artista("Morad", 2700)
        };

        // ------------------------
        // Buscar primera coincidencia
        // ------------------------
        System.out.print("Artista a buscar (primera coincidencia): ");
        String nombre = sc.nextLine().trim();
        int pos = indiceDe(cartel, nombre);
        if (pos >= 0) {
            System.out.println("✔ " + nombre + " actúa. Índice: " + pos);
            System.out.println("  Detalles: " + cartel[pos]);
        } else {
            System.out.println("✘ " + nombre + " no actúa en el festival.");
        }

        // ------------------------
        // Buscar todas las coincidencias por nombre
        // ------------------------
        System.out.print("\nArtista para listar TODAS las coincidencias: ");
        String nombreTodas = sc.nextLine().trim();
        int[] todos = indicesDeTodos(cartel, nombreTodas);
        if (todos.length > 0) {
            System.out.println("Coincidencias: " + todos.length);
            mostrarArtistas(cartel, todos);
        } else {
            System.out.println("No hay coincidencias para \"" + nombreTodas + "\".");
        }

        // ------------------------
        // Filtrar artistas por inicial
        // ------------------------
        System.out.print("\nLetra inicial (si dejas vacío usaré 'A'): ");
        String entrada = sc.nextLine().trim();
        char inicial = entrada.isEmpty() ? 'A' : entrada.charAt(0);

        System.out.println("Usando la inicial: " + Character.toUpperCase(inicial));
        int[] porInicial = indicesPorInicial(cartel, inicial);
        if (porInicial.length > 0) {
            System.out.println("Artistas que empiezan por '" + Character.toUpperCase(inicial) + "':");
            mostrarArtistas(cartel, porInicial);
        } else {
            System.out.println("No hay artistas que empiecen por '" + Character.toUpperCase(inicial) + "'.");
        }

        // ------------------------
        // Filtrar por inicial y rango de seguidores
        // ------------------------
        System.out.print("\nInicial para filtrar (vacío='A'): ");
        String entradaIni = sc.nextLine().trim();
        char inicial2 = entradaIni.isEmpty() ? 'A' : entradaIni.charAt(0);

        System.out.print("Mínimo de seguidores en miles (vacío=0): ");
        String sMin = sc.nextLine().trim();
        int min = sMin.isEmpty() ? 0 : Integer.parseInt(sMin);

        System.out.print("Máximo de seguidores en miles (vacío=1000000): ");
        String sMax = sc.nextLine().trim();
        int max = sMax.isEmpty() ? 1000000 : Integer.parseInt(sMax);

        int[] filtrados = indicesPorInicialYSeguidores(cartel, inicial2, min, max);
        if (filtrados.length > 0) {
            System.out.println("\nArtistas que empiezan por '" + Character.toUpperCase(inicial2)
                    + "' y tienen entre " + min + "K y " + max + "K seguidores:");
            mostrarArtistas(cartel, filtrados);
        } else {
            System.out.println("\nNo hay artistas que cumplan ambos filtros.");
        }

        sc.close();
    }
}
