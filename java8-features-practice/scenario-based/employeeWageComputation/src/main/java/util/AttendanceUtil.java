package util;

import java.util.Random;

public class AttendanceUtil {
	
	public static int getAttendance() {
		return new Random().nextInt(3);
	}

}
