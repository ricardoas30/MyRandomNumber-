
import br.edu.utfpr.myrandomnumber.IntervaloInvalidoException;
import br.edu.utfpr.myrandomnumber.MyRandomNumber;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author 1134728 - Ricardo A. Silveira
 * Disciplina: Teste de Software
 * Mock Objects (Parte 2)
 */
public class JUnitTestRandom {
    private MyRandomNumber numeros;

    public JUnitTestRandom() throws IntervaloInvalidoException {
        this.numeros = new MyRandomNumber();
    }

    @Test
    public void teste_01() throws IntervaloInvalidoException {
        assertEquals(numeros.nextRandomNumber(-5, 15),12);
    }
    @Test
    public void teste_02() throws IntervaloInvalidoException {
        assertEquals(numeros.nextRandomNumber(-25, 30), 27);
    }
    @Test
    public void teste_03() throws IntervaloInvalidoException {
        assertEquals(numeros.nextRandomNumber(100, 150), 120);
    }
}
