package br.net.silva.daniel.generator.password.key.keypasswordgenerator.domain.password.interfaces;

public abstract class AbstractPassword {

    private final boolean isUpperCase;
    private final boolean isLowerCase;
    private final boolean isNumber;
    private final boolean isSpecialCharacter;
    private final Integer limit;

    private static final char[] ALPHA_UPPER_CHARACTERS = { 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    private static final char[] ALPHA_LOWER_CHARACTERS = { 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    private static final char[] NUMERIC_CHARACTERS = { '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9' };
    private static final char[] SPECIAL_CHARACTERS = { '~', '`', '!', '@', '#',
            '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', '{',
            ']', '}', '\\', '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/',
            '?' };

    protected AbstractPassword(boolean isUpperCase, boolean isNumber, boolean isSpecialCharacter, Integer limit) {
        this.isUpperCase = isUpperCase;
        this.isLowerCase = true;
        this.isNumber = isNumber;
        this.isSpecialCharacter = isSpecialCharacter;
        this.limit = limit;
    }

    protected abstract String generatePassword();

    public String generate() {
        return generatePassword();
    }
}
