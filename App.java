import java.util.Scanner;
import src.QuanLySanPham;
import src.Sach;
import src.SanPham;
import src.VanPhongPham;

public class App {
    public static void main(String[] args) {

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

        qlsp.themTuMang(sp);

        Scanner scanner = new Scanner(System.in);
        int luaChon = -1;

        while (luaChon != 0) {
            System.out.println("=============MENU=============");
            System.out.println("1. Xem danh sach san pham");
            System.out.println("2. Them san pham");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Sua san pham");
            System.out.println("5. Tim kiem san pham theo ten");
            System.out.println("6. Sap xep san pham theo gia");
            System.out.println("7. Hien thi tong tien cua tat ca san pham");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.println("====== DANH SACH SAN PHAM ======");
                    qlsp.hienThi();
                    break;
                case 2:
                    System.out.println("Ban muon them san pham nao?");
                    System.out.println("Chon 1 de them sach");
                    System.out.println("Chon 2 de them van phong pham");
                    System.out.println("Chon 0 de quay lai menu");
                    luaChon = scanner.nextInt();

                    while (luaChon < 0 || luaChon > 2) {
                        System.out.println("Khong hop le, vui long nhap lai: ");
                        luaChon = scanner.nextInt();
                    }
                    if (luaChon == 1) {
                        qlsp.themSach();
                    } else if (luaChon == 2) {
                        qlsp.themVPP();
                    } else if (luaChon == 0) {
                        System.out.println("Da tro ve menu!");
                        luaChon = 1;
                    }
                    break;
                case 3:
                    qlsp.xoaSanPham();
                    break;
                case 4:
                    qlsp.suaSanPham();
                    break;
                case 5:
                    System.out.println("Tim kiem san pham theo ten");
                    break;
                case 6:
                    System.out.println("Sap xep san pham theo gia");
                    break;
                case 7:
                    System.out.println("Hien thi tong tien cua tat ca san pham");
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    while (luaChon < 0 || luaChon > 7) {
                        System.out.println("Khong hop le, vui long nhap lai: ");
                        luaChon = scanner.nextInt();
                    }
            }
        }

        // for (int i = 0; i < sp.length; i++) {
        // System.out.println(sp[i]);
        // // System.out.println("Tong tien: " + sp[i].thanhToan());
        // System.out.println("---------------------------------");
        // }

        // Sach sach = new Sach();
        // sach.ThemSanPham();
        // them.AddVPP();

        // Thêm toàn bộ dữ liệu từ mảng sp vào ArrayList danhSach của QuanLySanPham

        // qlsp.hienThi();

        // qlsp.themSach();

        scanner.close();
    }
}
