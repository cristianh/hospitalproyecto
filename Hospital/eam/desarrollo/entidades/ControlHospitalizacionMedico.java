package eam.desarrollo.entidades;

import java.io.Serializable;

/**
 * Model class of control_hospitalizacion_medico.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class ControlHospitalizacionMedico implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** medico. */
	private Medico medico;

	/** hospitalizacion. */
	private Hospitalizacion hospitalizacion;

	/**
	 * Constructor.
	 */
	public ControlHospitalizacionMedico() {
	}

	/**
	 * Set the medico.
	 * 
	 * @param medico
	 *            medico
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	/**
	 * Get the medico.
	 * 
	 * @return medico
	 */
	public Medico getMedico() {
		return this.medico;
	}

	/**
	 * Set the hospitalizacion.
	 * 
	 * @param hospitalizacion
	 *            hospitalizacion
	 */
	public void setHospitalizacion(Hospitalizacion hospitalizacion) {
		this.hospitalizacion = hospitalizacion;
	}

	/**
	 * Get the hospitalizacion.
	 * 
	 * @return hospitalizacion
	 */
	public Hospitalizacion getHospitalizacion() {
		return this.hospitalizacion;
	}


}
