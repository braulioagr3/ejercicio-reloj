public class Reloj
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;
    public Reloj(int horaInicial, int minutoInicial)
    {
        horas=horaInicial;
        minutos=minutoInicial;
    }
    /**
     * Va aumentado los minutos y ademas se tienen ciertas condiciones
     * Si minutos es igual a 60 se resetean y se suman 1 a la hora
     * Si horas es igual a 24 se resetean 
     */
    public void ticTac()
    {
        minutos +=1;
        if(minutos==60)
        {
            minutos=0;
            horas+=1;
        }
        if(horas==24)
        {
            horas = 0;
        }
    }
    /**
     * Genera una cadena para mostrar el tiempo con condicionles para que
     * cuando horas o minutos sean menor que 10 agregue un cero al return
     * para que siemrpe muestre 2 digitos
     * @return regresa una cadena con la hora actual
     */
    public String dimeTuTiempo()
    {
        
        String cadResultado="";
        if(horas<10)
        {
            cadResultado+="0";
        }
        cadResultado+=horas;
        cadResultado+=":";
        if(minutos<10)
        {
            cadResultado+="0";
        }
        cadResultado+=minutos;
        /*if(minutos==0)
        {
            cadResultado+="0";
        }*/
        return cadResultado;
    }
}