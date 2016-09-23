package ec.gob.mdt.ciudadano.ejb.facade.app.remote;

import java.util.List;

public interface UsuarioFacadeInterface {

	public void verificarUsuario(String user, String pass) throws Exception;
	
	public List<String> getRoles(String user) throws Exception;
}
