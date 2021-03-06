package eam.desarrollo.hospital.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of medicamento.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Medicamento implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id_medicamento. */
	private String idMedicamento;

	/** nombre_medicamento. */
	private String nombreMedicamento;

	/** marca_medicamento. */
	private String marcaMedicamento;

	/** farmacia. */
	private Farmacia farmacia;

	/** The set of formula_medicamento. */
	//private Set<FormulaMedicamento> formulaMedicamentoSet;

	/** The set of medicamento_proveedor. */
	//private Set<MedicamentoProveedor> medicamentoProveedorSet;

	
	
	/**
	 * Set the id_medicamento.
	 * 
	 * @param idMedicamento
	 *            id_medicamento
	 */
	public void setIdMedicamento(String idMedicamento) {
		this.idMedicamento = idMedicamento;
	}


	public Medicamento(String idMedicamento, String nombreMedicamento, String marcaMedicamento, Farmacia farmacia) {
		super();
		this.idMedicamento = idMedicamento;
		this.nombreMedicamento = nombreMedicamento;
		this.marcaMedicamento = marcaMedicamento;
		this.farmacia = farmacia;
	}

	/**
	 * Get the id_medicamento.
	 * 
	 * @return id_medicamento
	 */
	public String getIdMedicamento() {
		return this.idMedicamento;
	}

	/**
	 * Set the nombre_medicamento.
	 * 
	 * @param nombreMedicamento
	 *            nombre_medicamento
	 */
	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	/**
	 * Get the nombre_medicamento.
	 * 
	 * @return nombre_medicamento
	 */
	public String getNombreMedicamento() {
		return this.nombreMedicamento;
	}

	/**
	 * Set the marca_medicamento.
	 * 
	 * @param marcaMedicamento
	 *            marca_medicamento
	 */
	public void setMarcaMedicamento(String marcaMedicamento) {
		this.marcaMedicamento = marcaMedicamento;
	}

	/**
	 * Get the marca_medicamento.
	 * 
	 * @return marca_medicamento
	 */
	public String getMarcaMedicamento() {
		return this.marcaMedicamento;
	}

	/**
	 * Set the farmacia.
	 * 
	 * @param farmacia
	 *            farmacia
	 */
	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}

	/**
	 * Get the farmacia.
	 * 
	 * @return farmacia
	 */
	public Farmacia getFarmacia() {
		return this.farmacia;
	}

	/**
	 * Set the set of the formula_medicamento.
	 * 
	 * @param formulaMedicamentoSet
	 *            The set of formula_medicamento
	 */
	//public void setFormulaMedicamentoSet(Set<FormulaMedicamento> formulaMedicamentoSet) {
		//this.formulaMedicamentoSet = formulaMedicamentoSet;
	//}

	/**
	 * Add the formula_medicamento.
	 * 
	 * @param formulaMedicamento
	 *            formula_medicamento
	 */
	//public void addFormulaMedicamento(FormulaMedicamento formulaMedicamento) {
		//this.formulaMedicamentoSet.add(formulaMedicamento);
	//}

	/**
	 * Get the set of the formula_medicamento.
	 * 
	 * @return The set of formula_medicamento
	 */
	//public Set<FormulaMedicamento> getFormulaMedicamentoSet() {
		//return this.formulaMedicamentoSet;
	//}

	/**
	 * Set the set of the medicamento_proveedor.
	 * 
	 * @param medicamentoProveedorSet
	 *            The set of medicamento_proveedor
	 */
	//public void setMedicamentoProveedorSet(Set<MedicamentoProveedor> medicamentoProveedorSet) {
		//this.medicamentoProveedorSet = medicamentoProveedorSet;
	//}

	/**
	 * Add the medicamento_proveedor.
	 * 
	 * @param medicamentoProveedor
	 *            medicamento_proveedor
	 */
	//public void addMedicamentoProveedor(MedicamentoProveedor medicamentoProveedor) {
		//this.medicamentoProveedorSet.add(medicamentoProveedor);
	//}

	/**
	 * Get the set of the medicamento_proveedor.
	 * 
	 * @return The set of medicamento_proveedor
	 */
	//public Set<MedicamentoProveedor> getMedicamentoProveedorSet() {
		//return this.medicamentoProveedorSet;
	//}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMedicamento == null) ? 0 : idMedicamento.hashCode());
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
		Medicamento other = (Medicamento) obj;
		if (idMedicamento == null) {
			if (other.idMedicamento != null) {
				return false;
			}
		} else if (!idMedicamento.equals(other.idMedicamento)) {
			return false;
		}
		return true;
	}

}
