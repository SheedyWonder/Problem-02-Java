package cd.get.ready.algorithms;
import java.util.*;
public class CountDuplicates
{
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    //Use a hashmap
    public Integer countDuplicates(String[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++)
        {
            for (int j = i + 1; j < input.length; j++)
            {
                if(input[i] == input[j])
                {
                    count++;
                }
            }
        }
            return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input)
{
    return null;
}
/*
private static void findDuplicatesUsingHashMap(int[] inputArray)
{
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int element : inputArray)
    {
        if(map.get(element) == null)
        {
            map.put(element, 1);
        }
        else
        {
            map.put(element, map.get(element)+1);
        }
    }

    Set<Entry<Integer, Integer>> entrySet = map.entrySet();

    for (Entry<Integer, Integer> entry : entrySet)
    {
        if(entry.getValue() > 1)
        {
            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
        }
    }
}
 */
}
