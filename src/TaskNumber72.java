import java.util.*;

public class TaskNumber72 {
    public static void main(String[] args) {
        int[] mass = new int[2];
        mass[0] = 6;
        mass[1] = 5;
        System.out.println(Arrays.toString(mass));

        List<? super Number> list = new ArrayList<>();
        Object d = 6;
        Number k = 8;
        list.add((Number) d);
        System.out.println(list.get(0));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "h");
        map.put(null, null);
        map.put(4, "j");
        System.out.println(map.get(null).hashCode());
    }
    
//    static <T> T add(){
//        T a = null;
//        T b = null;
//
//        return (a + b);
//    }

}

