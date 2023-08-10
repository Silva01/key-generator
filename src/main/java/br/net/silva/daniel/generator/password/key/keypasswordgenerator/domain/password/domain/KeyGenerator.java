package br.net.silva.daniel.generator.password.key.keypasswordgenerator.domain.password.domain;

import br.net.silva.daniel.generator.password.key.keypasswordgenerator.domain.password.interfaces.AbstractKeyGenerator;

import java.util.Arrays;
import java.util.List;

public class KeyGenerator extends AbstractKeyGenerator {
    protected KeyGenerator(boolean haveUpperCase, boolean haveLowerCase, boolean haveNumeric, Integer qtdCharacters, boolean haveSpecialCharacter) {
        super(haveUpperCase, haveLowerCase, haveNumeric, qtdCharacters, haveSpecialCharacter);
    }

    @Override
    protected List<Character> addToUpperCase() {
        return Arrays.asList('A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    }

    @Override
    protected List<Character> addLowerCase() {
        return Arrays.asList('a', 'b', 'c', 'd',
                'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    }

    @Override
    protected List<Character> addNumeric() {
        return Arrays.asList('0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9');
    }

    @Override
    protected List<Character> addSpecialCharacters() {
        return Arrays.asList('~', '`', '!', '@', '#',
                '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', '{',
                ']', '}', '\\', '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/',
                '?');
    }
}
