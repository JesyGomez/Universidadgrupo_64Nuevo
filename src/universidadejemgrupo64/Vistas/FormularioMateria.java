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
        jbDardeBaja = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();

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

        jbDardeBaja.setBackground(new java.awt.Color(255, 255, 255));
        jbDardeBaja.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbDardeBaja.setForeground(new java.awt.Color(0, 102, 255));
        jbDardeBaja.setText("DAR DE BAJA");
        jbDardeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDardeBajaActionPerformed(evt);
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

        jbModificar.setBackground(new java.awt.Color(0, 102, 255));
        jbModificar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 102, 255));
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEscritorioLayout = new javax.swing.GroupLayout(jPEscritorio);
        jPEscritorio.setLayout(jPEscritorioLayout);
        jPEscritorioLayout.setHorizontalGroup(
            jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPEscritorioLayout.createSequentialGroup()
                                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCodigoEtiqueta)
                                    .addComponent(jlEstado))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEscritorioLayout.createSequentialGroup()
                                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlAnioEtiqueta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombreEtiqueta, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtID, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jtNombre)
                            .addComponent(jtAnio)
                            .addComponent(jrbEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEscritorioLayout.createSequentialGroup()
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar))
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jbDardeBaja)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                        .addGap(36, 36, 36)
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAnioEtiqueta))
                        .addGap(64, 64, 64))
                    .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlEstado)
                        .addComponent(jrbEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir)
                    .addComponent(jbModificar)
                    .addComponent(jbGuardar))
                .addGap(30, 30, 30)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDardeBaja)
                    .addComponent(jbEliminar))
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
        MateriaData materiaData = new MateriaData();

        try {
            String nombreMateria = jtNombre.getText();
            int anioMateria = Integer.parseInt(jtAnio.getText());
            boolean estadoMateria = jrbEstado.isSelected();

            // El año tiene que ser un número positivo
            if (anioMateria < 0) {
                JOptionPane.showMessageDialog(this, "El año debe ser un número positivo.");
                return; 
            }

            Materia nuevaMateria = new Materia(nombreMateria, anioMateria, estadoMateria);

            materiaData.guardarMateria(nuevaMateria);

            jtID.setText("");
            jtNombre.setText("");
            jtAnio.setText("");
            jrbEstado.setSelected(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El año debe ser un número válido.");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbDardeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDardeBajaActionPerformed

        MateriaData materiaData = new MateriaData();

        try {
            int idMateria = Integer.parseInt(jtID.getText());

            materiaData.dadaDeBajaMateria(WIDTH);

            jtID.setText("");
            jtNombre.setText("");
            jtAnio.setText("");
            jrbEstado.setSelected(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
        }
    }//GEN-LAST:event_jbDardeBajaActionPerformed

    private void jlBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarMouseClicked
        MateriaData materiaData = new MateriaData();
        try {
            String idMateriaText = jtID.getText();
            String nombreMateria = jtNombre.getText();
            Materia materiaEncontrada = null;

            if (idMateriaText.isEmpty() && nombreMateria.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID o un nombre para buscar.");
                return;
            } else if (!idMateriaText.isEmpty()) {
                int idMateria = Integer.parseInt(idMateriaText);
                materiaEncontrada = materiaData.buscarMateriaPorId(idMateria);
            } else if (!nombreMateria.isEmpty()) {
                materiaEncontrada = materiaData.buscarMateriaPorNombre(nombreMateria);
            }

            if (materiaEncontrada != null) {
                if (materiaEncontrada.isEstado()) {
                    JOptionPane.showMessageDialog(this, "La materia se encontró en la lista.");
                    jtNombre.setText(materiaEncontrada.getNombre());
                    jtAnio.setText(String.valueOf(materiaEncontrada.getAnio()));
                    jrbEstado.setSelected(materiaEncontrada.isEstado());
                } else {
                    jtNombre.setText(materiaEncontrada.getNombre());
                    jtAnio.setText(String.valueOf(materiaEncontrada.getAnio()));
                    jrbEstado.setSelected(materiaEncontrada.isEstado());
                }
            } else {
                //JOptionPane.showMessageDialog(this, "La materia no se encontró en la lista.");
                jtNombre.setText("");
                jtAnio.setText("");
                jrbEstado.setSelected(false);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
        }
    }//GEN-LAST:event_jlBuscarMouseClicked

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
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

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        MateriaData materiaData = new MateriaData();

        try {
            int idMateria = Integer.parseInt(jtID.getText());
            String nombreMateria = jtNombre.getText();
            int anioMateria = Integer.parseInt(jtAnio.getText());
            boolean estadoMateria = jrbEstado.isSelected();

            // Crear una instancia de Materia con los datos modificados
            Materia materiaModificada = new Materia(idMateria, nombreMateria, anioMateria, estadoMateria);
            // Mostrar un cuadro de diálogo de confirmación
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro desea realizar este cambio en la materia?", "Confirmar Modificación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                // El usuario ha confirmado, entonces realizamos la modificación de la materia
                materiaData.modificarMateria(materiaModificada);

                jtID.setText("");
                jtNombre.setText("");
                jtAnio.setText("");
                jrbEstado.setSelected(false);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID y el Año deben ser números válidos.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        try {
            int idMateria = Integer.parseInt(jtID.getText());

            // Preguntar al usuario si realmente desea eliminar la materia
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar la materia?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                // Llamar al método eliminarMateria de materiaData
                md.eliminarMateriaPorIdYNombre(WIDTH, title);

                JOptionPane.showMessageDialog(this, "Materia eliminada exitosamente.");

                jtID.setText("");
                jtNombre.setText("");
                jtAnio.setText("");
                jrbEstado.setSelected(false);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPEscritorio;
    private javax.swing.JButton jbDardeBaja;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
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
