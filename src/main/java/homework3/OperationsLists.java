package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OperationsLists {

    public static void main(String[] args) {
//        new OperationsLists().RemoveEvenNum();
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomList.add(new Random().nextInt(100));
        }
        System.out.println(randomList);
        System.out.println("-".repeat(100));

        ArrayList<Integer> oddList = new ArrayList<>();
        oddList.addAll(randomList);
        for (int i = 0; i < oddList.size(); i++) {
            if (oddList.get(i) % 2 == 0) {
                oddList.remove(i);
                i--;
            }
        }
        System.out.println("Список без четных чисел: \n" + oddList);
        System.out.println("-".repeat(100));
        System.out.println("Минимальное значение из списка: " + Collections.min(randomList));
        System.out.println("-".repeat(100));
        System.out.println("Максимальное значение из списка: " + Collections.max(randomList));
        System.out.println("-".repeat(100));

        double average = 0;
        for (int i = 0; i < randomList.size(); i++){
            average += randomList.get(i);
        }
        average /= randomList.size();
        System.out.println("Среднее значение = " + average);
    }
}

