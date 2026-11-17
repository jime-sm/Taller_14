import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Elements {
    private String nombre;
    // UNA SOLA LISTA para cualquier elemento que implemente la interfaz
    private List<Elements> hijos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    // Un único método agregar para todo
    public void agregar(Elements e) {
        hijos.add(e);
    }

    @Override
    public int getTamanoKB() {
        int total = 0;
        // Un solo bucle sin importar si es archivo, carpeta u otra cosa
        for (Elements e : hijos) {
            total += e.getTamanoKB();
        }
        return total;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "[" + nombre + "] " + getTamanoKB() + " KB");
        // Delegamos el mostrar a cada hijo polimórficamente
        for (Elements e : hijos) {
            e.mostrar(sangria + "   ");
        }
    }
}