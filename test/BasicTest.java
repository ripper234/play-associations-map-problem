import models.Bar;
import models.ListOfBars;
import models.MapOfBars;
import org.junit.Test;
import play.test.UnitTest;

public class BasicTest extends UnitTest {
    @Test
    public void listOfBars() {
        ListOfBars list = new ListOfBars();
        Bar bar = new Bar();
        bar.k = "k";
        bar.v = "v";
        list.bars.add(bar);
        list.save();
    }

    @Test
    public void mapOfBars() {
        MapOfBars map = new MapOfBars();
        Bar bar = new Bar();
        bar.k = "k";
        bar.v = "v";
        map.bars.put("k", bar);
        map.save();
    }
}
