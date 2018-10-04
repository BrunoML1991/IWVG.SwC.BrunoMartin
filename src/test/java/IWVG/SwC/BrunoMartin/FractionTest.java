package IWVG.SwC.BrunoMartin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction();
    }

    @Test
    void testFractionIntInt() {
        this.fraction = new Fraction(2, 2);
        assertEquals(2, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(1, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testIsPropiaTrue(){
        this.fraction = new Fraction(1,3);
        assertEquals(true,this.fraction.isPropia());
    }

    @Test
    void testIsPropiaFalse(){
        this.fraction = new Fraction(7,4);
        assertEquals(false,this.fraction.isPropia());
    }

    @Test
    void testinvert() {
        this.fraction = new Fraction(7,4);
        fraction.invert();
        assertEquals(4,this.fraction.getNumerator());
        assertEquals(7,this.fraction.getDenominator());
    }

    @Test
    void testMutiply(){
        double fraction = new Fraction(2,2).multiply(2,2);
        assertEquals(1, fraction);
    }

}