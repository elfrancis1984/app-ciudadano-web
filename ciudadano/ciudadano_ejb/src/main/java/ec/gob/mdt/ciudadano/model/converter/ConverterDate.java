package ec.gob.mdt.ciudadano.model.converter;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import ec.gob.mdt.ciudadano.util.DatesUtil;

@Converter
public class ConverterDate implements AttributeConverter<LocalDateTime, Date> {

	public Date convertToDatabaseColumn(LocalDateTime attribute) {
		return DatesUtil.getJavaUtilDate(attribute);
	}

	public LocalDateTime convertToEntityAttribute(Date dbData) {
		return DatesUtil.getLocalDateTime(dbData);
	}
}
