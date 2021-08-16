package p66.tiendaropa_66;

import p66.tiendaropa_66.conexion.SqliteConnection;
import p66.tiendaropa_66.vista.VentanaMenu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*La Tienda de Ropa**");
        /* Se crea conexión a la base de datos */
        SqliteConnection conexionBD = new SqliteConnection();

        VentanaMenu menuPrincipal = new VentanaMenu(conexionBD);
        menuPrincipal.setVisible(true);
        /*
         * Menu menuPrincipal = new Menu(); menuPrincipal.generarMenu(conexionBD);
         */
    }

}