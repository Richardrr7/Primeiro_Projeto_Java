
public class Media {
    double np1;
    double np2;
    double pim;
    

    public Media(double np1, double np2, double pim){
        this.np1 = np1;
        this.np2 = np2;
        this.pim = pim;
        
    }

    public double calcularMedia() {
        double resultadoMedia = ((np1*4) + (np2*4) + (pim*2)) / 10;
        return resultadoMedia;
    }

}