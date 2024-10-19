package universidad.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.AlumnoData;
import universidad.AccesoADatos.InscripcionData;
import universidad.AccesoADatos.MateriaData;
import universidad.Entidades.Alumno;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;

public class FormularioInscripcion extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo= new DefaultTableModel(); //Paso 1: Inicializo variables
    private AlumnoData aluData=new AlumnoData(); 
    private MateriaData matData=new MateriaData();
    private InscripcionData inscData=new InscripcionData();
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA=(ArrayList)aluData.listarAlumnos();
    
    public FormularioInscripcion() {
       initComponents();
       cargarAlumnos();  //Paso 2: Cargar check box de ALumnos - jc alumnos es de clase Alumnos
       armarCabecera(); //Paso 3: Cargar tabla Materias
       cargarDatos();            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRotulo = new javax.swing.JLabel();
        jSTabla = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jcAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrMatInsc = new javax.swing.JRadioButton();
        jrMatNoInsc = new javax.swing.JRadioButton();
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

        jtMaterias.setBackground(new java.awt.Color(102, 102, 0));
        jtMaterias.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtMaterias.setForeground(new java.awt.Color(0, 153, 153));
        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMaterias.setToolTipText("Listado de Alumnos");
        jtMaterias.setFillsViewportHeight(true);
        jtMaterias.setGridColor(new java.awt.Color(0, 47, 78));
        jtMaterias.setSelectionForeground(new java.awt.Color(204, 0, 153));
        jtMaterias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtMaterias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtMateriasFocusGained(evt);
            }
        });
        jtMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMateriasMouseClicked(evt);
            }
        });
        jSTabla.setViewportView(jtMaterias);

        jbInscribir.setBackground(new java.awt.Color(102, 102, 0));
        jbInscribir.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/inscribir30.gif"))); // NOI18N
        jbInscribir.setToolTipText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbInscribir.setMaximumSize(new java.awt.Dimension(81, 24));
        jbInscribir.setMinimumSize(new java.awt.Dimension(81, 24));
        jbInscribir.setName(""); // NOI18N
        jbInscribir.setPreferredSize(new java.awt.Dimension(81, 28));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(102, 102, 0));
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

        jbAnular.setBackground(new java.awt.Color(102, 102, 0));
        jbAnular.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/anular30.gif"))); // NOI18N
        jbAnular.setToolTipText("Anular Inscripción");
        jbAnular.setEnabled(false);
        jbAnular.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbAnular.setMaximumSize(new java.awt.Dimension(81, 24));
        jbAnular.setMinimumSize(new java.awt.Dimension(81, 24));
        jbAnular.setName(""); // NOI18N
        jbAnular.setPreferredSize(new java.awt.Dimension(81, 28));
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jcAlumno.setBackground(new java.awt.Color(0, 51, 102));
        jcAlumno.setEditable(true);
        jcAlumno.setMinimumSize(new java.awt.Dimension(25, 25));
        jcAlumno.setPreferredSize(new java.awt.Dimension(25, 25));
        jcAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Seleccione un alumno:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jrMatInsc.setBackground(new java.awt.Color(0, 51, 102));
        jrMatInsc.setForeground(new java.awt.Color(255, 255, 255));
        jrMatInsc.setText("Materias inscriptas");
        jrMatInsc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jrMatInsc.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jrMatInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMatInscActionPerformed(evt);
            }
        });

        jrMatNoInsc.setBackground(new java.awt.Color(0, 51, 102));
        jrMatNoInsc.setForeground(new java.awt.Color(255, 255, 255));
        jrMatNoInsc.setText("Materias no inscriptas");
        jrMatNoInsc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jrMatNoInsc.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jrMatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMatNoInscActionPerformed(evt);
            }
        });

        jLRotulo1.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo1.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo1.setText("Formulario Inscripción");
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
                                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jrMatInsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jrMatNoInsc)
                        .addGap(54, 54, 54)))
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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrMatInsc)
                    .addComponent(jrMatNoInsc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        //Paso 6: Boton Inscribir
        int filaElegida=jtMaterias.getSelectedRow();
        if(filaElegida!=-1){
            Alumno alu=(Alumno)jcAlumno.getSelectedItem();
            int idMat= (Integer)jtMaterias.getValueAt(filaElegida, 0);
            String nombreMat=(String)jtMaterias.getValueAt(filaElegida, 1);
            int anioMat=(Integer)jtMaterias.getValueAt(filaElegida, 2);
            Materia mat=new Materia(idMat,nombreMat,anioMat,true);
            Inscripcion insc=new Inscripcion(alu,mat,0);
            inscData.guardarInscripcion(insc);
            borrarDatos();           
        }   
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        jtMaterias.enable(true);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        // Paso 6: 
        int filaElegida=jtMaterias.getSelectedRow();
        if(filaElegida!=-1){
            Alumno alu=(Alumno)jcAlumno.getSelectedItem();
            int idMat= (Integer)jtMaterias.getValueAt(filaElegida, 0);
            inscData.borrarInscripcionAlumnoMateria(alu.getIdAlumno(), idMat);
            borrarDatos();           
        }   
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jtMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriasMouseClicked

//        int filaElegida=jtAlumnos.getSelectedRow();
//        if(filaElegida!=-1){
//            Integer dni= (Integer)jtAlumnos.getValueAt(filaElegida, 3);  
//            alumnoActual=aluData.buscarAlumnoPorDni(dni);
//            if(alumnoActual!=null){
//                jtDocumento.setText("");
//                jtApellido.setText(alumnoActual.getApellido());
//                jtNombre.setText(alumnoActual.getNombre());
//                jrEstado.setSelected(alumnoActual.isEstado());
//                jtLegajo.setText(""+alumnoActual.getIdAlumno());
//                jtDocumento.setText(""+alumnoActual.getDni());
//                LocalDate lc= alumnoActual.getFechaNacimiento();
//                java.util.Date date= java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
//                jdFechaNac.setDate(date);                  
//       
//
//            }
//        }
    }//GEN-LAST:event_jtMateriasMouseClicked

    private void jtMateriasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtMateriasFocusGained
        // TODO add your handling code here:
        jtMaterias.enable(false);
    }//GEN-LAST:event_jtMateriasFocusGained

    private void jcAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcAlumnoActionPerformed

    private void jrMatInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMatInscActionPerformed
        // TODO add your handling code here:
        jrMatNoInsc.setSelected(false);
        cargaDatosInscriptas();
        jbInscribir.setEnabled(false);
        jbAnular.setEnabled(true);
        
    }//GEN-LAST:event_jrMatInscActionPerformed

    private void jrMatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMatNoInscActionPerformed
        // TODO add your handling code here:
        jrMatInsc.setSelected(false);
        cargaDatosNoInscriptas();
        jbInscribir.setEnabled(true);
        jbAnular.setEnabled(false);
    }//GEN-LAST:event_jrMatNoInscActionPerformed
    
    private void armarCabecera(){     
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año cursada");
        jtMaterias.setModel(modelo);
    }

    private void cargarAlumnos(){
        for (Alumno item:listaA){
            jcAlumno.addItem(item);
        }
    }
    
    private void borrarDatos(){
        int filas=jtMaterias.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            modelo.removeRow(f);
        }        
    }
    
    private void cargarDatos(){
        for (Materia materia : matData.listarMaterias()) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(),materia.getAnioMateria()});          
        }
        jtMaterias.enable(true);
    }
    
    private void cargaDatosNoInscriptas(){ //Paso 5: Cargar tabla Materias No Iscriptas
        borrarDatos();
        Alumno selec=(Alumno)jcAlumno.getSelectedItem();
        listaM=(ArrayList)inscData.obtenerMateriasNoCursadasPorAlumno(selec.getIdAlumno());
        for (Materia materia : listaM) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(),materia.getAnioMateria()});          
        }
        jtMaterias.enable(true);
    }
    
    private void cargaDatosInscriptas(){  //Paso 4: Cargar tabla Materias Iscriptas
        borrarDatos();
        Alumno selec=(Alumno)jcAlumno.getSelectedItem();
        listaM=(ArrayList)inscData.obtenerMateriasCursadasPorAlumno(selec.getIdAlumno());
        for (Materia materia : listaM) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(),materia.getAnioMateria()});          
        }
        jtMaterias.enable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLRotulo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jSTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcAlumno;
    private javax.swing.JRadioButton jrMatInsc;
    private javax.swing.JRadioButton jrMatNoInsc;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
}
