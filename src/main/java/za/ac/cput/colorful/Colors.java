package za.ac.cput.colorful;

import java.util.*;

public class Colors {

    public Collection <String> getCollection(){

        Collection <String> collect = new ArrayList<>();
        collect.add("Blue");
        collect.add("Red");
        collect.add("Orange");
        collect.add("Green");
        collect.add("Black");
        collect.add("Grey");

        System.out.println("Colors: " + collect);
      //  System.out.println("Color at index 3: " + ((ArrayList<String>) collect).remove(3));

        return collect;

    }

    public List<String> getList(){

        List <String> lst = new ArrayList<>();
        //((ArrayList <String> lst).add("Purple");
        lst.add("White");
        lst.add("Brown");
        lst.add("Purple");
        lst.add("Yellow");
        lst.add("Pink");

        System.out.println("\nList size: " + lst.size());

        return lst;

    }

    public Set <String> getSet(){

       Set <String> set = new HashSet<>();

       set.add("Bright Green");
       set.add("Charcoal");
       set.add("Maroon");
       set.add("Cocoa brown");
       set.add("Copper");

        System.out.println("\nList has " + set.size() + " colors >> " + set.toString());

       return set;
    }

    public Map <Integer, String> getMap(){

        Map <Integer, String> mp = new HashMap<>();

        mp.put(2, " Beige");
        mp.put(4, " Violet");
        mp.put(6," Bole");
        mp.put(1, " Bronze");
        mp.put(3, " Cola");

        System.out.println("Color Removed: " + mp.remove(6));
        System.out.println("Remaining list after removing " + mp.toString() + "\n");

        return mp;
    }

}
