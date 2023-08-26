package exercicio1p10;

public class Principal {
    public static void main(String[] args){
        HoraAproximada h1 = new HoraAproximada();
        h1.setHoras(8);
        h1.setMinutos(9);
        System.out.println(h1.horaÉVálida(0, 0));
        h1.mostraHora();
    }
}