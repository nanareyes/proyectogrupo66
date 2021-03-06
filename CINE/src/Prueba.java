import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    // los atributos de la clase se deben construir por fuera de la creación de la
    // declaración
    private ArrayList<Cliente> listaClientes;

    // constructor, losconstructores no llevan void
    public Prueba() {
        listaClientes = new ArrayList<>();
        // Se crea metodo para agregar elementos a esta listaClientes
    }

    public void agregarCliente(Cliente pCliente) {
        listaClientes.add(pCliente);

    }

    public void mostrarNombreClientes() {
        System.out.println("Nombre de Clientes");
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i).getNombre());

        }

    }

    public void mostrarDatosClientes() {
        String cadenaClientes = " ";
        System.out.println("Datos Clientes");
        for (int i = 0; i < listaClientes.size(); i++) {
            String datos = "\nCédula: " + listaClientes.get(i).getCedula() + "\nNombre: "
                    + listaClientes.get(i).getNombre() + "\nID: " + listaClientes.get(i).getId();
            System.out.println();
            cadenaClientes = cadenaClientes.concat(datos);
            System.out.println(cadenaClientes);
        }
    }

    public void generarLista() {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner sca = new Scanner(System.in);
        int numero = 0;

        // usaremos ciclo while
        while (numero >= 0) {
            System.out.println("Ingrese un número(Número negativo para salir): ");
            numero = sca.nextInt();
            if (numero >= 0) {
                listaNumeros.add(numero);
            }
        }

        // ciclo for

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }

        // Ciclo forEach
        System.out.println();
        listaNumeros.forEach((elemento) -> {
            System.out.println(elemento);
            // elemento = elemento * 2

        });
    }
}

/*
 * import java.util.ArrayList; import java.util.InputMismatchException; import
 * java.util.Scanner;
 * 
 * public class Prueba {
 * 
 * private ArrayList<Cliente> listaClientes;
 * 
 * public Prueba() { listaClientes = new ArrayList<>(); }
 * 
 * public void generarLista() { try { ArrayList<Integer> listaNumeros = new
 * ArrayList<>(); Scanner scan2 = new Scanner(System.in); int numero = 0; while
 * (numero >= 0) {
 * System.out.println("Ingrese un número (Número negativo para salir):"); numero
 * = scan2.nextInt(); if (numero >= 0) { listaNumeros.add(numero); } }
 * 
 * // Ciclo for for (int i = 0; i < listaNumeros.size(); i++) {
 * System.out.println(listaNumeros.get(i)); //
 * System.out.println(listaNumeros.get(i+1)); } System.out.println(); // for
 * each listaNumeros.forEach((elemento) -> { System.out.println(elemento); }); }
 * catch(InputMismatchException e) { // Excepción de tipo de dato
 * System.out.println("Solo se permiten número"); } catch (Exception e2) { //
 * Excepción general System.out.println("Se presentó un error con la lista"); }
 * finally { System.out.println("Finalizó el método"); } }
 * 
 * public void agregarCliente(Cliente pCliente){ listaClientes.add(pCliente); }
 * 
 * public void mostrarNombreClientes() { System.out.println("CLIENTES"); for
 * (int i = 0; i < listaClientes.size(); i++) {
 * System.out.println(listaClientes.get(i).getNombre()); } }
 * 
 * public void mostrarDatosClientes() { String cadenaClientes = "";
 * System.out.println("\nDatos de los clientes"); for (int i = 0; i <
 * listaClientes.size(); i++) { String datos = "\nCedula: " +
 * listaClientes.get(i).getCedula() + "\nNombre: " +
 * listaClientes.get(i).getNombre() + "\nID: " + listaClientes.get(i).getId() +
 * "\n-----------"; cadenaClientes = cadenaClientes.concat(datos); }
 * System.out.println(cadenaClientes); }
 * 
 * }
 * 
 * 
 * 
 */