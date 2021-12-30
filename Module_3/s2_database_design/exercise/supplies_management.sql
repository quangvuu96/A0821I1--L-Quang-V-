create database QuanLyVatTu;
use QuanLyVatTu;
create table PhieuXuat(
SoPX int not null auto_increment primary key,
NgayXuat datetime
);
create table VatTu(
MaVTU varchar(20) not null primary key,
TenVTU varchar(50) not null
);
create table PhieuNhap(
SoPN int not null auto_increment primary key,
NhapNhap datetime
);
create table DonDH (
SoDH int not null auto_increment primary key,
NgayDH datetime
);
create table SDT_type(
id int primary key auto_increment,
sdt_type varchar(20)
);
create table NhaCC(
MaNCC varchar(20) not null primary key,
TenNCC varchar(50) not null,
DiaChi varchar(50),
SDT_id int,
foreign key (SDT_id) references SDT_type(id)
);
create table PhieuXuatChiTiet(
SoPX int,
MaVTU varchar(20),
DGXuat varchar(20) not null,
SLXuat varchar(20) not null,
primary key(SoPX, MaVTU),
foreign key (SoPX) references PhieuXuat(SoPX),
foreign key (MaVTU) references VatTu(MaVTU)
);
create table DatHangChiTiet(
MaVTU varchar(20),
SoDH int,
primary key (MaVTU,SoDH),
foreign key (SoDH) references DonDH(SoDH),
foreign key (MaVTU) references VatTu(MaVTU)
);
create table PhieuNhapChiTiet(
SoPN int,
MaVTU varchar(20),
DGNhap varchar(20) not null,
SLNhap varchar(20) not null,
primary key(SoPN, MaVTU),
foreign key (SoPN) references PhieuNhap(SoPN),
foreign key (MaVTU) references VatTu(MaVTU)
);
create table CungCap(
SoDH int,
MaNCC varchar(20),
primary key(SoDH, MaNCC),
foreign key (SoDH) references DonDH(SoDH),
foreign key (MaNCC) references NhaCC(MaNCC)
);
drop database QuanLyVatTu; 