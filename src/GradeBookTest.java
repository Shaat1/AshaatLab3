import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeBookTest {
    GradeBook gradeBook1 = new GradeBook(5);
    GradeBook gradeBook2 = new GradeBook(5);

    @org.junit.jupiter.api.Test
    void getScoresSize() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void addScore() {
    }

    @org.junit.jupiter.api.Test
    void sum() {
    }

    @org.junit.jupiter.api.Test
    void minimum() {

    }

    @org.junit.jupiter.api.Test
    void finalScore() {
    }

    @BeforeEach
    void setUp() {
        gradeBook1.addScore(66);
        gradeBook1.addScore(90);
        gradeBook2.addScore(89);
        gradeBook2.addScore(89);
        gradeBook2.addScore(99);
    }

    @AfterEach
    void tearDown() {
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    void testGetScoresSize() {
    }

    @Test
    void testToString1() {
    }

    @Test
    void testAddScore() {
        assertEquals(2,gradeBook1.getScoresSize(),0.01);
        assertEquals("66.0 90.0" , gradeBook1.toString());
        assertEquals("89.0 89.0 99.0" , gradeBook2.toString());
    }

    @Test
    void testSum() {
        assertEquals(156,gradeBook1.sum());
        assertEquals(277,gradeBook2.sum());
    }

    @Test
    void testMinimum() {
        assertEquals(66,gradeBook1.minimum());
        assertEquals(89,gradeBook2.minimum());
    }

    @Test
    void testFinalScore() {
        assertEquals(188,gradeBook2.finalScore());
    }
}