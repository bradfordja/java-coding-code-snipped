import java.util.ArrayList;  
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class ArrayListFilterSort {
    
    public static void main(String[] args) {  
        List<Product> Chocolatelist = new ArrayList<Product>();  
          
        // Adding Products  
        Chocolatelist.add(new Product(1, "Mars", 17));  
        Chocolatelist.add(new Product(3, "Ghirardelli", 28));  
        Chocolatelist.add(new Product(2, "Hersheys", 4));
        Chocolatelist.add(new Product(4, "Godiva", 21));
          
        System.out.println("Sorting on the basis of name!");  
  
        // implementing lambda expression to SORT BY NAME
        Chocolatelist.sort((a, b) -> a.name.compareTo(b.name));

        // print the sorted values
        System.out.println("Sorted values are:");  
        for (Product p : Chocolatelist) {  
            System.out.println(p.id + " " + p.name + " " + p.price); 
        }

        // implementing lambda expression to SORT BY ID
        Chocolatelist.sort((a, b) -> Integer.compare(a.id, b.id));
    
        // print the sorted values
        System.out.println();
        System.out.println("Sorting on the basis of Id!"); 
        System.out.println("Sorted values are:");  
        for (Product p : Chocolatelist) {  
            System.out.println(p.id + " " + p.name + " " + p.price); 
        }

        // implementing lambda expression to SORT BY PRICE
        Chocolatelist.sort((a, b) -> Float.compare(a.price, b.price));
    
       // print the sorted values
       System.out.println();
       System.out.println("Sorting on the basis of Price!"); 
       System.out.println("Sorted values are:");  
       for (Product p : Chocolatelist) {  
           System.out.println(p.id + " " + p.name + " " + p.price); 
       }

       // BONUS: Filter the chocolate list- display the chocolates > $20
       System.out.println();
       System.out.println("Filter by chocolate price:");
       List<Product> FilteredChocolatelist = Chocolatelist.stream()
                                                          .filter(p -> p.price > 20)
                                                          .collect(Collectors.toList());
    
       // print the filtered values
       for (Product p : FilteredChocolatelist) {  
           System.out.println(p.id + " " + p.name + " " + p.price); 
       }
    }  
}
