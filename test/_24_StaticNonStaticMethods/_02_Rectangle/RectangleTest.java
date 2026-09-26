package _24_StaticNonStaticMethods._02_Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void calculatesArea() {
        Rectangle rectangle = new Rectangle();

        assertEquals(24.0, rectangle.alanHesapla(4, 6), 0.0001);
    }

    @Test
    void calculatesPerimeter() {
        assertEquals(20.0, Rectangle.cevreHesapla(4, 6), 0.0001);
    }
}
