import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = false)
public class DefaultFinalWithFieldDefaultsFieldTest {
  int a = 0;
  String b = "";

  public static void main(String[] args) throws Exception {
    Field field = DefaultFinalWithFieldDefaultsFieldTest.class.getDeclaredField("a");
    System.out.println(Modifier.isFinal(field.getModifiers()));
  }
}
