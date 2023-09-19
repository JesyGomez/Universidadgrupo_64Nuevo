package universidadejemgrupo64.Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import universidadejemgrupo64.Entidades.Materia;
import universidadejemplogrupo64.AccesoADatos.Conexion;
import universidadejemplogrupo64.AccesoADatos.MateriaData;

public class FormularioMateria extends javax.swing.JInternalFrame {

    private MateriaData md;

    /**
     * Creates new form FormularioMateria
     */
    public FormularioMateria() {
        initComponents();
        this.md = md;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPEscritorio = new javax.swing.JPanel();
        jtID = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlCodigoEtiqueta = new javax.swing.JLabel();
        jlNombreEtiqueta = new javax.swing.JLabel();
        jlAnioEtiqueta = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPEscritorio.setBackground(new java.awt.Color(0, 102, 255));

        jtID.setBackground(new java.awt.Color(255, 255, 255));
        jtID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtID.setForeground(new java.awt.Color(0, 0, 0));

        jtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(0, 0, 0));

        jtAnio.setBackground(new java.awt.Color(255, 255, 255));
        jtAnio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtAnio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materias");

        jlCodigoEtiqueta.setBackground(new java.awt.Color(0, 0, 0));
        jlCodigoEtiqueta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlCodigoEtiqueta.setForeground(new java.awt.Color(255, 255, 255));
        jlCodigoEtiqueta.setText("ID");

        jlNombreEtiqueta.setBackground(new java.awt.Color(0, 0, 0));
        jlNombreEtiqueta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlNombreEtiqueta.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreEtiqueta.setText("Nombre: ");

        jlAnioEtiqueta.setBackground(new java.awt.Color(0, 0, 0));
        jlAnioEtiqueta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlAnioEtiqueta.setForeground(new java.awt.Color(255, 255, 255));
        jlAnioEtiqueta.setText("Año: ");

        jlEstado.setBackground(new java.awt.Color(0, 0, 0));
        jlEstado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlEstado.setText("Estado: ");

        jrbEstado.setBackground(new java.awt.Color(0, 102, 255));
        jrbEstado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jrbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jrbEstado.setText("Activo");

        jbEliminar.setBackground(new java.awt.Color(0, 102, 255));
        jbEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(0, 102, 255));
        jbGuardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(0, 102, 255));
        jbNuevo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jlBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jlBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBuscarMouseClicked(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(0, 102, 255));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEscritorioLayout = new javax.swing.GroupLayout(jPEscritorio);
        jPEscritorio.setLayout(jPEscritorioLayout);
        jPEscritorioLayout.setHorizontalGroup(
            jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPEscritorioLayout.createSequentialGroup()
                                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCodigoEtiqueta)
                                    .addComponent(jlNombreEtiqueta)
                                    .addComponent(jlAnioEtiqueta)
                                    .addComponent(jlEstado))
                                .addGap(45, 45, 45)
                                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtID, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(jtNombre)
                                    .addComponent(jtAnio)
                                    .addComponent(jrbEstado))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addContainerGap())))
        );
        jPEscritorioLayout.setVerticalGroup(
            jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEscritorioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPEscritorioLayout.createSequentialGroup()
                                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCodigoEtiqueta))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEscritorioLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombreEtiqueta))
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEscritorioLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEscritorioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlAnioEtiqueta)
                                .addGap(55, 55, 55))))
                    .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlEstado)
                        .addComponent(jrbEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
    // Crear una instancia de MateriaData 
        MateriaData materiaData = new MateriaData();

    // Obtener los datos de la nueva materia desde los campos de texto
        String nombreMateria = jtNombre.getText();
        int anioMateria = Integer.parseInt(jtAnio.getText());
        boolean estadoMateria = jrbEstado.isSelected();

    // Crear una instancia de Materia
        Materia nuevaMateria = new Materia(nombreMateria, anioMateria, estadoMateria);

    // Llamar al método guardarMateria de materiaData
        materiaData.guardarMateria(nuevaMateria);

        jtID.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrbEstado.setSelected(false);

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Obtener el ID de la materia desde el campo de texto jtID
        MateriaData materiaData = new MateriaData();

        int idMateria = Integer.parseInt(jtID.getText());

        // Llamar al método eliminarMateria de materiaData
        materiaData.eliminarMateria(idMateria);

        jtID.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrbEstado.setSelected(false);

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jlBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarMouseClicked
        // Obtener el ID de la materia desde el campo de texto jtID
        int idMateria = Integer.parseInt(jtID.getText());
        MateriaData materiaData = new MateriaData();

        // Llamar al método buscarMateria de materiaData
        Materia materiaEncontrada = materiaData.buscarMateria(idMateria);

        if (materiaEncontrada != null) {
            JOptionPane.showMessageDialog(this, "La materia se encontró en la lista.");
            // Llenar los campos con la información de la materia encontrada
            jtNombre.setText(materiaEncontrada.getNombre());
            jtAnio.setText(String.valueOf(materiaEncontrada.getAnio()));
            jrbEstado.setSelected(materiaEncontrada.isEstado());
        } else {
            JOptionPane.showMessageDialog(this, "La materia no se encontró en la lista.");
            // Limpiar los campos si la materia no se encontró
            jtNombre.setText("");
            jtAnio.setText("");
            jrbEstado.setSelected(false);
        }
    }//GEN-LAST:event_jlBuscarMouseClicked

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        jtID.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrbEstado.setSelected(false);
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPEscritorio;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAnioEtiqueta;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlCodigoEtiqueta;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNombreEtiqueta;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
