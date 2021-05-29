package coding.interviews.Klarna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Klarna {

    public static String ingredients(String order) {
        Map<String, String> menu = new HashMap<String, String>();
        menu.put("Classic", "strawberry,banana,pineapple,mango,peach,honey");
        menu.put("Freezie", "blackberry,blueberry,black currant,grape juice,frozen yogurt");
        menu.put("Greenie", "green apple,lime,avocado,spinach,ice,apple juice");
        menu.put("Just Desserts", "banana,ice cream,chocolate,peanut,cherry");

        String ingredients = "";
        String[] orderWithIngredients;
        if (order != null && !order.isEmpty()) {
            orderWithIngredients = order.split(",");
            if (orderWithIngredients != null) {
                if (!menu.containsKey(orderWithIngredients[0])) {
                    throw new IllegalArgumentException();
                }
                ingredients = menu.get(orderWithIngredients[0]);
                for (int i = 1; i < orderWithIngredients.length; i++) {
                    if (orderWithIngredients[i].startsWith("-")) {
                        if (!ingredients.contains(orderWithIngredients[i].substring(1))) {
                            throw new IllegalArgumentException();
                        }
                        ingredients = ingredients.replaceAll(orderWithIngredients[i].substring(1), "");
                    } else if (!ingredients.contains(orderWithIngredients[i])) {
                        throw new IllegalArgumentException();
                    }
                }
                String[] ingredientsArray = ingredients.split(",");
                Arrays.sort(ingredientsArray);
                ingredients = "";
                for (int i = 0; i < ingredientsArray.length; i++) {
                    if (!ingredientsArray[i].equals("") && !ingredientsArray[i].isEmpty()) {
                        ingredients += ingredientsArray[i];
                        if (i < ingredientsArray.length - 1) {
                            ingredients += ",";
                        }
                    }
                }
            } else {
                return "";
            }
        }

        return ingredients;
    }

    @Test
    public void test_ingredients() {
        String input = "Classic,-strawberry,-peanut";
        String output = "banana,honey,mango,peach,pineapple";
        assertEquals(output, Klarna.ingredients(input));
    }

    @Test
    public void classicSmoothie() {
        assertEquals("banana,honey,mango,peach,pineapple,strawberry",
                Klarna.ingredients("Classic"));
    }

    @Test
    public void classicSmoothieWithoutStrawberry() {
        assertEquals("banana,honey,mango,peach,pineapple",
                Klarna.ingredients("Classic2,chocolate"));
    }
}


/*


Functional Smooothies Inc. is releasing a new smoothie machine that will make the best icy fruit beverages of all time. According to Wikipedia:

    A smoothie (occasionally spelled smoothee or smoothy) is a thick, cold beverage made from pureed raw fruit blended with ice cream or frozen yogurt along with other ingredients such as crushed ice, fruit juice, sweeteners, dairy products, nuts, seeds, etc.

In order to sell the machine to smoothie vendors all over the world, Functional Smooothies needs to ensure that the machine takes all dietary preferences and allergies into account. They have hired you to write the software for the machine.

The software has a menu of standard smoothie options, including the ingredients for each drink. When a customer places their order, they supply a list of zero or more dietary restrictions that must be honoured. Your software will print out a list of the ingredients that the smoothie operator needs to put into the machine.
Menu

The menu options, along with the ingredients needed for each are as follows.

    Classic: strawberry, banana, pineapple, mango, peach, honey
    Freezie: blackberry, blueberry, black currant, grape juice, frozen yogurt
    Greenie: green apple, lime, avocado, spinach, ice, apple juice
    Just Desserts: banana, ice cream, chocolate, peanut, cherry

Input

You should write a function called ingredients, which takes as input a string containing item from the menu and optionally one or more ingredients to omit from the smoothie, separated by commas.

Restricted ingredients have to be preceded by - sign, as opposed to the ones that should be added. Note that:

    It is valid to have the allergens not present in the ordered smoothie. Those ingredients will just be ignored and no exception should be thrown.
    As adding new ingredients is not supported yet, any input with additional ingredients is considered invalid and an IllegalArgumentException should be thrown.

In very rare cases of the user input processor mechanical failures, their order might be lost or arrive empty to the software.
Output

The function should return a string listing the ingredients that the operator needs to put in. To make it more convenient for the operator, the ingredients should be listed in alphabetical order and separated by commas in the string returned from the function.

A smoothie with no ingredients is represented as "". In case of input being invalid, an IllegalArgumentException should be thrown.
Examples

    if a customer orders a Classic but is allergic to strawberry and peanuts, your function will be called with the argument "Classic,-strawberry,-peanut" and should return "banana,honey,mango,peach,pineapple". Note that peanut was ignored as it is not a part of the Classic menu.
    Requesting Classic with additional chocolate "Classic,chocolate" should result in IllegalArgumentException being thrown.
    Same result should apply for requesting a smoothie that is not present in the menu "Vitamin smoothie".


 */
/*

Problem statement

You've been assigned to a task force aiming to develop a new generation of hard disk drives.
One of the key components you will work on, is responsible for storing the data on the drive.

We need of a function that can determine if a certain file can be stored in given a disk block in one chunk. In order to tell that there must be at least fileSize number of contiguous free disk sectors in a given block.

You are given Set<Integer> occupiedSectors where each element is a sector between 1 and blockSize that is already occupied by some other data.
The sectors are free to be written to otherwise.

Return a boolean stating if it is possible to store the file in the given block.

Although it is an early experimental development phase, please keep in mind that, it is undesired to have the so-far-excellent disk performance degraded by way-too-slow isWritable method execution.
Input

Method signature:

boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors)

Constraints:

    blockSize will be between 1 and 1,000,000, inclusive.
    fileSize will be between 1 and blockSize, inclusive.
    occupiedSectors will contain between 1 and 1,000,000 elements, inclusive.
    Each element of occupiedSectors will be between 1 and blockSize, inclusive.
    Elements of occupiedSectors will be distinct.
    Expected execution time is below 10 seconds.

Output

A boolean result telling if it is possible to store the file on a given disk block.
Examples

    isWritable(1, 1, []) returns true as there is exactly 1 free sector which is enough to store the file of size 1
    isWritable(1, 1, [1]) returns false as there's no free disk space at all
    isWritable(4, 2, [1, 4]) returns true as the file of size 2 can be stored on sectors 2 and 3


 */