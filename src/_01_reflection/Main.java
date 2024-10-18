package _01_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException,
            NoSuchMethodException, InvocationTargetException {

        //Создаем объект определенного типа в котором есть приватное поле и приватный метод
        var obj = new TestReflection();

        //Плучаем объект типа class для ранее созданного объекта  с помощью метода getDeclaredFild
        //достаем объект типа Field по имени omeField
       var field = obj.getClass().getDeclaredField("someField");

       //
       field.setAccessible(true);
       field.set(obj, "Some value");

        System.out.println(obj);

        var method = obj.getClass().getDeclaredMethod("someMethod");
        method.setAccessible(true);

        method.invoke(obj, null);

        var method1 = obj.getClass().getDeclaredMethod("methodWithArgs", String.class);
        method1.setAccessible(true);
        method1.invoke(obj,new String[]{"qwerty"});
    }
}
