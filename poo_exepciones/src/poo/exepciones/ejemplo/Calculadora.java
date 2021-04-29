package poo.exepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorZeroException {
        if(divisor == 0){
            throw new DivisionPorZeroException("No se puede dividir por zero");
        }
        return numerador/(double)divisor;
    }
}
