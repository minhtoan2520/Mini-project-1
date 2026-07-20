package src;

public class VanPhongPham extends SanPham {
    private String chatLieu;
    private String mauSac;
    private String thuongHieu;

    public VanPhongPham() {
    }

    public VanPhongPham(String idSanPham,
            String tenSanPham,
            double donGia,
            int soLuong,
            String chatLieu,
            String mauSac,
            String thuongHieu) {
        super(idSanPham, tenSanPham, donGia, soLuong);
        this.chatLieu = chatLieu;
        this.mauSac = mauSac;
        this.thuongHieu = thuongHieu;
    }

    public String getChatLieu() {
        return this.chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getMauSac() {
        return this.mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getThuongHieu() {
        return this.thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n- Chat lieu: " + getChatLieu()
                + "\n- Mau sac: " + getMauSac()
                + "\n- Thuong hieu: " + getThuongHieu();
    }
}
