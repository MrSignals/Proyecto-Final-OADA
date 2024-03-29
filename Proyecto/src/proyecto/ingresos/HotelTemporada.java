/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ingresos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.MenuIngreso;
import proyecto.dbConexion;

/**
 *
 * @author PC
 */
public class HotelTemporada extends javax.swing.JFrame {

    dbConexion db = new dbConexion();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;

    public HotelTemporada() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarHotel();
        mostrarTemporada();
        consulta();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHotelTemporada = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboHotel = new javax.swing.JComboBox<>();
        cboTemporada = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtFI = new javax.swing.JTextField();
        txtFF = new javax.swing.JTextField();
        panelBtnAgregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        panelBtnModificar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelBtnEliminar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panelBtnNuevo = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JLabel();
        panelBtnVolver = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setText("HotelTemporada");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Ingresados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 16))); // NOI18N

        tablaHotelTemporada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hotel", "Temporada", "Fecha de Inicio", "Fecha de Fin"
            }
        ));
        tablaHotelTemporada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHotelTemporadaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHotelTemporada);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("IdHotel");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("IdTemporada");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de Inicio");

        cboHotel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cboHotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Hotel" }));

        cboTemporada.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cboTemporada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Temporada" }));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Fin");

        txtFI.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        txtFF.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MODIFICAR");

        javax.swing.GroupLayout panelBtnModificarLayout = new javax.swing.GroupLayout(panelBtnModificar);
        panelBtnModificar.setLayout(panelBtnModificarLayout);
        panelBtnModificarLayout.setHorizontalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnModificarLayout.setVerticalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
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

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ELIMINAR");

        javax.swing.GroupLayout panelBtnEliminarLayout = new javax.swing.GroupLayout(panelBtnEliminar);
        panelBtnEliminar.setLayout(panelBtnEliminarLayout);
        panelBtnEliminarLayout.setHorizontalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnEliminarLayout.setVerticalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboHotel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtFF))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/temporadaLogo.png"))); // NOI18N
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/hotelLogo.png"))); // NOI18N
        panelPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaHotelTemporadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHotelTemporadaMouseClicked
        // TODO add your handling code here:
        int fila = tablaHotelTemporada.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado una fila");
        } else {
            Date fechaInicio = (Date) tablaHotelTemporada.getValueAt(fila, 2);
            Date fechaFin = (Date) tablaHotelTemporada.getValueAt(fila, 3);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaISQL = sdf.format(fechaInicio);
            String fechaFSQL = sdf.format(fechaFin);

            txtFI.setText(fechaISQL);
            txtFF.setText(fechaFSQL);

        }
    }//GEN-LAST:event_tablaHotelTemporadaMouseClicked

    private void txtFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFActionPerformed

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
        String sql = "Select hotel.Nombre, temporada.Descripcion, hotelTemporada.F_I_Temporada, hotelTemporada.F_F_Temporada\n" /*1 ta*/
                + "     From hotelTemporada\n"
                + "     Inner Join hotel ON hotelTemporada.IdHotel = hotel.IdHotel\n"
                + "     Inner Join temporada ON hotelTemporada.IdTemporada = temporada.IdTemporada;";
        try {
            conect = db.getConnection(); /*2  ta*/
            st = conect.createStatement();  /*3  ta*/
            rs = st.executeQuery(sql);  /*4  ta*/
            Object[] hotelTemp = new Object[4];  /*5  ta*/
            modelo = (DefaultTableModel) tablaHotelTemporada.getModel();  /*6  ta*/
            while (rs.next()) {  /*7  n*(tc) + tc */
                hotelTemp[0] = rs.getString("hotel.Nombre"); /*8 n*(ta)*/
                hotelTemp[1] = rs.getString("temporada.Descripcion"); /*9  n*(ta)*/
                hotelTemp[2] = rs.getDate("hotelTemporada.F_I_Temporada"); /*10  n*(ta)*/
                hotelTemp[3] = rs.getDate("hotelTemporada.F_F_Temporada"); /*11  n*(ta)*/

                modelo.addRow(hotelTemp); /*12  n*(ta)*/
            }
            tablaHotelTemporada.setModel(modelo); /*13 ta*/
        } catch (Exception e) {

        }
    }
    
    /*COSTO DE ALGORITMO DEL METODO CONSULTA
        Tm = 7ta + ntc + tc
        Tp = 7ta + n*(tc + 5ta) + tc
        Tu = (Tm + Tp) / 2
        Tu = (14ta + n*(2tc + 5ta) + 2tc) / 2
     */

    void Agregar() {
        int idHotel = cboHotel.getSelectedIndex(); /*1  ta*/
        int idTemporada = cboTemporada.getSelectedIndex(); /*2  ta*/
        String fechaI = txtFI.getText(); /*3  ta*/
        String fechaF = txtFF.getText(); /*4  ta*/
        try {
            if (fechaF.equals(" ") || fechaI.equals(" ")) { /*5  tc*/
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");
                limpiarTabla(); /*6 n*(ta + tc + 3to) + tc*/
            } else {
                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy"); /*7  ta*/
                LocalDate fechaISQL = LocalDate.parse(fechaI, formatoFecha); /*8  ta*/
                LocalDate fechaFSQL = LocalDate.parse(fechaF, formatoFecha); /*9  ta*/
                String sql = "insert into hoteltemporada(IdHotel,IdTemporada,F_I_Temporada,F_F_Temporada) values ('" + idHotel + "','" + idTemporada + "','" + fechaISQL + "','" + fechaFSQL + "' )"; /*10  ta*/
                conect = db.getConnection(); /*11  ta*/
                st = conect.createStatement(); /*12  ta*/
                st.executeUpdate(sql); /*13  ta*/

                JOptionPane.showMessageDialog(null, "Temporada del Hotel ingresada ingresada con exito");
                limpiarTabla(); /*14 n*(ta + tc + 3to) + tc*/
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /* COSTO DE ALGORITMO DEL METODO AGREGAR
        Tm = 4ta + n*(ta + tc + 3to) + 2tc
        Tp = 11ta + n*(ta + tc + 3to) + 2tc
        Tu = (Tm + Tp) / 2
        Tu = (15ta + n*(2ta + 2tc + 6to) + 4tc) / 2
    */

    void limpiarTabla() {
        for (int i = 0; i <= tablaHotelTemporada.getRowCount(); i++) { /*1  n*(ta + tc + to) + tc*/
            modelo.removeRow(i); /*2  nto*/
            i = (i - 1); /*3  nto*/
        }
    }
    
     /* COSTO DE ALGORITMO DEL METODO limpiarTabla
        T = n*(ta + tc + 3to) + tc
    */
    

    void Modificar() {
        int idHotel = cboHotel.getSelectedIndex(); /*1  ta*/
        int idTemporada = cboTemporada.getSelectedIndex(); /*2  ta*/
        String fechaInicio = txtFI.getText(); /*3  ta*/
        String fechaFin = txtFF.getText(); /*4  ta*/
        try {
            if (fechaInicio.equals(" ") || fechaFin.equals(" ")) { /*5  tc*/
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");
                limpiarTabla(); /*6 n*(ta + tc + 3to) + tc */
            } else {

                String sql = "Update hoteltemporada set IdHotel='" + idHotel + "',IdTemporada  ='" + idTemporada + "' WHERE IdHotel=" + idHotel; /*7  ta*/
                conect = db.getConnection(); /*8  ta*/
                st = conect.createStatement(); /*9  ta*/
                st.executeUpdate(sql); /*10  ta*/
                JOptionPane.showMessageDialog(null, "Temporada del Hotel modificada con exito");
                limpiarTabla(); /*11 n*(ta + tc + 3to) + tc */
            }

        } catch (Exception e) {
        }
    }
    
     /* COSTO DE ALGORITMO DEL METODO MODIFICAR
        Tm = 4ta + n*(ta + tc + 3to) + 2tc
        Tp = 8ta + n*(ta + tc + 3to) + 2tc
        Tu = (Tm + Tp) / 2
        Tu = (12ta + n*(2ta + 2tc + 6to) + 4tc) / 2
    */
    
    void Eliminar() {
        int idHotel = cboHotel.getSelectedIndex(); /*1  ta*/
        int fila = tablaHotelTemporada.getSelectedRow(); /*2  ta*/
        try {
            if (fila < 0) { /*3  tc*/
                JOptionPane.showMessageDialog(null, "Hotel no seleccionado");
                limpiarTabla(); /*4 n*(ta + tc + 3to) + tc*/
            } else {
                int n = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Hotel", "Hotel", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);  /*5 ta */
                if (n == JOptionPane.YES_NO_OPTION) { /*6 tc*/
                    String sql = "Delete from hoteltemporada where IdHotel= " + idHotel; /*8 ta*/
                    conect = db.getConnection(); /*9 ta*/
                    st = conect.createStatement(); /*10 ta*/
                    st.executeUpdate(sql); /*11 ta*/
                    JOptionPane.showMessageDialog(null, "Temporada del Hotel eliminado");
                    limpiarTabla(); /*12 n*(ta + tc + 3to) + tc*/
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /* COSTO DE ALGORITMO DEL METODO ELIMINAR
        Tm = 2ta + n*(ta + 3to + tc) + 2tc
        Tp = 7ta + n*(ta + tc + 3to) + 3tc
        Tu = (Tm + Tp'1) / 2
        Tu = (9ta + n*(2ta + 6to + 2tc) + 5tc) / 2
    */
    
    void Nuevo() {
        cboHotel.setSelectedIndex(0);
        cboTemporada.setSelectedIndex(0);
        txtFI.setText("");
        txtFF.setText("");
    }

    void mostrarHotel() {
        String sql = "Select * from Hotel"; /*1  ta*/
        try {
            conect = db.getConnection(); /*2 ta*/
            st = conect.createStatement(); /*3 ta*/
            rs = st.executeQuery(sql); /*4 ta*/
            while (rs.next()) { /*5 n*(tc) + tc */
                cboHotel.addItem(rs.getString("Nombre")); /*6 n*(ta) */
            }
        } catch (SQLException e) {
        }
    }
    
     /* COSTO DE ALGORITMO DEL METODO mostrarHotel
        Tm = 4ta + n*(tc) + tc
        Tp = 4ta + n*(tc + ta) + tc
        Tu = (8ta + n*(2tc + 2ta) + 2tc) / 2
    */
    
    void mostrarTemporada() {
        String sql = "Select * from Temporada"; /*1  ta*/
        try {
            conect = db.getConnection(); /*2  ta*/
            st = conect.createStatement(); /*3  ta*/
            rs = st.executeQuery(sql); /*4 ta*/
            while (rs.next()) {  /*5 n*(tc) + tc */
                cboTemporada.addItem(rs.getString("Descripcion")); /*6 n*(ta) */
            }
        } catch (SQLException e) {
        }
    }
    
    /* COSTO DE ALGORITMO DEL METODO mostrarTemporada
        Tm = 4ta + n*(tc) + tc
        Tp = 4ta + n*(tc + ta) + tc
        Tu = (8ta + n*(2tc + 2ta) + 2tc) / 2
    */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JComboBox<String> cboHotel;
    private javax.swing.JComboBox<String> cboTemporada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBtnAgregar;
    private javax.swing.JPanel panelBtnEliminar;
    private javax.swing.JPanel panelBtnModificar;
    private javax.swing.JPanel panelBtnNuevo;
    private javax.swing.JPanel panelBtnVolver;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaHotelTemporada;
    private javax.swing.JTextField txtFF;
    private javax.swing.JTextField txtFI;
    // End of variables declaration//GEN-END:variables
}
