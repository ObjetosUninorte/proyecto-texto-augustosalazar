import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.uninorte.Paragraph;
import com.uninorte.Sentence;
import com.uninorte.Text;
import com.uninorte.Word;
import com.uninorte.WordType;

public class ParagraphTest {
    
    @Test
    public void testValidParagraph1() {
        Paragraph paragraph = new Paragraph();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   
        
        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));        

        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);
        // el metodo isValid verifica que todas las frases sean validas y que tenga entre 3 y 5 frases
        assertTrue(paragraph.isValid());
    }

    @Test
    public void testValidParagraph2() {
        Paragraph paragraph = new Paragraph();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   
        
        paragraph.add(sentence);
        paragraph.add(sentence2);
        assertFalse(paragraph.isValid());
    }

    @Test
    public void testLetterCount() {
        Paragraph paragraph = new Paragraph();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   

        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));           
        
        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);
        assertEquals(18, paragraph.getLetterCount());
    }

    @Test
    public void testWordCount() {
        Paragraph paragraph = new Paragraph();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   

        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));           
        
        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);
        assertEquals(6, paragraph.getWordCount());
    }

    @Test
    public void testSentenceCount() {
        Paragraph paragraph = new Paragraph();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   

        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));           
        
        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);
        assertEquals(3, paragraph.getSentenceCount());
    }

    @Test
    public void testToString() {
        Paragraph paragraph = new Paragraph();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   

        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));    
        

        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);
        
        Text text = new Text();
        text.add(paragraph);
        assertEquals("abc abc.abc abc.abc abc.", text.toString());
    }
}
