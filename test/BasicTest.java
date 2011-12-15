import models.Bar;
import models.Foo;
import org.junit.Test;
import play.test.UnitTest;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        Foo foo = new Foo();
        Bar bar = new Bar();
        bar.k = "k";
        bar.v = "v";
        foo.bars.put("k", bar);

        foo.save();
    }

}
