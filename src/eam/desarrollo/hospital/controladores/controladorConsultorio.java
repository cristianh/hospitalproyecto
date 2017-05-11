package eam.desarrollo.hospital.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import eam.desarollo.hospital.vistas.VentanaConsultorio;
import eam.desarrollo.hospital.DAO.DAOConsultorio;
import eam.desarrollo.hospital.entidades.Consultorio;
import eam.desarrollo.hospital.entidades.EstadoConsultorio;
import eam.desarrollo.hospital.entidades.Genero;
import eam.desarrollo.hospital.entidades.Municipio;
import eam.desarrollo.hospital.entidades.Paciente;
import eam.desarrollo.hospital.entidades.Tipodocumento;


public class controladorConsultorio implements ActionListener {

	public VentanaConsultorio ventanaconsultorio;
	public Consultorio nuevo_consultorio = null;
	public EstadoConsultorio estado_consultorio = null;
	public DAOConsultorio Midao = new DAOConsultorio();
	public ArrayList<EstadoConsultorio> listaEstado;
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		switch (evento.getActionCommand()) {
		case "Registrar":
			if (verificarformulario()) {
				
				String estado = ventanaconsultorio.comboBox.getSelectedItem().toString();
				

				String consultorio = ventanaconsultorio.JTFConsultorio.getText();
				String descripcion = ventanaconsultorio.textPane.getText();
				estado_consultorio = new EstadoConsultorio(Integer.toString(ventanaconsultorio.comboBox.getSelectedIndex()),estado);
				nuevo_consultorio = new Consultorio(consultorio,descripcion,estado_consultorio);
				System.out.println(nuevo_consultorio.getIdConsultario());


				try {
					Midao.crear(nuevo_consultorio);
				} catch (Exception e1) {

				}
				ventanaconsultorio.comboBox.setSelectedIndex(0);
				// ventanapaciente.dateChooser.setDate(null);
				Limpiarformulario();
			} else {
				JOptionPane.showMessageDialog(null, "Por favor ingrese sus datos", "Info",
						JOptionPane.INFORMATION_MESSAGE);
			}

			break;
			
		case "Eliminar":
			try {
				if(!verificarVacio()){
					Midao.eliminar(ventanaconsultorio.JTFConsultorio.getText());
					ventanaconsultorio.comboBox.setSelectedIndex(0);
					ventanaconsultorio.textPane.setText("");
					
					Limpiarformulario();
					JOptionPane.showMessageDialog(null, "Consultorio eliminado", "Info",
							JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "Llene el campo requerido");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case "Actualizar":
			String estado = ventanaconsultorio.comboBox.getSelectedItem().toString();
			String consultorio = ventanaconsultorio.JTFConsultorio.getText();
			String descripcion = ventanaconsultorio.textPane.getText();
			
				estado_consultorio = new EstadoConsultorio(Integer.toString(ventanaconsultorio.comboBox.getSelectedIndex()),estado);
				nuevo_consultorio = new Consultorio(consultorio,descripcion,estado_consultorio);
				try {
					Midao.actualizar(nuevo_consultorio);
					ventanaconsultorio.comboBox.setSelectedIndex(0);
					Limpiarformulario();
					JOptionPane.showMessageDialog(null, "Consultorio actualizado", "Info",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			break;
			
		case "Buscar":
			try {
				nuevo_consultorio = Midao.buscar(ventanaconsultorio.JTFConsultorio.getText());
				if (nuevo_consultorio != null) {
					ventanaconsultorio.comboBox
							.setSelectedIndex(Integer.parseInt(nuevo_consultorio.getEstadoConsultorio().getIdEstadoConsultorio()));
					CargarformularioPaciente(nuevo_consultorio);
					JOptionPane.showMessageDialog(null, "Usuario encontrado", "Info", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Info", JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
break;
		
	}
	}

	public controladorConsultorio(VentanaConsultorio ventanaconsultorio) {
		super();
		this.ventanaconsultorio = ventanaconsultorio;
		listarEstado();
		listenerbotones();
		
	}
	
	
	private void listenerbotones() {
		// TODO Auto-generated method stub
		try {
			this.ventanaconsultorio.btnRegistrar.addActionListener(this);
			this.ventanaconsultorio.btnBuscar.addActionListener(this);
			this.ventanaconsultorio.btnEliminar.addActionListener(this);
			this.ventanaconsultorio.btnActualizar.addActionListener(this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void CargarformularioPaciente(Consultorio miConsultorio) {
		try {
			this.ventanaconsultorio.JTFConsultorio.setText(miConsultorio.getIdConsultario());
			this.ventanaconsultorio.textPane.setText(miConsultorio.getDescripcionConsultorio());
			
		} catch (Exception e) {
			System.out.println("Mensaje" + e.getLocalizedMessage());
		}
	}
	
	public void listarEstado()
	{
	listaEstado = Midao.listarEstadoConsul();
	for (int i = 0; i < listaEstado.size(); i++) {
		String item = listaEstado.get(i).getDescripcionEstadoConsultorio();
		ventanaconsultorio.comboBox.addItem(item);
	}
	}
	
	public void Limpiarformulario() {
		this.ventanaconsultorio.JTFConsultorio.setText("");
		this.ventanaconsultorio.textPane.setText("");
	}
	
	public boolean verificarformulario() {

		if (this.ventanaconsultorio.JTFConsultorio.getText().equals("")
				|| this.ventanaconsultorio.textPane.getText().equals("")) {
			return false;
		}
		return true;
	}
	
	public boolean verificarVacio() {

		if (this.ventanaconsultorio.JTFConsultorio.getText().equals("")) {
			return true;
		}
		return false;
	}
	

}