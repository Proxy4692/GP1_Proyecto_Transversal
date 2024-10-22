package universidad.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.AlumnoData;
import universidad.AccesoADatos.InscripcionData;
import universidad.Entidades.Alumno;
import universidad.Entidades.Inscripcion;

public class CargaNotas extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            if(columna==2){
                return true;
            }
            return false;
        }
    };
    private AlumnoData aluData=new AlumnoData(); 
    private InscripcionData inscData=new InscripcionData();
    private ArrayList<Inscripcion> listaI;
    private ArrayList<Alumno> listaA=(ArrayList)aluData.listarAlumnos();
    
    public CargaNotas() {
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
        jtNotas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jcAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLRotulo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(480, 600));

        jLRotulo.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLRotulo.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo.setText("Listado de Materias");
        jLRotulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSTabla.setBackground(new java.awt.Color(0, 47, 78));

        jtNotas.setBackground(new java.awt.Color(51, 0, 102));
        jtNotas.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNotas.setForeground(new java.awt.Color(0, 153, 153));
        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtNotas.setToolTipText("Listado de Notas");
        jtNotas.setFillsViewportHeight(true);
        jtNotas.setGridColor(new java.awt.Color(0, 47, 78));
        jtNotas.setSelectionForeground(new java.awt.Color(204, 0, 153));
        jtNotas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtNotas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtNotasFocusGained(evt);
            }
        });
        jtNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNotasMouseClicked(evt);
            }
        });
        jtNotas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtNotasPropertyChange(evt);
            }
        });
        jSTabla.setViewportView(jtNotas);

        jbSalir.setBackground(new java.awt.Color(51, 0, 102));
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

        jbGuardar.setBackground(new java.awt.Color(51, 0, 102));
        jbGuardar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/guardar30.gif"))); // NOI18N
        jbGuardar.setToolTipText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbGuardar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbGuardar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbGuardar.setName(""); // NOI18N
        jbGuardar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jcAlumno.setBackground(new java.awt.Color(0, 51, 102));
        jcAlumno.setEditable(true);
        jcAlumno.setMinimumSize(new java.awt.Dimension(25, 25));
        jcAlumno.setPreferredSize(new java.awt.Dimension(25, 25));
        jcAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcAlumnoItemStateChanged(evt);
            }
        });
        jcAlumno.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jcAlumnoInputMethodTextChanged(evt);
            }
        });
        jcAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnoActionPerformed(evt);
            }
        });
        jcAlumno.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcAlumnoPropertyChange(evt);
            }
        });
        jcAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcAlumnoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Seleccione un alumno:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLRotulo1.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo1.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo1.setText("Carga de Notas");
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
                                .addGap(0, 193, Short.MAX_VALUE)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jcAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLRotulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(jLRotulo)
                .addGap(18, 18, 18)
                .addComponent(jSTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
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

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
            int filaElegida=jtNotas.getSelectedRow();
            if(filaElegida!=-1){
                Alumno alu=(Alumno)jcAlumno.getSelectedItem();
                int idAlu=alu.getIdAlumno();
                System.out.println("idAlu"+idAlu);
                int idMat= (Integer)jtNotas.getValueAt(filaElegida, 0);
                System.out.println("idMat"+idMat);
                double nota= (Double)jtNotas.getValueAt(filaElegida, 2);
                System.out.println("nota"+nota);
                inscData.actualizarNota(idAlu, idMat, nota);
            }   
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"La nota debe ser un número entero o decimal");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNotasMouseClicked

    }//GEN-LAST:event_jtNotasMouseClicked

    private void jtNotasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNotasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNotasFocusGained

    private void jcAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnoActionPerformed
        // TODO add your handling code here:
        cargarDatos();
    }//GEN-LAST:event_jcAlumnoActionPerformed

    private void jcAlumnoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcAlumnoPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jcAlumnoPropertyChange

    private void jcAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcAlumnoItemStateChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jcAlumnoItemStateChanged

    private void jcAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcAlumnoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jcAlumnoKeyPressed

    private void jcAlumnoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jcAlumnoInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcAlumnoInputMethodTextChanged

    private void jtNotasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtNotasPropertyChange
        // TODO add your handling code here:
        jbGuardar.setEnabled(true);
    }//GEN-LAST:event_jtNotasPropertyChange
    
    private void armarCabecera(){     
        modelo.addColumn("código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jtNotas.setModel(modelo);
    }

    private void cargarAlumnos(){
        for (Alumno item:listaA){
            jcAlumno.addItem(item);
        }
    }
    
    private void cargarDatos(){
        int filas=modelo.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            modelo.removeRow(f);
        }        
        Alumno selec=(Alumno)jcAlumno.getSelectedItem();
        listaI=(ArrayList)inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
        for (Inscripcion insc : listaI) {
            modelo.addRow(new Object[]{insc.getMateria().getIdMateria(), insc.getMateria().getNombre(), insc.getNota()});          
        }
        jtNotas.enable(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLRotulo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jSTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcAlumno;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables
}
