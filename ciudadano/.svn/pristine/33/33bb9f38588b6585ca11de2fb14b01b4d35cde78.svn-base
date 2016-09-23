package ec.gob.mdt.ciudadano.model.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ConverterGenero implements AttributeConverter<String, Integer> {

	private static final String genero_maculino = "Masculino";
	private static final String genero_femenino = "Femenino";

	public Integer convertToDatabaseColumn(String attribute) {
		return attribute != null && genero_maculino.equals(attribute) ? 1 : 0;
	}

	public String convertToEntityAttribute(Integer dbData) {
		return dbData != null && dbData.equals(1) ? genero_maculino : genero_femenino;
	}
}
