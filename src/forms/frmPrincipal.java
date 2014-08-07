
package forms;

import entidades.DatoSist;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class frmPrincipal extends javax.swing.JFrame {
    DatoSist ds;
    public static JToolBar toolBarPrinc;
    public static JMenuBar menuBarPrinc;
    
    public frmPrincipal() {
        initComponents();
        datosIniciales();
        toolBarPrinc= toolBar;
        menuBarPrinc= jMenuBar1;
    }

    private void datosIniciales() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("colectivos.odb");
        EntityManager em= emf.createEntityManager();
        ds= em.find(DatoSist.class, 1);
        if(ds==null){
            em.getTransaction().begin();
            ds= new DatoSist("COLECTIVOS S.R.L.", 5000);
            ds.setId(1);
            em.persist(ds);
            em.getTransaction().commit();
        }
        this.setTitle(ds.getNombreEmpresa());
        em.close();
        emf.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpprincipal = new javax.swing.JDesktopPane();
        toolBar = new javax.swing.JToolBar();
        btnCiudades = new javax.swing.JButton();
        btnTrayectos = new javax.swing.JButton();
        btnChofer = new javax.swing.JButton();
        btnVehiculos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnViaje = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        mitCiudades = new javax.swing.JMenuItem();
        mitTrayectos = new javax.swing.JMenuItem();
        mitChoferes = new javax.swing.JMenuItem();
        mitVehiculos = new javax.swing.JMenuItem();
        mitViaje = new javax.swing.JMenuItem();
        mitPasajes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnListas = new javax.swing.JMenu();
        mitPasajesPorViaje = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();
        mitAcercaDe = new javax.swing.JMenuItem();
        mitDatosSist = new javax.swing.JMenuItem();
        mitSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema COLECTIVOS");

        dpprincipal.setBackground(java.awt.SystemColor.controlHighlight);

        toolBar.setRollover(true);
        toolBar.setEnabled(false);

        btnCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_city.png"))); // NOI18N
        btnCiudades.setToolTipText("Ciudades");
        btnCiudades.setFocusable(false);
        btnCiudades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCiudades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiudadesActionPerformed(evt);
            }
        });
        toolBar.add(btnCiudades);

        btnTrayectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1373221794_invoice.png"))); // NOI18N
        btnTrayectos.setToolTipText("Trayectos");
        btnTrayectos.setFocusable(false);
        btnTrayectos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrayectos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrayectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrayectosActionPerformed(evt);
            }
        });
        toolBar.add(btnTrayectos);

        btnChofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chofer.png"))); // NOI18N
        btnChofer.setToolTipText("Choferes");
        btnChofer.setFocusable(false);
        btnChofer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChofer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoferActionPerformed(evt);
            }
        });
        toolBar.add(btnChofer);

        btnVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transp.png"))); // NOI18N
        btnVehiculos.setToolTipText("Vehículos");
        btnVehiculos.setFocusable(false);
        btnVehiculos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVehiculos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });
        toolBar.add(btnVehiculos);
        toolBar.add(jSeparator1);

        btnViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viaje.png"))); // NOI18N
        btnViaje.setToolTipText("Viajes");
        btnViaje.setFocusable(false);
        btnViaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajeActionPerformed(evt);
            }
        });
        toolBar.add(btnViaje);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ticket.png"))); // NOI18N
        jButton1.setToolTipText("Ventas");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        toolBar.add(jButton1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abstract.jpg"))); // NOI18N

        javax.swing.GroupLayout dpprincipalLayout = new javax.swing.GroupLayout(dpprincipal);
        dpprincipal.setLayout(dpprincipalLayout);
        dpprincipalLayout.setHorizontalGroup(
            dpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dpprincipalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        dpprincipalLayout.setVerticalGroup(
            dpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpprincipalLayout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        dpprincipal.setLayer(toolBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpprincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mnArchivo.setText("Archivo");

        mitCiudades.setText("Ciudades");
        mitCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitCiudadesActionPerformed(evt);
            }
        });
        mnArchivo.add(mitCiudades);

        mitTrayectos.setText("Trayectos");
        mitTrayectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTrayectosActionPerformed(evt);
            }
        });
        mnArchivo.add(mitTrayectos);

        mitChoferes.setText("Choferes");
        mitChoferes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitChoferesActionPerformed(evt);
            }
        });
        mnArchivo.add(mitChoferes);

        mitVehiculos.setText("Vehículos");
        mitVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitVehiculosActionPerformed(evt);
            }
        });
        mnArchivo.add(mitVehiculos);

        mitViaje.setText("Viaje");
        mitViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitViajeActionPerformed(evt);
            }
        });
        mnArchivo.add(mitViaje);

        mitPasajes.setText("Pasajes");
        mitPasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPasajesActionPerformed(evt);
            }
        });
        mnArchivo.add(mitPasajes);
        mnArchivo.add(jSeparator2);

        jMenuBar1.add(mnArchivo);

        mnListas.setText("Listas");

        mitPasajesPorViaje.setText("Pasajes por Viaje");
        mitPasajesPorViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPasajesPorViajeActionPerformed(evt);
            }
        });
        mnListas.add(mitPasajesPorViaje);

        jMenuBar1.add(mnListas);

        mnSistema.setText("Sistema");

        mitAcercaDe.setText("Acerca de ...");
        mitAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAcercaDeActionPerformed(evt);
            }
        });
        mnSistema.add(mitAcercaDe);

        mitDatosSist.setText("Datos del Sistema");
        mitDatosSist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDatosSistActionPerformed(evt);
            }
        });
        mnSistema.add(mitDatosSist);

        mitSalir.setText("Salir");
        mitSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSalirActionPerformed(evt);
            }
        });
        mnSistema.add(mitSalir);

        jMenuBar1.add(mnSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpprincipal)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiudadesActionPerformed
        new frmCiudades().setVisible(true);
    }//GEN-LAST:event_btnCiudadesActionPerformed

    private void btnTrayectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrayectosActionPerformed
        new frmTrayectos().setVisible(true);
    }//GEN-LAST:event_btnTrayectosActionPerformed

    private void btnChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoferActionPerformed
        new frmChoferes().setVisible(true);
    }//GEN-LAST:event_btnChoferActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        new frmVehiculos().setVisible(true);
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajeActionPerformed
        new frmViaje().setVisible(true);
    }//GEN-LAST:event_btnViajeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new frmPasajes().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mitAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAcercaDeActionPerformed
        new frmAcercaDe().setVisible(true);
    }//GEN-LAST:event_mitAcercaDeActionPerformed

    private void mitSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mitSalirActionPerformed

    private void mitDatosSistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDatosSistActionPerformed
        new frmDatosSist().setVisible(true);
    }//GEN-LAST:event_mitDatosSistActionPerformed

    private void mitCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitCiudadesActionPerformed
        new frmCiudades().setVisible(true);
    }//GEN-LAST:event_mitCiudadesActionPerformed

    private void mitTrayectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTrayectosActionPerformed
        new frmTrayectos().setVisible(true);
    }//GEN-LAST:event_mitTrayectosActionPerformed

    private void mitChoferesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitChoferesActionPerformed
        new frmChoferes().setVisible(true);
    }//GEN-LAST:event_mitChoferesActionPerformed

    private void mitVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitVehiculosActionPerformed
        new frmVehiculos().setVisible(true);
    }//GEN-LAST:event_mitVehiculosActionPerformed

    private void mitViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitViajeActionPerformed
        new frmViaje().setVisible(true);
    }//GEN-LAST:event_mitViajeActionPerformed

    private void mitPasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPasajesActionPerformed
        new frmPasajes().setVisible(true);
    }//GEN-LAST:event_mitPasajesActionPerformed

    private void mitPasajesPorViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPasajesPorViajeActionPerformed
        new frmVentasViaje().setVisible(true);
    }//GEN-LAST:event_mitPasajesPorViajeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChofer;
    private javax.swing.JButton btnCiudades;
    private javax.swing.JButton btnTrayectos;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JButton btnViaje;
    private javax.swing.JDesktopPane dpprincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mitAcercaDe;
    private javax.swing.JMenuItem mitChoferes;
    private javax.swing.JMenuItem mitCiudades;
    private javax.swing.JMenuItem mitDatosSist;
    private javax.swing.JMenuItem mitPasajes;
    private javax.swing.JMenuItem mitPasajesPorViaje;
    private javax.swing.JMenuItem mitSalir;
    private javax.swing.JMenuItem mitTrayectos;
    private javax.swing.JMenuItem mitVehiculos;
    private javax.swing.JMenuItem mitViaje;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnListas;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
