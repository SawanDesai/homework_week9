import java.util.Map;

public class Programme9 {
    public static void main(String[] args)
    {
        Map<String, Integer> people = new java.util.HashMap<>();
        people.put("A", 25);
        people.put("B", 50);
        people.put("C", 75);
        people.put("D", 100);

        //using the for-each loop to get the values
        for (Integer i : people.values())
        {
            System.out.println(i);
        }
    }
}
