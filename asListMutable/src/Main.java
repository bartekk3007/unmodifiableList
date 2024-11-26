import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        String[] stringArray = {"Andrzej", "Bartek", "Jan"};
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(stringArray));
        stringArrayList.add("Dariusz");
        System.out.println(stringArrayList);

        //List<String> arrayListCopy = List.copyOf(stringArrayList);
        //arrayListCopy.add("Edward");
        //System.out.println(arrayListCopy);

        List<String> listUn = Collections.unmodifiableList(stringArrayList);
        System.out.println(listUn);
        stringArrayList.add("Filip");
        System.out.println(stringArrayList);
        System.out.println(listUn);
    }
}