package ec.gob.mdt.ciudadano.ejb.facade.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import ec.gob.mdt.ciudadano.ejb.facade.app.remote.UsuarioFacadeInterface;
import ec.gob.mdt.ciudadano.ejb.service.CiudadanoServiceBean;
import ec.gob.mdt.ciudadano.model.app.Rol;
import ec.gob.mdt.ciudadano.model.app.Usuario;

@Stateless
public class UsuarioFacade implements UsuarioFacadeInterface {

	@EJB
	private CiudadanoServiceBean ciudadanoServiceBean;

	public Usuario getUsuarioPorNombre(String nombre) {
		Map<String, Object> params = new HashMap<>();
		params.put("user", nombre);
		return ciudadanoServiceBean.findByNamedQuerySingleResult(Usuario.FIND_BY_USER, params);
	}

	public void verificarUsuario(String user, String pass) throws Exception {
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("user", user);
			params.put("pass", pass);
			Usuario usuario = ciudadanoServiceBean.findByNamedQuerySingleResult(Usuario.FIND_BY_USER_PASS, params);
			if (usuario == null)
				throw new Exception();
		} catch (NoResultException e) {
			throw new Exception("bad user/pass");
		}
	}
	
	public List<String> getRoles(String user) throws Exception {
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("user", user);
			Usuario usuario = ciudadanoServiceBean.findByNamedQuerySingleResult(Usuario.FIND_BY_USER, params);
			Set<Rol> roles = usuario.getRoles();
			if (roles == null || roles.isEmpty())
				throw new Exception();
			else {				
				List<String> result = roles.stream().map(Rol::getNombre).collect(Collectors.toList());
				result.add(Rol.AUTHORIZED);
				return result;
			}
		} catch (Exception e) {
			throw new Exception("no roles");
		}
	}
}
