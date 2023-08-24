/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ingresos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.MenuIngreso;
import proyecto.dbConexion;

/**
 *
 * @author PC
 */
public class Pais extends javax.swing.JFrame {

    dbConexion db = new dbConexion();
    Connection conect;
    ResultSet rs;
    DefaultTableModel modelo;
    Statement st;

    public Pais() {
        initComponents();
        setLocationRelativeTo(null);
        consulta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPais = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdPais = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        panelBtnAgregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        panelBtnModificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelBtnEliminar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBtnNuevo = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JLabel();
        panelBtnVolver = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        paisesImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTable.setBackground(new java.awt.Color(255, 255, 255));
        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Ingresados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 14))); // NOI18N

        tablaPais.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tablaPais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPais", "Pais"
            }
        ));
        tablaPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPais);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 264, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("PAISES");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 80, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setText("Pais");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("IdPais");

        txtIdPais.setEditable(false);
        txtIdPais.setBackground(new java.awt.Color(255, 255, 255));
        txtIdPais.setEnabled(false);

        panelBtnAgregar.setBackground(new java.awt.Color(0, 204, 255));
        panelBtnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnAgregarLayout = new javax.swing.GroupLayout(panelBtnAgregar);
        panelBtnAgregar.setLayout(panelBtnAgregarLayout);
        panelBtnAgregarLayout.setHorizontalGroup(
            panelBtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnAgregarLayout.setVerticalGroup(
            panelBtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        panelBtnModificar.setBackground(new java.awt.Color(0, 204, 255));
        panelBtnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnModificar.setPreferredSize(new java.awt.Dimension(112, 47));
        panelBtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnModificarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MODIFICAR");

        javax.swing.GroupLayout panelBtnModificarLayout = new javax.swing.GroupLayout(panelBtnModificar);
        panelBtnModificar.setLayout(panelBtnModificarLayout);
        panelBtnModificarLayout.setHorizontalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnModificarLayout.setVerticalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        panelBtnEliminar.setBackground(new java.awt.Color(0, 204, 255));
        panelBtnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnEliminar.setPreferredSize(new java.awt.Dimension(112, 47));
        panelBtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnEliminarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ELIMINAR");

        javax.swing.GroupLayout panelBtnEliminarLayout = new javax.swing.GroupLayout(panelBtnEliminar);
        panelBtnEliminar.setLayout(panelBtnEliminarLayout);
        panelBtnEliminarLayout.setHorizontalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnEliminarLayout.setVerticalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBtnNuevo.setBackground(new java.awt.Color(0, 204, 255));
        panelBtnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnNuevoLayout = new javax.swing.GroupLayout(panelBtnNuevo);
        panelBtnNuevo.setLayout(panelBtnNuevoLayout);
        panelBtnNuevoLayout.setHorizontalGroup(
            panelBtnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnNuevoLayout.setVerticalGroup(
            panelBtnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        panelBtnVolver.setBackground(new java.awt.Color(0, 204, 255));
        panelBtnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBtnVolver.setPreferredSize(new java.awt.Dimension(112, 47));
        panelBtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnVolverMouseClicked(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("VOLVER AL INICIO");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnVolverLayout = new javax.swing.GroupLayout(panelBtnVolver);
        panelBtnVolver.setLayout(panelBtnVolverLayout);
        panelBtnVolverLayout.setHorizontalGroup(
            panelBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnVolverLayout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBtnVolverLayout.setVerticalGroup(
            panelBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(txtIdPais, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(panelBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtIdPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 570, 160));

        paisesImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/paises.png"))); // NOI18N
        panelPrincipal.add(paisesImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPaisMouseClicked
        // TODO add your handling code here:
        int fila = tablaPais.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado una fila");
        } else {
            int idPais = Integer.parseInt((String) tablaPais.getValueAt(fila, 0).toString());
            String pais = (String) tablaPais.getValueAt(fila, 1);
            txtIdPais.setText("" + idPais);
            txtPais.setText(pais);
        }
    }//GEN-LAST:event_tablaPaisMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        Agregar();
        consulta();
        Nuevo();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void panelBtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarMouseClicked
        // TODO add your handling code here:
        Modificar();
        consulta();
        Nuevo();
    }//GEN-LAST:event_panelBtnModificarMouseClicked

    private void panelBtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnEliminarMouseClicked
        // TODO add your handling code here:
        Eliminar();
        consulta();
        Nuevo();
    }//GEN-LAST:event_panelBtnEliminarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        // TODO add your handling code here:
        Nuevo();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        this.dispose();
        MenuIngreso men = new MenuIngreso();
        men.setVisible(true);
    }//GEN-LAST:event_btnVolverMouseClicked

    private void panelBtnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnVolverMouseClicked

    }//GEN-LAST:event_panelBtnVolverMouseClicked

    void consulta() {
        String sql = "Select * from pais";
        try {
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] pais = new Object[2];
            modelo = (DefaultTableModel) tablaPais.getModel();
            while (rs.next()) {
                pais[0] = rs.getInt("IdPais");
                pais[1] = rs.getString("Pais");

                modelo.addRow(pais);
            }
            tablaPais.setModel(modelo);
        } catch (Exception e) {

        }
    }

    void Agregar() {
        String pais = txtPais.getText();
        try {
            if (pais.equals(" ")) {
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");
                limpiarTabla();
            } else {
                String sql = "insert into pais( Pais) values('" + pais + "')";
                conect = db.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Pais ingresado con exito");
                limpiarTabla();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void limpiarTabla() {
        for (int i = 0; i <= tablaPais.getRowCount(); i++) {
            modelo.removeRow(i);
            i = (i - 1);
        }
    }

    void Modificar() {
        String idPais = txtIdPais.getText();
        String pais = txtPais.getText();
        try {
            if (idPais.equals(" ") || pais.equals(" ")) {
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");
                limpiarTabla();
            } else {

                String sql = "Update pais set IdPais='" + idPais + "',Pais  ='" + pais + "' WHERE IdPais=" + idPais;
                conect = db.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Ciudad modificada con exito");
                limpiarTabla();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void Eliminar() {
        String idPais = txtIdPais.getText();
        int fila = tablaPais.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Pais no seleccionadao");
                limpiarTabla();
            } else {
                CallableStatement csmt = conect.prepareCall("{CALL  reset_autoincrement_Pais()}");
                int n = JOptionPane.showConfirmDialog(null, "Desea eliminar el Pais", "Pais", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (n == JOptionPane.YES_NO_OPTION) {
                    if (validar()) {
                        JOptionPane.showMessageDialog(null, "No puede eliminar este dato ya que esta referenciado en otra tabla");
                        limpiarTabla();
                    } else {
                        String sql = "Delete from pais where IdPais= " + idPais;

                        conect = db.getConnection();
                        st = conect.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Pais eliminado");
                        csmt.execute();

                        System.out.println("Valor reiniciado");
                        limpiarTabla();
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void Nuevo() {
        txtIdPais.setText(" ");
        txtPais.setText(" ");
    }

    boolean validar() {
        boolean result = false;
        try {
            String sql = "Select * from ciudadPais WHERE IdPais= " + txtIdPais.getText();
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                result = true;
            } else {
                result = false;
            }
        } catch (SQLException E) {

        }
        return result;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paisesImg;
    private javax.swing.JPanel panelBtnAgregar;
    private javax.swing.JPanel panelBtnEliminar;
    private javax.swing.JPanel panelBtnModificar;
    private javax.swing.JPanel panelBtnNuevo;
    private javax.swing.JPanel panelBtnVolver;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable tablaPais;
    private javax.swing.JTextField txtIdPais;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
