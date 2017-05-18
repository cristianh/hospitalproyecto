package eam.desarrollo.hospital.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import eam.desarrollo.hospital.conexion.Conexion;
import eam.desarrollo.hospital.entidades.Cita;
import eam.desarrollo.hospital.entidades.Consultorio;
import eam.desarrollo.hospital.entidades.EstadoConsultorio;
import eam.desarrollo.hospital.entidades.TipoCita;
import eam.desarrollo.hospital.interfaces.IntCita;

public class DAOCita implements IntCita {

	@Override
	public void crear(Cita cita) throws Exception {
		try {

			String sql = "INSERT INTO  cita (id_cita,fecha_cita,id_paciente,id_tipo_cita,id_estado_cita,id_consultario,id_medico) VALUES (?,?,?,?,?,?,?)";
			// System.out.println(sql);

			Connection con = Conexion.getConexion();
			PreparedStatement stm = con.prepareStatement(sql);

			stm.setString(1, cita.getIdCita());
			stm.setObject(2, cita.getFechaCita());
			stm.setObject(3, cita.getPaciente().getIdPaciente());
			stm.setObject(4, cita.getTipoCita().getIdTipoCita());
			stm.setObject(5, cita.getEstadoCita().getIdEstadoCita());
			stm.setObject(6, cita.getConsultorio().getIdConsultario());
			stm.setObject(7, cita.getMedico().getIdMedico());
			stm.executeUpdate();

			JOptionPane.showMessageDialog(null, "Cita registrada", "Info", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());

		}

	}

	@Override
	public Cita buscar(String numerocita) throws Exception {

		Connection con = Conexion.getConexion();

		String sql = "SELECT c.id_cita,c.fecha_cita,c.id_paciente,p.nombre_paciente,c.id_tipo_cita,tc.descripcion_tipo_cita,c.id_estado_cita,ec.descripcion_estado_cita,c.id_consultario,c.id_medico,m.nombre_medico  from cita as c"
				+ "join paciente as p on c.id_paciente=p.id_paciente"
				+ "join tipo_cita as tc on c.id_tipo_cita=tc.id_tipo_cita"
				+ "join estado_cita as ec on c.id_estado_cita = ec.id_estado_cita"
				+ "join consultorio as co on c.id_consultario = co.id_consultario"
				+ "join medico as m on c.id_medico = m.id_medico where c.id_cita";
		java.sql.PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, numerocita);
		// ejecutar consulta
		java.sql.ResultSet res = pstmt.executeQuery();

		Cita cita = null;
		// hubo un registro....
		System.out.println(res);
		if (res.next()) {
			String idCita = res.getString(1);
			String fechaCita = res.getString(2);
			String idPaciente = res.getString(3);
			String tipoCita = res.getString(6);

			String idestadoconsultorio = res.getString(4);
			String descripcionestadoconsultorio = res.getString(5);
			EstadoConsultorio estado_consultorio = new EstadoConsultorio(idestadoconsultorio,
					descripcionestadoconsultorio);
			cita = new Cita(idCita, null, null, null, null, null, null);

		}
		con.close();
		return cita;

	}

	@Override
	public void eliminar(String numerocita) throws Exception {

		try {

			// System.out.println(sql);
			Connection con = Conexion.getConexion();
			String sql2 = "DELETE from cita WHERE id_cita=?";
			java.sql.PreparedStatement stm2 = con.prepareStatement(sql2);
			stm2.setString(1, numerocita);
			stm2.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			// Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,
			// null, ex);
		} finally {
			System.out.print("Usuario eliminado");
		}

	}

	@Override
	public void actualizar(Cita cita) throws Exception {

		try {

			String sql = "UPDATE cita SET fecha_cita=?,id_paciente=?,id_tipo_cita=?,id_estado_cita=?,id_consultario=?,id_medico=? where id_cita=?";
			// System.out.println(sql);

			Connection con = Conexion.getConexion();
			java.sql.PreparedStatement stm = con.prepareStatement(sql);
			stm.setObject(1, cita.getFechaCita());
			stm.setObject(2, cita.getPaciente().getIdPaciente());
			stm.setObject(3, cita.getTipoCita().getIdTipoCita());
			stm.setObject(4, cita.getEstadoCita().getIdEstadoCita());
			stm.setObject(5, cita.getConsultorio().getIdConsultario());
			stm.setObject(6, cita.getMedico().getIdMedico());
			stm.setString(7, cita.getIdCita());
			stm.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			// Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,
			// null, ex);
		}

	}

	@Override
	public void listarPaciente(Cita paciente) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<TipoCita> listarEstadoConsul() {
		TipoCita estado = null;
		ArrayList<TipoCita> listTipoCita = new ArrayList<>();
		// Tipodocumento tipDocumento;
		try {

			String sql = "SELECT * FROM tipo_cita ";
			Connection con = Conexion.getConexion();
			java.sql.PreparedStatement stm = con.prepareStatement(sql);
			java.sql.ResultSet rs = stm.executeQuery();
			
			while (rs.next()) {
				estado = new TipoCita(rs.getString("id_tipo_cita"),
						rs.getString("descripcion_tipo_cita"));
				listTipoCita.add(estado);

			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return listTipoCita;

	}

}
