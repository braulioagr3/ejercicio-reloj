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
    public String dimeTuTiempo()
    {
        String cadResultado="";
        cadResultado+=horas;
        cadResultado+=":";
        cadResultado+=minutos;
        return cadResultado;
    }
}