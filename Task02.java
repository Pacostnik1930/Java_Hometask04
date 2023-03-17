
// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
import java.util.LinkedList;

public class Task02 { 
    public static void main(String[] args) { 
        LinkedList<Integer> list = new LinkedList<Integer>(); 
        System.out.println("Вот наш список: "); 
        list.add(15); 
        list.add(20); 
        list.add(5); 
        list.add(10); 
        System.out.println(list); 
        LinkedList<Integer> reversList = new LinkedList<>(); 
        for (Integer i : list) { 
            reversList.add(i); 
        } 
        int i = 0; 
        while (i != reversList.size() - 1) { 
            reversList.add(reversList.size() - i, reversList.getFirst()); 
            reversList.removeFirst(); 
            i++; 
        } 
 
        System.out.println("Наш результат: " + reversList); 
    } 
}

    

