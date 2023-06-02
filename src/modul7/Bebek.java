package modul7;

public class Bebek extends Hewan{
    private int hasil;
    private float jualHasil;

    public Bebek(String jenis, int jumlahHewan, float hargaBeli, float hargaPerawatan, int hasil, float jualHasil){
        super(jenis, jumlahHewan, hargaBeli, hargaPerawatan);
        this.hasil=hasil;
        this.jualHasil=jualHasil;
    }

    @Override
    public float uangPendapatan() {
        return(super.getJumlah()*hasil*jualHasil*30);
    }
    @Override
    public void pendapatan() {
        System.out.printf("%s\t\t:Rp. %,.2f\n",super.getJenis(),uangPendapatan());
    }
    
    @Override
    public float uangPerawatan() {
        return(super.getJumlah()*super.getHargaPerawatan()*30);
    }
    @Override
    public void perawatan() {
        System.out.printf("%s\t\t:Rp. %,.2f\n",super.getJenis(),uangPerawatan());
    }

}