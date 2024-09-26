import static org.junit.jupiter.api.Assertions.*;

import com.stjean.TPTEST.Modele.Calculatrice;
import org.junit.jupiter.api.*;

public class CalculatriceTest {

    private final Calculatrice calc = new Calculatrice();

    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {

    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Avant chaque test");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Après chaque test");
    }

    @Test
    public void testSomme() {
        assertEquals(5, calc.somme(2, 3),"Votre implémentation de la somme est erronée.");
        assertEquals(0, calc.somme(0, 0),"Votre implémentation de la somme est erronée.");
        assertEquals(-1, calc.somme(-1, 0),"Votre implémentation de la somme est erronée.");
    }

    @Test
    public void testSoustraction() {
        assertEquals(2, calc.soustraction(5, 3),"Votre implémentation de la soustraction est erronée.");
        assertEquals(4, calc.soustraction(6, 2),"Votre implémentation de la soustraction est erronée.");
        assertEquals(-1, calc.soustraction(-2, -1),"Votre implémentation de la soustraction est erronée.");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calc.multiplication(2, 3),"Votre implémentation de la multiplication est erronée.");
        assertEquals(0, calc.multiplication(0, 0),"Votre implémentation de la multiplication est erronée.");
        assertEquals(2, calc.multiplication(-2, -1),"Votre implémentation de la multiplication est erronée.");
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.division(4, 2),"Votre implémentation de la division est erronée.");
        assertEquals(-2, calc.division(-4, 2),"Votre implémentation de la division est erronée.");
        assertThrows(ArithmeticException.class, () -> calc.division(1, 0));
    }

    @Test
    public void testMaximum() {
        assertEquals(5, calc.maximum(5, 3),"Votre implémentation du maximum est erronée.");
        assertEquals(5, calc.maximum(3, 5),"Votre implémentation du maximum est erronée.");
        assertEquals(5, calc.maximum(5, 5),"Votre implémentation du maximum est erronée.");
        assertEquals(-1, calc.maximum(-1, -2),"Votre implémentation du maximum est erronée.");
    }

    @Test
    public void testFactoriel() {
        assertEquals(120, calc.factoriel(5),"Votre implémentation du factoriel est erronée.");
        assertEquals(1, calc.factoriel(0),"Votre implémentation du factoriel est erronée.");
        assertThrows(IllegalArgumentException.class, () -> calc.factoriel(-1));
    }

    @Test
    public void testIsNegatif(){
        assertTrue(calc.isNegatif(-15),"Erreur dans votre test de négativité d'un nombre");
    }
}