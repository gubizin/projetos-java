package exercicio1p42;

public class Principal {
    public static void main(String[] args){
        Data d1 = new Data();
        d1.setDia(42);
        d1.setMes(2);
        d1.setAno(2004);
        d1.dataÉVálida();
        d1.mostraData();
        
        Data d2 = new Data();
        d2.setDia(29);
        d2.setMes(2);
        d2.setAno(2016);
        d2.dataÉVálida();
        d2.mostraData();
    }
}