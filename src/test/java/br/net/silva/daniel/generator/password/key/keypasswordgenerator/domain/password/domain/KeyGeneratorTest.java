package br.net.silva.daniel.generator.password.key.keypasswordgenerator.domain.password.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyGeneratorTest {

    @Test
    void shouldGeneratePasswordWith8CharacteresWithUpperCaseAndLowerCase() {
        KeyGenerator keyGenerator = new KeyGenerator(true, true, false, 8, false);
        String password = keyGenerator.process();

        System.out.println(password);
        assertEquals(8, password.length());
    }

    @Test
    void shouldGeneratePasswordWith8CharacteresWithUpperCaseAndLowerCaseAndNumeric() {
        KeyGenerator keyGenerator = new KeyGenerator(true, true, true, 8, false);
        String password = keyGenerator.process();

        System.out.println(password);
        assertEquals(8, password.length());
    }

    @Test
    void shouldGeneratePasswordWith8CharacteresWithUpperCaseAndLowerCaseAndNumericAndSpecialCharacter() {
        KeyGenerator keyGenerator = new KeyGenerator(true, true, true, 8, true);
        String password = keyGenerator.process();

        System.out.println(password);
        assertEquals(8, password.length());
    }

    @Test
    void shouldGeneratePasswordWith20CharacteresWithUpperCaseAndLowerCaseAndNumericAndSpecialCharacter() {
        KeyGenerator keyGenerator = new KeyGenerator(true, true, true, 20, true);
        String password = keyGenerator.process();

        System.out.println(password);
        assertEquals(20, password.length());
    }

}