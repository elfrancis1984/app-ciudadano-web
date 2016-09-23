package ec.gob.mdt.ciudadano.web.rest;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.gob.mdt.ciudadano.ejb.facade.app.NoticiaFacade;
import ec.gob.mdt.ciudadano.model.app.Rol;

@RolesAllowed({Rol.ROL_ADMINISTRADOR, Rol.ROL_USUARIO})
@Stateless
@Path("/noticias")
public class NoticiaRest {

	@EJB
	private NoticiaFacade noticiaFacade;
	
	@GET
	@Path("/ultimas")	
	@Produces(MediaType.APPLICATION_JSON)
	public ListaNoticia getListaUltimasNoticias() {
		ListaNoticia noticias = new ListaNoticia();
		noticias.setNoticias(noticiaFacade.getListaUltimasNoticias()); 
		return noticias;
	}

	@GET
	@Path("/imagen/{id}")
	@Produces("image/jpeg")
	public Response getImagenNoticia(@PathParam("id") int id) {
		try {
			BufferedImage image = new BufferedImage(250, 100, BufferedImage.TYPE_4BYTE_ABGR);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			ImageIO.write(image, "jpeg", byteArrayOutputStream);
			byte[] imageData = byteArrayOutputStream.toByteArray();
			return Response.ok(imageData).build();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		// send streamed
		// return Response.ok(new ByteArrayInputStream(imageData)).build();
	}
}
