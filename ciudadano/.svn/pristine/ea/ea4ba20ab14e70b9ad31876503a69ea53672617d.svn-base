package ec.gob.mdt.ciudadano.web.bean;

import java.io.Serializable;
import java.security.Principal;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.sun.enterprise.security.web.integration.WebPrincipal;

import ec.gob.mdt.ciudadano.ejb.facade.app.remote.UsuarioFacadeInterface;
import ec.gob.mdt.ciudadano.model.app.Usuario;
import ec.gob.mdt.ciudadano.web.util.EndOperation;
import ec.gob.mdt.ciudadano.web.util.JsfUtil;

@Named
@SessionScoped
public class AutenticacionBean implements Serializable {

	private static final long serialVersionUID = -538715778954874766L;

	private Usuario usuario;
	private boolean autenticado;

	@EJB
	private UsuarioFacadeInterface usuarioFacade;
	
	@PostConstruct
	private void init() {

	}

	public void autenticar() {
		try {
			login(usuario.getUsuario(), usuario.getContrasenna(), null, null);			
			JsfUtil.redirectURL(JsfUtil.getRelativeCurrentPage());
			autenticado = true;			
		} catch (Exception e) {			
			JsfUtil.adicionarMensajeError("Usuario o contraseña incorrecto.");
		}
	}

	public void cerrarSesion() {
		try {			
			autenticado = false;
			JsfUtil.redirectURL("/index.xhtml");
			JsfUtil.getRequest().logout();			
		} catch (Exception e) {
			e.printStackTrace();
			JsfUtil.redirectURL("/index.xhtml");
		}
	}
	
	public void login(String user, String pass, String rolName, EndOperation endOperationForRole) throws Exception {
		JsfUtil.getRequest().login(user, pass);
		if (isUserInRole(rolName) && endOperationForRole != null)
			endOperationForRole.executeOnEnd(rolName);
	}

	public boolean isUserInRole(String rolName) {
		try {
			WebPrincipal principal = (WebPrincipal) JsfUtil.getRequest().getUserPrincipal();
			Set<Principal> principals = principal.getSecurityContext().getSubject().getPrincipals();
			return principals.stream().filter(p -> p.getName().equals(rolName)).findFirst().isPresent();
		} catch (Exception e) {
			return false;
		}
	}

	public Usuario getUsuario() {
		return usuario == null ? usuario = new Usuario() : usuario;
	}

	public boolean isAutenticado() {
		return autenticado;
	}
}