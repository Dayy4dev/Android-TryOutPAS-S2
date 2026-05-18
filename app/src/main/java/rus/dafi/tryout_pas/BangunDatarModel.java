package rus.dafi.tryout_pas;

public class BangunDatarModel {
    String namaBangunDatar, luasBangunDatar, sisiBangunDatar, kelilingBangunDatar, detailBangunDatar;

    public BangunDatarModel(String namaBangunDatar, String luasBangunDatar, String kelilingBangunDatar, String sisiBangunDatar, String detailBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
        this.luasBangunDatar = luasBangunDatar;
        this.sisiBangunDatar = sisiBangunDatar;
        this.kelilingBangunDatar = kelilingBangunDatar;
        this.detailBangunDatar = detailBangunDatar;
    }

    public String getnamaBangunDatar() {
        return namaBangunDatar;
    }

    public String getluasBangunDatar() {
        return luasBangunDatar;
    }

    public String getsisiBangunDatar() {
        return sisiBangunDatar;
    }

    public String getkelilingBangunDatar() {
        return kelilingBangunDatar;
    }

    public String getdetailBangunDatar() {
        return detailBangunDatar;
    }

}
