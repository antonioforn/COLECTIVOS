
package forms;

import clasesUtiles.ControlNum;
import clasesUtiles.ModeloTabla;
import clasesUtiles.Util;
import entidades.Chofer;
import entidades.Ciudad;
import entidades.Vehiculo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class frmVehiculos extends javax.swing.JFrame {

    EntityManagerFactory emf;
    EntityManager em;
    boolean flag;
    DefaultTableModel mtbl;
    String cadena;
    static Chofer chof;
    
    public frmVehiculos() {
        initComponents();
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em = emf.createEntityManager();
        txtAnho.setDocument(new ControlNum(4));
        txtCapacidad.setDocument(new ControlNum(2));
        cargarTabla("SELECT ve FROM Vehiculo ve ORDER BY ve.matricula");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtModelo = new javax.swing.JTextField();
        lbModelo = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbCI = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        btnBuscarN = new javax.swing.JToggleButton();
        lbAnho = new javax.swing.JLabel();
        txtAnho = new javax.swing.JTextField();
        btnBuscarA = new javax.swing.JToggleButton();
        btnBuscarCI = new javax.swing.JToggleButton();
        ftxtChapa = new javax.swing.JFormattedTextField();
        lbCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        lbChofer = new javax.swing.JLabel();
        txtChNom = new javax.swing.JTextField();
        txtChCI = new javax.swing.JTextField();
        btnChofer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vehículos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Vehículos");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        txtModelo.setEnabled(false);
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        lbModelo.setText("Modelo:");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        btnNuevo.setToolTipText("Añadir Ciudad");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit32.png"))); // NOI18N
        btnEditar.setToolTipText("Editar Ciudad");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar Ciudad");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirmar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbCI.setText("Matrícula:");

        txtCI.setEnabled(false);
        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCIKeyTyped(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Right32Green.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar ventana");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnBuscarN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscarN.setToolTipText("Buscar");
        btnBuscarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNActionPerformed(evt);
            }
        });

        lbAnho.setText("Año:");

        txtAnho.setEnabled(false);
        txtAnho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnhoKeyTyped(evt);
            }
        });

        btnBuscarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscarA.setToolTipText("Buscar");
        btnBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAActionPerformed(evt);
            }
        });

        btnBuscarCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscarCI.setToolTipText("Buscar");
        btnBuscarCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCIActionPerformed(evt);
            }
        });

        try {
            ftxtChapa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtChapa.setToolTipText("");
        ftxtChapa.setEnabled(false);

        lbCapacidad.setText("Capacidad: ");

        txtCapacidad.setEnabled(false);
        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        lbChofer.setText("Chofer:");

        txtChNom.setEnabled(false);

        txtChCI.setEnabled(false);

        btnChofer.setText("Elegir Chofer");
        btnChofer.setEnabled(false);
        btnChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbCI)
                                                    .addComponent(lbModelo))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(ftxtChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnBuscarCI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbChofer))
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtChNom, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lbCapacidad)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtChCI, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(btnChofer)))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCI)
                            .addComponent(ftxtChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbModelo)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAnho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbAnho))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChofer)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        em.close();
        emf.close();
    }//GEN-LAST:event_formWindowClosed

    private void btnBuscarCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCIActionPerformed
        if(btnBuscarCI.isSelected()){
            lbCI.setText("Filtrar:");
            ftxtChapa.setEnabled(true);
            ftxtChapa.requestFocusInWindow();
            Util.limpiarCampos(jPanel1);
            lbModelo.setText("Nombre:");
            txtModelo.setEnabled(false);
            lbAnho.setText("Apellido:");
            txtAnho.setEnabled(false);
        }else{
            lbAnho.setText("Apellido:");
            txtAnho.setEnabled(false);
            lbCI.setText("CI:");
            ftxtChapa.setEnabled(false);
            ftxtChapa.setText(null);
            cargarTabla("SELECT ve FROM Vehiculo ve ORDER BY ve.matricula");
        }
    }//GEN-LAST:event_btnBuscarCIActionPerformed

    private void btnBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAActionPerformed
        if(btnBuscarA.isSelected()){
            lbAnho.setText("Filtrar:");
            txtAnho.setEnabled(true);
            txtAnho.requestFocusInWindow();
            Util.limpiarCampos(jPanel1);
            lbModelo.setText("Modelo:");
            txtModelo.setEnabled(false);
            lbCI.setText("Matrícula:");
            ftxtChapa.setEnabled(false);
        }else{
            lbAnho.setText("Año:");
            txtAnho.setEnabled(false);
            cargarTabla("SELECT ve FROM Vehiculo ve ORDER BY ve.matricula");
        }
    }//GEN-LAST:event_btnBuscarAActionPerformed

    private void txtAnhoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyTyped
         if(btnBuscarA.isSelected()){
            cargarTabla("SELECT ve FROM Vehiculo ve WHERE ve.anho =" + txtAnho.getText().trim());
        }
    }//GEN-LAST:event_txtAnhoKeyTyped

    private void btnBuscarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNActionPerformed
        if(btnBuscarN.isSelected()){
            lbModelo.setText("Filtrar:");
            txtModelo.setEnabled(true);
            txtModelo.requestFocusInWindow();
            Util.limpiarCampos(jPanel1);
            lbAnho.setText("Año:");
            txtAnho.setEnabled(false);
            lbCI.setText("Matricula:");
            ftxtChapa.setEnabled(false);
        }else{
            lbModelo.setText("Modelo:");
            txtModelo.setEnabled(false);
            cargarTabla("SELECT ve FROM Vehiculo ve ORDER BY ve.matricula");
        }
    }//GEN-LAST:event_btnBuscarNActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
        Util.soloNumeros(txtCI);

    }//GEN-LAST:event_txtCIKeyTyped

    private void txtCIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnBuscarN.setSelected(false);
        lbModelo.setText("Nombre:");
        Util.limpiarCampos(jPanel1);
        txtModelo.setEnabled(false);
        txtAnho.setEnabled(false);
        txtCapacidad.setEnabled(false);
        btnChofer.setEnabled(false);
        ftxtChapa.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        tabla.setEnabled(true);
        cargarTabla("SELECT ve FROM Vehiculo ve ORDER BY ve.matricula");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Vehiculo veh;

        if(txtModelo.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar datos");
            txtModelo.requestFocusInWindow();
            return;
        }

        if(ftxtChapa.getText().trim().equals("-") ){
            JOptionPane.showMessageDialog(rootPane, "Revise datos");
            ftxtChapa.requestFocusInWindow();
            return;
        }

        if(txtAnho.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar datos");
            txtAnho.requestFocusInWindow();
            return;
        }
        
        if(txtCapacidad.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar datos");
            txtCapacidad.requestFocusInWindow();
            return;
        }

        if (flag){
            try{
                em.getTransaction().begin();
                veh = new Vehiculo(ftxtChapa.getText().trim(),txtModelo.getText().trim(), 
                        Integer.parseInt(txtAnho.getText().trim()),
                        Integer.parseInt(txtCapacidad.getText()));
                if(!txtChCI.getText().isEmpty()){
                    veh.setChofer(chof);
                }
                em.persist(veh);
                em.getTransaction().commit();
            }catch(EntityExistsException ex){
                JOptionPane.showMessageDialog(rootPane, "Ya se encuentra registrado");
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error al guardar" + e.getMessage());
            }
        }else{
            String id= ftxtChapa.getText();
            em.getTransaction().begin();
            veh = em.find(Vehiculo.class, id);
            veh.setModelo(txtModelo.getText().trim());
            veh.setAnho(Integer.parseInt(txtAnho.getText().trim()));
            veh.setCapacidad(Integer.parseInt(txtCapacidad.getText().trim()));
            if(!txtChCI.getText().isEmpty()){
                    veh.setChofer(chof);
            }            
            em.getTransaction().commit();
        }
        cargarTabla("SELECT ve FROM Vehiculo ve ORDER BY ve.matricula");

        Util.limpiarCampos(jPanel1);
        txtModelo.setEnabled(false);
        txtAnho.setEnabled(false);
        ftxtChapa.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnChofer.setEnabled(false);
        btnEliminar.setEnabled(false);
        tabla.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int resp = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el registro?", "Eliminar?", JOptionPane.YES_NO_OPTION);

        if(resp!=0){
            return;
        }
        String id = ftxtChapa.getText();
        Vehiculo ve = em.find(Vehiculo.class, id);
        em.getTransaction().begin();
        em.remove(ve);
        em.getTransaction().commit();
        Util.limpiarCampos(jPanel1);
        btnEditar.setEnabled(false);
        btnChofer.setEnabled(false);
        btnEliminar.setEnabled(false);
        cargarTabla("SELECT ve FROM Vehiculo ve ORDER BY ve.matricula");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        flag= false;
        txtModelo.setEnabled(true);
        txtAnho.setEnabled(true);
        txtCapacidad.setEnabled(true);
        txtModelo.requestFocusInWindow();
        tabla.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnChofer.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        flag= true;
        Util.limpiarCampos(jPanel1);
        txtModelo.setEnabled(true);
        ftxtChapa.setEnabled(true);
        txtAnho.setEnabled(true);
        txtCapacidad.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnChofer.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        tabla.setEnabled(false);
        ftxtChapa.requestFocusInWindow();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        //Util.soloLetras(txtModelo);
        if(btnBuscarN.isSelected()){
            cargarTabla("SELECT ve FROM Vehiculo ve WHERE ve.modelo LIKE '%" + txtModelo.getText().trim() + "%'");
        }
    }//GEN-LAST:event_txtModeloKeyTyped

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        try {
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            ftxtChapa.setText(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
            txtModelo.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
            txtAnho.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            txtCapacidad.setText(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
            btnBuscarN.setSelected(false);
            btnBuscarA.setSelected(false);
            btnBuscarCI.setSelected(false);
            chof = devChofer(ftxtChapa.getText());
            if(chof!=null){
               txtChNom.setText(chof.getNombre() +" "+ chof.getApellido());
               txtChCI.setText(String.valueOf(chof.getCi()));
            }else{
                txtChNom.setText("");
                txtChCI.setText("");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al mostrar datos \n" + ex.getMessage() );
        }
    }//GEN-LAST:event_tablaMousePressed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void btnChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoferActionPerformed
        new frmChoferes(txtChNom, txtChCI).setVisible(true);
    }//GEN-LAST:event_btnChoferActionPerformed

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
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscarA;
    private javax.swing.JToggleButton btnBuscarCI;
    private javax.swing.JToggleButton btnBuscarN;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnChofer;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JFormattedTextField ftxtChapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAnho;
    private javax.swing.JLabel lbCI;
    private javax.swing.JLabel lbCapacidad;
    private javax.swing.JLabel lbChofer;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtAnho;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtChCI;
    private javax.swing.JTextField txtChNom;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla(String jpql) {
    
       String [] titulos = {"Matrícula","Modelo", "Año", "Capacidad", "Chofer"} ;
       mtbl= null;
       mtbl= new DefaultTableModel(null, titulos);
        TypedQuery<Vehiculo> q1 = em.createQuery(jpql, Vehiculo.class);
        List<Vehiculo> results = q1.getResultList();
        //System.out.println( results.toString());
        String[] fila= new String[5];
        for(Vehiculo v: results){
         fila[0]= v.getMatricula();
         fila[1]= v.getModelo();
         fila[2]= String.valueOf(v.getAnho());
         fila[3]= String.valueOf(v.getCapacidad());
         if(v.getChofer()==null){
            fila[4]="No asignado";
         }
         else{
            fila[4]= v.getChofer().getNombre() +" "+ v.getChofer().getApellido();
         }
         mtbl.addRow(fila);
        }
       tabla.setModel(mtbl);
    
    }
    
    private Chofer devChofer(String matric){
        Vehiculo ve= em.find(Vehiculo.class, matric);
        Chofer ch= ve.getChofer();
        return ch;
    }
}
