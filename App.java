import java.util.Scanner;
import src.QuanLySanPham;
import src.Sach;
import src.SanPham;
import src.VanPhongPham;

public class App {
    public static void main(String[] args) {
        // Sach sach = new Sach("1", "Sach 1", 100, 10, "Tac Gia 1", "NXB 1", "The Loai
        // 1");
        // System.out.println(sach);
        // System.out.println("Tong tien: " + sach.thanhToan());

        // VanPhongPham vpp = new VanPhongPham("1", "Van Phong Pham 1", 100, 10, "Chat
        // Lieu 1", "Mau Sac 1",
        // "Thuong Hieu 1");
        // System.out.println(vpp);
        // System.out.println("Tong tien: " + vpp.thanhToan());

        Scanner scanner = new Scanner(System.in);

        QuanLySanPham qlsp = new QuanLySanPham();

        SanPham[] sp = new SanPham[11];
        sp[0] = new Sach("101", "Doremon", 25000, 1000, "Fujiko F. Fujio", "Kim Dong", "Truyen tranh");
        sp[1] = new Sach("102", "Tay Du Ky", 90000, 156, "Ngo Thua An", "Van hoc Ha Noi", "Tieu thuyet");
        sp[2] = new Sach("103", "Sieu nhan Gao", 70000, 323, "Toei Company", "Giai tri", "Truyen tranh");
        sp[3] = new Sach("104", "Harry potter", 50000, 10, "J.K. Rowling", "NXB Tre", "Fantasy");
        sp[4] = new Sach("105", "Conan", 56000, 422, "Gosho Aoyama", "Kim Dong", "Trinh tham, pha an");
        sp[5] = new VanPhongPham("201", "But bi", 5000, 1200, "Nhua", "Xanh", "Kim Long");
        sp[6] = new VanPhongPham("202", "But chi 2B", 3000, 778, "Go + than chi", "Nau cam", "Hong Ha");
        sp[7] = new VanPhongPham("203", "Gom - Tay", 5000, 500, "Cao su", "Trang", "Thien Long");
        sp[8] = new VanPhongPham("204", "Thuoc ke", 20000, 900, "Nhua", "Nhieu mau", "Thien Long");
        sp[9] = new VanPhongPham("205", "Bang dinh", 20000, 567, "Nhua + keo dinh", "Trong suot", "Nhieu thuong hieu");
        sp[10] = new VanPhongPham("206", "Compa", 15000, 730, "Nhua", "Nhieu mau", "Kim Long");

        // for (int i = 0; i < sp.length; i++) {
        // System.out.println(sp[i]);
        // // System.out.println("Tong tien: " + sp[i].thanhToan());
        // System.out.println("---------------------------------");
        // }

        // Sach sach = new Sach();
        // sach.ThemSanPham();
        // them.AddVPP();

        // Thêm toàn bộ dữ liệu từ mảng sp vào ArrayList danhSach của QuanLySanPham
        qlsp.themTuMang(sp);
        System.out.println("====== DANH SACH SAN PHAM ======");
        qlsp.hienThi();

        qlsp.themSach();
        // qlsp.hienThi();
        // qlsp.themVPP();
        // qlsp.hienThi();

        scanner.close();
    }
}
