package ec.gob.mdt.ciudadano.web.bean;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import ec.gob.mdt.ciudadano.ejb.facade.app.NoticiaFacade;
import ec.gob.mdt.ciudadano.model.app.Noticia;
import ec.gob.mdt.ciudadano.web.util.JsfUtil;

@Named
@ViewScoped
public class NoticiasBean implements Serializable {

	private static final long serialVersionUID = 6822927441643730987L;

	private List<Noticia> noticias;

	private Noticia noticia;

	@EJB
	private NoticiaFacade noticiaFacade;

	public void guardarNoticia() {
		try {
			noticiaFacade.guardarNoticia(noticia);
			noticia = null;
			noticias = null;
			JsfUtil.addCallbackParam("noticia");
		} catch (Exception e) {
			e.printStackTrace();
			JsfUtil.adicionarMensajeError("Ha ocurrido un error al guardar la noticia.");
		}
	}
	
	public void eliminarNoticia(Noticia noticia) {
		try {
			noticiaFacade.eliminarNoticia(noticia);
			noticia = null;
			noticias = null;			
		} catch (Exception e) {
			e.printStackTrace();
			JsfUtil.adicionarMensajeError("Ha ocurrido un error al eliminar la noticia.");
		}
	}

	public void seleccionarNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	public List<Noticia> getNoticias() {
		return noticias == null ? noticias = noticiaFacade.getListaNoticias() : noticias;
	}

	public Noticia getNoticia() {
		return noticia == null ? noticia = new Noticia() : noticia;
	}
}
