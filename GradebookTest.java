import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTest {
Gradebook grade1, grade2;

	@Before
	public void setUp() throws Exception {
		grade1 = new Gradebook(5);
		grade2 = new Gradebook(5);
		
		grade1.addScore(50.0);
		grade1.addScore(67.0);
		grade1.addScore(99.0);
		grade1.addScore(89.9);
		grade1.addScore(76.9);
		
		grade2.addScore(77.0);
		grade2.addScore(51.0);
		grade2.addScore(45.8);
		grade2.addScore(78.0);
		grade2.addScore(97.8);
	}

	@After
	public void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}

	@Test
	public void testGetScoreSize() {
	}

	@Test
	public void testToString() {
		grade1.toString();
		grade2.toString();
		
	}

	@Test
	public void testGradebook() {
	}

	@Test
	public void testAddScore() {
		
		assertTrue(grade1.toString().equals("50.0 67.0 99.0 89.9 76.9"));
		assertTrue(grade2.toString().equals("77.0 51.0 45.8 78.0 97.8"));

		
		assertEquals(5, grade1.getScoreSize(), .001);
		assertEquals(5, grade2.getScoreSize(), .001);
	
	}

	@Test
	public void testSum() {
		assertEquals(382.8, grade1.sum(), .001);
		assertEquals(349.6, grade2.sum(), .001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50, grade1.minimum(), .001);
		assertEquals(45.8, grade2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(332.8, grade1.finalScore(), .001);
		assertEquals(303.8, grade2.finalScore(), .001);
	}

}
