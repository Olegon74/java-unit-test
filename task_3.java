import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;              // Инициализируй поля класса в конструкторе
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
        {19, true},
        {17, false},
        {18, true},
        //{20, false},
        {21, true},
        //{22, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program(); 
    //int age = 21;// Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Age " + age + " should return " + result, result, isAdult);
	}

}
