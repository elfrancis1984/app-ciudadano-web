package ec.gob.mdt.ciudadano.ejb.facade.app;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.mdt.ciudadano.ejb.service.CiudadanoServiceBean;
import ec.gob.mdt.ciudadano.model.app.Noticia;

@Stateless
public class NoticiaFacade {

	@EJB
	private CiudadanoServiceBean ciudadanoServiceBean;
	
	@SuppressWarnings("unchecked")
	public List<Noticia> getListaNoticias() {
		return (List<Noticia>) ciudadanoServiceBean.findAll(Noticia.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Noticia> getListaUltimasNoticias() {
		return (List<Noticia>) ciudadanoServiceBean.findByNamedQueryPaginado(Noticia.FIND_ALL, null, 0, 10);
	}
	
	public void guardarNoticia(Noticia noticia) {
		ciudadanoServiceBean.saveOrUpdate(noticia);
	}
	
	public void eliminarNoticia(Noticia noticia) {
		ciudadanoServiceBean.delete(noticia);
	}
}
