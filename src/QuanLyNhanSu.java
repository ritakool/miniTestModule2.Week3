import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class QuanLyNhanSu {
    ArrayList<NhanVien> NhanVien;
    public QuanLyNhanSu() {
        this.NhanVien = new ArrayList<>();
    }
    public QuanLyNhanSu(ArrayList<NhanVien> NhanVien) {
        this.NhanVien = NhanVien;
    }
    public void hienThiNhanSu() {
        for (NhanVien nv: NhanVien) {
            System.out.println(nv);
        }
    }
    public void themNhanSu(NhanVien nhanVien) {
        this.NhanVien.add(nhanVien);
    }
    public double tbLuong() {
        double sum = 0;
        int count = 0;
        for (NhanVien nv : NhanVien) {
            if (nv instanceof NhanVienPartTime) {
               sum += ((NhanVienPartTime) nv).tinhLuong();
               count++;
            }
            if (nv instanceof NhanVienFullTime) {
                sum += ((NhanVienFullTime) nv).tinhLuong();
                count++;
            }
        }
        return sum / count;
    }
    public void lietKe() {
        for (NhanVien nv : NhanVien) {
            if (nv instanceof NhanVienFullTime) {
                if (nv.tinhLuong() < tbLuong()) {
                    System.out.println(nv);
                }
            }
        }
    }
    public double luongNVPartTime() {
        double sum = 0;
        for (NhanVien nv : NhanVien) {
            if (nv instanceof NhanVienPartTime) {
                sum += ((NhanVienPartTime) nv).tinhLuong();
            }
        }
        return sum;
    }
//    public double phuongThuc = NhanVien.stream().filter(nv -> nv instanceof NhanVienPartTime).mapToDouble(nv -> ((NhanVienPartTime) nv).tinhLuong()).sum();
    public void sapXepNVFullTime () {
        ArrayList<NhanVienFullTime> sx = new ArrayList<>();
        for (NhanVien nv : NhanVien) {
            if (nv instanceof NhanVienFullTime) {
                sx.add((NhanVienFullTime) nv);
            }
        }
        Collections.sort(sx,Comparator.comparingDouble(NhanVienFullTime::tinhLuong));
        sx.forEach(System.out::println);
    }
}
