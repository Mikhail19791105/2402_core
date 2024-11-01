package _06_generics._05_method;

public class DemoMethod {
    public static <T> void printArray(T... items) {

        for (T item : items) {
            System.out.println(item);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T, E> T concat(E param1, E param2) {
        if (param1 instanceof String && param2 instanceof String) {
            return  (T) new  StringBuilder(String.join(" and "
                    , (String)param1, (String) param2)).append(" = Love").toString();
        }
        if (param1 instanceof  Integer && param2 instanceof Integer) {
            return (T) Integer.valueOf((Integer) param1 + (Integer)  param2);
        }
        return null;
    }
}
