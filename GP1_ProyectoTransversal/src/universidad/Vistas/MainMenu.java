package universidad.Vistas;

// Inicializar Jframe

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

// Crear JMenuBar y JMenu Items
// action listeners de JMenu items y JInternalFrames
// Crear JDesktopPane que contiene JInternalFrames
// set propiedades de JFrame

public class MainMenu extends javax.swing.JFrame{
    public MainMenu(){
        setTitle("Menu Principal");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu alumnoMenu = new JMenu("Alumno");
        JMenu materiaMenu = new JMenu("Materia");
        JMenu adminMenu = new JMenu("Administracion");
        JMenu consultasMenu = new JMenu("Consultas");
        JMenu salirMenu = new JMenu("Salir");
        
        JMenuItem formAlumno = new JMenuItem("Formulario de Alumno");
        JMenuItem formMateria = new JMenuItem("Formulario de Materia");
        JMenuItem manageInscripcion = new JMenuItem("Manejo de Inscripciones");
        JMenuItem manageGrades = new JMenuItem("Manipulacion de notas");
        
        alumnoMenu.add(formAlumno);
        materiaMenu.add(formMateria);
        adminMenu.add(manageInscripcion);
        adminMenu.add(manageGrades);
        
        menuBar.add(alumnoMenu);
        menuBar.add(materiaMenu);
        menuBar.add(adminMenu);
        menuBar.add(consultasMenu);
        menuBar.add(salirMenu);
        
        setJMenuBar(menuBar);
        
        JDesktopPane desktopPane = new JDesktopPane();
        add(desktopPane);
        
        formAlumno.addActionListener(e -> openInternalFrame(new FormularioAlumno(), desktopPane));
        formMateria.addActionListener(e -> openInternalFrame(new FormularioMateria(), desktopPane));
        manageInscripcion.addActionListener(e -> openInternalFrame(new ManejoInscripciones(), desktopPane));
        manageGrades.addActionListener(e -> openInternalFrame(new ManipulacionNotas(), desktopPane));
        
        initComponents();
    }
    
    private void openInternalFrame(JInternalFrame frame, JDesktopPane desktopPane){
        desktopPane.add(frame);
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        SwingUtilities.invokeLater(()->{
            MainMenu menu = new MainMenu();
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
