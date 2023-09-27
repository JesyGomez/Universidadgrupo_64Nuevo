package universidadejemgrupo64.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import universidadejemgrupo64.Entidades.Alumno;
import universidadejemgrupo64.Entidades.Inscripcion;
import universidadejemgrupo64.Entidades.Materia;
import universidadejemplogrupo64.AccesoADatos.AlumnoData;
import universidadejemplogrupo64.AccesoADatos.InscripcionData;
import universidadejemplogrupo64.AccesoADatos.MateriaData;

public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private InscripcionData insData = new InscripcionData();
    private AlumnoData aluData = new AlumnoData();
    private DefaultTableModel modelo = new DefaultTableModel();

    public FormularioInscripcion() {
        initComponents();
        armarCabecera();
        cargarCBAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtalumnos = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Formulario de inscripción");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un alumno:");

        jcbAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbAlumnoMouseClicked(evt);
            }
        });
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listado de alumnos");

        jtalumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtalumnos);
        if (jtalumnos.getColumnModel().getColumnCount() > 0) {
            jtalumnos.getColumnModel().getColumn(0).setResizable(false);
            jtalumnos.getColumnModel().getColumn(1).setResizable(false);
            jtalumnos.getColumnModel().getColumn(2).setResizable(false);
        }

        jbInscribir.setBackground(new java.awt.Color(0, 0, 0));
        jbInscribir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setBackground(new java.awt.Color(0, 0, 0));
        jbAnular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbAnular.setForeground(new java.awt.Color(255, 255, 255));
        jbAnular.setText("Anular inscripción");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jSalir.setBackground(new java.awt.Color(0, 0, 0));
        jSalir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jSalir.setForeground(new java.awt.Color(255, 255, 255));
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado de materias");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Materias inscriptas");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Materias no inscriptas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbNoInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbInscribir)
                                .addGap(38, 38, 38)
                                .addComponent(jbAnular)
                                .addGap(58, 58, 58)
                                .addComponent(jSalir)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAlumno))
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jrbNoInscriptas)
                            .addComponent(jLabel6))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addComponent(jrbInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jSalir))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        jrbInscriptas.setSelected(true);
        jrbNoInscriptas.setSelected(false);
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        doDefaultCloseAction();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

        Alumno alumnoSeleccionado = (Alumno) jcbAlumno.getSelectedItem();
        int filaSelec = jtalumnos.getSelectedRow();
        if (filaSelec != -1) {
            int idM = (Integer) modelo.getValueAt(filaSelec, 0);
            Materia mat = new Materia();
            mat.setIdMateria(idM);
            Inscripcion insc = new Inscripcion(alumnoSeleccionado, mat, 0);
            insData.guardarInscripcion(insc);

        } else {
            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una materia");
        }

    }//GEN-LAST:event_jbInscribirActionPerformed


    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed

        Alumno alumnoseleccionado = (Alumno) jcbAlumno.getSelectedItem();


    }//GEN-LAST:event_jcbAlumnoActionPerformed


    private void jcbAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnoMouseClicked
   
    }//GEN-LAST:event_jcbAlumnoMouseClicked

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        jrbNoInscriptas.setSelected(true);
        jrbInscriptas.setSelected(false);
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed

        Alumno alumnoSeleccionado = (Alumno) jcbAlumno.getSelectedItem();
        int filaSelec = jtalumnos.getSelectedRow();
        if (filaSelec != -1) {
            int idM = (Integer) modelo.getValueAt(filaSelec, 0);

            insData.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), idM);

            borrarFilas();
            
        } else {
            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una materia");
        }
    }//GEN-LAST:event_jbAnularActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtalumnos;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");

        jtalumnos.setModel(modelo);

    }

    private void cargarCBAlumnos() {

        List<Alumno> alumnos = aluData.listarAlumnos();

        for (Alumno alu : alumnos) {
            jcbAlumno.addItem(alu);
        }
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void llenarTabla() {
        Alumno alumnoSeleccionado = (Alumno) jcbAlumno.getSelectedItem();
        if (jrbNoInscriptas.isSelected()) {
            List<Materia> materias = insData.obtenerMateriasNoCursadas(alumnoSeleccionado.getIdAlumno());
            for (Materia m : materias) {
                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});

            }
        } else {
            List<Materia> materias = insData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
            for (Materia m : materias) {
                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});

            }
        }
    }
}
