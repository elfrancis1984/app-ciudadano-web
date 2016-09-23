package ec.gob.mdt.ciudadano.model.app.base;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.eclipse.persistence.annotations.AdditionalCriteria;

@MappedSuperclass
@AdditionalCriteria(":filterStatus = 1 and this.estado = true")
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = -8952068548320139605L;

	protected Boolean estado = true;

	@Transient
	private boolean seleccionado;

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public boolean isPersisted() {
		return getId() != null;
	}

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		BaseEntity base = (BaseEntity) obj;
		if (this.getId() == null && base.getId() == null)
			return super.equals(obj);
		if (this.getId() == null || base.getId() == null)
			return false;
		return this.getId().equals(base.getId());
	}
}
