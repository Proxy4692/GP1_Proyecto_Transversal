package universidad.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.AlumnoData;
import universidad.Entidades.Alumno;

public class FormularioAlumnos extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo= new DefaultTableModel();
    private AlumnoData aluData=new AlumnoData(); //Paso 1: Inicializo alumno data y un actual inicializada con el boton Buscar
    private Alumno alumnoActual=null;
    
    public FormularioAlumnos() {
        initComponents();
        armarCabecera(); 
        for (Alumno alumno : aluData.listarAlumnos()) {
            cargarDatos(alumno);           
        }      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRotulo = new javax.swing.JLabel();
        jPDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtLegajo = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtFechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jrEstado = new javax.swing.JRadioButton();
        jSTabla = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
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
        jLRotulo.setText("Formulario Alumnos");
        jLRotulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPDatos.setBackground(new java.awt.Color(0, 47, 78));
        jPDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(255, 51, 102));
        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");

        jLabel2.setBackground(new java.awt.Color(255, 51, 102));
        jLabel2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Legajo:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setBackground(new java.awt.Color(255, 51, 102));
        jLabel4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");

        jtLegajo.setBackground(new java.awt.Color(255, 255, 255));
        jtLegajo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtLegajo.setForeground(new java.awt.Color(0, 0, 0));
        jtLegajo.setToolTipText("Codigo de registro ID autogenerado");
        jtLegajo.setEnabled(false);
        jtLegajo.setMinimumSize(new java.awt.Dimension(25, 25));
        jtLegajo.setName(""); // NOI18N
        jtLegajo.setPreferredSize(new java.awt.Dimension(25, 25));
        jtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLegajoActionPerformed(evt);
            }
        });

        jtApellido.setBackground(new java.awt.Color(255, 204, 255));
        jtApellido.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtApellido.setForeground(new java.awt.Color(102, 0, 204));
        jtApellido.setToolTipText("Ingrese apellido del alumno");
        jtApellido.setMinimumSize(new java.awt.Dimension(25, 25));
        jtApellido.setName(""); // NOI18N
        jtApellido.setPreferredSize(new java.awt.Dimension(25, 25));

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

        jtDocumento.setBackground(new java.awt.Color(255, 255, 102));
        jtDocumento.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtDocumento.setForeground(new java.awt.Color(102, 0, 204));
        jtDocumento.setToolTipText("Ingrese DNI del alumno");
        jtDocumento.setMinimumSize(new java.awt.Dimension(25, 25));
        jtDocumento.setName(""); // NOI18N
        jtDocumento.setPreferredSize(new java.awt.Dimension(25, 25));
        jtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DNI:");

        jtFechaNacimiento.setBackground(new java.awt.Color(255, 204, 255));
        jtFechaNacimiento.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtFechaNacimiento.setForeground(new java.awt.Color(102, 0, 204));
        jtFechaNacimiento.setToolTipText("Ingrese su nombre");
        jtFechaNacimiento.setMinimumSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento.setName(""); // NOI18N
        jtFechaNacimiento.setPreferredSize(new java.awt.Dimension(25, 25));
        jtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacimientoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 51, 102));
        jLabel6.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha de nac :");

        jdFechaNac.setBackground(new java.awt.Color(0, 47, 78));
        jdFechaNac.setToolTipText("");
        jdFechaNac.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaNacPropertyChange(evt);
            }
        });

        jrEstado.setBackground(new java.awt.Color(102, 0, 153));
        jrEstado.setForeground(new java.awt.Color(255, 255, 255));
        jrEstado.setText("activo");
        jrEstado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(3, 3, 3)
                                .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPDatosLayout.createSequentialGroup()
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDatosLayout.createSequentialGroup()
                                .addComponent(jtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrEstado)
                    .addComponent(jdFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jSTabla.setBackground(new java.awt.Color(0, 47, 78));

        jtAlumnos.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jtAlumnos.setForeground(new java.awt.Color(0, 153, 153));
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
        jtAlumnos.setToolTipText("Listado de Alumnos");
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
        jSTabla.setViewportView(jtAlumnos);

        jbGuardar.setBackground(new java.awt.Color(0, 47, 78));
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

        jbNuevo.setBackground(new java.awt.Color(0, 47, 78));
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

        jbSalir.setBackground(new java.awt.Color(0, 47, 78));
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

        jbEliminar.setBackground(new java.awt.Color(0, 47, 78));
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
                    .addComponent(jSTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
            if(jtDocumento.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Complete DNI del alumno para poder guardar");
                return;
            }
            int dni= Integer.parseInt(jtDocumento.getText());
            if(jtApellido.getText().isEmpty()||jtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Complete nombre y apellido del alumno para poder guardar");
                return;
            }
            String apellido= jtApellido.getText();
            String nombre= jtNombre.getText();
            if(jtFechaNacimiento.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Seleccione fecha de nacimiento del alumno para poder guardar");
                return;
            }
            java.util.Date sfecha=jdFechaNac.getDate();
            LocalDate fechaNac=sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado=jrEstado.isSelected();
            
            //Paso 5 : Corroboro si es alumno nuevo o modificar alumno
            if(alumnoActual==null){
                alumnoActual=new Alumno(dni, apellido, nombre, fechaNac, estado);
                Alumno alumnoBuscar=aluData.buscarAlumnoPorDni(dni);
                if(alumnoBuscar.getDni()==dni){
                    JOptionPane.showMessageDialog(this,"El DNI ingresado pertenece a otro alumno guardado anteriormente");
                    alumnoActual=null;
                    return;
                }
                aluData.guardarAlumno(alumnoActual);
            }else{
                
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNacimiento(fechaNac);
                aluData.modificarAlumno(alumnoActual);
            }

        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this,"El DNI debe ser un número entero");
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        limpiarCampos(); // Paso 3
        alumnoActual=null;
        jtAlumnos.enable(true);
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLegajoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Paso 6: 
        if(alumnoActual!=null){
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this,"No hay un alumno seleccionado para eliminar");            
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocumentoActionPerformed

    private void jtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacimientoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    try{
        Integer dni= Integer.parseInt(jtDocumento.getText());  //Paso 2: Inicializo alumno actual con DNI seleccionado
        alumnoActual=aluData.buscarAlumnoPorDni(dni);
        if(alumnoActual!=null){
            jtApellido.setText(alumnoActual.getApellido());
            jtNombre.setText(alumnoActual.getNombre());
            jrEstado.setSelected(alumnoActual.isEstado());
            jtLegajo.setText(""+alumnoActual.getIdAlumno());
            LocalDate lc= alumnoActual.getFechaNacimiento();
            java.util.Date date= java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdFechaNac.setDate(date);
        }
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"Debe ingresar un DNI válido");
        jtDocumento.requestFocus();
    }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jdFechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaNacPropertyChange

        if(evt.getPropertyName().equals("date")){
            if(jdFechaNac.getDate()!=null){
                java.util.Date fechaVieja= jdFechaNac.getDate();
                long tiempo= fechaVieja.getTime();
                java.sql.Date fecha= new java.sql.Date(tiempo);
                LocalDate fechaNueva= fecha.toLocalDate();
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
                jtFechaNacimiento.setText(fechaNueva.format(dtf));                                  
            }else{
                JOptionPane.showMessageDialog(this,"Debe ingresar una fecha valida");
                jdFechaNac.requestFocus(); 
            }        
        }
    }
        
    private void limpiarCampos(){
    /* Paso 3: Vacía los campos para iniciar el llenado de datos*/    
        jtLegajo.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtDocumento.setText("");
        jtFechaNacimiento.setText("");
        jrEstado.setSelected(false);
    }//GEN-LAST:event_jdFechaNacPropertyChange

    private void jtAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnosMouseClicked

        int filaElegida=jtAlumnos.getSelectedRow();
        if(filaElegida!=-1){
            Integer dni= (Integer)jtAlumnos.getValueAt(filaElegida, 3);  
            alumnoActual=aluData.buscarAlumnoPorDni(dni);
            if(alumnoActual!=null){
                jtApellido.setText(alumnoActual.getApellido());
                jtNombre.setText(alumnoActual.getNombre());
                jrEstado.setSelected(alumnoActual.isEstado());
                jtLegajo.setText(""+alumnoActual.getIdAlumno());
                LocalDate lc= alumnoActual.getFechaNacimiento();
                java.util.Date date= java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdFechaNac.setDate(date);                  
//            jbActualizar.setEnabled(true);
//            jbEliminar.setEnabled(true);            

            }
        }
    }//GEN-LAST:event_jtAlumnosMouseClicked

    private void jtAlumnosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAlumnosFocusGained
        // TODO add your handling code here:
        jbBuscar.requestFocus();
        jtAlumnos.enable(false);
    }//GEN-LAST:event_jtAlumnosFocusGained

    private void jbBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbBuscarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarFocusGained
    
    private void armarCabecera(){     
        modelo.addColumn("Legajo");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Fecha de nac");
        jtAlumnos.setModel(modelo);
    }

    private void cargarDatos(Alumno alumno){     
        modelo.addRow(new Object[]{alumno.getIdAlumno(), alumno.getApellido(), alumno.getNombre(),alumno.getDni(),alumno.getFechaNacimiento()}); 

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLRotulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JScrollPane jSTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTable jtAlumnos;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtFechaNacimiento;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
