import static org.junit.Assert.assertEquals;
import org.junit.*;

public class FieldTest{
  Field field;
  Buffalo buffalo;

@Before
public void before(){
field = new Field("Kilrie");
buffalo = new Buffalo();
}

@Test
public void hasName(){
  assertEquals("Kilrie", field.getName());
}

}