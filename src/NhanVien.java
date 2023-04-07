public abstract class NhanVien implements TinhLuong{
    protected String id;
    protected String ten;
    protected String email;
    protected int sdt;
    protected String diaChi;
    public NhanVien() {
    }

    public NhanVien(String id, String ten, String email, String diaChi, int sdt) {
        this.id = id;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
