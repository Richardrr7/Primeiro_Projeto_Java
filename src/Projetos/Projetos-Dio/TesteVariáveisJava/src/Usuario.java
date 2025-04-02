public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual:" + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);
        System.out.println("\n");
        smartTV.Ligar();
        smartTV.aumentarVolume();
        smartTV.mudarCanal( 10);
        smartTV.aumentarCanal();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual:" + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

}

}