package ec.gob.mdt.ciudadano.web.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("listToStringConverter")
public class ListToStringConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return arg2;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent component, Object value) {
		List<?> list = (List<?>) value;
		return getListToString(list);
	}

	public static String getListToString(List<?> list) {
		String result = "";
		for (Object object : list) {
			result += object.toString() + ", ";
		}
		if (result.length() > ", ".length())
			result = result.substring(0, result.length() - ", ".length());
		return result;
	}
}
