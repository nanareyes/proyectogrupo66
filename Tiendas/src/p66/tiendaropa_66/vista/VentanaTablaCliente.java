/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p66.tiendaropa_66.vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import p66.tiendaropa_66.modelo.Cliente;

/**
 *
 * @author Camilo A
 */
public class VentanaTablaCliente extends javax.swing.JFrame {

  /**
   * Creates new form VentanaTablaCliente
   */

  private DefaultTableModel modeloTabla;

  public VentanaTablaCliente() {
    initComponents();
    modeloTabla = new DefaultTableModel();
    modeloTabla.addColumn("Identificación");
    modeloTabla.addColumn("Nombres");
    modeloTabla.addColumn("Apellidos");
    tblClientes.setModel(modeloTabla);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  // @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btnCerrar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblClientes = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Reporte de clientes");

    jLabel1.setText("Reporte de los diez primeros clientes");

    btnCerrar.setText("Cerrar");
    btnCerrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCerrarActionPerformed(evt);
      }
    });

    tblClientes.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null },
        { null, null, null, null }, { null, null, null, null }, { null, null, null, null } },
        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
    jScrollPane1.setViewportView(tblClientes);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(171, 171, 171).addComponent(btnCerrar))
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))))
            .addContainerGap(28, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel1).addGap(32, 32, 32)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18).addComponent(btnCerrar)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
        jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
        javax.swing.GroupLayout.PREFERRED_SIZE));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1,
        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
        javax.swing.GroupLayout.PREFERRED_SIZE));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCerrarActionPerformed
    this.dispose();
  }// GEN-LAST:event_btnCerrarActionPerformed

  public void generarTabla(ArrayList<Cliente> clientes) {
    for (int i = 0; i < clientes.size(); i++) {
      String datos[] = new String[3];
      datos[0] = clientes.get(i).getIdentificacion();
      datos[1] = clientes.get(i).getNombres();
      datos[2] = clientes.get(i).getApellidos();
      modeloTabla.addRow(datos);
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCerrar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblClientes;
  // End of variables declaration//GEN-END:variables
}