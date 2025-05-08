import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComptarVocalsTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        // Redirigim la sortida del sistema per poder llegir el que imprimeix
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testComptarVocals() {
        // Cas bàsic: vocals en minúscula
        String input = "aei";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ComptarVocals.main(new String[]{});
        String resultat = outputStream.toString().toLowerCase();

        assertTrue(resultat.contains("amount of 'a': 1"));
        assertTrue(resultat.contains("amount of 'e': 1"));
        assertTrue(resultat.contains("amount of 'i': 1"));
        assertTrue(resultat.contains("amount of 'o': 0"));
        assertTrue(resultat.contains("amount of 'u': 0"));
        assertTrue(resultat.contains("total amount of vowels: 3"));
    }

    @Test
    public void testSenseVocals() {
        // Cas sense cap vocal
        String input = "xyz";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        outputStream.reset();
        ComptarVocals.main(new String[]{});
        String resultat = outputStream.toString().toLowerCase();

        assertTrue(resultat.contains("amount of 'a': 0"));
        assertTrue(resultat.contains("amount of 'e': 0"));
        assertTrue(resultat.contains("amount of 'i': 0"));
        assertTrue(resultat.contains("amount of 'o': 0"));
        assertTrue(resultat.contains("amount of 'u': 0"));
        assertTrue(resultat.contains("total amount of vowels: 0"));
    }

    @Test
    public void testTotesLesVocals() {
        // Cas amb totes les vocals una vegada
        String input = "aeiou";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        outputStream.reset();
        ComptarVocals.main(new String[]{});
        String resultat = outputStream.toString().toLowerCase();

        assertTrue(resultat.contains("amount of 'a': 1"));
        assertTrue(resultat.contains("amount of 'e': 1"));
        assertTrue(resultat.contains("amount of 'i': 1"));
        assertTrue(resultat.contains("amount of 'o': 1"));
        assertTrue(resultat.contains("amount of 'u': 1"));
        assertTrue(resultat.contains("total amount of vowels: 5"));
    }

    @Test
    public void testVocalsMajuscules() {
        // Cas amb vocals en majúscula
        String input = "AEIOU";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        outputStream.reset();
        ComptarVocals.main(new String[]{});
        String resultat = outputStream.toString().toLowerCase();

        assertTrue(resultat.contains("amount of 'a': 1"));
        assertTrue(resultat.contains("amount of 'e': 1"));
        assertTrue(resultat.contains("amount of 'i': 1"));
        assertTrue(resultat.contains("amount of 'o': 1"));
        assertTrue(resultat.contains("amount of 'u': 1"));
        assertTrue(resultat.contains("total amount of vowels: 5"));
    }
}
