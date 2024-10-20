package universidad.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.MateriaData;
import universidad.Entidades.Materia;

public class FormularioMaterias extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo= new DefaultTableModel();
    private MateriaData matData=new MateriaData(); //Paso 1: Inicializo alumno data y un actual inicializada con el boton Buscar
    private Materia materiaActual=null;
    
    public FormularioMaterias() {
        initComponents();
        armarCabecera(); 
        cargarDatos();            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRotulo = new javax.swing.JLabel();
        jPDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtIdMateria = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnioMateria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSTabla = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(480, 600));

        jLRotulo.setBackground(new java.awt.Color(0, 204, 204));
        jLRotulo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLRotulo.setForeground(new java.awt.Color(0, 153, 153));
        jLRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRotulo.setText("Formulario Materias");
        jLRotulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos.setBackground(new java.awt.Color(102, 0, 0));
        jPDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 51, 102));
        jLabel2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setBackground(new java.awt.Color(255, 51, 102));
        jLabel4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");

        jtIdMateria.setBackground(new java.awt.Color(255, 255, 255));
        jtIdMateria.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtIdMateria.setForeground(new java.awt.Color(0, 0, 0));
        jtIdMateria.setToolTipText("Codigo de registro ID autogenerado");
        jtIdMateria.setEnabled(false);
        jtIdMateria.setMinimumSize(new java.awt.Dimension(25, 25));
        jtIdMateria.setName(""); // NOI18N
        jtIdMateria.setPreferredSize(new java.awt.Dimension(25, 25));
        jtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdMateriaActionPerformed(evt);
            }
        });

        jtNombre.setBackground(new java.awt.Color(255, 204, 255));
        jtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(102, 0, 204));
        jtNombre.setToolTipText("Ingrese nombre del alumno");
        jtNombre.setMinimumSize(new java.awt.Dimension(25, 25));
        jtNombre.setName(""); // NOI18N
        jtNombre.setPreferredSize(new java.awt.Dimension(25, 25));
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtAnioMateria.setBackground(new java.awt.Color(255, 204, 255));
        jtAnioMateria.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtAnioMateria.setForeground(new java.awt.Color(102, 0, 204));
        jtAnioMateria.setToolTipText("Ingrese su nombre");
        jtAnioMateria.setMinimumSize(new java.awt.Dimension(25, 25));
        jtAnioMateria.setName(""); // NOI18N
        jtAnioMateria.setPreferredSize(new java.awt.Dimension(25, 25));
        jtAnioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAnioMateriaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 51, 102));
        jLabel6.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Año:");

        jrEstado.setBackground(new java.awt.Color(102, 0, 153));
        jrEstado.setForeground(new java.awt.Color(255, 255, 255));
        jrEstado.setText("activo");
        jrEstado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jtBuscar.setBackground(new java.awt.Color(255, 255, 102));
        jtBuscar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtBuscar.setForeground(new java.awt.Color(102, 0, 204));
        jtBuscar.setToolTipText("Ingrese DNI del alumno");
        jtBuscar.setMinimumSize(new java.awt.Dimension(25, 25));
        jtBuscar.setName(""); // NOI18N
        jtBuscar.setPreferredSize(new java.awt.Dimension(25, 25));
        jtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarActionPerformed(evt);
            }
        });
        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtBuscarKeyPressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 51, 102));
        jLabel7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Buscar ID:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrEstado)))))
                .addContainerGap())
        );
        jPDatosLayout.setVerticalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSTabla.setBackground(new java.awt.Color(0, 47, 78));

        jtMaterias.setBackground(new java.awt.Color(102, 0, 0));
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
        jtMaterias.setGridColor(new java.awt.Color(102, 0, 0));
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

        jbGuardar.setBackground(new java.awt.Color(102, 0, 0));
        jbGuardar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/guardar30.gif"))); // NOI18N
        jbGuardar.setToolTipText("Guardar");
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

        jbNuevo.setBackground(new java.awt.Color(102, 0, 0));
        jbNuevo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/nuevo30.gif"))); // NOI18N
        jbNuevo.setToolTipText("Nuevo");
        jbNuevo.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbNuevo.setMaximumSize(new java.awt.Dimension(81, 24));
        jbNuevo.setMinimumSize(new java.awt.Dimension(81, 24));
        jbNuevo.setName(""); // NOI18N
        jbNuevo.setPreferredSize(new java.awt.Dimension(81, 28));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(102, 0, 0));
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

        jbEliminar.setBackground(new java.awt.Color(102, 0, 0));
        jbEliminar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/eliminar30.gif"))); // NOI18N
        jbEliminar.setToolTipText("Eliminar");
        jbEliminar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbEliminar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbEliminar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbEliminar.setName(""); // NOI18N
        jbEliminar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(255, 255, 51));
        jbBuscar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/recursos/buscar30.gif"))); // NOI18N
        jbBuscar.setToolTipText("Búsqueda por DNI");
        jbBuscar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbBuscar.setMaximumSize(new java.awt.Dimension(81, 24));
        jbBuscar.setMinimumSize(new java.awt.Dimension(81, 24));
        jbBuscar.setName(""); // NOI18N
        jbBuscar.setPreferredSize(new java.awt.Dimension(81, 28));
        jbBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbBuscarFocusGained(evt);
            }
        });
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jSTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jSTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(3, 30, 480, 535);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try{
            //Paso 4: Rescato los valores 
            int anioMateria= Integer.parseInt(jtAnioMateria.getText());
            if(jtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Complete nombre de materia para poder guardar");
                return;
            }
            String nombre= jtNombre.getText();
            Boolean estado=jrEstado.isSelected();
            
            //Paso 5 : Corroboro si es alumno nuevo o modificar alumno
            if(materiaActual==null){
                materiaActual=new Materia(nombre, anioMateria, estado);
                matData.guardarMateria(materiaActual);
            }else{
                materiaActual.setEstado(estado);                
                materiaActual.setNombre(nombre);
                materiaActual.setAnioMateria(anioMateria);
                matData.modificarMateria(materiaActual);
            }
            cargarDatos();
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"El año de la materia debe ser un número entero");
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        limpiarCampos(); // Paso 3
        materiaActual=null;
        jtMaterias.enable(true);
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        jtMaterias.enable(true);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdMateriaActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Paso 6: 
        if(materiaActual!=null){
            matData.eliminarMateria(materiaActual.getIdMateria());
            System.out.println(materiaActual.getIdMateria());
            materiaActual=null;
            limpiarCampos();
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(this,"No hay una materia seleccionada para eliminar");            
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtAnioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAnioMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAnioMateriaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    try{
        Integer idb= Integer.parseInt(jtBuscar.getText());  //Paso 2: Inicializo alumno actual con ID seleccionado
        materiaActual=matData.buscarMateria(idb);
        if(materiaActual!=null){
            jtNombre.setText(materiaActual.getNombre());
            jrEstado.setSelected(materiaActual.isEstado());
            jtIdMateria.setText(""+materiaActual.getIdMateria());
            jtAnioMateria.setText(""+materiaActual.getAnioMateria());
        }else{
            JOptionPane.showMessageDialog(this,"La materia que busca no existe");
            jtBuscar.requestFocus();
        }
        jtMaterias.enable(true);
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"Debe ingresar un ID de materia válido");
        jtBuscar.requestFocus();
    }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriasMouseClicked

        int filaElegida=jtMaterias.getSelectedRow();
        if(filaElegida!=-1){
            Integer idb= (Integer)jtMaterias.getValueAt(filaElegida, 0);  
            materiaActual=matData.buscarMateria(idb);
            if(materiaActual!=null){
                jtBuscar.setText("");
                jtNombre.setText(materiaActual.getNombre());
                jrEstado.setSelected(materiaActual.isEstado());
                jtIdMateria.setText(""+materiaActual.getIdMateria());
                jtAnioMateria.setText(""+materiaActual.getAnioMateria());
            }
        }
    }//GEN-LAST:event_jtMateriasMouseClicked

    private void jtMateriasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtMateriasFocusGained
        // TODO add your handling code here:
        jbBuscar.requestFocus();
        jtMaterias.enable(false);
    }//GEN-LAST:event_jtMateriasFocusGained

    private void jbBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbBuscarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarFocusGained

    private void jtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBuscarActionPerformed

    private void jtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyPressed
        // TODO add your handling code here:
        jtIdMateria.setText("");
        jtNombre.setText("");
        jtAnioMateria.setText("");
        jrEstado.setSelected(false);
    }//GEN-LAST:event_jtBuscarKeyPressed
    
    private void armarCabecera(){     
        modelo.addColumn("Id Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año cursada");
        modelo.addColumn("estado");
        jtMaterias.setModel(modelo);
    }

    private void cargarDatos(){
        int filas=jtMaterias.getRowCount()-1;
        for(int f=filas;f>=0;f--){
            modelo.removeRow(f);
        }
        for (Materia materia : matData.listarMaterias()) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(),materia.getAnioMateria(),materia.isEstado()});          
        }
        jtMaterias.enable(true);
    }

    private void limpiarCampos(){
    /* Paso 3: Vacía los campos para iniciar el llenado de datos*/    
        jtIdMateria.setText("");
        jtNombre.setText("");
        jtAnioMateria.setText("");
        jtBuscar.setText("");
        jrEstado.setSelected(false);
    }                                      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JScrollPane jSTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtAnioMateria;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtIdMateria;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
