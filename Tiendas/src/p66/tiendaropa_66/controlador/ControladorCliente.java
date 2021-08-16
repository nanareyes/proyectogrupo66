package p66.tiendaropa_66.controlador;

import java.util.ArrayList;
import p66.tiendaropa_66.conexion.SqliteConnection;
import p66.tiendaropa_66.modelo.Cliente;
import p66.tiendaropa_66.modelo.ClienteDAO;

public class ControladorCliente {

    public void crearCliente(Cliente nuevoCliente, SqliteConnection conexionBD) {
        ClienteDAO cli1 = new ClienteDAO();
        cli1.insertarCliente(nuevoCliente, conexionBD);
    }

    public ArrayList<Cliente> listarClientes(SqliteConnection conexionBD) {
        ClienteDAO cli1 = new ClienteDAO();
        ArrayList<Cliente> clientes = cli1.mostrarClientes(conexionBD);
        return clientes;
    }

    public String listarProductosCliente(String idenCliente, SqliteConnection conexionBD) {
        ClienteDAO cli1 = new ClienteDAO();
        String productos = cli1.listarProductosPorCliente(idenCliente, conexionBD);
        return productos;
    }

}