package eam.desarrollo.entidades;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of urgencia.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Urgencia implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id_urgencia. */
	private String idUrgencia;

	/** hora_urgencia. */
	private Time horaUrgencia;

	/** fecha_urgencia. */
	private Date fechaUrgencia;

	/** The set of urgencia_paciente. */
	private Set<UrgenciaPaciente> urgenciaPacienteSet;

	/** The set of urgencia_procedimiento. */
	private Set<UrgenciaProcedimiento> urgenciaProcedimientoSet;

	/**
	 * Constructor.
	 */
	public Urgencia() {
		this.urgenciaPacienteSet = new HashSet<UrgenciaPaciente>();
		this.urgenciaProcedimientoSet = new HashSet<UrgenciaProcedimiento>();
	}

	/**
	 * Set the id_urgencia.
	 * 
	 * @param idUrgencia
	 *            id_urgencia
	 */
	public void setIdUrgencia(String idUrgencia) {
		this.idUrgencia = idUrgencia;
	}

	/**
	 * Get the id_urgencia.
	 * 
	 * @return id_urgencia
	 */
	public String getIdUrgencia() {
		return this.idUrgencia;
	}

	/**
	 * Set the hora_urgencia.
	 * 
	 * @param horaUrgencia
	 *            hora_urgencia
	 */
	public void setHoraUrgencia(Time horaUrgencia) {
		this.horaUrgencia = horaUrgencia;
	}

	/**
	 * Get the hora_urgencia.
	 * 
	 * @return hora_urgencia
	 */
	public Time getHoraUrgencia() {
		return this.horaUrgencia;
	}

	/**
	 * Set the fecha_urgencia.
	 * 
	 * @param fechaUrgencia
	 *            fecha_urgencia
	 */
	public void setFechaUrgencia(Date fechaUrgencia) {
		this.fechaUrgencia = fechaUrgencia;
	}

	/**
	 * Get the fecha_urgencia.
	 * 
	 * @return fecha_urgencia
	 */
	public Date getFechaUrgencia() {
		return this.fechaUrgencia;
	}

	/**
	 * Set the set of the urgencia_paciente.
	 * 
	 * @param urgenciaPacienteSet
	 *            The set of urgencia_paciente
	 */
	public void setUrgenciaPacienteSet(Set<UrgenciaPaciente> urgenciaPacienteSet) {
		this.urgenciaPacienteSet = urgenciaPacienteSet;
	}

	/**
	 * Add the urgencia_paciente.
	 * 
	 * @param urgenciaPaciente
	 *            urgencia_paciente
	 */
	public void addUrgenciaPaciente(UrgenciaPaciente urgenciaPaciente) {
		this.urgenciaPacienteSet.add(urgenciaPaciente);
	}

	/**
	 * Get the set of the urgencia_paciente.
	 * 
	 * @return The set of urgencia_paciente
	 */
	public Set<UrgenciaPaciente> getUrgenciaPacienteSet() {
		return this.urgenciaPacienteSet;
	}

	/**
	 * Set the set of the urgencia_procedimiento.
	 * 
	 * @param urgenciaProcedimientoSet
	 *            The set of urgencia_procedimiento
	 */
	public void setUrgenciaProcedimientoSet(Set<UrgenciaProcedimiento> urgenciaProcedimientoSet) {
		this.urgenciaProcedimientoSet = urgenciaProcedimientoSet;
	}

	/**
	 * Add the urgencia_procedimiento.
	 * 
	 * @param urgenciaProcedimiento
	 *            urgencia_procedimiento
	 */
	public void addUrgenciaProcedimiento(UrgenciaProcedimiento urgenciaProcedimiento) {
		this.urgenciaProcedimientoSet.add(urgenciaProcedimiento);
	}

	/**
	 * Get the set of the urgencia_procedimiento.
	 * 
	 * @return The set of urgencia_procedimiento
	 */
	public Set<UrgenciaProcedimiento> getUrgenciaProcedimientoSet() {
		return this.urgenciaProcedimientoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUrgencia == null) ? 0 : idUrgencia.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Urgencia other = (Urgencia) obj;
		if (idUrgencia == null) {
			if (other.idUrgencia != null) {
				return false;
			}
		} else if (!idUrgencia.equals(other.idUrgencia)) {
			return false;
		}
		return true;
	}

}
