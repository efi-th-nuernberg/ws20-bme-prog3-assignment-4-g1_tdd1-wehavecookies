import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

    }

    @Test
    public void testValidEquilateralTriangle() {

        // Arrange
        float a = 2;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);

    }
    
    @Test
    public void invalidTriangleFirstSideZero() {

        // Arrange
        float a = 0;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test
     public void invalidTriangleSecondSideZero() {

        // Arrange
        float a = 2;
        float b = 0;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test
     public void invalidTriangleThirdSideZero() {

        // Arrange
        float a = 2;
        float b = 2;
        float c = 0;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

     @Test
     public void invalidTriangleFirstSideNegative() {

        // Arrange
        float a = -2;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test
     public void invalidTriangleSecondSideNegative() {

        // Arrange
        float a = 2;
        float b = -2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test
     public void invalidTriangleThirdSideNegative() {

        // Arrange
        float a = 2;
        float b = 2;
        float c = -2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testIsoscelesTriangleSecondAndThirdSideEquals() {

        // Arrange
        float a = 3;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testIsoscelesTriangleFirstAndThirdSideEquals() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testIsoscelesTriangleFirstAndSecondSideEquals() {

        // Arrange
        float a = 2;
        float b = 2;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testNonValidTriangleSumOfSidesEqualsThird() {

        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle( 2, 3, 5) );
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle( 2, 1, 1) );
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle( 2, 7, 5) );
    }
}
