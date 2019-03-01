package za.ac.cput.colorful;

import Question2.Crocodile;
import Question2.Reptiles;
import Question2.Snake;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Colors colors = new Colors();

        colors.getCollection();
        colors.getList();
        colors.getSet();
        colors.getMap();

       Reptiles reptiles = new Snake();
       Reptiles reptiles2 = new Crocodile();

        System.out.println("+++++ SNAKE +++++");
        System.out.println(reptiles.eat());
        System.out.println(reptiles.move());

        System.out.println("\n");
        System.out.println("+++++ CROCODILE +++++");
        System.out.println(reptiles2.eat());
        System.out.println(reptiles2.move());

       //snake.move();
       //snake.eat();
    }
}
