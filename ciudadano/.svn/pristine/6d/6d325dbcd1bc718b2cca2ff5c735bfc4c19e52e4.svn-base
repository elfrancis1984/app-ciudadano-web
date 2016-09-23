package ec.gob.mdt.ciudadano.ejb.facade.app;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.mdt.ciudadano.ejb.service.CiudadanoServiceBean;
import ec.gob.mdt.ciudadano.model.app.Acceso;

@Stateless
public class AccesoFacade {

	@EJB
	private CiudadanoServiceBean ciudadanoServiceBean;

	public void guardarAcceso(Acceso acceso) {
		ciudadanoServiceBean.saveOrUpdate(acceso);
	}

	@SuppressWarnings("unchecked")
	public List<Acceso> getAccesos(int inicio, int total) {
		return (List<Acceso>) ciudadanoServiceBean.findByNamedQueryPaginado(Acceso.FIND_ALL, null, inicio, total);
	}
}
