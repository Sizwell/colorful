package za.ac.cput.colorful;

import Question2.Crocodile;
import Question2.Snake;
import Question3.Nokia;
import Question3.Samsung;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColorsTest {

    Colors colors;
    Crocodile croc;
    Snake snake;

    Nokia nokia;
    Samsung samsung;

    //Settings things you need before starting with test..... Also known As pre-conditions
    @Before
    public void setUp() throws Exception {
       colors = new Colors();
       croc = new Crocodile();
       snake = new Snake();

       nokia = new Nokia();
       samsung = new Samsung();
    }

    //Freeing resources after testing.. Like closing a File in File handling
    @After
    public void tearDown() {

    }

    @Test
    public void getCollection(){
       Collection collection = colors.getCollection();
        Assert.assertEquals(colors.getCollection(), collection);

    }

    @Test
    public void getList(){
        List list = colors.getList();
        Assert.assertEquals(colors.getList(), list);

    }

    @Test
    public void getMap(){

        Map map = colors.getMap();
        Assert.assertEquals(colors.getMap(), map);
    }

    @Test
    public void getSet(){

        Set set = colors.getSet();
        Assert.assertEquals(colors.getSet(), set);
    }

    @Test
    public void crocEat(){
        String food = croc.eat();

        Assert.assertEquals(croc.eat(), "Meat");
       // Assert.assertEquals(croc.move(), "Hops");
    }

    @Test
     public void crocMove(){
    String run = croc.move();
    Assert.assertEquals(croc.move(), "Crawl");
    }

    @Test
    public void snakeEat(){

        String food = snake.eat();
        Assert.assertEquals(snake.eat(), "Frogs");
    }

    @Test
    public void snakeMove(){
        String move = snake.move();
        Assert.assertEquals(snake.move(), "Slither");
    }

    @Test
    public void simcard(){
        String sim = samsung.simcard();
        Assert.assertEquals(samsung.simcard(), "Normal");
    }

    @Test
    public void camera(){
        String cam = samsung.camera();
        Assert.assertEquals(samsung.camera(), "Digital");
    }

    @Test
    public void nokiaCam(){
        String ncam = nokia.camera();
        Assert.assertEquals(nokia.camera(), "Flashy");
    }

    @Test
    public void nokiaSim(){
        String nsim = nokia.simcard();
        Assert.assertEquals(nokia.simcard(), "Dual");
    }

}
