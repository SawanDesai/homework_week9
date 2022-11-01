import java.util.ArrayList;
import java.util.Iterator;

public class Programme5 {
    public static void main(String[] args) {
        ArrayList studentName = new ArrayList();
        studentName.add("Alex");
        studentName.add("Mark");
        studentName.add("Ben");
        studentName.add("Chloe");
        studentName.add("Ella");

        //iterating the array list using Iterator
        Iterator itr = studentName.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
