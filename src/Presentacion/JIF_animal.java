 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.controladorCliente;
import Logica.fabricaElGuardian;
import Logica.mascota;
import Logica.utilidades;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jp
 */
public class JIF_animal extends javax.swing.JInternalFrame {

    Long idMascota = null;
    private final JDesktopPane escritorio;
    controladorCliente contCliente = (controladorCliente) fabricaElGuardian.getInstance().getInstanceIControladorCliente();
    String rutaFoto = contCliente.getRutaFotoImagenesMascotaLevantar();
    utilidades util = utilidades.getInstance();

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    /**
     * Creates new form JIF_animal
     */
    JIF_animal(JDesktopPane escritorioPrincipal) {
        initComponents();
        this.escritorio = escritorioPrincipal;
        cargarMascotas();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab_Animal = new javax.swing.JTable();
        jT_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLab_foto = new javax.swing.JLabel();

        jTab_Animal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab_Animal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTab_AnimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTab_Animal);

        jT_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT_buscarKeyTyped(evt);
            }
        });

        jLabel1.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jT_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cerrar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLab_foto.setText("Foto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLab_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLab_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_cancelar)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        this.setVisible(false);
        JIF_animalAlta animalAlta = new JIF_animalAlta(this.escritorio);
        escritorio.add(animalAlta);
        animalAlta.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jTab_AnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTab_AnimalMouseClicked
        int rowAtPoint = jTab_Animal.rowAtPoint(evt.getPoint()); // TODO add your handling code here:
        this.idMascota = (Long) jTab_Animal.getValueAt(rowAtPoint, 0);
        cargarFoto(idMascota);
    }//GEN-LAST:event_jTab_AnimalMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (this.idMascota != null) {
            int res = JOptionPane.showConfirmDialog(this, "Desea modificar la informacion de la Mascota: " + idMascota + "?");
            if (res == 0) {
                JIF_animalModificar animalModificar = new JIF_animalModificar(this.idMascota, this.escritorio);
                escritorio.add(animalModificar);
                animalModificar.setVisible(true);
                this.setVisible(false);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminar();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void jT_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_buscarKeyTyped
        util.filtrarTabla(jT_buscar.getText(), jTab_Animal);        // TODO add your handling code here:
    }//GEN-LAST:event_jT_buscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLab_foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_buscar;
    private javax.swing.JTable jTab_Animal;
    // End of variables declaration//GEN-END:variables

    public void cargarMascotas() {
        ArrayList<mascota> mascotasSis = (ArrayList<mascota>) contCliente.getMascotas();
        if (mascotasSis.size() > 0) {
            String[] cabeceras = (String[]) util.cabeceras((mascota) mascotasSis.get(0));
            DefaultTableModel dtm = new DefaultTableModel(cabeceras, 0);
            for (mascota m : mascotasSis) {
                Object[] objdata = {m.getId(), m.getNombre(), m.getRaza().getRaza(), m.getCliente().getCedula() + " " + m.getCliente().getNombre() + " " + m.getCliente().getApellido(), m.getDescripcion(),};
                dtm.addRow(objdata);
            }
            //jTab_Animal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            jTab_Animal.setModel(dtm);
            //util.resizeColumnWidth(jTab_Animal);
        } else {
            JOptionPane.showMessageDialog(this, "No existen mascotas en el sistema!");
            jTab_Animal.setEnabled(false);
        }
    }

    private void eliminar() {
        if (this.idMascota != null) {
            if (JOptionPane.showConfirmDialog(this, "Desea eliminar la Mascota: " + this.idMascota + "?") == 0) {
                if (contCliente.eliminarAnimal(this.idMascota)) {
                    JOptionPane.showMessageDialog(this, "Se ha eliminado la mascota!");
                    //cargarMascotas();
                   this.idMascota = null;
                    this.setVisible(false);
                    JIF_animal ja=new JIF_animal(escritorio);
                    this.escritorio.add(ja);
                    ja.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrio un problema al eliminar la mascota!");
                    cargarMascotas();
                    this.idMascota = null;
                }
            }

        }
    }

    private void cargarFoto(Long idMascota) {
        mascota mascota = (mascota) contCliente.getMascota(idMascota);
        if (!mascota.getFoto().equals("N/A")) {
            BufferedImage image = (BufferedImage) util.dameEstaImagen(rutaFoto + mascota.getFoto());
            jLab_foto.setIcon(new ImageIcon(mascota.getFoto()));
            Image scaledInstance = image.getScaledInstance(200, 180, Image.SCALE_DEFAULT);
            jLab_foto.setIcon(new ImageIcon(scaledInstance));
        }

    }
    
    

}
