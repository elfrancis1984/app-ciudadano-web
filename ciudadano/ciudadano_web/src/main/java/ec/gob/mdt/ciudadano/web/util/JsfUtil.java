package ec.gob.mdt.ciudadano.web.util;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.el.ELContext;
import javax.el.MethodExpression;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.context.RequestContext;

public final class JsfUtil {
	
	public static void executeEndOperation(EndOperation end, Object result) {
		if (end != null)
			end.executeOnEnd(result);
	}

	public static FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	public static ExternalContext getExternalContext() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}

	public static ServletContext getServletContext() {
		return (ServletContext) JsfUtil.getExternalContext().getContext();
	}

	public static HttpServletRequest getRequest() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		return request;
	}

	public static String getHomeURL() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest req = (HttpServletRequest) context.getExternalContext().getRequest();
		String url = req.getRequestURL().toString();
		return url.substring(0, url.indexOf(req.getContextPath()) + req.getContextPath().length());
	}

	public static String getRelativeCurrentPage() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest req = (HttpServletRequest) context.getExternalContext().getRequest();
		String url = req.getRequestURL().toString();
		return url.substring(getHomeURL().length());
	}

	public static void addMesageInfo(String msg) {
		addMessage(msg, FacesMessage.SEVERITY_INFO);
	}

	public static void adicionarMensajeAdvertencia(String msg) {
		addMessage(msg, FacesMessage.SEVERITY_WARN);
	}

	public static void adicionarMensajeError(String msg) {
		addMessage(msg, FacesMessage.SEVERITY_ERROR);
	}
	
	public static String getMessageFromBundle(String bundleName, String key, Object... params) {
		String messageBundleName = bundleName;
		if (messageBundleName == null) {
			messageBundleName = FacesContext.getCurrentInstance().getApplication().getMessageBundle();
		}
		Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		ResourceBundle bundle = null;
		try {
			bundle = ResourceBundle.getBundle(messageBundleName, locale);
		} catch (Exception e) {
			bundle = FacesContext.getCurrentInstance().getApplication().getResourceBundle(FacesContext.getCurrentInstance(), messageBundleName);
		}
		try {
			return MessageFormat.format(bundle.getString(key), params);
		} catch (Exception e) {
			return '!' + key + '!';
		}
	}

	public static void primefacesOpenDialog(String widgetVar) {
		executeScript("PF('" + widgetVar + "').show()");
	}

	public static void primefacesCloseDialog(String widgetVar) {
		executeScript("PF('" + widgetVar + "').hide()");
	}

	public static void executeScript(String script) {
		getRequestContext().execute(script);
	}

	public static RequestContext getRequestContext() {
		return RequestContext.getCurrentInstance();
	}

	private static void addMessage(String msg, Severity severity) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, msg, null));
	}

	public static String actionNavigateURL(String url) {
		return url + "?faces-redirect=true";
	}

	public static String actionNavigateURL(String url, String... params) {
		String add = "";
		if (params != null) {
			for (String string : params) {
				add += string + "&";
			}
			add = add.substring(0, add.length() - 1);
		}
		return url + "?faces-redirect=true" + (add.isEmpty() ? add : "&" + add);
	}

	public static String getRequestParameter(String key) {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key) == null ? "" : FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
	}

	public static void redirectURL(String url) {
		try {
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			externalContext.redirect(externalContext.getRequestContextPath() + url);
		} catch (IOException e) {
			Logger.getLogger("").log(Level.SEVERE, e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> beanType) {
		String customName = null;
		try {
			customName = beanType.getAnnotation(ManagedBean.class).annotationType().getDeclaredMethod("name").invoke(beanType.getAnnotation(ManagedBean.class)).toString();
		} catch (Exception e) {

		}
		String standardBeanName = (beanType.getSimpleName().charAt(0) + "").toLowerCase() + beanType.getSimpleName().substring(1);

		if (customName != null && !customName.isEmpty())
			standardBeanName = customName;

		ELContext elContext = FacesContext.getCurrentInstance().getELContext();
		return (T) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, standardBeanName);
	}
	
	public static void addCallbackParam(String name) {
		RequestContext.getCurrentInstance().addCallbackParam(name, true);
	}

	public static UIComponent createComponent(String name) {
		return FacesContext.getCurrentInstance().getApplication().createComponent(name);
	}

	public static MethodExpression createMethodExpression(String expression, Class<?> returnType) {
		FacesContext context = FacesContext.getCurrentInstance();
		return context.getApplication().getExpressionFactory().createMethodExpression(context.getELContext(), expression, returnType, new Class[0]);
	}	
}