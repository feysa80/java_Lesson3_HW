package Tasks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int lstSize = 10;
        ArrayList<Integer> lst = new ArrayList<>(lstSize);
        FillArray(lst, lstSize, 1, 21);
        System.out.println(lst);
        DeleteOdd(lst);
        System.out.println(lst);

    }
    public static void FillArray(ArrayList list1, int size, int min, int max){
        Random rndm = new Random();
             for (int i = 0; i < size; i ++){
                 list1.add(i, rndm.nextInt(min, max));
             }
    }
    public static void DeleteOdd(ArrayList<Integer> list1){
        for (int i = 0; i <= list1.size(); i ++){
            if (list1.get(i) % 2 == 0){
                list1.remove(i);
            }

        }

    }
}
