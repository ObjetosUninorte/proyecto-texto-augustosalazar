import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.uninorte.Paragraph;
import com.uninorte.Sentence;
import com.uninorte.Text;
import com.uninorte.Word;
import com.uninorte.WordType;

public class TextTest {
    
    @Test
    public void testValidText() {
        Text text = new Text();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   
        
        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));  
        
        Paragraph paragraph = new Paragraph();
        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);

        text.add(paragraph);
        // el metodo isValid verifica que todas todos los parrafos sean validos
        assertTrue(text.isValid());
    }

    @Test
    public void testParagraphCount() {
        Text text = new Text();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   
        
        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));  
        
        Paragraph paragraph = new Paragraph();
        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);

        text.add(paragraph);
        
        assertEquals(1, text.getParagraphCount());
    }

    @Test
    public void testSentenceCount() {
        Text text = new Text();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   
        
        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));  
        
        Paragraph paragraph = new Paragraph();
        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);

        text.add(paragraph);
        
        assertEquals(3, text.getSentenceCount());
    }    

    @Test
    public void testWordCount() {
        Text text = new Text();

        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));

        Sentence sentence2 = new Sentence();
        sentence2.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence2.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));   
        
        Sentence sentence3 = new Sentence();
        sentence3.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence3.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));  
        
        Paragraph paragraph = new Paragraph();
        paragraph.add(sentence);
        paragraph.add(sentence2);
        paragraph.add(sentence3);

        text.add(paragraph);
        
        assertEquals(6, text.getWordCount());
    } 

    
}
