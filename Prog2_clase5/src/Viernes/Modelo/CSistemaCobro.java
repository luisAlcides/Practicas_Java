package Viernes.Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alcides Blandon
 */
public class CSistemaCobro {

    private double IVA = 0.15;
    private double valorPagar;
    private double totalPagar;
    private double billete500, billete200, billete100, billete50, billete20, billete10, billete5, billete1;
    private double resultado;
    private String resultadoFinal;
    private double totalBillete;

    public CSistemaCobro() {
        this.billete500 = 0;
        this.billete200 = 0;
        this.billete100 = 0;
        this.billete50 = 0;
        this.billete20 = 0;
        this.billete10 = 0;
        this.billete5 = 0;
        this.billete1 = 0;
    }

    public String calcular() {
        totalPagar = valorPagar + (valorPagar * IVA);
        totalBillete = billete500 + billete200 + billete100 + billete50 + billete20 + billete10 + billete5 + billete1;
        resultado = Math.abs(totalPagar - totalBillete);
        System.out.println("resultado: " + resultado);
        System.out.println("Total billetes: " + totalBillete);

        if (totalBillete == 0) {
            JOptionPane.showMessageDialog(null, "No ha ingresado los billetes");
        } else {

            if (totalBillete < totalPagar) {
                if (resultado != 0) {
                    resultadoFinal = "Aun le hace faltan: " + (resultado);

                }
            }
            if (totalBillete > totalPagar) {

                if (resultado > 0) {
                    resultadoFinal = "Su vuelto es de: " + (resultado);

                }

            }
            if (totalPagar == totalBillete) {
                resultadoFinal = "Ah saldado su deuda ";

            }
        }

        return resultadoFinal;

    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal(String resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getBillete500() {
        return billete500;
    }

    public void setBillete500(double billete500) {
        this.billete500 = billete500;
    }

    public double getBillete200() {
        return billete200;
    }

    public void setBillete200(double billete200) {
        this.billete200 = billete200;
    }

    public double getBillete100() {
        return billete100;
    }

    public void setBillete100(double billete100) {
        this.billete100 = billete100;
    }

    public double getBillete50() {
        return billete50;
    }

    public void setBillete50(double billete50) {
        this.billete50 = billete50;
    }

    public double getBillete20() {
        return billete20;
    }

    public void setBillete20(double billete20) {
        this.billete20 = billete20;
    }

    public double getBillete10() {
        return billete10;
    }

    public void setBillete10(double billete10) {
        this.billete10 = billete10;
    }

    public double getBillete5() {
        return billete5;
    }

    public void setBillete5(double billete5) {
        this.billete5 = billete5;
    }

    public double getBillete1() {
        return billete1;
    }

    public void setBillete1(double billete1) {
        this.billete1 = billete1;
    }

}
