package eam.desarrollo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of incapacidad.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Incapacidad implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id_incapacidad. */
	private String idIncapacidad;

	/** fecha_inicio_incapacidad. */
	private Date fechaInicioIncapacidad;

	/** fecha_final_incapacidad. */
	private Date fechaFinalIncapacidad;

	/** medico. */
	private Medico medico;

	/** The set of especialidad. */
	private Set<Especialidad> especialidadSet;

	/**
	 * Constructor.
	 */
	public Incapacidad() {
		this.especialidadSet = new HashSet<Especialidad>();
	}

	/**
	 * Set the id_incapacidad.
	 * 
	 * @param idIncapacidad
	 *            id_incapacidad
	 */
	public void setIdIncapacidad(String idIncapacidad) {
		this.idIncapacidad = idIncapacidad;
	}

	/**
	 * Get the id_incapacidad.
	 * 
	 * @return id_incapacidad
	 */
	public String getIdIncapacidad() {
		return this.idIncapacidad;
	}

	/**
	 * Set the fecha_inicio_incapacidad.
	 * 
	 * @param fechaInicioIncapacidad
	 *            fecha_inicio_incapacidad
	 */
	public void setFechaInicioIncapacidad(Date fechaInicioIncapacidad) {
		this.fechaInicioIncapacidad = fechaInicioIncapacidad;
	}

	/**
	 * Get the fecha_inicio_incapacidad.
	 * 
	 * @return fecha_inicio_incapacidad
	 */
	public Date getFechaInicioIncapacidad() {
		return this.fechaInicioIncapacidad;
	}

	/**
	 * Set the fecha_final_incapacidad.
	 * 
	 * @param fechaFinalIncapacidad
	 *            fecha_final_incapacidad
	 */
	public void setFechaFinalIncapacidad(Date fechaFinalIncapacidad) {
		this.fechaFinalIncapacidad = fechaFinalIncapacidad;
	}

	/**
	 * Get the fecha_final_incapacidad.
	 * 
	 * @return fecha_final_incapacidad
	 */
	public Date getFechaFinalIncapacidad() {
		return this.fechaFinalIncapacidad;
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
	 * Set the set of the especialidad.
	 * 
	 * @param especialidadSet
	 *            The set of especialidad
	 */
	public void setEspecialidadSet(Set<Especialidad> especialidadSet) {
		this.especialidadSet = especialidadSet;
	}

	/**
	 * Add the especialidad.
	 * 
	 * @param especialidad
	 *            especialidad
	 */
	public void addEspecialidad(Especialidad especialidad) {
		this.especialidadSet.add(especialidad);
	}

	/**
	 * Get the set of the especialidad.
	 * 
	 * @return The set of especialidad
	 */
	public Set<Especialidad> getEspecialidadSet() {
		return this.especialidadSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIncapacidad == null) ? 0 : idIncapacidad.hashCode());
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
		Incapacidad other = (Incapacidad) obj;
		if (idIncapacidad == null) {
			if (other.idIncapacidad != null) {
				return false;
			}
		} else if (!idIncapacidad.equals(other.idIncapacidad)) {
			return false;
		}
		return true;
	}

}
