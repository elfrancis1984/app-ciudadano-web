package ec.gob.mdt.ciudadano.web.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("selectItemConverter")
public class SelectItemConverter implements Converter {
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		Object objeto = arg1.getChildren().get(0);
		if (objeto instanceof UISelectItem)
			objeto = arg1.getChildren().get(1);
		UISelectItems items = (UISelectItems) objeto;
		List<?> elements = (List<?>) items.getValue();
		Object myObject = null;
		if(elements!=null){
		for (Object object : elements) {
			if (object.toString().equals(arg2)) {
				myObject = object;
				break;
			}
		}
		}
		return myObject;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return arg2 == null ? null : arg2.toString();
	}

}
