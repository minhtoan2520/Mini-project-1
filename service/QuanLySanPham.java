package service;

import java.util.ArrayList;
import java.util.Scanner;

import src.Sach;
import src.SanPham;
import src.VanPhongPham;
import srcinterface.InterfaceQLSP;

public class QuanLySanPham implements InterfaceQLSP {
    Scanner scanner = new Scanner(System.in);
    protected ArrayList<SanPham> danhSach = new ArrayList<>();

    public void hienThi() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
            System.out.println("----------------------------------");
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
                if (danhSach.get(i).getIdSanPham().equals(id)) {
                    System.out.println(danhSach.get(i) + "\nXoa san pham?");
                    System.out.println("1. Co \n0. Khong");
                    System.out.println("Nhap lua chon: ");
                    int luaChon = scanner.nextInt();
                    scanner.nextLine();

                    if (luaChon == 1) {
                        danhSach.remove(i);
                        check = true;
                        hienThi();
                        System.out.println("----------------------------------");
                        System.out.println("Xoa thanh cong san pham co ID: " + id);
                        break;
                    } else if (luaChon == 0) {
                        System.out.println("----------------------------------");
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
                if (danhSach.get(i).getIdSanPham().equals(id)) {
                    System.out.println("San pham ban muon sua:\n" + danhSach.get(i));

                    System.out.println("ID cu: " + danhSach.get(i).getIdSanPham() + "\nID moi: ");
                    danhSach.get(i).setIdSanPham(scanner.nextLine());

                    System.out.println("Ten cu: " + danhSach.get(i).getTenSanPham() + "\nTen moi: ");
                    danhSach.get(i).setTenSanPham(scanner.nextLine());

                    System.out.println("Don gia cu: " + danhSach.get(i).getDonGia() + "\nDon gia moi: ");
                    danhSach.get(i).setDonGia(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println("So luong cu: " + danhSach.get(i).getSoLuong() + "\nSo luong moi: ");
                    danhSach.get(i).setSoLuong(scanner.nextInt());
                    scanner.nextLine();

                    if (danhSach.get(i) instanceof Sach) {
                        Sach sach = (Sach) danhSach.get(i);

                        System.out.println("Tac gia cu: " + sach.getTacGia() + "\nTac gia moi: ");
                        sach.setTacGia(scanner.nextLine());

                        System.out.println("Nha xuat ban cu: " + sach.getNXB() + "\nNha xuat ban moi: ");
                        sach.setNXB(scanner.nextLine());

                        System.out.println("The loai cu: " + sach.getTheLoai() + "\nThe loai moi: ");
                        sach.setTheLoai(scanner.nextLine());

                        System.out.println("Sua thanh cong!\nSan pham sau khi sua:\n" + danhSach.get(i));
                        check = true;
                        break;

                    } else if (danhSach.get(i) instanceof VanPhongPham) {
                        VanPhongPham vpp = (VanPhongPham) danhSach.get(i);

                        System.out.println("Chat lieu cu: " + vpp.getChatLieu() + "\nChat lieu moi: ");
                        vpp.setChatLieu(scanner.nextLine());

                        System.out.println("Mau sac cu: " + vpp.getMauSac() + "\nMau sac moi: ");
                        vpp.setMauSac(scanner.nextLine());

                        System.out.println("Thuong hieu cu: " + vpp.getThuongHieu() + "\nThuong hieu moi: ");
                        vpp.setThuongHieu(scanner.nextLine());

                        System.out.println("Sua thanh cong!\nSan pham sau khi sua:\n" + danhSach.get(i));
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

    public void timKiemSanPham() {
        boolean check = false;
        while (!check) {
            System.out.println("1. Tim kiem theo ten");
            System.out.println("2. Tim kiem theo khoang gia");
            System.out.println("0. Tro ve Menu");
            System.out.println("Nhap lua chon: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.println("Nhap ten san pham: ");
                    String ten = scanner.nextLine();

                    for (int i = 0; i < danhSach.size(); i++) {
                        if (danhSach.get(i).getTenSanPham().toLowerCase().contains(ten.toLowerCase())) {
                            System.out.println(danhSach.get(i));
                            System.out.println("------------------------------");
                            check = true;
                        }
                    }

                    if (!check) {
                        System.out.println("Khong tim thay san pham!");
                    }
                    break;
                case 2:
                    System.out.println("Nhap gia MIN: ");
                    double giaMin = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Nhap gia MAX: ");
                    double giaMax = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Cac san pham nam trong khoang " + giaMin + " ==> " + giaMax + " la: ");
                    for (int i = 0; i < danhSach.size(); i++) {
                        if (danhSach.get(i).getDonGia() >= giaMin && danhSach.get(i).getDonGia() <= giaMax) {
                            System.out.println(danhSach.get(i));
                            System.out.println("------------------------------");
                            check = true;
                        }
                    }

                    if (!check) {
                        System.out.println("Khong ton tai san pham!");
                    }
                    break;
                case 0:
                    check = true;
                    break;
            }
        }
    }
}
