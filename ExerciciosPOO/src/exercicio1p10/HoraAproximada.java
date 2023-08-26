package exercicio1p10;

public class HoraAproximada {
    int horas;
    int minutos;
    
    public int getHoras(){
        return horas;
    }
    
    public void setHoras(int horas){
        this.horas = horas;
    }
    
    public int getMinutos(){
        return minutos;
    }
    
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    
    public boolean horaÉVálida(int umHoras, int umMinutos){
        umHoras = horas;
        umMinutos = minutos;
        
        if(horas > -1 && horas < 24 && minutos > -1 && minutos < 60){
            return true;           
        }else{
            return false;        
        }
    }
    
    public void mostraHora(){
        if(horas < 10 && minutos > 9){
            System.out.println("Horario: 0"+horas+":"+minutos);
        }else{
            if(horas > 9 && minutos < 10){
                System.out.println("Horario: "+horas+":0"+minutos);
            }else{
                if(horas < 10 && minutos < 10){
                    System.out.println("Horario: 0"+horas+":0"+minutos);
                }else{
                    System.out.println("Horario: "+horas+":"+minutos);
                }
            }
        }
    }
}