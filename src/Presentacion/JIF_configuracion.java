/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ControladorProperties;
import Logica.fabricaElGuardian;
import Logica.hiloHijo;
import Logica.utilidades;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jp
 */
public class JIF_configuracion extends javax.swing.JInternalFrame {

    private JFileChooser jF;
    ControladorProperties contProp = ControladorProperties.getInstance();
    HashMap<String, String> diccionarioPropiedades = new HashMap<>();
    utilidades util = utilidades.getInstance();
    fabricaElGuardian fabrica = fabricaElGuardian.getInstance();
    public HashMap<String, String> getDiccionarioPropiedades() {
        return diccionarioPropiedades;
    }

    public void setDiccionarioPropiedades(HashMap<String, String> diccionarioPropiedades) {
        this.diccionarioPropiedades = diccionarioPropiedades;
    }

    /**
     * Creates new form JIF_configuracion
     */
    public JIF_configuracion() {
        initComponents();
        cargarPropiedades();
        jtxt_rutaImgMascota.setEditable(false);
        jtxt_rutaImgProducto.setEditable(false);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_rutaMascota = new javax.swing.JButton();
        jtxt_NumPuerto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxt_rutaImgMascota = new javax.swing.JTextField();
        jtxt_rutaImgProducto = new javax.swing.JTextField();
        btn_rutaProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxt_correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_contraseña = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        jLabel1.setText("Direccion Ip");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Puerto");

        btn_rutaMascota.setText("Cambiar");
        btn_rutaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rutaMascotaActionPerformed(evt);
            }
        });

        jtxt_NumPuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_NumPuertoKeyTyped(evt);
            }
        });

        jLabel3.setText("Ruta Img Mascota");

        jLabel4.setText("Ruta Img Producto");

        jtxt_rutaImgProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutaImgProductoActionPerformed(evt);
            }
        });

        btn_rutaProducto.setText("Cambiar");
        btn_rutaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rutaProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("Correo");

        jLabel6.setText("Contraseña");

        jtxt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_contraseñaActionPerformed(evt);
            }
        });

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_contraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_NumPuerto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_rutaImgMascota, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_rutaImgProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_correo))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_rutaProducto)
                            .addComponent(btn_rutaMascota)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btn_cancelar)
                        .addGap(32, 32, 32)
                        .addComponent(btn_aceptar)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_NumPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_rutaImgMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rutaMascota))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_rutaImgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rutaProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_aceptar))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rutaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rutaMascotaActionPerformed
        buscarImgMascota();
    }//GEN-LAST:event_btn_rutaMascotaActionPerformed

    private void jtxt_rutaImgProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutaImgProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_rutaImgProductoActionPerformed

    private void btn_rutaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rutaProductoActionPerformed
        buscarImgProduto();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_rutaProductoActionPerformed

    private void jtxt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_contraseñaActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        crearProperties();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jtxt_NumPuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_NumPuertoKeyTyped
        util.numerosYcomas(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_NumPuertoKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        util.numerosYcomas(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_rutaMascota;
    private javax.swing.JButton btn_rutaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtxt_NumPuerto;
    private javax.swing.JTextField jtxt_contraseña;
    private javax.swing.JTextField jtxt_correo;
    private javax.swing.JTextField jtxt_rutaImgMascota;
    private javax.swing.JTextField jtxt_rutaImgProducto;
    // End of variables declaration//GEN-END:variables

///////////////////////FUNCIONES
    private void cargarPropiedades() {
        this.setDiccionarioPropiedades(contProp.getConfigProp());

        String ip = diccionarioPropiedades.get("ip");
        String puerto = diccionarioPropiedades.get("puerto");
        String rutaMascota = diccionarioPropiedades.get("rutaImgMascota");
        String rutaProducto = diccionarioPropiedades.get("rutaImgProducto");
        String correo = diccionarioPropiedades.get("correo");
        String contrasenia = diccionarioPropiedades.get("contrasenia");

        if (!ip.equals("AUTO")) {
            jTextField1.setText(ip);
        } else {
            jTextField1.setText(util.getIpLocalHost());
        }
        jtxt_NumPuerto.setText(puerto);
        jtxt_rutaImgMascota.setText(rutaMascota);
        jtxt_rutaImgProducto.setText(rutaProducto);
        jtxt_correo.setText(correo);
        jtxt_contraseña.setText(contrasenia);

    }

    private void buscarImgMascota() {
        jF.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jF.showOpenDialog(this);
        jtxt_rutaImgMascota.setText(jF.getSelectedFile().getPath());
    }

    private void buscarImgProduto() {
        jF.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jF.showOpenDialog(this);
        jtxt_rutaImgProducto.setText(jF.getSelectedFile().getPath());
    }

    private void crearProperties() {
        if (JOptionPane.showConfirmDialog(this, "Desea modificar la configuracion?") == 0) {
            if (validaDatos()) {
                if (!verificarDatos()) {
                    if (contProp.recibeDiccPropiedades(diccionarioPropiedades)) {
                        JOptionPane.showMessageDialog(this, "Se ha modificado la configuracion!");
                        cargarPropiedades();
                        fabrica.reload();
                    } else {
                        JOptionPane.showMessageDialog(this, "Ocurrio un error al modificar la configuracion!");
                    }
                }
            }
        }
    }

    private boolean validaDatos() {

        if (jTextField1.getText().isEmpty()) {
            int res = JOptionPane.showConfirmDialog(this, "Si no ingresa una direccion Ip el programa tomara la por defecto de la maquina, desea ingresar una direccion?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
                jTextField1.requestFocus();
                return false;
            }
            if (res == 1) {
                jTextField1.setText(util.getIpLocalHost());
            }
        }
        if (jtxt_NumPuerto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de puerto!");
            jtxt_NumPuerto.requestFocus();
            return false;
        }
        if (jtxt_rutaImgMascota.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una ruta para las imagenes de las mascotas!");
            btn_rutaMascota.requestFocus();
            return false;
        }
        if (jtxt_rutaImgProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una ruta para las imagenes de los productos!");
            return false;
        }
        if (jtxt_correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un correo!");
            jtxt_correo.requestFocus();
            return false;
        }
        if (jtxt_correo.getText().length() > 5) {
            if (!util.emailValido(jtxt_correo.getText())) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un correo valido!");
                jtxt_correo.requestFocus();
                jtxt_correo.selectAll();
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un correo valido!");
            jtxt_correo.requestFocus();
            jtxt_correo.selectAll();
            return false;
        }
        if (jtxt_contraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una contraseña valida!");
            jtxt_contraseña.requestFocus();
            return false;
        }
        if (jtxt_contraseña.getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una contrasña valida!");
            jtxt_contraseña.requestFocus();
            jtxt_contraseña.selectAll();
            return false;
        }
        return true;
    }

    private boolean verificarDatos() {
        boolean retorno = true;
        if (!verficaCambio("ip", jTextField1.getText())) {
            diccionarioPropiedades.replace("ip", jTextField1.getText());
            retorno = false;
        }
        if (!verficaCambio("puerto", jtxt_NumPuerto.getText())) {
            diccionarioPropiedades.replace("puerto", jtxt_NumPuerto.getText());
            retorno = false;
        }
        if (!verficaCambio("rutaImgMascota", jtxt_rutaImgMascota.getText())) {
            diccionarioPropiedades.replace("rutaImgMascota", jtxt_rutaImgMascota.getText());
            retorno = false;
        }
        if (!verficaCambio("rutaImgProducto", jtxt_rutaImgProducto.getText())) {
            diccionarioPropiedades.replace("rutaImgProducto", jtxt_rutaImgProducto.getText());
            retorno = false;
        }
        if (!verficaCambio("correo", jtxt_correo.getText())) {
            diccionarioPropiedades.replace("correo", jtxt_correo.getText());
            retorno = false;
        }
        if (!verficaCambio("contrasenia", jtxt_contraseña.getText())) {
            diccionarioPropiedades.replace("contrasenia", jtxt_contraseña.getText());
            retorno = false;
        }
        return retorno;
    }

    

    private boolean verficaCambio(String key, String value) {
        System.out.println("verificaCambio...");
        String atri = (String) diccionarioPropiedades.get(key);
        return atri.equals(value);
    }
}