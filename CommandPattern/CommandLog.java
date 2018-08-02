package CommandPattern;

import java.lang.reflect.Field;

public class CommandLog {
	public void getLog(Command command) {
		System.out.println(command.getClass().getName());
		getStatus(command);
	}

	public void getStatus(Command command) {
		Field[] fields = command.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				if (field.getType() == Light.class) {
					System.out.println((Light) field.get(command));

				} else if (field.getType() == Stereo.class) {
					System.out.println((Stereo) field.get(command));
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
}
