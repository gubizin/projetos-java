package exercicio1p42;

public class Data {
    int dia;
    int mes;
    int ano;
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public boolean dataÉVálida(){
        switch(mes){
            case 1:
                if(dia > 0 && dia < 32){
                    return true;
                }else{
                    return false;
                }                              
            case 2:
                if(ano % 4 == 0){
                    if(dia > 0 && dia < 30){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    if(dia > 0 && dia < 29){
                        return true;
                    }else{
                        return false;
                    }
                }                              
            case 3:
                if(dia > 0 && dia < 32){
                    return true;
                }else{
                    return false;
                }                               
            case 4:
                if(dia > 0 && dia < 31){
                    return true;
                }else{
                    return false;
                }                             
            case 5:
                if(dia > 0 && dia < 32){
                    return true;
                }else{
                    return false;
                }                             
            case 6:
                if(dia > 0 && dia < 31){
                    return true;
                }else{
                    return false;
                }                               
            case 7:
                if(dia > 0 && dia < 32){
                    return true;
                }else{
                    return false;
                }                               
            case 8:
                if(dia > 0 && dia < 32){
                    return true;
                }else{
                    return false;
                }                               
            case 9:
                if(dia > 0 && dia < 31){
                    return true;
                }else{
                    return false;
                }                             
            case 10:
                if(dia > 0 && dia < 32){
                    return true;
                }else{
                    return false;
                }                             
            case 11:
                if(dia > 0 && dia < 31){
                    return true;
                }else{
                    return false;
                }                             
            case 12:
                if(dia > 0 && dia < 32){
                    return true;
                }else{
                    return false;
                }                                
            default:
                return false;
        }
    }
    
    public void mostraData(){
        if(this.dataÉVálida() == true){
            if(dia < 10 && mes > 9){
                System.out.println("Data: 0"+dia+"/"+mes+"/"+ano);
            }else{
                if(dia > 9 && mes < 10){
                    System.out.println("Data: "+dia+"/"+"0"+mes+"/"+ano);
                }else{
                    if(dia < 10 && mes < 10){
                        System.out.println("Data: 0"+dia+"/"+"0"+mes+"/"+ano);
                    }else{
                        if(dia > 9 && mes > 9){
                            System.out.println("Data: "+dia+"/"+mes+"/"+ano);                       
                        }                      
                    }
                }
            }
        }
        if(this.dataÉVálida() == false){
            System.out.println("Data invalida");
        }
    }    
}