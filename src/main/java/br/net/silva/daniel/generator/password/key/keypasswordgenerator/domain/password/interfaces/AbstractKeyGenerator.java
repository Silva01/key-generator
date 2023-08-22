package br.net.silva.daniel.generator.password.key.keypasswordgenerator.domain.password.interfaces;

import java.util.*;

public abstract class AbstractKeyGenerator {

    protected boolean haveUpperCase;
    protected boolean haveLowerCase;
    protected boolean haveNumeric;
    protected boolean haveSpecialCharacter;
    protected Integer qtdCharacters;
    private final Random random;

    protected AbstractKeyGenerator(boolean haveUpperCase, boolean haveLowerCase, boolean haveNumeric, Integer qtdCharacters, boolean haveSpecialCharacter) {
        this.haveUpperCase = haveUpperCase;
        this.haveLowerCase = haveLowerCase;
        this.haveNumeric = haveNumeric;
        this.qtdCharacters = qtdCharacters;
        this.haveSpecialCharacter = haveSpecialCharacter;
        this.random = new Random();
    }

    public final String process() {
        List<Character> characters = new ArrayList<>();
        StringBuilder password = new StringBuilder();

        if (haveLowerCase)
            characters.addAll(addLowerCase());

        if (haveUpperCase)
            characters.addAll(addToUpperCase());

        if (haveNumeric)
            characters.addAll(addNumeric());

        if (haveSpecialCharacter)
            characters.addAll(addSpecialCharacters());

        for (int i = 0; i < qtdCharacters; i++) {
            int index = random.nextInt(characters.size());
            password.append(characters.get(index));
        }

        return password.toString();
    }

    protected abstract List<Character> addToUpperCase();
    protected abstract List<Character> addLowerCase();
    protected abstract List<Character> addNumeric();
    protected abstract List<Character> addSpecialCharacters();
}
