1. Hướng dẫn cài đặt:
- B1: Cài đặt: tomcat 7.0, eclipse IDE for Java EE developer, mySql, Boostrap
-B2: Add project:
	 Eclipse > File > Import > General > Existing Project into workspaces > Chọn tới thư mục source
- B3: Connect database
	+ B3.1: MySql > add connection > port: 3309, user: root, password: 12345
	+ B3.2: Vào connection mysql vừa tạo > Import digitalwebdb.sql để tạo scheme có tên digitalwebdb
	+ B3.3: Vào WebContent > WEB-INF > lib kiểm tra nếu có sẵn file .jar, remove file đó.
	+ B3.4: Vào thư mục MySql> Connect.J 5.1 (Thường ở C:\Program Files (x86)) copy file mysql-connector-java-5.1.38-bin.jar bỏ vào thư mục WebContent > WEB-INF > lib	của project trong eclipse
	+ B3.5: Click chuột phải vào mysql-connector-java-5.1.38-bin.jar > Build Path > Add to Build Path
-B4: Run chương trình

2. Hướng dẫn sử dụng:
- B1: Login với user name = "user", password = "user" > Giao diện chính
- B2: Trên giao diện chính chọn 1 sản phẩm, click icon giỏ hàng trên sản phẩm để mua hàng > Màn hình chi tiết sản phẩm
- B3: Ở màn hình chi tiết sản phẩm, click button "add to card" > màn hình list các sản phẩm đã mua