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
}
