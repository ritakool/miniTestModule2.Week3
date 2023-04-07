public class NhanVienPartTime extends NhanVien{
    private double soGio;
    private static final double motGio = 100;
    public NhanVienPartTime() {
    }
    public NhanVienPartTime(String id, String ten, String email, String diaChi, int sdt, double soGio) {
        super(id, ten, email, diaChi, sdt);
        this.soGio = soGio;
    }

    public double getSoGio() {
        return soGio;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }

    @Override
    public double tinhLuong() {
        return soGio * motGio;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime {" +
                " id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", sdt=" + sdt +
                ", diaChi='" + diaChi + '\'' +
                ", soGio=" + soGio +
                '}';
    }
}
