package universidadejemplogrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadejemgrupo64.Entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {

        con = Conexion.getConexion();
    }

    public static final int ERROR_SQL_CLAVE_DUPLICADA = 1062;

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUE(? , ? , ? , ? , ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente!");
            }
            ps.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == ERROR_SQL_CLAVE_DUPLICADA) {
                JOptionPane.showMessageDialog(null, "El DNI que intenta guardar, ya existe.");

            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno al guardar" + ex.getMessage() + ex.getErrorCode());
            }
        }
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?, estado=? "
                + "WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente!");
            }
            ps.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == ERROR_SQL_CLAVE_DUPLICADA) {
                JOptionPane.showMessageDialog(null, "El DNI que intenta modificar, ya existe.", "Error de entrada",JOptionPane.ERROR_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Alumno al modificar. "
                        + ex.getMessage());
            }
        }
    }

    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno Eliminado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno al eliminar" + ex.getMessage());
        }
    }

    public Alumno buscarAlumno(int id) {
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getNString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese Id");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni = ? AND estado = 1";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getNString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno activo con ese DNI");
                int a = JOptionPane.YES_NO_OPTION;
                int resultado = JOptionPane.showConfirmDialog(null, "Desea buscar dentro de los alumnos inactivos?", "Atencion", a);
                if (resultado == 0) {
                    alumno = buscarAlumnoPorDniInactivo(dni);
                }

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getNString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);

                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de Alumnos");
        }
        return alumnos;
    }

    public Alumno buscarAlumnoPorDniInactivo(int dni) {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 0";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getNString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(false);

            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese DNI");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alumno;
    }

}
