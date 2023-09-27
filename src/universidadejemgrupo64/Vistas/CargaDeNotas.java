/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemgrupo64.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemgrupo64.Entidades.Alumno;
import universidadejemgrupo64.Entidades.Inscripcion;
import universidadejemgrupo64.Entidades.Materia;
import universidadejemplogrupo64.AccesoADatos.AlumnoData;
import universidadejemplogrupo64.AccesoADatos.InscripcionData;
import universidadejemplogrupo64.AccesoADatos.MateriaData;

/**
 *
 * @author Mis Documentos
 */
public class CargaDeNotas extends javax.swing.JInternalFrame {

    private InscripcionData insData;
    private AlumnoData aluData;
    private MateriaData matData;
    private MateriaData materiaData;

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

         
            return false;
        }

    };

    /**
     * Creates new form CargaDeNotas
     */
    public CargaDeNotas() {
        initComponents();
        aluData = new AlumnoData();
        insData = new InscripcionData();

        armarCabecera();
        cargarAlumnos();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateria = new javax.swing.JTable();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jbGuardarN = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carga de notas");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un alumno:");

        jtTablaMateria.setBackground(new java.awt.Color(0, 102, 255));
        jtTablaMateria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtTablaMateria.setForeground(new java.awt.Color(255, 255, 255));
        jtTablaMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaMateria);

        jcbAlumnos.setBackground(new java.awt.Color(0, 102, 255));
        jcbAlumnos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jbGuardarN.setBackground(new java.awt.Color(0, 102, 255));
        jbGuardarN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbGuardarN.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardarN.setText("Modificar Nota");
        jbGuardarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarNActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(0, 102, 255));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbGuardarN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarN)
                    .addComponent(jbSalir))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
        Alumno alumnoSeleccionado = (Alumno) jcbAlumnos.getSelectedItem();

        if (alumnoSeleccionado != null) {
            borrarFilas();
            for (Inscripcion inscrip : insData.obtenerMateriasCursadasDos(alumnoSeleccionado.getIdAlumno())) {

                modelo.addRow(new Object[]{
                    inscrip.getMateria().getIdMateria(),
                    inscrip.getMateria().getNombre(),
                    inscrip.getNota()});
            }
        }
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarNActionPerformed
        // TODO add your handling code here:

        Inscripcion in = new Inscripcion();
        int filaSeleccinada = jtTablaMateria.getSelectedRow();
        Alumno selec = (Alumno) jcbAlumnos.getSelectedItem();
        if (filaSeleccinada != -1) {
            int idmateria = (Integer) jtTablaMateria.getValueAt(filaSeleccinada, 0);

            Double nuevaNota = obtenerNuevaNota();
            if (nuevaNota != null) {
                // Validamos la nota entre 0 y 10
                if (nuevaNota >= 0 && nuevaNota <= 10) {
                    jtTablaMateria.setValueAt(nuevaNota, filaSeleccinada, 2);
                    insData.actualizarNota(selec.getIdAlumno(), idmateria, nuevaNota);
                } else {
                    // Si la nota no está en rango válido se muestra un mensaje de error 
                    JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 10.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_jbGuardarNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardarN;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JTable jtTablaMateria;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("idMateria");
        modelo.addColumn("nombre");
        modelo.addColumn("Nota");
        jtTablaMateria.setModel(modelo);
    }

    private void borrarFilas() {

        int filas = jtTablaMateria.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cargarAlumnos() {

        for (Alumno alumno : aluData.listarAlumnos()) {
            jcbAlumnos.addItem(alumno);
        }
    }

    private Double obtenerNuevaNota() {
        String input = JOptionPane.showInputDialog("Ingrese la nueva nota:");
        if (input != null) {
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La entrada no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Devolvemos null para indicar que no se ingresó una nueva nota o se canceló la operación
        return null;
    }
}
