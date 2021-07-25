public class Cliente extends Persona implements Tiquete {
    private int id;

    // el constructor tiene que ser público
    public Cliente() {

    }

    // Constructor sobrfecargado - set (con valores)
    public Cliente(String cedula, String nombre, int id) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.id = id;

    }

    @Override
    public float cacularCosto(float costoBase) {
        float costoReal = costoBase - 1000;
        return costoReal;
    }

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return this.id;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cedula = " + this.cedula + " Nombre = " + this.nombre + " ID = " + this.id);
    }

}
