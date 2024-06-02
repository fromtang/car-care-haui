# car-care-haui

## Giới thiệu

Phần mềm Quản lý Xe là một ứng dụng được phát triển bằng Java Swing để giúp quản lý thông tin và hoạt động của các phương tiện trong một hệ thống. Ứng dụng này cho phép người dùng thêm, chỉnh sửa, xóa và xem thông tin về các phương tiện, hóa đơn và bảo hiểm, cùng với nhiều tính năng hữu ích khác.

## Các yêu cầu hệ thống

Để chạy phần mềm này, bạn cần cài đặt:
- Java Development Kit (JDK) phiên bản 8 trở lên
- Hệ điều hành: Windows, macOS hoặc Linux

## Hướng dẫn cài đặt

1. **Cài đặt JDK:**
   - Tải và cài đặt JDK từ trang [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Đảm bảo rằng biến môi trường `JAVA_HOME` đã được cấu hình đúng cách.

2. **Tải mã nguồn:**
   - Tải mã nguồn của dự án từ [đây](#) (đặt link tải mã nguồn ở đây).

3. **Biên dịch và chạy ứng dụng:**
   - Mở terminal hoặc command prompt.
   - Điều hướng đến thư mục chứa mã nguồn của dự án.
   - Chạy lệnh sau để biên dịch mã nguồn:
     ```sh
     javac -d bin src/*.java
     ```
   - Chạy ứng dụng:
     ```sh
     java -cp bin Main
     ```

## Hướng dẫn sử dụng

### Đăng nhập:
- Khởi động ứng dụng và đăng nhập bằng thông tin người dùng của bạn.

### Quản lý xe:

1. **Thêm xe:**
   - Chọn mục "Thêm xe" từ menu.
   - Nhập các thông tin cần thiết như biển số xe, loại xe, chủ sở hữu, v.v.
   - Nhấn nút "Lưu" để thêm xe vào hệ thống.

2. **Chỉnh sửa thông tin xe:**
   - Chọn xe cần chỉnh sửa từ danh sách xe hiện có.
   - Nhấn nút "Chỉnh sửa" và cập nhật thông tin.
   - Nhấn "Lưu" để lưu các thay đổi.

3. **Xóa xe:**
   - Chọn xe cần xóa từ danh sách xe hiện có.
   - Nhấn nút "Xóa" và xác nhận để xóa xe khỏi hệ thống.

4. **Xem thông tin xe:**
   - Chọn xe cần xem từ danh sách xe hiện có.
   - Thông tin chi tiết sẽ hiển thị trong khu vực thông tin.

### Quản lý hóa đơn:

1. **Thêm hóa đơn:**
   - Chọn mục "Thêm hóa đơn" từ menu.
   - Nhập các thông tin cần thiết như mã hóa đơn, ngày lập, số tiền, xe liên quan, v.v.
   - Nhấn nút "Lưu" để thêm hóa đơn vào hệ thống.

2. **Chỉnh sửa hóa đơn:**
   - Chọn hóa đơn cần chỉnh sửa từ danh sách hóa đơn hiện có.
   - Nhấn nút "Chỉnh sửa" và cập nhật thông tin.
   - Nhấn "Lưu" để lưu các thay đổi.

3. **Xóa hóa đơn:**
   - Chọn hóa đơn cần xóa từ danh sách hóa đơn hiện có.
   - Nhấn nút "Xóa" và xác nhận để xóa hóa đơn khỏi hệ thống.

4. **Xem thông tin hóa đơn:**
   - Chọn hóa đơn cần xem từ danh sách hóa đơn hiện có.
   - Thông tin chi tiết sẽ hiển thị trong khu vực thông tin.

### Quản lý bảo hiểm:

1. **Thêm bảo hiểm:**
   - Chọn mục "Thêm bảo hiểm" từ menu.
   - Nhập các thông tin cần thiết như mã bảo hiểm, ngày bắt đầu, ngày kết thúc, loại bảo hiểm, xe liên quan, v.v.
   - Nhấn nút "Lưu" để thêm bảo hiểm vào hệ thống.

2. **Chỉnh sửa bảo hiểm:**
   - Chọn bảo hiểm cần chỉnh sửa từ danh sách bảo hiểm hiện có.
   - Nhấn nút "Chỉnh sửa" và cập nhật thông tin.
   - Nhấn "Lưu" để lưu các thay đổi.

3. **Xóa bảo hiểm:**
   - Chọn bảo hiểm cần xóa từ danh sách bảo hiểm hiện có.
   - Nhấn nút "Xóa" và xác nhận để xóa bảo hiểm khỏi hệ thống.

4. **Xem thông tin bảo hiểm:**
   - Chọn bảo hiểm cần xem từ danh sách bảo hiểm hiện có.
   - Thông tin chi tiết sẽ hiển thị trong khu vực thông tin.

## Thông tin liên hệ

Nếu bạn có bất kỳ câu hỏi hoặc gặp vấn đề gì trong quá trình sử dụng phần mềm, vui lòng liên hệ với chúng tôi qua:
- **Email:** 
- **Điện thoại:**

Chúc bạn sử dụng phần mềm hiệu quả!
