import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonTest {

    private List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person( 5  , "Мухомор"),
            new Person( 6  , "Доброжир "),
            new Person( 7  , "Иркаил "),
            new Person( 8  , "Серафим"),
            new Person( 9  , "Агниил "),
            new Person( 15 , "Мерилл "),
            new Person( 14 , "Агафий "),
            new Person( 13 , "Рёрик  "),
            new Person( 50 , "Святополк"),
            new Person( 2  , "Баркадий"),
            new Person( 1  , "Аркадий"))
    );
    private int[] ids = new int[]{10, 1, 12, 13, 14, 15};
    private List<Person> expected = Arrays.asList(
            new Person( 1  , "Аркадий"),
            new Person( 13 , "Рёрик  "),
            new Person( 14 , "Агафий "),
            new Person( 15 , "Мерилл "),
            new Person( 5  , "Мухомор"),
            new Person( 6  , "Доброжир "),
            new Person( 7  , "Иркаил "),
            new Person( 8  , "Серафим"),
            new Person( 9  , "Агниил "),
            new Person( 50 , "Святополк"),
            new Person( 2  , "Баркадий")
    );

    @org.junit.Test
    public void order() {
        Person.order(persons,ids);
        Assert.assertEquals(expected,persons);
    }
}