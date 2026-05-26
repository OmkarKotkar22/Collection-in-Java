import java.util.*;

public class Remove_Even_Element_using_RemoveIf {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6));

        set.removeIf(n -> n % 2 == 0);

        System.out.println(set);
    }
}