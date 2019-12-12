package BID.SWE;

import java.util.LinkedList;

public class Exercise5Impl implements Exercise5
{
    LinkedList<String>myList = new LinkedList();

    @Override
    public Object Method1(String s, int i) {
        myList.add(s);
        myList.add(Integer.toString(i));
        return myList;
    }
}
