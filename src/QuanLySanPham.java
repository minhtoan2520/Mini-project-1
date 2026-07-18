package src;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham {
    Scanner scanner = new Scanner(System.in);
    protected ArrayList<SanPham> danhSach = new ArrayList<>();

    public void hienThi() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
            System.out.println("---------------------------------");
        }
    }

    public void themTuMang(SanPham[] mangNew) {
        for (int i = 0; i < mangNew.length; i++) {
            if (mangNew[i] != null) {
                danhSach.add(mangNew[i]);
            }
        }
    }

    public void themSach() {
        System.out.println("Nhap thong tin sach muon them!");
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.print("nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("nhap so luong: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhap nha xuat ban: ");
        String nhaXB = scanner.nextLine();

        System.out.print("Nhap the loai: ");
        String theLoai = scanner.nextLine();

        danhSach.add(new Sach(id, ten, donGia, soLuong, tacGia, nhaXB, theLoai));
        System.out.println("=================================");
        hienThi();
        System.out.println("Them thanh cong!");
    }

    public void themVPP() {
        System.out.println("Nhap thong tin san pham muon them!");
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.print("nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("nhap so luong: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap chat lieu: ");
        String chatLieu = scanner.nextLine();

        System.out.print("Nhap mau sac: ");
        String mauSac = scanner.nextLine();

        System.out.print("Nhap thuong hieu: ");
        String thuongHieu = scanner.nextLine();

        danhSach.add(new VanPhongPham(id, ten, donGia, soLuong, chatLieu, mauSac, thuongHieu));
        System.out.println("=================================");
        hienThi();
        System.out.println("Them thanh cong!");
    }

    public void xoaSanPham() {
        System.out.println("Nhap ID san pham muon xoa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).idSanPham.equals(id)) {
                danhSach.remove(i);
                System.out.println("Xoa thanh cong san pham ID :" + id);
                hienThi();
                break;
            } else {
                System.out.println("Khong tim thay san pham co ID: " + id + ", vui long nhap lai ID: ");
                id = scanner.nextLine();
            }
        }
    }
    // public void AddSach(String idSanPham,
    // String tenSanPham,
    // double donGia,
    // int soLuong,
    // String tacGia,
    // String nhaXB,
    // String theLoai) {
    // Sach sach = new Sach(idSanPham,
    // tenSanPham,
    // donGia,
    // soLuong,
    // tacGia,
    // nhaXB,
    // theLoai);
    // danhSach.add(sach);
    // System.out.println("Them sach thanh cong!");
    // }
}
