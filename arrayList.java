package basicJava;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList<>();
        ArrayList name = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }
        sc.nextLine();
        System.out.println("insert names : ");
        for (int i = 0; i <n; i++) {
            String nm = sc.nextLine();
            name.add(nm);
        }
        System.out.println("Size : " + arr.size() + " Index : " + arr);
        System.out.println("Name size : " + name.size() + " Name : " + name);

        Map<Integer, String> myMap = new HashMap<>();

        if(name.contains("mamun")){
            System.out.println("mamun is at position : " + name.indexOf("mamun"));
        }



        for (int i = 0; i < arr.size(); i++) {
            myMap.put((Integer) arr.get(i), (String) name.get(i));
        }
        System.out.println("Mymap datas are : \n" + myMap);
        if(myMap.get(2).equals("mamun")){
            System.out.println("My name is : " +myMap.get(1));
        } else{
            System.out.println(myMap.get(2));
        }

    }
}
