/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemgrupo64.Vistas;

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
 * @author Windows 10 OS
 */
public class AlumnoPorMateria extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel(){
    public boolean isCellEditable(int f, int c){
          return false;
}

};
    /**
     * Creates new form AlumnoPorMateria
     */
    public AlumnoPorMateria() {
        initComponents();
        armarCabecera();
        cargarMaterias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEscritorio = new javax.swing.JPanel();
        jLlistadoAlumnosPorMateria = new javax.swing.JLabel();
        jlSeleccioneUnaMateria = new javax.swing.JLabel();
        jcbMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnosPorMateria = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jpEscritorio.setBackground(new java.awt.Color(0, 102, 255));

        jLlistadoAlumnosPorMateria.setBackground(new java.awt.Color(0, 102, 255));
        jLlistadoAlumnosPorMateria.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLlistadoAlumnosPorMateria.setForeground(new java.awt.Color(255, 255, 255));
        jLlistadoAlumnosPorMateria.setText("Listado de Alumnos por Materia");

        jlSeleccioneUnaMateria.setBackground(new java.awt.Color(0, 102, 255));
        jlSeleccioneUnaMateria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlSeleccioneUnaMateria.setForeground(new java.awt.Color(255, 255, 255));
        jlSeleccioneUnaMateria.setText("Seleccione una Materia:");

        jcbMateria.setBackground(new java.awt.Color(0, 102, 255));
        jcbMateria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbMateria.setForeground(new java.awt.Color(255, 255, 255));
        jcbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaActionPerformed(evt);
            }
        });

        jtAlumnosPorMateria.setBackground(new java.awt.Color(0, 102, 255));
        jtAlumnosPorMateria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtAlumnosPorMateria.setForeground(new java.awt.Color(255, 255, 255));
        jtAlumnosPorMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAlumnosPorMateria);

        jbSalir.setBackground(new java.awt.Color(0, 102, 255));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorioLayout.createSequentialGroup()
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalir)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpEscritorioLayout.createSequentialGroup()
                                .addComponent(jlSeleccioneUnaMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLlistadoAlumnosPorMateria))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLlistadoAlumnosPorMateria)
                .addGap(23, 23, 23)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSeleccioneUnaMateria)
                    .addComponent(jcbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
        
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaActionPerformed
        // TODO add your handling code here:
        
        Materia materiaSeleccionada = (Materia) jcbMateria.getSelectedItem();
        InscripcionData aluData = new InscripcionData();
        if (materiaSeleccionada != null){
            borrarFilas();
            for (Alumno inscrip :aluData.obtenerAlumnosPorMateria(materiaSeleccionada.getIdMateria()) ) {
         
          modelo.addRow(new Object[]{
              inscrip.getIdAlumno(),
              inscrip.getDni(),
              inscrip.getApellido(),
              inscrip.getNombre()});
        }
            
            
            
        }
        
    }//GEN-LAST:event_jcbMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLlistadoAlumnosPorMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbMateria;
    private javax.swing.JLabel jlSeleccioneUnaMateria;
    private javax.swing.JPanel jpEscritorio;
    private javax.swing.JTable jtAlumnosPorMateria;
    // End of variables declaration//GEN-END:variables

    
    
    private void armarCabecera(){
       modelo.addColumn("ID");
       modelo.addColumn("DNI");
       modelo.addColumn("Apellido");
       modelo.addColumn("Nombre");
       jtAlumnosPorMateria.setModel(modelo);
       
    }
    
    private void borrarFilas() {

        int filas = jtAlumnosPorMateria.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);

        }
    }
    
    private void cargarMaterias( ){
         
         MateriaData mate=new MateriaData();
        for (Materia materia:mate.listarMateria()){
            jcbMateria.addItem(materia);
        }
    
    

}
}
