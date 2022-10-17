abstract class YakuzaJepang{  
    protected void NamaAnggota() {
        System.out.println("anggota :");
    }
}
public class PolimorfismeFarhan21A {
    public static void main (String[] args) {
        YakuzaJepang Farhan = new Farhan();
        Farhan.NamaAnggota();
        YakuzaJepang Angga = new Angga();
        Angga.NamaAnggota();
}

}