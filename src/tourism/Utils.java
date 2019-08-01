package tourism;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Utils {
	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	/**
	 * ask to the user to enter value from a field of a class
	 * @param m
	 * @param obj
	 * @throws Exception
	 */
	public static void askField(Method m, Object obj) throws Exception {
		// Check type of the field
		Scanner sc = new Scanner(System.in);
		Class<?> param = m.getParameterTypes()[0];
		if (param.equals(Integer.class)) {
			m.invoke(obj, sc.nextInt());
		} else if(param.equals(String.class)) {
			m.invoke(obj, sc.nextLine());
		}
		
	}
	
	/**
	 * 
	 * @param tableName
	 * @return an instance object of the class name
	 * @throws Exception
	 */
	public static Object instanceByClassName (String tableName) throws Exception {
		String tableUpper = tableName.substring(0, 1).toUpperCase() + tableName.substring(1);
		Class<?> entitieClass = Class.forName("entities." + tableUpper);
		Object obj = (Object)entitieClass.getConstructor().newInstance();
		return obj;
	}
	
	/**
	 * Check if method is getter from his name
	 * @param method
	 * @return
	 */
	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}
	
	/**
	 * check if method is a setter from his name
	 * @param method
	 * @return
	 */
	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}
}
