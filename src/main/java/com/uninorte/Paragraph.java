package com.uninorte;

public class Paragraph {
    


    // check that the paragraph has all valid sentences
    // and that has between 3 and 5 sentences
    public boolean isValid() {

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Sentence currentSentence = root;
        while (currentSentence != null) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(currentSentence.toString());
            currentSentence = currentSentence.getNext();
        }
        sb.append(".");
        return sb.toString();
    }


    
}
