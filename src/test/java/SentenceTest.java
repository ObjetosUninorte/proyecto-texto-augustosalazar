import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.uninorte.Sentence;
import com.uninorte.Word;
import com.uninorte.WordType;

public class SentenceTest {
    
    @Test
    public void testValidSentence1() {
        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));
        // el metodo isValid retorna true ya que la oracion tiene al menos un sujeto y un verbo y todas las palabras son validas
        assertTrue(sentence.isValid());
    }

    @Test
    public void testValidSentence2() {
        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        assertFalse(sentence.isValid());
    }

    @Test
    public void testValidSentence3() {
        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'1', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));
        assertFalse(sentence.isValid());
    }    

    @Test
    public void testValidSentence4() {
        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));
        assertFalse(sentence.isValid());
    }

    @Test
    public void testWordCount() {
        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b', 'c'}));
        assertEquals(2, sentence.getWordCount());
    }

    @Test
    public void testCharacterCount() {
        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b'}));
        assertEquals(5, sentence.getLetterCount());
    }

    @Test
    public void testToString() {
        Sentence sentence = new Sentence();
        sentence.add(new Word(WordType.VERB, new char[]{'a', 'b', 'c'}));
        sentence.add(new Word(WordType.SUBJECT, new char[]{'a', 'b'}));
        assertEquals("abc ab", sentence.toString());
    }

    
}
