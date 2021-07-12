import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al cine XX");

        Scanner sca = new Scanner(System.in);
        System.out.println("Ingreses su cédula: ");
        String cedula = sca.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = sca.nextLine();

        Cliente clienteUno = new Cliente();
        clienteUno.setCedula("1120548");
        clienteUno.setNombre("Carolina");
        clienteUno.setId(1);
        float costo = clienteUno.cacularCosto(8000);

        System.out.println("Cédula: " + clienteUno.getCedula() + "\nNombre: " + clienteUno.getNombre() + "\nID: "
                + clienteUno.getId() + "\nCosto Tiquete: " + costo);

        System.out.println("\n");
        System.out.println("Bienvenido al cine XX");
        ClientePremium clienteDos = new ClientePremium();
        clienteDos.setCedula("123456");
        clienteDos.setNombre("Ana");
        clienteDos.setNumeroTarjeta(12345);
        float costoDos = clienteDos.cacularCosto(8000);

        System.out.println("Cédula: " + clienteDos.getCedula() + "\nNombre: " + clienteDos.getNombre()
                + "\nNumero Tarjeta: " + clienteDos.getNumeroTarjeta() + "\nCosto Tiquete: " + costoDos);
        ;

    }
}
