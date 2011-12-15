import models.Bar;
import models.ListOfBars;
import models.MapOfBars;
import org.junit.Test;
import play.test.UnitTest;

import java.util.ArrayList;
import java.util.HashMap;

public class BasicTest extends UnitTest {
    @Test
    public void listOfBars_relyOnAssociationsModule() {
        ListOfBars list = new ListOfBars();
        Bar bar = new Bar();
        bar.k = "k";
        bar.v = "v";
        list.bars.add(bar);
        list.save();
    }

    @Test
    public void listOfBars_manual() {
        ListOfBars list = new ListOfBars();
        Bar bar = new Bar();
        bar.k = "k";
        bar.v = "v";
        list.bars = new ArrayList<Bar>();
        list.bars.add(bar);
        bar.list = list;
        list.save();
    }

    @Test
    public void mapOfBars_relyOnAssociationsModule() {
        MapOfBars map = new MapOfBars();
        Bar bar = new Bar();
        bar.k = "k";
        bar.v = "v";
        map.bars.put("k", bar);
        map.save();
    }

    @Test
    public void mapOfBars_manual() {
        MapOfBars map = new MapOfBars();
        Bar bar = new Bar();
        bar.k = "k";
        bar.v = "v";
        map.bars = new HashMap<String, Bar>();
        map.bars.put("k", bar);
        bar.map = map;
        map.save();
    }
}
