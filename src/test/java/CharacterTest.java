import org.junit.jupiter.api.Test;

import com.uninorte.BaseCharacter;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    @Test
    public void testNumCharacter() {
        // el constructor de BaseCharacter recibe un char
        BaseCharacter letter = new BaseCharacter('9');
        assertTrue(letter.isNumber());
    }

    @Test
    public void testLetterCharacter() {
        BaseCharacter letter = new BaseCharacter('a');
        assertFalse(letter.isNumber());
    }
    
}
