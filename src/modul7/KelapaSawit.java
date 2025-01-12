package modul7;

public class KelapaSawit extends Tanaman{
    private int hasil;
    private float jualHasil;

    public KelapaSawit(String jenis, int luasTanah, float hargaPerawatan, int hasil, float jualHasil){
        super(jenis, luasTanah, hargaPerawatan);
        this.hasil=hasil;
        this.jualHasil=jualHasil;
    }

    @Override
    public float uangPendapatan() {
        return(super.getJumlah()*hasil*jualHasil*30);
    }
    @Override
    public void pendapatan() {
        System.out.printf("%s\t:Rp. %,.2f\n",super.getJenis(),uangPendapatan());
    }
    
    @Override
    public float uangPerawatan() {
        return(super.getJumlah()*super.getHargaPerawatan()*30);
    }
    @Override
    public void perawatan() {
        System.out.printf("%s\t:Rp. %,.2f\n",super.getJenis(),uangPerawatan());
    }
}