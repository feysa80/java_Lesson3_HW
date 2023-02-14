package Tasks;


import java.util.ArrayList;
import java.util.Comparator;

import static Tasks.Task1.FillArray;

public class Task2 {
    public static void main(String[] args) {
        int listSize = 10;
        ArrayList<Integer> list2= new ArrayList<>();
        FillArray(list2, listSize,1, 11);
        System.out.println(list2);
        int min = FindMin(list2);
        System.out.printf("Минимальное значение - %d\n", min);
        int max = FindMax(list2);
        System.out.printf("Максимальное значение - %d\n", max);
        double average = FindAverage(list2);
        System.out.printf("Среднее арифметическое значение - %s", average);


    }
    public static int FindMin(ArrayList<Integer> list1){
        list1.sort(Comparator.naturalOrder());
        return list1.get(0);
    }
    public static int FindMax(ArrayList<Integer> list1){
        list1.sort(Comparator.naturalOrder());
        return list1.get(list1.size()-1);
    }
    public static double FindAverage(ArrayList<Integer> list1){
        double sum = 0;
        for (int element: list1) {
            sum = sum + element;
        }
        double result = sum / list1.size();
        return result;
    }
}
