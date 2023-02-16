package br.edu.utfpr.myrandomnumber;

import java.util.Random;

/**
 *
 * @author 1134728 - Ricardo A. Silveira
 * Disciplina: Teste de Software
 * Mock Objects (Parte 2)
 */
public class MyRandomNumber {
    Random random = new Random();
    
    /**
     *
     * @param begin inicio do intervalo
     * @param end fim do intervalo
     * @return retornar um numero aleatorio entre [begin, end]
     * o numero aleatorio retornado nao pode ser igual ao anterior
     * @throws IntervaloInvalidoException
     * essa excecao eh lancada quando begin >= end ou (begin<0 || end<0)
     *
     */
    public int nextRandomNumber(int begin, int end) throws IntervaloInvalidoException {
       int number;
        
        number = random.nextInt(begin,end);
        
        if(number < 0) {
            throw new IntervaloInvalidoException("begin eh menor que zero");
        }
    return number;
    }
    
    public MyRandomNumber() throws IntervaloInvalidoException {
        System.out.println(nextRandomNumber(-2,20));
    }
    
    public static void main(String[] args) throws IntervaloInvalidoException {
        new MyRandomNumber();
    }
}
