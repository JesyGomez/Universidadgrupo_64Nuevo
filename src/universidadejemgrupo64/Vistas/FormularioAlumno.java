/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemgrupo64.Vistas;

import java.awt.event.ItemEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadejemgrupo64.Entidades.Alumno;
import universidadejemplogrupo64.AccesoADatos.AlumnoData;

/**
 *
 * @author Windows 10 OS
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {
private boolean modoEdicion = false;
    /**
     * Creates new form FormularioAlumno
     */
    public FormularioAlumno() {
        initComponents();
        habilitarCampos();
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
        jlAlumno = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlFechaNac = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        jlBuscar = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JCheckBox();
        jtId = new javax.swing.JTextField();
        jlId = new javax.swing.JLabel();
        jtbEditar = new javax.swing.JToggleButton();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jlAlumno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlAlumno.setForeground(new java.awt.Color(255, 255, 255));
        jlAlumno.setText("Alumno");

        jlDocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlDocumento.setForeground(new java.awt.Color(255, 255, 255));
        jlDocumento.setText("DNI:");

        jlApellido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlApellido.setForeground(new java.awt.Color(255, 255, 255));
        jlApellido.setText("Apellido:");

        jlNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Nombre:");

        jlEstado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlEstado.setText("Estado:");

        jlFechaNac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jlFechaNac.setText("Fecha de Nacimiento");

        jtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        jtDocumento.setForeground(new java.awt.Color(0, 0, 0));

        jtApellido.setBackground(new java.awt.Color(255, 255, 255));
        jtApellido.setForeground(new java.awt.Color(0, 0, 0));

        jtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtNombre.setForeground(new java.awt.Color(0, 0, 0));

        jbNuevo.setBackground(new java.awt.Color(0, 102, 255));
        jbNuevo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 0, 0));
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

        jbSalir.setBackground(new java.awt.Color(0, 102, 255));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jdcFechaNac.setDateFormatString("yyyy-MM-dd");

        jlBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jlBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBuscarMouseClicked(evt);
            }
        });

        jcbEstado.setBackground(new java.awt.Color(0, 102, 255));
        jcbEstado.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jcbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jcbEstado.setText("Activo/Inactivo");

        jtId.setBackground(new java.awt.Color(255, 255, 255));
        jtId.setForeground(new java.awt.Color(0, 0, 0));

        jlId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlId.setForeground(new java.awt.Color(255, 255, 255));
        jlId.setText("ID:");

        jtbEditar.setBackground(new java.awt.Color(51, 153, 0));
        jtbEditar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtbEditar.setForeground(new java.awt.Color(255, 255, 255));
        jtbEditar.setText("Editar");
        jtbEditar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jtbEditarItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jlAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlId)
                                .addGap(18, 18, 18)
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlDocumento)
                                .addGap(19, 19, 19)
                                .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlFechaNac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdcFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlNombre)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlApellido)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbEstado)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(26, 26, 26)
                                .addComponent(jbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jbGuardar)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtbEditar))))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDocumento)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlApellido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEstado)
                            .addComponent(jcbEstado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlFechaNac)
                            .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbNuevo)
                    .addComponent(jtbEditar))
                .addGap(4, 4, 4)
                .addComponent(jbSalir)
                .addContainerGap())
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

    private void jlBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarMouseClicked
        // TODO add your handling code here:
        try {

            int dni = Integer.parseInt(jtDocumento.getText());
            AlumnoData alu = new AlumnoData();
            Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(dni);

            if (alumnoEncontrado != null) {

                LocalDate fechaNacimientoLocalDate = alumnoEncontrado.getFechaNacimiento();
                Instant instant = fechaNacimientoLocalDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
                Date fechaNacimientoDate = Date.from(instant);

                jtId.setText(Integer.toString(alumnoEncontrado.getIdAlumno()));
                jtApellido.setText(alumnoEncontrado.getApellido());
                jtNombre.setText(alumnoEncontrado.getNombre());
                jcbEstado.setSelected(alumnoEncontrado.isActivo());
                jdcFechaNac.setDate(fechaNacimientoDate);

            }
        } catch (NumberFormatException e) {
            // Manejo de excepciones si se produce un error de formato de número
            JOptionPane.showMessageDialog(this, "Error: Para buscar por dni, debe ingresar numeros.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
        deshabilitarCampos();
        verificarBotonEditar();
        

    }//GEN-LAST:event_jlBuscarMouseClicked

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try{
        /////// PRIMERO INSTANCIO UN AlumnoData PARA PODER LLAMAR SUS METODOS:
        AlumnoData alu = new AlumnoData();

        /////// SEGUNDO INSTANCIO UN Alumno PARA PODER LLAMAR SUS METODOS
        Alumno guardarAlumno = new Alumno();

        //// PASO A GUARDAR CADA DATO DEL FORMULARIO ADENTRO DE VARIABLES QUE LUEGO QUE SE UTILIZARAN PARA
        //// CARGAR LOS DATOS DEL Alumno INSTANCIADO guardarAlumno
        
        int dni = Integer.parseInt(jtDocumento.getText());
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        boolean estado = jcbEstado.isSelected(); /// EL METODO isSelected() marca true si el jcb esta tildado
        /// y false si no lo esta. De esa forma obtengo el estado.

        ////// COMO EL JDATECHOSER DE PORQUERIA TRAE UN DATO TIPO DATE, TENGO QUE GUARDARLO EN UNA NUEVA
        ////// VARIABLE DEL MISMO TIPO
        Date fechaSeleccionada = jdcFechaNac.getDate();

        ///// COMO EL TIPO DE DATO DE PORQUERIA DATE NO ME SIRVE, LO TENGO QUE TRANSFORMAR A LOCALDATE
        ///// YA QUE LOS GETTER AND SETTER DE Alumno, MANEJAN LOCALDATE Y NO DATE.
        LocalDate fechaNacimiento = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        //// COMIENZO A SETEAR EN guardarAlumno CON LAS VARIABLES CREADAS ANTERIORMENTE QUE TIENEN LOS DATOS
        //// DEL FORMULARIO.
        guardarAlumno.setDni(dni);
        guardarAlumno.setApellido(apellido);
        guardarAlumno.setNombre(nombre);

        ///// TODA LA TRAMOYA DEL DATE AL LOCAL DATE ERA PARA ESTO, PARA PASAR LA FECHA QUE TRAJE DEL JDATECHOSER
        ///// DE TIPO A DATE, A LOCAL DATE, ESE DATO SE GUARDO EN LA VARIABLE fechaNacimiento , Y ESA VARIABLE
        ///// ES LA QUE LE PUEDO PASAR AL ALUMNO SIN QUE SE CRASHEE TODO. YA QUE EL ATRIBUTO fechaNacimiento 
        ///// DE Alumno ES DE TIPO LOCALDATE :...(        
        guardarAlumno.setFechaNacimiento(fechaNacimiento);

        guardarAlumno.setActivo(estado);

        ///// YA CREADO EL ALUMNO DE PORQUERIA, SE LO PASO AL METODO guardarAlumno QUE SE ENCUENTRA EN AlumnoData
        ///// A TRAVES DEL alu INSTANCIADO AL PRINCIPIO.
        if (modoEdicion) {
            int id = Integer.parseInt(jtId.getText());
            guardarAlumno.setIdAlumno(id);
            alu.modificarAlumno(guardarAlumno);
            verificarBotonEditar();
            
        } else {
            alu.guardarAlumno(guardarAlumno);
            verificarBotonEditar();
        }
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar un código válido.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        verificarBotonEditar();
        limpiarCampos();
        habilitarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:

        try {
            int idAEliminar = Integer.parseInt(jtId.getText());
            AlumnoData alumnoAEliminar = new AlumnoData();

            // Mostrar un cuadro de diálogo de confirmación
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este alumno?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                alumnoAEliminar.eliminarAlumno(idAEliminar);
                verificarBotonEditar();
                limpiarCampos();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar un código válido.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtbEditarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jtbEditarItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // El JToggleButton ha sido presionado, llama a habilitarCampos()
            modoEdicion=true;
            habilitarCampos();
        } else {
            // El JToggleButton ha sido desactivado, llama a desHabilitarCampos()
            modoEdicion=false;
            deshabilitarCampos();
        }
    }//GEN-LAST:event_jtbEditarItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaNac;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JToggleButton jtbEditar;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {

        jtId.setText("");
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jcbEstado.setSelected(false);
        jdcFechaNac.setDate(null);

    }

    private void habilitarCampos() {

        jtId.setEnabled(false);
        jtDocumento.setEnabled(true);
        jtApellido.setEnabled(true);
        jtNombre.setEnabled(true);
        jcbEstado.setEnabled(true);
        jdcFechaNac.setEnabled(true);

    }

    private void deshabilitarCampos() {

        jtId.setEnabled(false);
        jtDocumento.setEnabled(false);
        jtApellido.setEnabled(false);
        jtNombre.setEnabled(false);
        jcbEstado.setEnabled(false);
        jdcFechaNac.setEnabled(false);

    }
    
    private void verificarBotonEditar(){
        
        if (jtbEditar.isSelected()) {
            jtbEditar.setSelected(false);
            
        }
        
    }

}
