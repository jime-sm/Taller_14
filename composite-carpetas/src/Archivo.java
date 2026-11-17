public class Archivo implements Elements {
    private String nombre;
    private int tamanoKB;

    public Archivo(String nombre, int tamanoKB) {
        this.nombre = nombre;
        this.tamanoKB = tamanoKB;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamanoKB() {
        return tamanoKB;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "   " + nombre + " " + tamanoKB + " KB");
    }
}
