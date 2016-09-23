package ec.gob.mdt.ciudadano.ejb;

import java.util.List;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.security.auth.login.LoginException;

import ec.gob.mdt.ciudadano.ejb.facade.app.remote.UsuarioFacadeInterface;

public class ContextUtil {

	public static final String VERIFICAR_USUARIO = "java:global/ciudadano_ear/ciudadano_web-1.0/UsuarioFacade";

	private static UsuarioFacadeInterface getBean(String jndiClassname) throws Exception {
		Properties properties = new Properties();
		properties.put("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		properties.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		properties.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");

		InitialContext remoteContext = new InitialContext(properties);

		Object object = remoteContext.lookup(jndiClassname);

		return (UsuarioFacadeInterface) object;
	}

	public static void authenticateUser(String user, char[] pass) throws LoginException {
		try {
			UsuarioFacadeInterface usuarioFacadeInterface = getBean(VERIFICAR_USUARIO);
			usuarioFacadeInterface.verificarUsuario(user, new String(pass));
		} catch (LoginException e) {
			throw e;
		} catch (Exception e) {
			throw new LoginException((new StringBuilder()).append("Error en la validación del usuario: ").append(user).toString() + ". " + e.getMessage());
		}
	}

	public static List<String> getGroups(String user) {
		try {
			UsuarioFacadeInterface usuarioFacadeInterface = getBean(VERIFICAR_USUARIO);
			return usuarioFacadeInterface.getRoles(user);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
