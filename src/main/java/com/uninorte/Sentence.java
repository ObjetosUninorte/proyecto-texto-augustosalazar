package com.uninorte;

public class Sentence {
   

    // check that the sentence has at least one subject and one verb
    // check that all words are valid
    public boolean isValid(){
 


    }

    // DO NOT DELETE THIS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Word currentWord = root;
        while (currentWord != null) {
            if (sb.length() > 0){
                sb.append(" ");
            }
            sb.append(currentWord.toString());
            currentWord = currentWord.getNext();
        }
        return sb.toString();
    }


}
