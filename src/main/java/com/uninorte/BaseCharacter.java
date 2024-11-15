package com.uninorte;

public class BaseCharacter {
    
    private char letter;


    // un char puede ser una letra o un número
    // para verificar si es un número se puede usar la función
    // Character.isDigit


    // DO NOT DELETE THIS
    @Override
    public String toString() {
        return String.valueOf(letter);
    }
}
