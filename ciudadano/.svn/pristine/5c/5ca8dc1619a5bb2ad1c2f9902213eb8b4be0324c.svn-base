package ec.gob.mdt.ciudadano.realm;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

import com.sun.appserv.security.AppservRealm;
import com.sun.enterprise.security.auth.realm.BadRealmException;
import com.sun.enterprise.security.auth.realm.InvalidOperationException;
import com.sun.enterprise.security.auth.realm.NoSuchRealmException;
import com.sun.enterprise.security.auth.realm.NoSuchUserException;

import ec.gob.mdt.ciudadano.ejb.ContextUtil;

public class CustomRealm extends AppservRealm {

	public static final String JAAS_CONTEXT = "jaas-context";
	public static final String AUTH_TPYE = "ciudadano_jdbc_form";

	@Override
	public void init(Properties properties) throws BadRealmException, NoSuchRealmException {
		String propJaasContext = properties.getProperty(JAAS_CONTEXT);
		if (propJaasContext != null)
			setProperty(JAAS_CONTEXT, propJaasContext);
	}

	@Override
	public String getAuthType() {
		return AUTH_TPYE;
	}

	@Override
	public Enumeration<?> getGroupNames(String user) throws InvalidOperationException, NoSuchUserException {
		return Collections.enumeration(ContextUtil.getGroups(user));
	}

}
