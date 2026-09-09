package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTestCase {

	@Test
	void test() {
		Persona p=new Persona();
		p.setApellido("Maciel");
		assertEquals("Maciel", p.getApellido());
		
		
	}

}
