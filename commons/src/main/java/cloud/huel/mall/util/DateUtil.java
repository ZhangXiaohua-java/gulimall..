package cloud.huel.mall.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public final class DateUtil {

	private static final String CURRENT_ZONE_ID = "Asia/Shanghai";
	private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	/**
	 *  获取当前系统的时钟
	 * @return 字符串的时间表示
	 */
	public static String getLocalStandardTime() {
		ZonedDateTime now = ZonedDateTime.now();
		return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

	}

	/**
	 *  返回一个线程安全的日期对象
	 * @param date 接收一个java.util.Date
	 * @return LocalDateTime
	 */
	private static LocalDateTime convert(Date date) {
		Instant instant = date.toInstant();
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		return localDateTime;
	}



	/** 格式化日期,格式yyyy-MM-dd HH:mm:ss,线程安全
	 * @param date 日期对象
	 * @return
	 */
	public static String dateTimeFormat(Date date) {
		return dateTimeFormatter.format(convert(date));
	}

	/**
	 * 解析字符串返回一个Date对象
	 * @param dateTime 日期表示
	 * @return java.util.Date
	 */
	public static Date parseDate(String dateTime) {
		TemporalAccessor parse = dateTimeFormatter.parse(dateTime);
		ZoneId zoneId = ZoneId.systemDefault();
		Instant instant = LocalDateTime.from(parse).atZone(zoneId).toInstant();
		Date date = new Date(instant.toEpochMilli());
		//Date.from(instant);
		return date;
	}


	public static void main(String[] args) {
		ZoneOffset.getAvailableZoneIds()
				.stream()
				.filter(e->e.contains("Asia/Shanghai"))
				.forEach(s-> System.out.println(s));
		String s = dateTimeFormat(new Date());
		Date date = parseDate(s);
		System.out.println(date);
		System.out.println(dateTimeFormat(date));
	}



	
}
