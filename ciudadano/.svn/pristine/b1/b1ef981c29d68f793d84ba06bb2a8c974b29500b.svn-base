package ec.gob.mdt.ciudadano.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public final class DatesUtil {

	public static LocalDate getLocalDate(Date javaUtilDate) {
		return javaUtilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static LocalDateTime getLocalDateTime(Date javaUtilDate) {
		return javaUtilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	public static Date getJavaUtilDate(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	public static Date getJavaUtilDate(LocalDateTime localDate) {				
		return Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());
	}

	public static boolean isOverlap(LocalDateTime ldtStart1, LocalDateTime ldtEnd1, LocalDateTime ldtStart2,
			LocalDateTime ldtEnd2) {
		return !ldtStart1.isAfter(ldtEnd2) && !ldtStart2.isAfter(ldtEnd1);
	}
}
