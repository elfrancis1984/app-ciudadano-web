package ec.gob.mdt.ciudadano.realm;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.sun.appserv.security.AppservPasswordLoginModule;

import ec.gob.mdt.ciudadano.ejb.ContextUtil;

public class LoginModule extends AppservPasswordLoginModule {

	@Override
	protected void authenticateUser() throws LoginException {
		ContextUtil.authenticateUser(_username, _passwd);

		List<String> roles = ContextUtil.getGroups(_username);
		String[] groups = new String[roles.size()];
		for (int i = 0; i < roles.size(); i++) {
			groups[i] = roles.get(i);
		}
		commitUserAuthentication(groups);
	}

}
