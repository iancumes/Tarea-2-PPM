
import org.junit.Test;
import src.Calc;
import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testSuma() {
        Calc calc = new Calc();
        assertEquals(5, calc.suma(2, 3));
        assertEquals(-1, calc.suma(2, -3));
        assertEquals(0, calc.suma(0, 0));
    }

    @Test
    public void testResta() {
        Calc calc = new Calc();
        assertEquals(1, calc.resta(3, 2));
        assertEquals(5, calc.resta(2, -3));
        assertEquals(0, calc.resta(0, 0));
    }

    @Test
    public void testMultiplicacion() {
        Calc calc = new Calc();
        assertEquals(6, calc.multiplicacion(2, 3));
        assertEquals(-6, calc.multiplicacion(2, -3));
        assertEquals(0, calc.multiplicacion(0,3));}
}
