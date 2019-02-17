
create table WebExCustomer(
customer_Id varchar2(20) primary key,
customer_password varchar2(100) not null,
customer_First_Name varchar2(60) not null,
customer_Last_Name varchar2(60) not null,
customer_email varchar2(30) not null,
customer_contact_No number(10) not null
)

create table WebExAdmin(
Admin_Id varchar2(20) primary key,
Admin_name varchar2(60) not null,
Admin_Level varchar2(5) not null,
Admin_password varchar2(100) not null,
Admin_email varchar2(30) not null
)

drop table WebExVendorShopAddress


create table WebExProduct(
product_id varchar2(20) primary key,
product_name varchar2(100) not null,
product_price number(35,2) not null,
product_picture blob not null

)

create table WebExCustomerAddress(
customer_Id varchar2(20) primary key references WebExCustomer(customer_Id),
Customer_Door_No varchar2(10),
Customer_Street varchar2(60),
Customer_Landmark varchar2(70),
Customer_city varchar2(50) not null,
Customer_state varchar2(70) not null,
customer_pincode number(6) not null,
contact_number number(10) not null

)


create table WebExVendorShop(
Shop_Name varchar2(60) not null,
Shop_Plot_No varchar2(10) not null,
Shop_Street varchar2(60),
Shop_Landmark varchar2(70),
Shop_city varchar2(50) not null,
Shop_state varchar2(70) not null,
Shop_pincode number(6) not null,
Shop_telephone_number number(10) not null,
Vendor_Id varchar2(20) primary key references WebExVendor(Vendor_Id)

)

create table WebExVendor(
Vendor_First_Name varchar2(60) not null,
Vendor_Last_Name varchar2(60) not null,
Vendor_Id varchar2(20) primary key,
Vendor_password varchar2(100) not null,
Vendor_email varchar2(30) not null,
Mobile_contact_No number(10) not null,
Vendor_Tin varchar2(20) not null
)

