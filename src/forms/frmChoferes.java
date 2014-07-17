
package forms;

import clasesUtiles.ModeloTabla;
import clasesUtiles.Util;
import entidades.Chofer;
import entidades.Ciudad;
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


public class frmChoferes extends javax.swing.JFrame {

    EntityManagerFactory emf;
    EntityManager em;
    boolean flag;
    DefaultTableModel mtbl;
    String cadena;
    
    public frmChoferes() {
        initComponents();
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em = emf.createEntityManager();
        cargarTabla("SELECT ch FROM Chofer ch ORDER BY ch.apellido");
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
        txtNombre = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
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
        lbApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnBuscarA = new javax.swing.JToggleButton();
        btnBuscarCI = new javax.swing.JToggleButton();
        lbComentario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choferes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Choferes");

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

        txtNombre.setEnabled(false);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lbNombre.setText("Nombres");

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

        lbCI.setText("C.I.:");

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

        btnBuscarN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewmag.png"))); // NOI18N
        btnBuscarN.setToolTipText("Buscar");
        btnBuscarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNActionPerformed(evt);
            }
        });

        lbApellido.setText("Apellidos");

        txtApellido.setEnabled(false);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        btnBuscarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewmag.png"))); // NOI18N
        btnBuscarA.setToolTipText("Buscar");
        btnBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAActionPerformed(evt);
            }
        });

        btnBuscarCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewmag.png"))); // NOI18N
        btnBuscarCI.setToolTipText("Buscar");
        btnBuscarCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCIActionPerformed(evt);
            }
        });

        lbComentario.setText("Buscar CI");
        lbComentario.setEnabled(false);
        lbComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbComentarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNombre)
                                    .addComponent(lbCI))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(txtCI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscarCI, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComentario))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbApellido)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCI)
                                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbComentario)
                                .addGap(0, 14, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbNombre)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbApellido)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addGap(12, 12, 12)
                                .addComponent(btnEliminar)
                                .addGap(64, 64, 64)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCerrar))
                            .addComponent(btnBuscarCI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        flag= true;
        Util.limpiarCampos(jPanel1);
        txtNombre.setEnabled(true);
        txtCI.setEnabled(true);
        txtApellido.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        tabla.setEnabled(false);
        txtCI.requestFocusInWindow();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnBuscarN.setSelected(false);
        lbNombre.setText("Nombre:");
        Util.limpiarCampos(jPanel1);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtCI.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);    
        tabla.setEnabled(true);
        cargarTabla("SELECT ch FROM Chofer ch");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        Chofer ch;
        
        if(txtNombre.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar datos");
            txtNombre.requestFocusInWindow();
            return;
        }
        
        if(txtCI.getText().trim().equals("") || Integer.parseInt(txtCI.getText().trim()) > 9999999){
            JOptionPane.showMessageDialog(rootPane, "Revise datos");
            txtCI.requestFocusInWindow();
            return;
        }        
        
        if(txtApellido.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar datos");
            txtApellido.requestFocusInWindow();
            return;
        }        
        
        if (flag){
            try{
                em.getTransaction().begin();
                ch = new Chofer(Integer.parseInt(txtCI.getText().trim()),txtNombre.getText().trim(), txtApellido.getText().trim());
                em.persist(ch);
                em.getTransaction().commit();            
            }catch(EntityExistsException ex){
                JOptionPane.showMessageDialog(rootPane, "Ya se encuentra registrado");
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Ya se encuentra registrado" + e.getMessage());
            }    
        }else{
            int id= Integer.parseInt(txtCI.getText());
            em.getTransaction().begin();
            ch = em.find(Chofer.class, id);
            ch.setNombre(txtNombre.getText().trim());
            ch.setApellido(txtApellido.getText().trim());
            em.getTransaction().commit();
        }
        cargarTabla("SELECT ch FROM Chofer ch ORDER BY ch.apellido");        
        
        Util.limpiarCampos(jPanel1);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtCI.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        tabla.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
           try {
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            txtCI.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            txtNombre.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
            txtApellido.setText(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
            btnBuscarN.setSelected(false);
            btnBuscarA.setSelected(false);
            btnBuscarCI.setSelected(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al mostrar datos \n" + ex.getMessage() );
        } 
    }//GEN-LAST:event_tablaMousePressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Util.soloLetras(txtNombre);
        if(btnBuscarN.isSelected()){
            cargarTabla("SELECT ch FROM Chofer ch WHERE ch.nombre LIKE '%" + txtNombre.getText().trim() + "%'");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        flag= false;
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtNombre.requestFocusInWindow();
        tabla.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int resp = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el registro?", "Eliminar?", JOptionPane.YES_NO_OPTION);
        
        if(resp!=0){
            return;
        }
        int id = Integer.parseInt(txtCI.getText()) ;
        Chofer ch = em.find(Chofer.class, id);
        em.getTransaction().begin();
        em.remove(ch);
        em.getTransaction().commit();
        Util.limpiarCampos(jPanel1);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        cargarTabla("SELECT ch FROM Chofer ch ORDER BY ch.apellido");        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNActionPerformed
       if(btnBuscarN.isSelected()){
            lbNombre.setText("Filtrar:");
            txtNombre.setEnabled(true);
            txtNombre.requestFocusInWindow();
            Util.limpiarCampos(jPanel1);
            lbApellido.setText("Apellido:");
            txtApellido.setEnabled(false);
            lbCI.setText("CI:");
            txtCI.setEnabled(false);
       }else{
            lbNombre.setText("Nombre:");
            txtNombre.setEnabled(false);           
            cargarTabla("SELECT ch FROM Chofer ch ORDER BY ch.apellido");
       }
    }//GEN-LAST:event_btnBuscarNActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        Util.soloLetras(txtApellido);
        if(btnBuscarA.isSelected()){
            cargarTabla("SELECT ch FROM Chofer ch WHERE ch.apellido LIKE '%" + txtApellido.getText().trim() + "%'");
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void btnBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAActionPerformed
       if(btnBuscarA.isSelected()){
            lbApellido.setText("Filtrar:");
            txtApellido.setEnabled(true);
            txtApellido.requestFocusInWindow();
            Util.limpiarCampos(jPanel1);
            lbNombre.setText("Nombre:");
            txtNombre.setEnabled(false);
            lbCI.setText("CI:");
            txtCI.setEnabled(false);            
       }else{
            lbApellido.setText("Nombre:");
            txtApellido.setEnabled(false);           
            cargarTabla("SELECT ch FROM Chofer ch ORDER BY ch.apellido");
       }
    }//GEN-LAST:event_btnBuscarAActionPerformed

    private void btnBuscarCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCIActionPerformed
       if(btnBuscarCI.isSelected()){
            lbCI.setText("Filtrar:");
            txtCI.setEnabled(true);
            txtCI.requestFocusInWindow();
            Util.limpiarCampos(jPanel1);
            lbNombre.setText("Nombre:");
            txtNombre.setEnabled(false);
            lbApellido.setText("Apellido:");
            txtApellido.setEnabled(false);
            lbComentario.setEnabled(true);
       }else{
            lbApellido.setText("Apellido:");
            txtApellido.setEnabled(false);
            lbCI.setText("CI:");
            txtCI.setEnabled(false);
            txtCI.setText(null);
            lbComentario.setEnabled(false);
            cargarTabla("SELECT ch FROM Chofer ch ORDER BY ch.apellido");
       }
    }//GEN-LAST:event_btnBuscarCIActionPerformed

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
        Util.soloNumeros(txtCI);
        
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtCIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIKeyPressed

    private void lbComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbComentarioActionPerformed
        if(btnBuscarCI.isSelected()){
            cargarTabla("SELECT ch FROM Chofer ch WHERE ch.ci =" + txtCI.getText().trim());
        } 
    }//GEN-LAST:event_lbComentarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChoferes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscarA;
    private javax.swing.JToggleButton btnBuscarCI;
    private javax.swing.JToggleButton btnBuscarN;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCI;
    private javax.swing.JButton lbComentario;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla(String jpql) {
    
       String [] titulos = {"Apellido","Nombre", "CI Nº"} ;
       mtbl= null;
       mtbl= new DefaultTableModel(null, titulos);
        TypedQuery<Chofer> q1 = em.createQuery(jpql, Chofer.class);
        List<Chofer> results = q1.getResultList();
        //System.out.println( results.toString());
        String[] nombre= new String[3];
        for(Chofer c: results){
         nombre[0]= c.getApellido();
         nombre[1]= c.getNombre();
         nombre[2]= String.valueOf(c.getCi());
         mtbl.addRow(nombre);
        }
       tabla.setModel(mtbl);
    
    }
}