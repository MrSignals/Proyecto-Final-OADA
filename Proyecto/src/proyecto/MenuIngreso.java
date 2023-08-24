/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import proyecto.ingresos.Pais;
import proyecto.ingresos.Categoria;
import proyecto.ingresos.Hotel;
import proyecto.ingresos.Ciudad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import proyecto.ingresos.HotelTemporada;
import proyecto.ingresos.Temporada;

/**
 *
 * @author PC
 */
public class MenuIngreso extends javax.swing.JFrame {
    dbConexion db = new dbConexion();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
       
    
    public MenuIngreso() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        agPais = new javax.swing.JLabel();
        agCiudad = new javax.swing.JLabel();
        agTemporada = new javax.swing.JLabel();
        agCategoria = new javax.swing.JLabel();
        agHotel = new javax.swing.JLabel();
        agCiudad1 = new javax.swing.JLabel();
        agVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escoja lo que desea ingresar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 18))); // NOI18N

        agPais.setBackground(new java.awt.Color(0, 204, 255));
        agPais.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        agPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/earthLogo.png"))); // NOI18N
        agPais.setText("AGREGAR PAIS");
        agPais.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        agPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agPaisMouseClicked(evt);
            }
        });

        agCiudad.setBackground(new java.awt.Color(0, 204, 255));
        agCiudad.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        agCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/cityLogo.png"))); // NOI18N
        agCiudad.setText("AGREGAR CIUDAD");
        agCiudad.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        agCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agCiudadMouseClicked(evt);
            }
        });

        agTemporada.setBackground(new java.awt.Color(0, 204, 255));
        agTemporada.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        agTemporada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/temporadaLogo.png"))); // NOI18N
        agTemporada.setText("AGREGAR TEMPORADA");
        agTemporada.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        agTemporada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agTemporada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agTemporadaMouseClicked(evt);
            }
        });

        agCategoria.setBackground(new java.awt.Color(0, 204, 255));
        agCategoria.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        agCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/hotelCategLogo.png"))); // NOI18N
        agCategoria.setText("AGREGAR CATEGORIAS");
        agCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        agCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agCategoriaMouseClicked(evt);
            }
        });

        agHotel.setBackground(new java.awt.Color(0, 204, 255));
        agHotel.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        agHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/hotelLogo.png"))); // NOI18N
        agHotel.setText("AGREGAR HOTEL");
        agHotel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        agHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agHotelMouseClicked(evt);
            }
        });

        agCiudad1.setBackground(new java.awt.Color(0, 204, 255));
        agCiudad1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        agCiudad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agCiudad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/hotelCategoria.png"))); // NOI18N
        agCiudad1.setText("AGREGAR TEMPORADA AL HOTEL");
        agCiudad1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        agCiudad1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agCiudad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agCiudad1MouseClicked(evt);
            }
        });

        agVolver.setBackground(new java.awt.Color(0, 204, 255));
        agVolver.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        agVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/img/volverLogo.png"))); // NOI18N
        agVolver.setText("VOLVER AL MENU");
        agVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        agVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agTemporada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(agHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agCiudad1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agPais)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agCiudad)
                    .addComponent(agCiudad1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agTemporada)
                    .addComponent(agVolver))
                .addGap(18, 18, 18)
                .addComponent(agCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agHotel)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agPaisMouseClicked
        // TODO add your handling code here:
        Pais pa = new Pais();
        this.dispose();
        pa.setVisible(true);
    }//GEN-LAST:event_agPaisMouseClicked

    private void agCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agCiudadMouseClicked
        // TODO add your handling code here:
        Ciudad cui = new Ciudad();
        this.dispose();
        cui.setVisible(true);
    }//GEN-LAST:event_agCiudadMouseClicked

    private void agTemporadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agTemporadaMouseClicked
        // TODO add your handling code here:
          Temporada temp = new Temporada();
        this.dispose();
        temp.setVisible(true);
    }//GEN-LAST:event_agTemporadaMouseClicked

    private void agCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agCategoriaMouseClicked
        // TODO add your handling code here:
        Categoria cat = new Categoria();
        this.dispose();
        cat.setVisible(true);
    }//GEN-LAST:event_agCategoriaMouseClicked

    private void agHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agHotelMouseClicked
        // TODO add your handling code here:
        Hotel ho = new Hotel();
        this.dispose();
        ho.setVisible(true);
    }//GEN-LAST:event_agHotelMouseClicked

    private void agCiudad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agCiudad1MouseClicked
        // TODO add your handling code here:
        HotelTemporada hotelTemp = new HotelTemporada();
        this.dispose();
        hotelTemp.setVisible(true);
    }//GEN-LAST:event_agCiudad1MouseClicked

    private void agVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agVolverMouseClicked
        // TODO add your handling code here:
        MenuPrincipal menP = new MenuPrincipal();
        this.dispose();
        menP.setVisible(true);
    }//GEN-LAST:event_agVolverMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agCategoria;
    private javax.swing.JLabel agCiudad;
    private javax.swing.JLabel agCiudad1;
    private javax.swing.JLabel agHotel;
    private javax.swing.JLabel agPais;
    private javax.swing.JLabel agTemporada;
    private javax.swing.JLabel agVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
