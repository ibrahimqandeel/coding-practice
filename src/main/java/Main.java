import coding.MyClass;
import com.sun.corba.se.impl.ior.JIDLObjectKeyTemplate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        System.out.println("**************** Welcome To Coding Practice Project ****************\n");
//
//        List<MyClass> streamList = new ArrayList<>();
//        streamList.add(new MyClass("NV"));
//        streamList.add(new MyClass("BBB"));
//        streamList.add(new MyClass("AB"));
//        streamList.add(new MyClass("AAA"));
//        streamList.add(new MyClass("ABC"));
//
////        List<MyClass> filteredList =
//        streamList.parallelStream().filter(item -> item.getName().contains("A")).findFirst().map(myClass -> {
//            myClass.setName("Lara");
//            return myClass;
//        });
//
//        streamList.stream().forEach(item -> System.out.println(item.getName()));
//        System.out.println();
////        filteredList.stream().forEach(item -> System.out.println(item));
//    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(checkArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); //true
        System.out.println(checkArray(new int[]{7, 2, 8, 4, 10, 6, 1, 3, 9, 5})); //true
        System.out.println(checkArray(new int[]{1, 2, 3})); //false
        System.out.println(checkArray(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 8, 9})); //false
        System.out.println(checkArray(new int[]{9, 2, 10, 3, 4, 5, 6, 7, 1, 9})); //false
    }

    public static boolean checkArray(int[] numArray) {
        if (numArray.length != 10) {
            return false;
        }
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] == numArray[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void test_checkArray() {
        Assertions.assertEquals(true, checkArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        Assertions.assertEquals(true, checkArray(new int[]{7, 2, 8, 4, 10, 6, 1, 3, 9, 5}));
        Assertions.assertEquals(false, checkArray(new int[]{1, 2, 3}));
        Assertions.assertEquals(false, checkArray(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 8, 9}));
        Assertions.assertEquals(false, checkArray(new int[]{9, 2, 10, 3, 4, 5, 6, 7, 1, 9}));
    }
}