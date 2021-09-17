package it1.doan.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KhuyenMai {
    private String maKM;
    private String tenKM;
    private Float  giaKM;
    private Date ngayBD;
    private Date ngayKT;
    private Boolean type;
    private String moTa;
    private String image;
}
