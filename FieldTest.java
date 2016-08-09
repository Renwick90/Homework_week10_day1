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

@Test 
public void fieldStartsEmpty(){
  assertEquals(0, field.livestockCount());
}

@Test
public void addBuffaloToField(){
  field.takeBuffalo(buffalo);
  assertEquals(1, field.livestockCount());
}

@Test
public void cannotTakeBuffaloWhenFieldFull(){
  for(int i = 0; i < 21; i++){
    field.takeBuffalo(buffalo);

  }
  assertEquals(20, field.livestockCount());
}

@Test 
public void fieldIsFull(){
    for(int i = 0; i < 20; i++){
      field.takeBuffalo(buffalo);
    }
    assertEquals(true, field.fieldFull());
}


}