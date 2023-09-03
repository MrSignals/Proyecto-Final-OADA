/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import proyecto.dbConexion;


/**
 *
 * @author PC
 */
public class HotelCategoria extends javax.swing.JFrame {

    dbConexion db = new dbConexion();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    public HotelCategoria() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHotelTemporada = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Ingresados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 14))); // NOI18N

        tablaHotelTemporada.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tablaHotelTemporada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Temporada", "Categoria", "Año de Construccion"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 752, 384));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setText("Hoteles con su categoria y temporada");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/volverLogo.png"))); // NOI18N
        jLabel2.setText("VOLVER AL MENU");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 210, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaHotelTemporadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHotelTemporadaMouseClicked

    }//GEN-LAST:event_tablaHotelTemporadaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        /* TODO add your handling code here: */
        MenuConsultas menCons = new MenuConsultas();
        this.dispose();
        menCons.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

     void consulta() {

        String sql = "Select hotel.Nombre,temporada.descripcion,categoria.descripcion, hotel.AnioConstruccion\n" + /*1 ta*/
"			from hotel \n" +
"			Inner join categoria ON hotel.Codigo = categoria.Codigo\n" +
"            Inner join hotelTemporada ON hotel.IdHotel = hotelTemporada.IdHotel\n" +
"            Inner join temporada ON hotelTemporada.IdTemporada = temporada.IdTemporada";
        try {
            conect = db.getConnection(); /*2  ta*/
            st = conect.createStatement(); /*3  ta*/
            rs = st.executeQuery(sql); /*4  ta*/
            Object[] hotelTemp = new Object[4]; /*5 ta*/
            modelo = (DefaultTableModel) tablaHotelTemporada.getModel(); /*6  ta*/
            while (rs.next()) { /*7  n*(tc) + tc */
                hotelTemp[0] = rs.getString("hotel.Nombre"); /*8 n*(ta)*/
                hotelTemp[1] = rs.getString("temporada.Descripcion");  /*9 n*(ta)*/
                hotelTemp[2] = rs.getString("categoria.descripcion");  /*10 n*(ta)*/
                hotelTemp[3] = rs.getInt("hotel.AnioConstruccion");  /*11 n*(ta)*/

                modelo.addRow(hotelTemp);  /*12 n*(ta)*/
            }
            tablaHotelTemporada.setModel(modelo);  /*13 ta*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
     /*COSTO DE ALGORITMO DEL METODO CONSULTA
        Tm = 7ta + ntc + tc
        Tp = 7ta + n*(tc + 5ta) + tc
        Tu = (Tm + Tp) / 2
        Tu = (14ta + n*(2tc + 5ta) + 2tc) / 2
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaHotelTemporada;
    // End of variables declaration//GEN-END:variables
}
