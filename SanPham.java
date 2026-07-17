public abstract class SanPham {
    protected String idSanPham;
    protected String tenSanPham;
    protected double donGia;
    protected int soLuong;

    public SanPham() {
    }

    public SanPham(String idSanPham,
            String tenSanPham,
            double donGia,
            int soLuong) {
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getIdSanPham() {
        return this.idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return this.tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public abstract double thanhToan();

    // public void set

    @Override
    public String toString() {
        return "- Ma san pham: " + getIdSanPham()
                + "\n- Ten san pham: " + getTenSanPham()
                + "\n- Don gia: " + getDonGia() + " VND"
                + "\n- So luong: " + getSoLuong();
    }

}
