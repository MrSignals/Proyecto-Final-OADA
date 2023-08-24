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
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.MenuIngreso;
import proyecto.dbConexion;

/**
 *
 * @author PC
 */
public class Ciudad extends javax.swing.JFrame {

    dbConexion db = new dbConexion();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;

    public Ciudad() {
        initComponents();
        setLocationRelativeTo(null);
        consulta();
        mostrarPais();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCiudad = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCiudadPais = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboPais = new javax.swing.JComboBox<>();
        panelBtnAgregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        panelBtnModificar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBtnEliminar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelBtnNuevo = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JLabel();
        panelBtnVolver = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Ingresados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 14))); // NOI18N

        tablaCiudad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tablaCiudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCiudadPais", "Pais", "Ciudad"
            }
        ));
        tablaCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCiudadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCiudad);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setText("Ciudad");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("IdCiudadPais");

        txtCiudadPais.setEditable(false);
        txtCiudadPais.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("Pais");

        cboPais.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Pais" }));
        cboPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboPaisMouseClicked(evt);
            }
        });
        cboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPaisActionPerformed(evt);
            }
        });

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
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MODIFICAR");

        javax.swing.GroupLayout panelBtnModificarLayout = new javax.swing.GroupLayout(panelBtnModificar);
        panelBtnModificar.setLayout(panelBtnModificarLayout);
        panelBtnModificarLayout.setHorizontalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnModificarLayout.setVerticalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
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

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ELIMINAR");

        javax.swing.GroupLayout panelBtnEliminarLayout = new javax.swing.GroupLayout(panelBtnEliminar);
        panelBtnEliminar.setLayout(panelBtnEliminarLayout);
        panelBtnEliminarLayout.setHorizontalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnEliminarLayout.setVerticalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCiudadPais)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
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
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCiudadPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        labelCiudad.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        labelCiudad.setText("CIUDADES");
        panelPrincipal.add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/ciudad.png"))); // NOI18N
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCiudadMouseClicked
        // TODO add your handling code here:
        int fila = tablaCiudad.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado una fila");
        } else {
            int idCiudadPais = Integer.parseInt((String) tablaCiudad.getValueAt(fila, 0).toString());
            String descrip = (String) tablaCiudad.getValueAt(fila, 2);
            txtCiudad.setText(descrip);
            txtCiudadPais.setText("" + idCiudadPais);
        }
    }//GEN-LAST:event_tablaCiudadMouseClicked

    private void cboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPaisActionPerformed

    private void cboPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboPaisMouseClicked
        // TODO add your handling code here:
//        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
//                    evt.consume();
//                    Pais pa = new Pais();
//                    pa.setVisible(true);
//            }
    }//GEN-LAST:event_cboPaisMouseClicked

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
        String sql = "Select cP.IdCiudadPais, p.pais, cp.Ciudad\n"
                + "	from ciudadPais as cP\n"
                + "    Inner Join Pais as p On cp.IdPais = p.IdPais\n"
                + "    Order By cp.IdCiudadPais;";
        try {
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] ciudad = new Object[3];
            modelo = (DefaultTableModel) tablaCiudad.getModel();
            while (rs.next()) {
                ciudad[0] = rs.getInt("cP.IdCiudadPais");
                ciudad[1] = rs.getString("p.pais");
                ciudad[2] = rs.getString("cP.Ciudad");

                modelo.addRow(ciudad);
            }
            tablaCiudad.setModel(modelo);
        } catch (Exception e) {

        }
    }

    void Agregar() {
        int idPais = cboPais.getSelectedIndex();
        String ciudad = txtCiudad.getText();
        try {
            if (ciudad.equals(" ")) {
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");
                limpiarTabla();
            } else {

                String sql = "insert into ciudadPais(IdPais,Ciudad) values ('" + idPais + "','" + ciudad + "')";
                conect = db.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Ciudad ingresada con exito");
                limpiarTabla();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    void limpiarTabla() {
        for (int i = 0; i <= tablaCiudad.getRowCount(); i++) {
            modelo.removeRow(i);
            i = (i - 1);
        }
    }

    void Modificar() {
        String idCiudadPais = txtCiudadPais.getText();
        int idPais = cboPais.getSelectedIndex();
        String ciudad = txtCiudad.getText();
        try {
            if (ciudad.equals(" ")) {
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");
                limpiarTabla();
            } else {

                String sql = "Update ciudadPais set IdPais  ='" + idPais + "', Ciudad ='" + ciudad + "' WHERE IdCiudadPais=" + idCiudadPais;
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
        String idCiudadPais = txtCiudadPais.getText();
        int fila = tablaCiudad.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Ciudad no seleccionada");
                limpiarTabla();
            } else {
                CallableStatement csmt = conect.prepareCall("{CALL reset_autoincrement()}");
                int n = JOptionPane.showConfirmDialog(null, "Desea Eliminar Ciudad", "Ciudad", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (n == JOptionPane.YES_NO_OPTION) {
                    if (validar()) {
                         JOptionPane.showMessageDialog(null, "No puede eliminar este dato ya que esta referenciado en otra tabla");
                        limpiarTabla();
                    } else {
                        String sql = "Delete from ciudadPais where IdCiudadPais= " + idCiudadPais;
                        conect = db.getConnection();
                        st = conect.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Ciudad eliminada");
                        csmt.execute();
                        limpiarTabla();
                    }
                }

            }
        } catch (Exception e) {
        }

    }

    void Nuevo() {
        txtCiudadPais.setText(" ");
        txtCiudad.setText(" ");
        cboPais.setSelectedIndex(0);
    }

    void mostrarPais() {
        String sql = "Select * from Pais";
        try {
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cboPais.addItem(rs.getString("Pais"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    boolean validar() {
        boolean result = false;
        try {
            String sql = "Select * from Hotel WHERE IdCiudadPais= " + txtCiudadPais.getText();
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
    private javax.swing.JComboBox<String> cboPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JPanel panelBtnAgregar;
    private javax.swing.JPanel panelBtnEliminar;
    private javax.swing.JPanel panelBtnModificar;
    private javax.swing.JPanel panelBtnNuevo;
    private javax.swing.JPanel panelBtnVolver;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaCiudad;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCiudadPais;
    // End of variables declaration//GEN-END:variables
}
