public class NhanVienFullTime extends NhanVien {
    private double tienThuong;
    private double tienPhat;
    private static final double luongCung = 8000;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String id, String ten, String email, String diaChi, int sdt, double tienThuong, double tienPhat) {
        super(id, ten, email, diaChi, sdt);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    @Override
    public double tinhLuong() {
        return luongCung + tienThuong - tienPhat;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime {" +
                " id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", sdt=" + sdt +
                ", diaChi='" + diaChi + '\'' +
                ", tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                '}';
    }
}
