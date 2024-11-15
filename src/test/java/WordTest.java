import org.junit.jupiter.api.Test;

import com.uninorte.Word;
import com.uninorte.WordType;

import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    @Test
    public void testLetterCount() {
        // el constructor de Word recibe un WordType
        Word word = new Word(WordType.VERB);
        // el metodo addLetter recibe un char
        word.add('a');
        word.add('b');
        word.add('c');
        word.add('d');
        word.add('e');
        // el metodo getLetterCount retorna un int
        assertEquals(5, word.getLetterCount());
    }

    @Test
    public void testIsValidNoChar() {
        Word word = new Word(WordType.VERB);
        // el metodo isValid retorna false ya que no se ha agregado ninguna letra
        assertFalse(word.isValid());
    }

    @Test
    public void testIsValidSingleChar() {
        Word word = new Word(WordType.VERB);
        word.add('a');
        // el metodo isValid retorna true ya que se ha agregado una letra
        assertTrue(word.isValid());
    }    

    @Test
    public void testIsValidSingleChar2() {
        Word word = new Word(WordType.VERB);
        word.add('2');
        // el metodo isValid retorna true ya que se ha agregado una letra
        assertTrue(word.isValid());
    }     

    @Test
    public void testIsValidMultipleChar() {
        Word word = new Word(WordType.VERB);
        word.add('a');
        word.add('b');
        assertTrue(word.isValid());        
    }

    @Test
    public void testIsValidMultipleChar2() {
        Word word = new Word(WordType.VERB);
        word.add('1');
        word.add('2');
        assertTrue(word.isValid());        
    }    
    

    @Test
    public void testIsValidCase1() {
        Word word = new Word(WordType.VERB);
        word.add('1');
        word.add('b');
        // el metodo isValid retorna false ya que se ha agregado una letra y un numero
        assertFalse(word.isValid());        
    }    

    @Test
    public void testIsValidCase2() {
        Word word = new Word(WordType.VERB);
        word.add('b');
        word.add('1');
        assertFalse(word.isValid());        
    }       

    @Test
    public void testIsValidCase3() {
        Word word = new Word(WordType.VERB, new char[]{'b', '1'});
        assertFalse(word.isValid());        
    }         

    @Test
    public void testGetType() {
        Word word = new Word(WordType.VERB);
        assertEquals(WordType.VERB, word.getType());
    }

    @Test
    public void testCharacterCount() {
        Word word = new Word(WordType.VERB);
        word.add('a');
        word.add('b');
        word.add('c');
        assertEquals(3, word.getLetterCount());
    }

    @Test
    public void testToString() {
        Word word = new Word(WordType.VERB);
        word.add('a');
        word.add('b');
        word.add('c');
        assertEquals("abc", word.toString());
    }

   
    
}