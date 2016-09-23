package ec.gob.mdt.ciudadano.model.listener;

import java.util.Date;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import ec.gob.mdt.ciudadano.model.app.base.BaseEntityAuditable;

public class EntityAuditable {

	@Resource
	private SessionContext context;

	public String getAuthenticatedUserName() {
		String userName = null;
		try {
			userName = context != null && context.getCallerPrincipal() != null ? context.getCallerPrincipal().getName() : null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (userName == null || userName.isEmpty())
			userName = "<desconocido>";
		return userName;
	}

	@PrePersist
	public void prePersist(Object object) {
		if (object instanceof BaseEntityAuditable) {
			BaseEntityAuditable entidad = (BaseEntityAuditable) object;
			entidad.setFechaCreacion(new Date());
			entidad.setFechaActualizacion(new Date());
			entidad.setUsuarioCreacion(getAuthenticatedUserName());
		}
	}

	@PreUpdate
	public void preUpdate(Object object) {
		if (object instanceof BaseEntityAuditable) {
			BaseEntityAuditable entidad = (BaseEntityAuditable) object;
			entidad.setFechaActualizacion(new Date());
			entidad.setUsuarioActualizacion(getAuthenticatedUserName());
		}
	}
}
