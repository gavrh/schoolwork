import java.util.*;

public class Element
{
  String name;
  String symbol;
  int number;

  public Element (String na, String s, int nu)
  {
    name = na;
    symbol = s;
    number = nu;
  }

  public String toString()
  {
     return "Element " + name + " known as " + symbol + " #: " + number;
  }
  

    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
 
        //  The code for your answer would go here}
        ArrayList<Element> elements = new ArrayList<Element>();
        for (int i = 0; i < 10; i++) {
            String line = in.nextLine();
            String[] splitLine = line.split(" ");
            String name = splitLine[0];
            String symbol = splitLine[1];
            int number = Integer.parseInt(splitLine[2]);
            Element newElement = new Element(name, symbol, number);
            elements.add(newElement);
        }
        
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).toString());
        }
    }
}
