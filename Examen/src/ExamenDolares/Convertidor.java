/*
 * Examen primer parcial: Calculadora de Dolares.
 * @author: Rodriguez de la Mora Elizabeth Dayanne 
 * @version:  1.0 
 * @fecha; 12/09/2017
*/
package ExamenDolares;
//Get & Set de Valor ingresado y a regresar
public class Convertidor {
    private int Pesos;
    private float Resulta;

    public float getResulta() {
        return Resulta;
    }

    public void setResulta(float Resulta) {
        this.Resulta = Resulta;
    }

    public int getPesos() {
        return Pesos;
    }

    public void setPesos(int Pesos) {
        this.Pesos = Pesos;
    }

    //Metodo que calcula los dolares. 
    public float Converter(){
        Resulta = Pesos / 19;
        return Resulta;
    }
    
    
}
