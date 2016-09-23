package ec.gob.mdt.ciudadano.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("booleanToStringConverter")
public class BooleanToStringConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return arg2;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent component, Object value) {
		boolean result = (Boolean) value;
		return result ? "Sí" : "No";
	}

}
