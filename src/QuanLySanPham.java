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
        scanner.nextLine();

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
        scanner.nextLine();

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
        boolean check = false;
        while (!check) {
            System.out.println("Nhap ID san pham muon xoa: ");
            String id = scanner.nextLine();

            for (int i = 0; i < danhSach.size(); i++) {
                if (danhSach.get(i).idSanPham.equals(id)) {
                    System.out.println(danhSach.get(i) + "\nXoa san pham?");
                    System.out.println("1. Co \n0. Khong");
                    System.out.println("Nhap lua chon: ");
                    int luaChon = scanner.nextInt();
                    scanner.nextLine();

                    if (luaChon == 1) {
                        danhSach.remove(i);
                        check = true;
                        hienThi();
                        System.out.println("Xoa thanh cong san pham co ID: " + id);
                        break;
                    } else if (luaChon == 0) {
                        System.out.println("Huy xoa thanh cong!");
                        check = true;
                        break;
                    }
                }
            }
            if (!check) {
                System.out.println("Khong tim thay san pham co ID: " + id);
            }
        }
    }

    public void suaSanPham() {
        boolean check = false;
        while (!check) {
            System.out.println("Nhap ID san pham can sua: ");
            String id = scanner.nextLine();

            for (int i = 0; i < danhSach.size(); i++) {
                if (danhSach.get(i).idSanPham.equals(id)) {
                    System.out.println("San pham ban muon sua:\n" + danhSach.get(i));

                    System.out.println("ID cu: " + danhSach.get(i).idSanPham + "\nID moi: ");
                    danhSach.get(i).idSanPham = scanner.nextLine();

                    System.out.println("Ten cu: " + danhSach.get(i).tenSanPham + "\nTen moi: ");
                    danhSach.get(i).tenSanPham = scanner.nextLine();

                    System.out.println("Don gia cu: " + danhSach.get(i).donGia + "\nDon gia moi: ");
                    danhSach.get(i).donGia = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("So luong cu: " + danhSach.get(i).soLuong + "\nSo luong moi: ");
                    danhSach.get(i).soLuong = scanner.nextInt();
                    scanner.nextLine();

                    if (danhSach.get(i) instanceof Sach) {
                        Sach sach = (Sach) danhSach.get(i);

                        System.out.println("Tac gia cu: " + sach.getTacGia() + "\nTac gia moi: ");
                        sach.setTacGia(scanner.nextLine());

                        System.out.println("Nha xuat ban cu: " + sach.getNXB() + "\nNha xuat ban moi: ");
                        sach.setNXB(scanner.nextLine());

                        System.out.println("The loai cu: " + sach.getTheLoai() + "\nThe loai moi: ");
                        sach.setTheLoai(scanner.nextLine());

                    } else if (danhSach.get(i) instanceof VanPhongPham) {
                        VanPhongPham vpp = (VanPhongPham) danhSach.get(i);

                        System.out.println("Chat lieu cu: " + vpp.getChatLieu() + "\nChat lieu moi: ");
                        vpp.setChatLieu(scanner.nextLine());

                        System.out.println("Mau sac cu: " + vpp.getMauSac() + "\nMau sac moi: ");
                        vpp.setMauSac(scanner.nextLine());

                        System.out.println("Thuong hieu cu: " + vpp.getThuongHieu() + "\nThuong hieu moi: ");
                        vpp.setThuongHieu(scanner.nextLine());

                        System.out.println("San pham sau khi sua:\n" + danhSach.get(i) + "\nSua thanh cong!");
                        check = true;
                        break;
                    }

                }
            }
            if (!check) {
                System.out.println("Khong tim thay san pham co ID: " + id);
            }
            // System.out.println("2. Ten san pham");
            // System.out.println("3. Don gia");
            // System.out.println("4. So luong");
            // if (danhSach.get(i) instanceof Sach) {
            // System.out.println("5. Tac gia");
            // System.out.println("6. Nha xuat ban");
            // System.out.println("7. The loai");
            // } else if (danhSach.get(i) instanceof VanPhongPham) {
            // System.out.println("5. Chat lieu");
            // System.out.println("6. Mau sac");
            // System.out.println("7. Thuong hieu");
            // }
            // System.out.println("0. Quay lai");
            // System.out.println("Nhap lua chon: ");
            // int luaChon = scanner.nextInt();

            // switch (luaChon) {
            // case 1:
            // System.out.println("Nhap ID moi: ");
            // String newID = scanner.nextLine();
            // danhSach.get(i).idSanPham = newID;
            // break;
            // }

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
