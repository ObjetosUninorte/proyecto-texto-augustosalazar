package com.uninorte;

public class Text {
   

    // check that the text has all valid paragraphs
    public boolean isValid() {

    }

    // DO NOT DELETE THIS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Paragraph currentParagraph = root;
        while (currentParagraph != null) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(currentParagraph.toString());
            currentParagraph = currentParagraph.getNext();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}