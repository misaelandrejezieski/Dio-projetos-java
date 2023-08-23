public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       smartTv.diminuirVolume();
       smartTv.aumentarVolume();


        System.out.println("TV LIGADA? " + smartTv.ligada);
        System.out.println("CANAL ATUAL: " + smartTv.canal);
        System.out.println("VOLUME ATUAL: " + smartTv.volume);
        System.out.println("------------------------------------");

        smartTv.ligar();
        System.out.println("NOVO STATUS: --TV LIGADA-- " + smartTv.ligada);
        System.out.println("volume: " + smartTv.volume);
        smartTv.mudarCanal(15);
        System.out.println("CANAL ATUAL: " + smartTv.canal);

    }   
}
