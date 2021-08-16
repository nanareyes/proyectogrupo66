package p66.tiendaropa_66.vista;

import java.util.ArrayList;
import p66.tiendaropa_66.modelo.*;
import javax.swing.JOptionPane;
import p66.tiendaropa_66.conexion.SqliteConnection;
import p66.tiendaropa_66.controlador.ControladorCliente;

public class Menu {

        public void generarMenu(SqliteConnection conexionBD, String opcionElegida) {
                /*
                 * String textoMenu = "Elija su opción: \n" + "1. Crear Cliente \n" +
                 * "2. Listar diez primeros clientes \n" +
                 * "3. Listar productos comprados por cliente"; String opcionElegida =
                 * JOptionPane.showInputDialog(null, textoMenu, "Menú principal",
                 * JOptionPane.QUESTION_MESSAGE); /*Objeto ClienteDAO para insertar cliente
                 */
                // ClienteDAO cli1 = new ClienteDAO();
                ControladorCliente ctrlCliente = new ControladorCliente();

                switch (opcionElegida) {
                        case "1":
                                VentanaNuevoCliente ventanaCliente = new VentanaNuevoCliente(conexionBD);
                                ventanaCliente.setVisible(true);
                                /*
                                 * String ident = JOptionPane.showInputDialog(null,
                                 * "Ingrese la identificación del cliente", "LA TIENDA DE ROPA",
                                 * JOptionPane.QUESTION_MESSAGE); String nombre =
                                 * JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente",
                                 * "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE); String apellido =
                                 * JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente",
                                 * "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                                 */
                                /* Objeto cliente */
                                // Cliente nuevoCliente = new Cliente(ident, nombre, apellido);
                                // cli1.insertarCliente(nuevoCliente, conexionBD);
                                // ctrlCliente.crearCliente(nuevoCliente, conexionBD);
                                break;
                        case "2":
                                /* Consulta cliente */
                                // String clientes = cli1.mostrarClientes(conexionBD);
                                ArrayList<Cliente> clientes = ctrlCliente.listarClientes(conexionBD);
                                VentanaTablaCliente ventanaTabla1 = new VentanaTablaCliente();
                                ventanaTabla1.setVisible(true);
                                ventanaTabla1.generarTabla(clientes);
                                // JOptionPane.showMessageDialog(null, clientes, "Listado de clientes",
                                // JOptionPane.INFORMATION_MESSAGE);
                                break;
                        case "3":
                                String identCliente = JOptionPane.showInputDialog(null,
                                                "Ingrese la identificación del cliente a buscar:", "LA TIENDA DE ROPA",
                                                JOptionPane.QUESTION_MESSAGE);
                                // String productos = cli1.listarProductosPorCliente(identCliente, conexionBD);
                                String productos = ctrlCliente.listarProductosCliente(identCliente, conexionBD);
                                JOptionPane.showMessageDialog(null, productos,
                                                "Listado de productos comprados por cliente",
                                                JOptionPane.INFORMATION_MESSAGE);
                                break;
                }

        }

}