package code.war.interviews;

import java.util.*;

public class Rain {

    public static void main(String[] args) {

        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
        String[] suites = {"Clubs", "Diamonds", "Hearts", "Spades"};


        String[] cards = new String[52];

        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < suites.length; j++) {
                cards[count] = values[i] + suites[j];
                count++;
            }
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + ",");
        }
        System.out.println();

        Random rand = new Random();
        int random = rand.nextInt(52);

        Set numberSet = new HashSet();
        Map<Integer, Integer> numberMap = new HashMap<>();

        while (numberMap.size() < 52) {
            random = rand.nextInt(52);
            if (!numberMap.containsKey(random)) {
                numberMap.put(random, random);
            }
        }
        while (numberSet.size() < 52) {
            random = rand.nextInt(52);
            numberSet.add(random);
        }
        numberMap.forEach((key, value) -> System.out.println(cards[key]));
//        Iterator loop = numberSet.iterator();

//        while (loop.hasNext()) {
//            System.out.println(cards[(int) loop.next()]);
//        }
    }
}

/*
Ahmed Al'Hulaibi‏
4:16 م
I can hear you but you can't hear me‏
أنت
4:16 م
can you hear me ?‏
أنت
4:18 م
Call stopped‏
Ahmed Al'Hulaibi‏
4:18 م
I can hear you, I'm still connected‏
Ahmed Al'Hulaibi‏
4:56 م
Select any general data model you might be familiar with (e.g. NBA teams, social media platforms, cryptocurrencies, etc.)
Setup a basic RESTful API web service that has an endpoint that can either accept a POST request to create a new record, or a GET request where it will return all the items in a collection.‏
JSON‏
Ahmed Al'Hulaibi‏
5:20 م
Problem: Create a string array containing a representation of the 52 cards in a standard deck, and then a second array that shuffles the 52 cards.
Start with two string arrays of the cards and suits:
Values: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, K, Q, A
Suits: Clubs, Diamonds, Hearts, Spades‏
var values = ['2','3,''4',...]‏
var suites = ['clubs',diamonds'...]‏
Ahmed Al'Hulaibi‏
5:21 م
2clubs 2diamonds‏
Ahmed Al'Hulaibi‏
5:22 م
[‘2Clubs’, ‘2Hearts’,...]‏
Ahmed Al'Hulaibi‏
5:26 م
https://blog.codinghorror.com/content/images/uploads/2007/12/6a0120a85dcdae970b012877702239970c-pi.jpg ‏
Ahmed Al'Hulaibi‏
6:01 م
ahmed.alhulaibi@rain.bh‏

 */
