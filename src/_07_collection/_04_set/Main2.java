package _07_collection._04_set;


import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
       var fishes = new HashSet<Fish>();
      var f1 = new Fish("Пенка", 1);
      var f2 = new Fish("Волна", 2);
      fishes.add(f1);
      fishes.add(f2);
      System.out.println(fishes);
      f1.setAge(2);
//      for (Fish fish: fishes) {
//          if (fish.getName().equals(f1.getName())) {
//              fishes.remove(f1);
//          }
//      }
//      fishes.remove(f1);
        var it =fishes.iterator();
        if (it.hasNext()) {
            var f = it.next();
            if (f.getName().equals(f1.getName())) {
                it.remove();
            }
        }
      System.out.println(fishes);

    }
}
