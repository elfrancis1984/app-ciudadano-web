package ec.gob.mdt.ciudadano.model.legacy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the sgi_empleado_empresa database table.
 * 
 */
@Embeddable
public class EntidadEmpleadoEmpresaSgiPK implements Serializable {

	private static final long serialVersionUID = 7047558662516818937L;

	@Column(name = "emp_ruc", insertable = false, updatable = false)
	private String empRuc;

	@Column(name = "per_identificacion", insertable = false, updatable = false)
	private String perIdentificacion;

	public EntidadEmpleadoEmpresaSgiPK() {
	}

	public String getEmpRuc() {
		return this.empRuc;
	}

	public void setEmpRuc(String empRuc) {
		this.empRuc = empRuc;
	}

	public String getPerIdentificacion() {
		return this.perIdentificacion;
	}

	public void setPerIdentificacion(String perIdentificacion) {
		this.perIdentificacion = perIdentificacion;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EntidadEmpleadoEmpresaSgiPK)) {
			return false;
		}
		EntidadEmpleadoEmpresaSgiPK castOther = (EntidadEmpleadoEmpresaSgiPK) other;
		return this.empRuc.equals(castOther.empRuc) && this.perIdentificacion.equals(castOther.perIdentificacion);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empRuc.hashCode();
		hash = hash * prime + this.perIdentificacion.hashCode();

		return hash;
	}
}