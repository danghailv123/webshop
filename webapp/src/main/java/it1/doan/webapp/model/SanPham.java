package it1.doan.webapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SanPham {
    String  maSP;
    String maHang;
    String maLoaiSp;
    String maKM;
    String tenSP;
    Float donGia;
    int soluong;
    String manHinh;
    Float soSao;
    String moTa;
}
