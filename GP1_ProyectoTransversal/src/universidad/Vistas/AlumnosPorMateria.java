package universidad.Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.AlumnoData;
import universidad.AccesoADatos.InscripcionData;
import universidad.AccesoADatos.MateriaData;
import universidad.Entidades.Alumno;
import universidad.Entidades.Materia;

public class AlumnosPorMateria extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo= new DefaultTableModel();
    private AlumnoData aluData=new AlumnoData(); 
    private MateriaData matData=new MateriaData();
    private InscripcionData inscData=new InscripcionData();
    private ArrayList<Alumno> listaA;
    private ArrayList<Materia> listaM=(ArrayList)matData.listarMaterias();
    
    public AlumnosPorMateria() {
       initComponents();
       cargarAlumnos();  
       armarCabecera(); 
       cargarDatos();            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRotulo = new javax.swing.JLabel();
        jSTabla = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbSalir = new javax.swing.JButton();
        jcMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLRotulo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(480, 600));

        jLRotulo.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRotulo.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo.setText("Listado de Alumnos");
        jLRotulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSTabla.setBackground(new java.awt.Color(0, 47, 78));

        jtAlumnos.setBackground(new java.awt.Color(255, 102, 102));
        jtAlumnos.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtAlumnos.setForeground(new java.awt.Color(0, 0, 0));
        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAlumnos.setToolTipText("Listado de Materias");
        jtAlumnos.setEnabled(false);
        jtAlumnos.setFillsViewportHeight(true);
        jtAlumnos.setGridColor(new java.awt.Color(0, 47, 78));
        jtAlumnos.setSelectionForeground(new java.awt.Color(204, 0, 153));
        jtAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtAlumnos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtAlumnosFocusGained(evt);
            }
        });
        jtAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlumnosMouseClicked(evt);
            }
        });
        jtAlumnos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtAlumnosPropertyChange(evt);
            }
        });
        jSTabla.setViewportView(jtAlumnos);

        jbSalir.setBackground(new java.awt.Color(255, 102, 102));
        jbSalir.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/salida30.gif"))); // NOI18N
        jbSalir.setToolTipText("Salir");
        jbSalir.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbSalir.setMaximumSize(new java.awt.Dimension(81, 24));
        jbSalir.setMinimumSize(new java.awt.Dimension(81, 24));
        jbSalir.setName(""); // NOI18N
        jbSalir.setPreferredSize(new java.awt.Dimension(81, 28));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcMateria.setBackground(new java.awt.Color(0, 51, 102));
        jcMateria.setEditable(true);
        jcMateria.setMinimumSize(new java.awt.Dimension(25, 25));
        jcMateria.setPreferredSize(new java.awt.Dimension(25, 25));
        jcMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcMateriaItemStateChanged(evt);
            }
        });
        jcMateria.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jcMateriaInputMethodTextChanged(evt);
            }
        });
        jcMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriaActionPerformed(evt);
            }
        });
        jcMateria.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcMateriaPropertyChange(evt);
            }
        });
        jcMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcMateriaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Seleccione una materia:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLRotulo1.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo1.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo1.setText("Alumnos por Materia");
        jLRotulo1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addComponent(jcMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLRotulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(76, Short.MAX_VALUE)
                    .addComponent(jLRotulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(jLRotulo)
                .addGap(18, 18, 18)
                .addComponent(jSTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLRotulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );

        setBounds(3, 30, 480, 535);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnosMouseClicked

    }//GEN-LAST:event_jtAlumnosMouseClicked

    private void jtAlumnosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAlumnosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAlumnosFocusGained

    private void jcMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriaActionPerformed
        // TODO add your handling code here:
        cargarDatos();
    }//GEN-LAST:event_jcMateriaActionPerformed

    private void jcMateriaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcMateriaPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jcMateriaPropertyChange

    private void jcMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMateriaItemStateChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jcMateriaItemStateChanged

    private void jcMateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcMateriaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jcMateriaKeyPressed

    private void jcMateriaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jcMateriaInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcMateriaInputMethodTextChanged

    private void jtAlumnosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtAlumnosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAlumnosPropertyChange
    
    private void armarCabecera(){     
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jtAlumnos.setModel(modelo);
    }

    private void cargarAlumnos(){
        for (Materia item:listaM){
            jcMateria.addItem(item);
        }
    }
    
    private void cargarDatos(){
        int filas=modelo.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            modelo.removeRow(f);
        }        
        Materia selec=(Materia)jcMateria.getSelectedItem();
        listaA=(ArrayList)inscData.obtenerAlumnosPorMateria(selec.getIdMateria());
        for (Alumno insc : listaA) {
            modelo.addRow(new Object[]{insc.getIdAlumno(),insc.getDni(), insc.getApellido(), insc.getNombre()});          
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLRotulo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jSTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcMateria;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
}
