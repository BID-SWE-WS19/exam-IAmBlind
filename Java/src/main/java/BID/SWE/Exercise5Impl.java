package BID.SWE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;

public class Exercise5Impl implements Exercise5
{
   /*LinkedList<String>myList = new LinkedList();

    @Override
    public Object Method1(String s, int i) {
        myList.add(s);
        myList.add(Integer.toString(i));
        return myList;
    }*/
    @Override
    public LinkedList<String> Method1(String s, int i) {
        LinkedList<String> myList = new LinkedList<>();
        try {
            Socket socket = new Socket(s, i);
            InputStreamReader inputReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputReader);

            String txt;
            while((txt = bufferedReader.readLine()) != null) {
                myList.add(txt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }
}
