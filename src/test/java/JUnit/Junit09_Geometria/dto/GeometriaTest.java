package JUnit.Junit09_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeometriaTest {

	Geometria geometria;

	@BeforeEach
	public void before() {
		geometria = new Geometria();
	}
	
	@Test
	void testGeometria() {		
		Geometria geometria4 = new Geometria();
		assertEquals(geometria.getId(), geometria4.getId());
	}
	
	@Test
	void testGeometriaInt() {
		Geometria geometria1 = new Geometria(1);
		Geometria geometria2 = new Geometria(1);
		assertEquals(geometria1.getId(), geometria2.getId());		
	}	

	@Test
	void testAreacuadrado() {
		int resultado = geometria.areacuadrado(5);
		int esperado = 25;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreaCirculo() {
		double resultado = geometria.areaCirculo(5);		
		double esperado = 78.53999999999999;
		assertEquals(esperado, resultado);
		
	}

	@Test
	void testAreatriangulo() {
		int resultado = geometria.areatriangulo(2, 5);		
		int esperado = 5;
		assertEquals(esperado, resultado);		
	}

	@Test
	void testArearectangulo() {
		int resultado = geometria.arearectangulo(2, 5);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreapentagono() {
		int resultado = geometria.areapentagono(2, 5);		
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearombo() {
		int resultado = geometria.arearombo(2, 5);		
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearomboide() {
		int resultado = geometria.arearomboide(2, 5);		
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreatrapecio() {
		int resultado = geometria.areatrapecio(2, 5, 2);		
		int esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	void testFigura() {
		String resultado = geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(2);
		esperado = "Circulo";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(3);
		esperado = "Triangulo";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(4);
		esperado = "Rectangulo";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(5);
		esperado = "Pentagono";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(6);
		esperado = "Rombo";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(7);
		esperado = "Romboide";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(8);
		esperado = "Trapecio";
		assertEquals(esperado, resultado);
		
		resultado = geometria.figura(9);
		esperado = "Default";
		assertEquals(esperado, resultado);		
	}

	@Test
	void testGetId() {
		geometria.setId(1);
		int resultado = geometria.getId();
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

	@Test
	void testSetId() {
		geometria.setId(1);
		int resultado = geometria.getId();
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

	@Test
	void testGetNom() {
		geometria.setNom("Edgar");
		String resultado = geometria.getNom();
		String esperado = "Edgar";
		assertEquals(esperado, resultado);
	}

	@Test
	void testSetNom() {
		geometria.setNom("Edgar");
		String resultado = geometria.getNom();
		String esperado = "Edgar";
		assertEquals(esperado, resultado);
	}

	@Test
	void testGetArea() {
		geometria.setArea(2.2);
		double resultado = geometria.getArea();
		double esperado = 2.2;
		assertEquals(esperado, resultado);
	}

	@Test
	void testSetArea() {
		geometria.setArea(2.2);
		double resultado = geometria.getArea();
		double esperado = 2.2;
		assertEquals(esperado, resultado);
	}

	@Test
	void testToString() {
		String resultado = geometria.toString();
		String esperado = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(esperado, resultado);		
	}

}
