package Collections1;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger 
{
    public static int romanToInt(String roman) 
    {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        romanMap.put('Z', 1000);
        int result = 0;
        for (int i = 0; i < roman.length(); i++)
        {
            int currentVal = romanMap.get(roman.charAt(i));
            if (i < roman.length() - 1 && currentVal < romanMap.get(roman.charAt(i + 1)))
            {
                result -= currentVal;
            } 
            else
            {
                result += currentVal;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman numeral:");
        String roman = sc.nextLine().toUpperCase(); 
        if (roman.matches("[IVXLCDMZ]+")) 
        {
        	int result = romanToInt(roman);
            System.out.println("The numeric value of the Roman numeral " + roman + " is: " + result);
        }
        else 
        {
            System.out.println("Invalid Roman numeral input!");
        }
        
        sc.close();
    }
}

