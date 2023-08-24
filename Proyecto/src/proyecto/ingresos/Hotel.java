package proyecto.ingresos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.MenuIngreso;
import proyecto.dbConexion;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hotel extends javax.swing.JFrame {

    dbConexion db = new dbConexion();
    Connection conect;
    ResultSet rs;
    DefaultTableModel modelo;
    Statement st;

    public Hotel() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarCategoria();
        mostrarCiudad();
        consulta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidHotel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox<>();
        cboCiudad = new javax.swing.JComboBox<>();
        panelBtnAgregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        panelBtnModificar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panelBtnEliminar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panelBtnNuevo = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JLabel();
        panelBtnVolver = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        panelBtnReporte = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHotel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de  hotel");

        txtDireccion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("Categoria");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("IdCiudadPais");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("IdHotel");

        txtidHotel.setEditable(false);
        txtidHotel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtidHotel.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setText("Direccion");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");

        txtnombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setText("Año de Construccion");

        txtTelefono.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        txtAño.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        cboCategoria.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Categoria" }));

        cboCiudad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Ciudad" }));

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

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MODIFICAR");

        javax.swing.GroupLayout panelBtnModificarLayout = new javax.swing.GroupLayout(panelBtnModificar);
        panelBtnModificar.setLayout(panelBtnModificarLayout);
        panelBtnModificarLayout.setHorizontalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnModificarLayout.setVerticalGroup(
            panelBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
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

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ELIMINAR");

        javax.swing.GroupLayout panelBtnEliminarLayout = new javax.swing.GroupLayout(panelBtnEliminar);
        panelBtnEliminar.setLayout(panelBtnEliminarLayout);
        panelBtnEliminarLayout.setHorizontalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        panelBtnEliminarLayout.setVerticalGroup(
            panelBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        panelBtnReporte.setBackground(new java.awt.Color(0, 204, 255));
        panelBtnReporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBtnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtnReporte.setPreferredSize(new java.awt.Dimension(112, 47));
        panelBtnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnReporteMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GENERAR REPORTE");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnReporteLayout = new javax.swing.GroupLayout(panelBtnReporte);
        panelBtnReporte.setLayout(panelBtnReporteLayout);
        panelBtnReporteLayout.setHorizontalGroup(
            panelBtnReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBtnReporteLayout.setVerticalGroup(
            panelBtnReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboCategoria, 0, 1, Short.MAX_VALUE)
                                    .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtidHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(panelBtnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtidHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 97, 970, 200));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresados"));

        tablaHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdHotel", "Categoria", "Pais", "Ciudad", "Nombre", "Direccion", "Telefono", "Año Construccion"
            }
        ));
        tablaHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHotelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaHotelMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHotel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 870, 340));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("HOTELES");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 110, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/hoteliMG.png"))); // NOI18N
        panelPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaHotelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHotelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaHotelMouseEntered

    private void tablaHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHotelMouseClicked
        int fila = tablaHotel.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado una fila");
        } else {
            int IdHotel = Integer.parseInt((String) tablaHotel.getValueAt(fila, 0).toString());
            String nombre = (String) tablaHotel.getValueAt(fila, 4);
            String direccion = (String) tablaHotel.getValueAt(fila, 5);
            int telefono = Integer.parseInt((String) tablaHotel.getValueAt(fila, 6).toString());
            int anio = Integer.parseInt((String) tablaHotel.getValueAt(fila, 7).toString());

            txtidHotel.setText("" + IdHotel);
            txtnombre.setText(nombre);
            txtDireccion.setText(direccion);
            txtTelefono.setText("" + telefono);
            txtAño.setText(" " + anio);
        }
    }//GEN-LAST:event_tablaHotelMouseClicked

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

    private void panelBtnReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnReporteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelBtnReporteMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        generarReporte();
    }//GEN-LAST:event_jLabel12MouseClicked

    void consulta() {
        String sql = "Select hotel.IdHotel, categoria.Descripcion, pais.Pais, ciudadPais.Ciudad, hotel.Nombre, hotel.Direccion, hotel.Telefono, hotel.AnioConstruccion\n"
                + "	FROM hotel\n"
                + "    Inner Join categoria ON hotel.codigo = categoria.Codigo\n"
                + "    Inner Join ciudadPais ON hotel.IdCiudadPais = ciudadPais.IdCiudadPais\n"
                + "    Inner Join pais ON ciudadPais.IdPais = pais.IdPais"
                + "     Order by hotel.IdHotel;";
        try {
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] hotel = new Object[8];
            modelo = (DefaultTableModel) tablaHotel.getModel();
            while (rs.next()) {
                hotel[0] = rs.getInt("hotel.IdHotel");
                hotel[1] = rs.getString("categoria.Descripcion");
                hotel[2] = rs.getString("pais.Pais");
                hotel[3] = rs.getString("ciudadPais.Ciudad");
                hotel[4] = rs.getString("hotel.Nombre");
                hotel[5] = rs.getString("hotel.Direccion");
                hotel[6] = rs.getInt("hotel.Telefono");
                hotel[7] = rs.getInt("hotel.AnioConstruccion");

                modelo.addRow(hotel);
            }
            tablaHotel.setModel(modelo);
        } catch (Exception e) {

        }
    }

    void Agregar() {
        String nombre = txtnombre.getText();
        String anio = txtAño.getText();
        String dire = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        int codCategoria = cboCategoria.getSelectedIndex();
        int idCiudadPais = cboCiudad.getSelectedIndex();

        try {
            if (anio.equals(" ") || dire.equals(" ") || telefono.equals(" ") || nombre.equals(" ")) {
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");

            } else {
                String sql = "Insert into hotel(Codigo, IdCiudadPais, Nombre, Direccion, Telefono,AnioConstruccion ) values('" + codCategoria + "','" + idCiudadPais + "','" + nombre + "','" + dire + "','" + telefono + "','" + anio + "')";
                conect = db.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Datos del Hotel ingresados con exito");
                limpiarTabla();
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < tablaHotel.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void Modificar() {
        String idHotel = txtidHotel.getText();
        String nombre = txtnombre.getText();
        String anio = txtAño.getText();
        String dire = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        int codCategoria = cboCategoria.getSelectedIndex();
        int idCiudadPais = cboCiudad.getSelectedIndex();
        try {
            if (idHotel.equals(" ") || anio.equals(" ") || dire.equals(" ") || telefono.equals(" ") || nombre.equals(" ")) {
                JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos");
                limpiarTabla();
            } else {

                String sql = "Update hotel set Codigo  ='" + codCategoria + "', IdCiudadPais ='" + idCiudadPais + "',Nombre = '" + nombre + "',Direccion = '" + dire + "',Telefono = '" + telefono + "', AnioConstruccion = '" + anio + "' WHERE IdHotel = " + idHotel;
                conect = db.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Hotel modificado con exito");
                limpiarTabla();
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    void Eliminar() {
        String idHotel = txtidHotel.getText();
        int fila = tablaHotel.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Hotel no seleccionada");
                limpiarTabla();
            } else {
                CallableStatement csmt = conect.prepareCall("{CALL reset_autoincrement_Hotel()}");
                int n = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Hotel", "Hotel", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (n == JOptionPane.YES_NO_OPTION) {
                    if (validar()) {
                        JOptionPane.showMessageDialog(null, "No puede eliminar este dato ya que esta referenciado en otra tabla");
                        limpiarTabla();
                    } else {
                        String sql = "Delete from hotel where IdHotel= " + idHotel;
                        conect = db.getConnection();
                        st = conect.createStatement();
                        st.executeUpdate(sql);
                        csmt.execute();
                        JOptionPane.showMessageDialog(null, "Hotel eliminada");
                        limpiarTabla();
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void Nuevo() {
        txtidHotel.setText(" ");
        cboCategoria.setSelectedIndex(0);
        cboCiudad.setSelectedIndex(0);
        txtnombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtAño.setText("");
    }

    void mostrarCategoria() {
        String sql = "Select * from Categoria";
        try {
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cboCategoria.addItem(rs.getString("Descripcion"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    void mostrarCiudad() {
        String sql = "Select * from ciudadPais";
        try {
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cboCiudad.addItem(rs.getString("Ciudad"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    void generarReporte() {
        Workbook workbook = new XSSFWorkbook();
        String sql = "Select hotel.Nombre, pais.Pais, ciudadPais.Ciudad, categoria.Descripcion,temporada.Descripcion ,hotelTemporada.F_I_Temporada, hotelTemporada.F_F_Temporada  , hotel.Direccion, hotel.Telefono, hotel.AnioConstruccion\n"
                + "	FROM hotel\n"
                + "    Inner Join categoria ON hotel.codigo = categoria.Codigo\n"
                + "    Inner Join ciudadPais ON hotel.IdCiudadPais = ciudadPais.IdCiudadPais\n"
                + "    Inner Join pais ON ciudadPais.IdPais = pais.IdPais\n"
                + "    Inner Join hotelTemporada ON hotel.IdHotel = hotelTemporada.IdHotel"
                + "    Inner Join temporada ON hotelTemporada.IdTemporada = temporada.IdTemporada;";
        try {
            conect = db.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);

            Sheet hoja = workbook.createSheet("Hoteles");
            Row tituloRow = hoja.createRow(0);
            tituloRow.createCell(0).setCellValue("Nombre");
            tituloRow.createCell(1).setCellValue("Pais");
            tituloRow.createCell(2).setCellValue("Ciudad");
            tituloRow.createCell(3).setCellValue("Descripcion");
            tituloRow.createCell(4).setCellValue("Temporada");
            tituloRow.createCell(5).setCellValue("Fecha de Inicio de Temporada");
            tituloRow.createCell(6).setCellValue("Fecha de Fin de Temporada");
            tituloRow.createCell(7).setCellValue("Direccion");
            tituloRow.createCell(8).setCellValue("Telefono");
            tituloRow.createCell(9).setCellValue("Año de Construccion");

            int rowNumber = 1;
            while (rs.next()) {
                Row columna = hoja.createRow(rowNumber++);
                columna.createCell(0).setCellValue(rs.getString("hotel.Nombre"));
                columna.createCell(1).setCellValue(rs.getString("pais.Pais"));
                columna.createCell(2).setCellValue(rs.getString("ciudadPais.Ciudad"));
                columna.createCell(3).setCellValue(rs.getString("categoria.Descripcion"));
                columna.createCell(4).setCellValue(rs.getString("temporada.Descripcion"));
                columna.createCell(5).setCellValue(rs.getString("hotelTemporada.F_I_Temporada"));
                columna.createCell(6).setCellValue(rs.getString("hotelTemporada.F_F_Temporada"));
                columna.createCell(7).setCellValue(rs.getString("hotel.Direccion"));
                columna.createCell(8).setCellValue(rs.getInt("hotel.Telefono"));
                columna.createCell(9).setCellValue(rs.getInt("hotel.AnioConstruccion"));
            }
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {
                hoja.autoSizeColumn(columnIndex);
            }

            CellStyle borderStyle = workbook.createCellStyle();
            borderStyle.setBorderTop(BorderStyle.THIN);
            borderStyle.setBorderBottom(BorderStyle.THIN);
            borderStyle.setBorderLeft(BorderStyle.THIN);
            borderStyle.setBorderRight(BorderStyle.THIN);

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    cell.setCellStyle(borderStyle);
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream("Hoteles.xlsx")) {
                workbook.write(outputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Se ha generado el excel con exito");

        } catch (SQLException e) {

        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    boolean validar() {
        boolean result = false;
        try {
            String sql = "Select * from HotelTemporada WHERE IdHotel= " + txtidHotel.getText();
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
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel panelBtnReporte;
    private javax.swing.JPanel panelBtnVolver;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaHotel;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtidHotel;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
