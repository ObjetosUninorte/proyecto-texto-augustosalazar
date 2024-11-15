package com.uninorte;

public class Word {
   

    // check that the word has at least one letter
    // check that the word is not a mix of letters and numbers
    public boolean isValid() {
        if (root == null) {
            return false;
        }
        boolean hasLetter = false;
        boolean hasNumber = false;
        
        BaseCharacter currentCharacter = root;
        while (currentCharacter != null) {
            if (currentCharacter.isNumber()) {
                hasNumber = true;
            } else {
                hasLetter = true;
            }
            currentCharacter = currentCharacter.getNext();
        }


        return !(hasLetter && hasNumber);
    }

 

    // DO NOT DELETE THIS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        BaseCharacter currentCharacter = root;
        while (currentCharacter != null) {
            sb.append(currentCharacter.getCharacter());
            currentCharacter = currentCharacter.getNext();
        }
        return sb.toString();
    }

}
