@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
   Program program = new Program(); 
   boolean isAdult = program.checkIsAdult(19);
   assertEquals("Если пользователю меньше 18 лет, то тест упадет", true, isAdult);
	
}
