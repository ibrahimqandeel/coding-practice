package code.war.challenges.hackerrank;

public class SaveThePrisoner {
    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int round = s + (m - 1);
        int result = round % n;
        if (result == 0) {
            return s;
        }
        return result;
    }

    public static void main(String[] args) {
        int numOfPrisoners = 3;
        int numOfSweets = 7;
        int startingChairNum = 3;


//        if (numOfSweets > numOfPrisoners) {

//        } else {
//            System.out.println(startingChairNum + numOfSweets);
//        }

    }
}
