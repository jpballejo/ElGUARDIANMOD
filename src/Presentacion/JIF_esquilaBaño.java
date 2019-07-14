/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ControladorReservas;

import Logica.controladorServicios;
import Logica.tipoBanio;
import Logica.tipoEsquila;
import Logica.utilidades;
import Persistencia.persistencia;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jp
 */
public class JIF_esquilaBaño extends javax.swing.JInternalFrame {

    private Persistencia.persistencia per = persistencia.getInstance();
    private controladorServicios contSrv = controladorServicios.getInstance();
    private JDesktopPane padre = null;
    private ControladorReservas contRes = ControladorReservas.getInstance();
    private utilidades util = utilidades.getInstance();
    private long idTipBanio = 0;
    private long idTipEsquila = 0;

    /**
     * Creates new form JIF_esquilaBaño
     *
     * @param JDKP
     */
    public JIF_esquilaBaño(JDesktopPane JDKP) {
        initComponents();
        this.padre = JDKP;
        cargarServicios();
        iniciop();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab_banios = new javax.swing.JTable();
        btn_nuevoBanio = new javax.swing.JButton();
        btn_eliminarBanio = new javax.swing.JButton();
        btn_cancelarBanio = new javax.swing.JButton();
        jText_BuscarBanio = new javax.swing.JTextField();
        jLabBuscarBanio = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabelBuscarEsquila = new javax.swing.JLabel();
        jText_buscarEsquila = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab_esquila = new javax.swing.JTable();
        btn_nuevaEsquila = new javax.swing.JButton();
        btn_emilinarEsquila = new javax.swing.JButton();
        btn_cancelarEsquila = new javax.swing.JButton();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        precioMuestra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_precio = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        bnt_cancelar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        jTab_banios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTab_banios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTab_baniosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTab_banios);

        btn_nuevoBanio.setText("Nuevo");
        btn_nuevoBanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoBanioActionPerformed(evt);
            }
        });

        btn_eliminarBanio.setText("Eliminar");
        btn_eliminarBanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarBanioActionPerformed(evt);
            }
        });

        btn_cancelarBanio.setText("Cancelar");
        btn_cancelarBanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarBanioActionPerformed(evt);
            }
        });

        jLabBuscarBanio.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabBuscarBanio)
                        .addGap(26, 26, 26)
                        .addComponent(jText_BuscarBanio, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(btn_cancelarBanio))
                    .addComponent(btn_eliminarBanio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevoBanio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_BuscarBanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabBuscarBanio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevoBanio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminarBanio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelarBanio)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Baños", jInternalFrame1);

        jInternalFrame2.setVisible(true);

        jLabelBuscarEsquila.setText("Buscar");

        jTab_esquila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTab_esquila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTab_esquilaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTab_esquila);

        btn_nuevaEsquila.setText("Nueva");
        btn_nuevaEsquila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaEsquilaActionPerformed(evt);
            }
        });

        btn_emilinarEsquila.setText("Eliminar");
        btn_emilinarEsquila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emilinarEsquilaActionPerformed(evt);
            }
        });

        btn_cancelarEsquila.setText("Cancelar");
        btn_cancelarEsquila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarEsquilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelBuscarEsquila)
                        .addGap(26, 26, 26)
                        .addComponent(jText_buscarEsquila, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(btn_cancelarEsquila))
                    .addComponent(btn_emilinarEsquila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevaEsquila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_buscarEsquila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscarEsquila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_nuevaEsquila, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_emilinarEsquila, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelarEsquila)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Esquilas", jInternalFrame2);

        jInternalFrame3.setVisible(true);

        jLabel1.setText("Precio:");

        precioMuestra.setText("0000");

        jLabel2.setText("Precio Nuevo:");

        jtxt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_precioKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_precioKeyPressed(evt);
            }
        });

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        bnt_cancelar.setText("Cancelar");
        bnt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioMuestra))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btn_aceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnt_cancelar))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(precioMuestra))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(bnt_cancelar))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Paseo", jInternalFrame3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarBanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarBanioActionPerformed
        eliminarTipoBanio();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarBanioActionPerformed

    private void btn_nuevoBanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoBanioActionPerformed
        nuevoServicio(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoBanioActionPerformed

    private void btn_nuevaEsquilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaEsquilaActionPerformed
        nuevoServicio(1); // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaEsquilaActionPerformed

    private void btn_emilinarEsquilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emilinarEsquilaActionPerformed
        eliminarTipoEsquila();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_emilinarEsquilaActionPerformed

    private void btn_cancelarBanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBanioActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarBanioActionPerformed

    private void jTab_baniosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTab_baniosMouseClicked
        int rowAtPoint = jTab_banios.rowAtPoint(evt.getPoint()); // TODO add your handling code here:
        this.idTipBanio = (Long) jTab_banios.getValueAt(rowAtPoint, 0);

    }//GEN-LAST:event_jTab_baniosMouseClicked

    private void btn_cancelarEsquilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarEsquilaActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarEsquilaActionPerformed

    private void jTab_esquilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTab_esquilaMouseClicked
        int row = jTab_esquila.rowAtPoint(evt.getPoint());
        this.idTipEsquila = (Long) jTab_esquila.getValueAt(row, 0);
// TODO add your handling code here:
    }//GEN-LAST:event_jTab_esquilaMouseClicked

    private void jtxt_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_precioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_precioKeyPressed

    private void jtxt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_precioKeyTyped
        util.numerosYcomas(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_precioKeyTyped

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        agregarPrecio();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void bnt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_cancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bnt_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_cancelar;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelarBanio;
    private javax.swing.JButton btn_cancelarEsquila;
    private javax.swing.JButton btn_eliminarBanio;
    private javax.swing.JButton btn_emilinarEsquila;
    private javax.swing.JButton btn_nuevaEsquila;
    private javax.swing.JButton btn_nuevoBanio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabBuscarBanio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBuscarEsquila;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTab_banios;
    private javax.swing.JTable jTab_esquila;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jText_BuscarBanio;
    private javax.swing.JTextField jText_buscarEsquila;
    private javax.swing.JTextField jtxt_precio;
    private javax.swing.JLabel precioMuestra;
    // End of variables declaration//GEN-END:variables

    private void nuevoServicio(int ser) {
        System.out.println("NUEVO SERVICIO INICIO...");
        JIF_ingresoDatosServicio ingDS = new JIF_ingresoDatosServicio(ser, this.padre);
        this.padre.add(ingDS);
        ingDS.setVisible(true);

        System.out.println("NUEVO SERVICIO FIN...");
    }

    public void cargarServicios() {
        inicializarTablas();
        cargarBanio();
        cargarEsquila();

    }

    private void cargarBanio() {
        List<tipoBanio> tipBanio = (List<tipoBanio>) this.contRes.getTipoBanios();
        if (tipBanio.size() > 0) {
            String[] cabeceras = util.cabeceras(tipBanio.get(0));
            DefaultTableModel dtm = new DefaultTableModel(cabeceras, 0);
            for (tipoBanio tpB : tipBanio) {
                Object[] data = {tpB.getId(), tpB.getTipoBanio(), tpB.getDescripcion(), tpB.getPrecio()};
                dtm.addRow(data);

            }

            jTab_banios.setModel(dtm);
        } else {
            JOptionPane.showMessageDialog(this, "No existen Tipos de Baños en el sistema!");
            jTab_banios.setModel(new DefaultTableModel(0, 0));
            jTab_banios.setEnabled(false);
        }
    }

    private void cargarEsquila() {
        List<tipoEsquila> tipEsq = (List<tipoEsquila>) this.contRes.getTipoEsquila();
        if (tipEsq.size() > 0) {
            String[] cabeceras = util.cabeceras(tipEsq.get(0));
            DefaultTableModel dtm = new DefaultTableModel(cabeceras, 0);
            for (tipoEsquila te : tipEsq) {
                Object[] data = {te.getId(), te.getTipoEsquila(), te.getDescripcion(), te.getPrecio()};
                dtm.addRow(data);

            }
            jTab_esquila.setModel(dtm);
        } else {
            JOptionPane.showMessageDialog(this, "No existen Tipos de Esquilas en el sistema!");
            jTab_esquila.setModel(new DefaultTableModel(0, 0));
            jTab_esquila.setEnabled(false);
        }
    }

    private void eliminarTipoBanio() {
        if (this.idTipBanio != 0) {
            int re = JOptionPane.showConfirmDialog(this, "Desea eliminar el Tipo de Baño: " + this.idTipBanio);
            if (re == 0) {
                if (contRes.eliminarBanio(this.idTipBanio)) {
                    JOptionPane.showMessageDialog(this, "Se ha eliminado el Tipo de Baño del sistema!");
                    cargarServicios();
                    this.idTipBanio = 0;
                    contSrv.cargarTiposServicios();
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrio un problema al eliminar el Tipo de Baño!", "Error al eliminar", ERROR);
                    cargarServicios();
                    this.idTipBanio = 0;
                }

            }
        }

    }

    private void eliminarTipoEsquila() {
        if (this.idTipEsquila != 0) {
            int res = JOptionPane.showConfirmDialog(this, "Desea eliminar el Tipo de Esquila: " + this.idTipEsquila);
            if (res == 0) {
                if (contRes.eliminarEsquila(this.idTipEsquila)) {
                    JOptionPane.showMessageDialog(this, "Se ha eliminado el Tipo de Esquila del sistema!");
                    cargarServicios();
                    this.idTipEsquila = 0;
                    contSrv.cargarTiposServicios();
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrio un problema al eliminar el Tipo de Esquila!", "Error al eliminar", ERROR);

                    cargarServicios();
                    this.idTipBanio = 0;
                }
            }
        }
    }

    private void inicializarTablas() {
        jTab_banios.setModel(new DefaultTableModel(0, 0));
        jTab_esquila.setModel(new DefaultTableModel(0, 0));
        jTab_banios.setEnabled(true);
        jTab_esquila.setEnabled(true);
    }

    private void agregarPrecio() {
        int res = JOptionPane.showConfirmDialog(this, "Desea agregar el nuevo precio?");
        if (res == 0) {
String a =jtxt_precio.getText();
            if (contSrv.setPrecioPaseo(Float.valueOf(jtxt_precio.getText()))) {
                JOptionPane.showMessageDialog(this, "Se ha cambiado el precio de los paseos!");

                iniciop();
            }
        }
    }

    private void iniciop() {
        jtxt_precio.setText(null);
        float precio = 0;
        precio = contSrv.getPrecioPaseo();
        if (precio > 0) {
            precioMuestra.setText(String.valueOf(precio));

        }
    }
}
