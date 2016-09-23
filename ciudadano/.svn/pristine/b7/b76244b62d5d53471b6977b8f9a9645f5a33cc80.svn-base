package ec.gob.mdt.ciudadano.web.converter;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import ec.gob.mdt.ciudadano.web.util.JsfUtil;

@FacesValidator("emailValidator")
public class EmailValidator implements Validator {

	public static final String REGEX_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private String message;
	
	private Pattern pattern;

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value.toString() == null || value.toString().isEmpty())
			return;

		if (!getPattern().matcher(value.toString()).matches())
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, getMessage(), getMessage()));
	}

	public String getMessage() {
		return message == null ? message = JsfUtil.getMessageFromBundle("jsf", "org.apache.myfaces.Email.INVALID")
				: message;
	}
	
	public Pattern getPattern() {
		return pattern == null ? pattern = Pattern.compile(REGEX_EMAIL) : pattern;
	}
}
