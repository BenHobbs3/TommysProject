import java.util.ArrayList;
import java.util.Collections;
public class Unjumble {
    public static void main(String[] args)
    {
        String jumbled = "ehunoeiftogrtihge";
        ArrayList<Integer> list1 = new ArrayList<>();

        while(jumbled.indexOf("g") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("g")) + jumbled.substring(jumbled.indexOf("g")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("i")) + jumbled.substring(jumbled.indexOf("i")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("h")) + jumbled.substring(jumbled.indexOf("h")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("t")) + jumbled.substring(jumbled.indexOf("t")+1);
            list1.add(8);
        }
        while(jumbled.indexOf("h") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("h")) + jumbled.substring(jumbled.indexOf("h")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("t")) + jumbled.substring(jumbled.indexOf("t")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("r")) + jumbled.substring(jumbled.indexOf("r")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            list1.add(3);
        }
        while(jumbled.indexOf("u") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("u")) + jumbled.substring(jumbled.indexOf("u")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("f")) + jumbled.substring(jumbled.indexOf("f")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("o")) + jumbled.substring(jumbled.indexOf("o")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("r")) + jumbled.substring(jumbled.indexOf("r")+1);
            list1.add(4);
        }
        while(jumbled.indexOf("f") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("f")) + jumbled.substring(jumbled.indexOf("f")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("i")) + jumbled.substring(jumbled.indexOf("i")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("v")) + jumbled.substring(jumbled.indexOf("v")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            list1.add(5);
        }
        while(jumbled.indexOf("v") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("s")) + jumbled.substring(jumbled.indexOf("s")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("v")) + jumbled.substring(jumbled.indexOf("v")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("n")) + jumbled.substring(jumbled.indexOf("n")+1);
            list1.add(7);
        }
        while(jumbled.indexOf("x") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("s")) + jumbled.substring(jumbled.indexOf("s")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("i")) + jumbled.substring(jumbled.indexOf("i")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("x")) + jumbled.substring(jumbled.indexOf("x")+1);
            list1.add(6);
        }
        while(jumbled.indexOf("z") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("z")) + jumbled.substring(jumbled.indexOf("z")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("r")) + jumbled.substring(jumbled.indexOf("r")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("o")) + jumbled.substring(jumbled.indexOf("o")+1);
            list1.add(0);
        }
        while(jumbled.indexOf("w") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("t")) + jumbled.substring(jumbled.indexOf("t")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("w")) + jumbled.substring(jumbled.indexOf("w")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("o")) + jumbled.substring(jumbled.indexOf("o")+1);
            list1.add(2);
        }
        while(jumbled.indexOf("o") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("o")) + jumbled.substring(jumbled.indexOf("o")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("n")) + jumbled.substring(jumbled.indexOf("n")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            list1.add(1);
        }
        while(jumbled.indexOf("n") != -1)
        {
            jumbled = jumbled.substring(0,jumbled.indexOf("n")) + jumbled.substring(jumbled.indexOf("n")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("i")) + jumbled.substring(jumbled.indexOf("i")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("n")) + jumbled.substring(jumbled.indexOf("n")+1);
            jumbled = jumbled.substring(0,jumbled.indexOf("e")) + jumbled.substring(jumbled.indexOf("e")+1);
            list1.add(9);
        }

        Collections.sort(list1);
        for(int i = 0; i < list1.size(); i++)
        {
            System.out.print(list1.get(i));
        }
    }
}
