import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al cine XX");

        // Cliente Uno
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingreses su cédula: ");
        String cedula = sca.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = sca.nextLine();

        Cliente clienteUno = new Cliente();
        clienteUno.setCedula(cedula);
        clienteUno.setNombre(nombre);
        clienteUno.setId(1);
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos días");
        clienteUno.mostrarDatos();
        float costo = clienteUno.cacularCosto(8000);

        System.out.println("Cédula: " + clienteUno.getCedula() + "\nNombre: " + clienteUno.getNombre() + "\nID: "
                + clienteUno.getId() + "\nCosto Tiquete: " + costo);

        // Cliente Dos
        System.out.println("\n");
        System.out.println("Bienvenido al cine XX");
        ClientePremium clienteDos = new ClientePremium();
        clienteDos.setCedula("123456");
        clienteDos.setNombre("Ana");
        clienteDos.setNumeroTarjeta(12345);
        clienteDos.mostrarDatos();
        float costoDos = clienteDos.cacularCosto(8000);

        System.out.println("Cédula: " + clienteDos.getCedula() + "\nNombre: " + clienteDos.getNombre()
                + "\nNumero Tarjeta: " + clienteDos.getNumeroTarjeta() + "\nCosto Tiquete: " + costoDos);
        ;
        // prueba de contenedores
        System.out.println();
        Prueba pruebaContenedor = new Prueba();
        pruebaContenedor.generarLista();

        // Lista de objetos
        System.out.println("Creación de clientes");
        String opcion = "S";
        while (opcion.equalsIgnoreCase("S")) { // Ignora mayúsculas
            // ingresa datos por teclado
            System.out.println("Ingrese su cédula:");
            cedula = sca.next(); // Uso de next
            sca.nextLine();
            System.out.println("Ingrese su nombre:");
            nombre = sca.nextLine();
            System.out.println("Ingrese su ID:");
            int id = sca.nextInt(); // se crea la variable id

            // Crea objeto cliente
            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setId(id);

            // agregar objeto cliente a la lista con todos los datos
            pruebaContenedor.agregarCliente(nuevoCliente);

            // preguntar nuevo cliente
            System.out.println("Desea agregar otro cliente? (s / n):");
            opcion = sca.next();
            sca.nextLine();
        }

        pruebaContenedor.mostrarNombreClientes();
        pruebaContenedor.mostrarDatosClientes();

    }

}
