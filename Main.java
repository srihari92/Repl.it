import java.time.LocalDateTime;
import java.time.ZoneOffset;

import java.util.*;
class Main {
  public static void main(String[] args) {
  LocalDateTime currentTime = LocalDateTime.now().toLocalDate().atStartOfDay();
  ZoneOffset localoffset = ZoneOffset.systemDefault().getRules().getOffset(currentTime);
		Long from = currentTime.toInstant(localoffset).toEpochMilli();
    System.out.println(from);

    Calendar calendar = Calendar.getInstance();
    calendar.setTimeZone(TimeZone.getDefault());
		calendar.set(Calendar.YEAR, 2021);
		calendar.set(Calendar.MONTH, 9 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, 30);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
    System.out.println(calendar.getTimeInMillis());
  }
}