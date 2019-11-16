create database Hotel;
use Hotel;

create table User1(
	ID int primary key,
	Email varchar(30) unique not null,
	Password1 varchar(20) not null,
	SSN char(15) unique not null,
	Name1 nvarchar(50) not null,
	PhoneNumber varchar(12) ,
	);

create table User2(
	ID int primary key,
	Email varchar(30) unique not null,
	Password2 varchar(20) not null,
	SSN char(15) unique not null,
	Name2 nvarchar(50) not null,
	PhoneOffice varchar(12) not null,
);

create table User3(
	ID int primary key,--fk
	UserAd varchar(50) unique not null,
	PassAd varchar(50) not null,
);

create table InfoHotel(
	IDUser2 int not null, --FK
	ID int primary key,	
	IDAddressHotel int not null, --FK
	IDCode int not null, --FK
	RentRoom	int not null,
	EmptyRoom int not null,
	IDService int not null,--FK
	TypeRoom nvarchar(20) not null,
	StarHotel char(1) check (StarHotel>=1 and StarHotel <=5),
	PlaceEntertaiment nvarchar(50) ,
);

create table AddressHotel(
	IDHotel int not null,--FK
	Street nvarchar(50) not null,
	Ward	nvarchar(20) ,
	District nvarchar(20),
	City nvarchar(20) not null,
	Country nvarchar(20) not null,
);

create table Code(
	ID int primary key,
	SaleOff float not null,
	TypeCode nvarchar(20),
	StartDate datetime not null,
	EndDate datetime not null,
);

create table Evaluete(
	ID int primary key,
	IDHotel int not null,--FK
	IDUser1 int not null,--FK
	Clean int check(Clean>=1 and Clean<=5),
	Convenient int check(Convenient>=1 and Convenient<=5) ,
	Comfortable int check(Comfortable>=1 and Comfortable <=5),
	LocationHotel	int check(LocationHotel>=1 and LocationHotel<=5),
	ServiceHotel	int check(ServiceHotel>=1 and ServiceHotel <=5),
	Cost	int check(Cost>=1 and Cost<=5),
	Total float not null check(Total>=1 and Total <=5),
	Comment nvarchar(100),
);

create table Servcice (
	ID int primary key,
	IDHotel int not null,--FK
	Breakfast bit not null ,
	FeeBook bit not null,
	FreeWifi bit not null,
	FreeTaxi bit not null,
	Lunch bit not null,
	Dinner bit not null,
	Gym bit not null,
	Spa bit not null,
	Bar bit not null,
);

create table Room(
	ID int primary key,
	IDHotel int not null,--FK
	NumberOfRoom int not null,
	TypeRoom varchar(20) not null,
	CostRoom money not null,
	Smoking bit not null,
	Heater bit not null,
	Bathhub bit not null,
	Area int not null,
);

create table BookHotel(
	ID int primary key,
	IDHotel int not null,--FK
	IDUser1 int not null,--FK
	BookStart datetime not null,
	BookEnd datetime not null,
	NumberOfBook int not null,
	TotalBook int not null,
	CostBook	money not null,
	TypePayment bit not null,
	DiscountCode int ,--FK
);

create table PlaceEntertaiment(
	IDHotel int not null,
	NameEntertaiment nvarchar(50) not null,
	Distance float not null,
);

create table InfoUser1(
	ID int primary key,
	NameUser1 nvarchar(50) not null,
	TypeMember char(1) check(TypeMember >=1 and TypeMember<=5),
	Country nvarchar(20) not null,
);

create table Booking(
	ID int primary key,
	IDHotel int not null,--FK
	IDUser1 int not null,--FK
	PhoneNumber char(12) ,
	Taxi char(3),
	SmokingRoom bit not null,
	StartDate datetime not null,
	TypePayment bit not null,
	CrediCard char(20),
	SecurityCode char(20),
);

create table Tranport(
	ID int primary key,
	TypeTransport nvarchar(50) not null,
	--PlaceAirport nvarchar(50) not null,
	Code varchar(4) not null,
	Country nvarchar(20) not null,
);

create table userAdmin(
	ID int primary key,
	Country nvarchar(20) not null,
	NameAdmin nvarchar(50) not null,
	Passport char(15) unique not null,
);
	