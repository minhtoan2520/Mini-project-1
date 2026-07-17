package src;

public class Sach extends SanPham {
    private String tacGia;
    private String nhaXB;
    private String theLoai;

    public Sach() {
    }

    public Sach(String idSanPham,
            String tenSanPham,
            double donGia,
            int soLuong,
            String tacGia,
            String nhaXB,
            String theLoai) {
        super(idSanPham, tenSanPham, donGia, soLuong);
        this.tacGia = tacGia;
        this.nhaXB = nhaXB;
        this.theLoai = theLoai;
    }

    public String getTacGia() {
        return this.tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNXB() {
        return this.nhaXB;
    }

    public void setNXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public String getTheLoai() {
        return this.theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public double thanhToan() {
        return getDonGia() * getSoLuong();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n- Tac gia: " + getTacGia()
                + "\n- Nha xuat ban: " + getNXB()
                + "\n- The loai: " + getTheLoai();
    }
}