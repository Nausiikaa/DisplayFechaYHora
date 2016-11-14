
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
private NumberDisplay minutos;
private NumberDisplay horas;
private NumberDisplay dia;
private NumberDisplay mes;
private NumberDisplay anio;
private String displayString;
/**
 * 
 */
public DisplayHoraYFecha()
{
    minutos = new NumberDisplay(60,0);
    horas = new NumberDisplay(24,0);
    dia = new NumberDisplay(31,01);
    mes = new NumberDisplay(13,01);
    anio = new NumberDisplay(100,01);
    updateDisplay();
}
public void avanzarMomento()
{
    if(minutos.getValue() == 0){
        horas.increment();
        if(horas.getValue() == 0){
            dia.increment();
            if(dia.getValue() == 0){
                mes.increment();
                if(mes.getValue() == 0){
                    anio.increment();
                }
            }
        }
    }
    updateDisplay();
}
public void setMomento(int minutes,int hours,int days,int months,int years)
{
    int legalidad = 0;
    if(minutes <= 59){
        legalidad = legalidad + 1;
    }
    if(hours <= 23){
        legalidad = legalidad + 1;
    }
    if(days <= 30){
        legalidad = legalidad + 1;
    }
    if(months <= 12){
        legalidad = legalidad + 1;
    }
    if(years <= 99){
        legalidad = legalidad + 1;
    }
    if (legalidad == 5){
       minutos.setValue(minutes);
       horas.setValue(hours);
       dia.setValue(days);
       mes.setValue(months);
       anio.setValue(years);
    }
    updateDisplay();
}
private void updateDisplay()

{
    displayString = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + anio.getDisplayValue();    
}
private String getMomento()
{
    return displayString;
}
}

