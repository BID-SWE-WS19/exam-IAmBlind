package BID.SWE;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Exercise4Impl implements Exercise4
{

    @Override
    public Object Method1() {
        //List<String> myList = Arrays.asList("Frohe Weihnachten", "42", "false");

        String text = "Frohe Weihnachten";
        int num = 42;
        boolean state = false;

        StringBuilder sb = new StringBuilder();

        sb.append(text);
        sb.append(num);
        sb.append(state);

        return sb.toString();
        //return String.format();
    }

    @Override
    public Object Method2(Object o) {
        //InputStreamReader reader = new InputStreamReader();

        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
}
