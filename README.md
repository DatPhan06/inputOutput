# Utils - Đọc và Ghi Nội Dung Tệp
## Giới Thiệu
Utils là một lớp trong Java cung cấp các phương thức tiện ích để đọc và ghi nội dung của các tệp văn bản. Các chức năng chính bao gồm đọc nội dung từ tệp, ghi nội dung vào tệp, bổ sung nội dung vào cuối tệp, và tìm kiếm tệp trong một thư mục.

## Phương Thức
### readContentFromFile
``` bash
public static String readContentFromFile(String path)
* ```
- Phương thức này đọc nội dung từ một tệp văn bản có đường dẫn được chỉ định và trả về dữ liệu dưới dạng chuỗi.

### writeContentToFile
```bash 
public static void writeContentToFile(String path, String content)
* ```

- Phương thức này ghi nội dung mới vào một tệp văn bản, thay thế nội dung cũ nếu có.

### appendContentToFile
```bash 
public static void appendContentToFile(String path, String content)
* ```

- Phương thức này bổ sung nội dung mới vào cuối tệp văn bản, không xóa nội dung cũ.

### findFileByName
```bash
 public static File findFileByName(String folderPath, String fileName)
 ```
- Phương thức này tìm kiếm tệp với tên cụ thể trong một thư mục và trả về đối tượng File nếu tệp được tìm thấy.