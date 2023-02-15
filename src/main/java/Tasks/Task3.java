package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        FillArrayList(planets, 16);
        System.out.println(planets);
        CutRepeatElements(planets);

    }
    public static void FillArrayList(ArrayList someArray, int size){
        String [] planetNames = new String[] {"Венера", "Сатурн", "Солнце", "Луна", "Плутон", "Марс", "Юпитер", "Меркурий", "Уран"};
        Random rnd = new Random();
        for (int i = 0; i < size; i++){
            int index = rnd.nextInt(0,9);
            someArray.add(planetNames[index]);
        }
    }
    public static ArrayList<Integer> CalculateFrequancy(ArrayList someArray){
        int index = 0;
        Collections.sort(someArray);
        ArrayList<Integer> countList = new ArrayList<>();
        while (index < someArray.size()){
            String value = someArray.get(index).toString();
            int count = Collections.frequency(someArray,value);
            System.out.printf("%s - %d ", value, count);
            System.out.println();
            countList.add(count);
            index = index + count;
        }
        return countList;
    }
    public static void CutRepeatElements(ArrayList someArray){
        ArrayList<Integer> frequancy = new ArrayList<>();
        frequancy = CalculateFrequancy(someArray);
        int index = 0;
        for (int i = 0; i < frequancy.size(); i ++){
            index = frequancy.get(i);
            while (index > 1){
                someArray.remove(i);
                index--;
            }
        }
        System.out.println(someArray);

    }
}
