import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuQuanLyNhanSu {
    private static QuanLyNhanSu quanLyNhanSu = new QuanLyNhanSu();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("====== MENU QUẢN LÝ NHÂN SỰ ======");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Tính trung bình lương");
            System.out.println("3. Liệt kê nhân viên lương thấp hơn trung bình");
            System.out.println("4. Tính tổng lương nhân viên thời vụ");
            System.out.println("5. Sắp xếp nhân viên toàn thời gian theo lương");
            System.out.println("6. Hiển thị toàn bộ nhân viên");
            System.out.println("7. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    themNhanVien();
                    break;
                case 2:
                    tinhTrungBinhLuong();
                    break;
                case 3:
                    lietKeNhanVienLuongThapHonTrungBinh();
                    break;
                case 4:
                    tinhTongLuongNhanVienThoiVu();
                    break;
                case 5:
                    sapXepNhanVienToanThoiGianTheoLuong();
                    break;
                case 6:
                    toanBoNhanVien();
                    break;
                case 7:
                    running = false;
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }

    private static void themNhanVien() {
        System.out.println("Bạn muốn thêm nhân viên toàn thời gian hay nhân viên thời vụ?");
        System.out.println("1. Nhân viên toàn thời gian");
        System.out.println("2. Nhân viên thời vụ");
        System.out.print("Mời bạn chọn loại nhân viên muốn thêm: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Mời bạn nhập mã nhân viên: ");
        String maNV = scanner.nextLine();
        System.out.print("Mời bạn nhập họ tên: ");
        String email = scanner.nextLine();
        System.out.print("Mời bạn nhập email: ");
        String hoTen = scanner.nextLine();
        System.out.print("Mời bạn nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Mời bạn nhập số điện thoại: ");
        int soDienThoai = scanner.nextInt();


        switch (choice) {
            case 1:
                System.out.print("Mời bạn nhập tiền thưởng: ");
                double tienThuong = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Mời bạn nhập tiền phạt: ");
                double tienPhat = scanner.nextDouble();
                scanner.nextLine();

                NhanVienFullTime nhanVienFullTime = new NhanVienFullTime(maNV, hoTen, email, diaChi, soDienThoai, tienThuong, tienPhat);
                quanLyNhanSu.themNhanSu(nhanVienFullTime);
                System.out.println("Thêm nhân viên toàn thời gian thành công!");
                break;
            case 2:
                System.out.print("Mời bạn nhập số giờ làm việc trong tháng: ");
                double gioLamViec = scanner.nextDouble();
                scanner.nextLine();
                NhanVienPartTime nhanVienPartTime = new NhanVienPartTime(maNV, hoTen, email, diaChi, soDienThoai, gioLamViec);
                quanLyNhanSu.themNhanSu(nhanVienPartTime);
                System.out.println("Thêm nhân viên thời vụ thành công!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
        }
    }


    private static void toanBoNhanVien() {
            quanLyNhanSu.hienThiNhanSu();
    }
    private static void tinhTrungBinhLuong() {
        double tbLuong = quanLyNhanSu.tbLuong();
        System.out.println("Trung bình lương của các nhân viên là: " + tbLuong);
    }

    private static void lietKeNhanVienLuongThapHonTrungBinh() {
        System.out.println("Danh sách nhân viên toàn thời gian có lương thấp hơn trung bình: ");
        quanLyNhanSu.lietKe();
    }

    private static void tinhTongLuongNhanVienThoiVu() {
        double tongLuong = quanLyNhanSu.luongNVPartTime();
        System.out.println("Tổng lương của các nhân viên thời vụ là: " + tongLuong);
    }

    private static void sapXepNhanVienToanThoiGianTheoLuong() {
        System.out.println("Danh sách nhân viên toàn thời gian sau khi sắp xếp là: ");
        quanLyNhanSu.sapXepNVFullTime();
    }
}
