import java.util.ArrayList;
import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Camel");
        arrayList.add("Horse");
        arrayList.add("Rabbit");
        arrayList.add("Elephant");
        arrayList.add("Lion");
        arrayList.add("Tiger");
        arrayList.add("Monkey");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number between 0 and 7");
        int index = scanner.nextInt();


        if(index == 0) {
            System.out.println("Camel");
        }else if (index==1) {
            System.out.println("Horse");
        }else if (index ==2) {
            System.out.println("Rabbit");
        }else if (index==3) {
            System.out.println("Elephant");
        }else if (index ==4) {
            System.out.println("Echo");
        }else if (index==5) {
            System.out.println("Lion");
        }else if (index==6) {
            System.out.println("Tiger");
        }else if(index ==7) {
            System.out.println("Monkey");
        }else {
            System.out.println("Invalid index number is entered");

        }

    }
}
