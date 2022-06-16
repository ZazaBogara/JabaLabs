package org.example;

/**
 * Hello world!
 *
 */
public class main
{
    public static void main( String[] args ) {
        String out = toDo("asd asdfga bcasd gfdas basdf aqwer");
        System.out.println(out);
    }
    public static String toDo(String Text)
    {
        String out = "";
        String[] words = Text.split(" ");
        boolean did;
        for(char i='a';i<'z';i++)
        {
            did= false;
            for(int j=0;j<words.length;j++)
            {
                if(words[j].charAt(0) == i)
                {
                    did = true;
                    out+= words[j] + " ";
                }
            }
            if(did)
                out +=  "\n";
        }
        return out;
    }
}
