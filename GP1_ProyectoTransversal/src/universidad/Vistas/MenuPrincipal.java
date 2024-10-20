
package universidad.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import universidad.AccesoADatos.Conexion;

public class MenuPrincipal extends javax.swing.JFrame {


    public MenuPrincipal() {
        initComponents();
        Connection con=Conexion.getConexion();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        ImageIcon icono=new ImageIcon(getClass().getResource("/universidad/recursos/gestionULP.jpg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumnos = new javax.swing.JMenu();
        MenuAlu1 = new javax.swing.JMenuItem();
        jmMaterias = new javax.swing.JMenu();
        MenuMat1 = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        MenuAd1 = new javax.swing.JMenuItem();
        MenuAd2 = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        MenuCon1 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Universidad ULP");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(485, 700));
        setPreferredSize(new java.awt.Dimension(485, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(485, 600));
        setType(java.awt.Window.Type.UTILITY);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setName(""); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(500, 900));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jmAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        jmAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/alumno.png"))); // NOI18N
        jmAlumnos.setToolTipText("Alumnos");
        jmAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmAlumnos.setMaximumSize(new java.awt.Dimension(95, 69));
        jmAlumnos.setMinimumSize(new java.awt.Dimension(95, 69));
        jmAlumnos.setName(""); // NOI18N
        jmAlumnos.setPreferredSize(new java.awt.Dimension(95, 69));
        jmAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosActionPerformed(evt);
            }
        });

        MenuAlu1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAlu1.setBackground(new java.awt.Color(0, 102, 153));
        MenuAlu1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuAlu1.setText("Formulario de Alumno");
        MenuAlu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlu1ActionPerformed(evt);
            }
        });
        jmAlumnos.add(MenuAlu1);

        jMenuBar1.add(jmAlumnos);

        jmMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/materia.png"))); // NOI18N
        jmMaterias.setToolTipText("Materias");
        jmMaterias.setMaximumSize(new java.awt.Dimension(95, 69));
        jmMaterias.setOpaque(false);
        jmMaterias.setPreferredSize(new java.awt.Dimension(95, 69));

        MenuMat1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuMat1.setBackground(new java.awt.Color(0, 102, 153));
        MenuMat1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuMat1.setText("Formulario de Materia");
        MenuMat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMat1ActionPerformed(evt);
            }
        });
        jmMaterias.add(MenuMat1);

        jMenuBar1.add(jmMaterias);

        jmAdministracion.setBackground(new java.awt.Color(255, 255, 255));
        jmAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/administracion.png"))); // NOI18N
        jmAdministracion.setToolTipText("Administración");
        jmAdministracion.setMaximumSize(new java.awt.Dimension(95, 69));
        jmAdministracion.setName(""); // NOI18N
        jmAdministracion.setPreferredSize(new java.awt.Dimension(95, 69));

        MenuAd1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAd1.setBackground(new java.awt.Color(0, 102, 153));
        MenuAd1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuAd1.setText("Manejo de Inscripciones");
        MenuAd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAd1ActionPerformed(evt);
            }
        });
        jmAdministracion.add(MenuAd1);

        MenuAd2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAd2.setBackground(new java.awt.Color(0, 102, 153));
        MenuAd2.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuAd2.setText("Manipulacion de Notas");
        MenuAd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAd2ActionPerformed(evt);
            }
        });
        jmAdministracion.add(MenuAd2);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setBackground(new java.awt.Color(255, 255, 255));
        jmConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/reporte.png"))); // NOI18N
        jmConsultas.setToolTipText("Consultas");
        jmConsultas.setMaximumSize(new java.awt.Dimension(95, 69));
        jmConsultas.setPreferredSize(new java.awt.Dimension(95, 69));

        MenuCon1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuCon1.setBackground(new java.awt.Color(0, 102, 153));
        MenuCon1.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        MenuCon1.setText("Alumnos por materia");
        jmConsultas.add(MenuCon1);

        jMenuBar1.add(jmConsultas);

        jmSalir.setBackground(new java.awt.Color(255, 255, 255));
        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/exit.png"))); // NOI18N
        jmSalir.setToolTipText("Salir");
        jmSalir.setMaximumSize(new java.awt.Dimension(95, 69));
        jmSalir.setName(""); // NOI18N
        jmSalir.setPreferredSize(new java.awt.Dimension(95, 69));
        jmSalir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmSalirMenuSelected(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Base de datos de la Universidad de la Punta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAlu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlu1ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnos fi=new FormularioAlumnos();
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_MenuAlu1ActionPerformed

    private void jmAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmAlumnosActionPerformed

    private void MenuAd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAd1ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ManejoInscripcion fi=new ManejoInscripcion();
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_MenuAd1ActionPerformed

    private void MenuAd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAd2ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        CargaNotas fi=new CargaNotas();
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_MenuAd2ActionPerformed

    private void MenuMat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMat1ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMaterias fi=new FormularioMaterias();
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_MenuMat1ActionPerformed

    private void jmSalirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmSalirMenuSelected
        // TODO add your handling code here:
        int resp= JOptionPane.showConfirmDialog(this, "¿Esta seguro de abandonar la aplicacion?","Confirmando",JOptionPane.YES_NO_OPTION);
        if (resp==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jmSalirMenuSelected

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAd1;
    private javax.swing.JMenuItem MenuAd2;
    private javax.swing.JMenuItem MenuAlu1;
    private javax.swing.JMenuItem MenuCon1;
    private javax.swing.JMenuItem MenuMat1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
