package org.example;

import java.io.*;


public class Utils {

    // Phương thức đọc nội dung từ tệp .txt
    public static String readContentFromFile(String path) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Phương thức ghi nội dung vào tệp, xóa nội dung cũ
    public static void writeContentToFile(String path, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức bổ sung nội dung mới vào cuối tệp hiện tại
    public static void appendContentToFile(String path, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.append(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức tìm kiếm tệp trong thư mục
    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    return file;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Đoạn mã kiểm thử
        String filePath = "src/main/java/org/example/input.txt";
        String contentToWrite = "Hello, this is a test content.";

        // Đọc nội dung từ tệp
        String readContent = readContentFromFile(filePath);
        System.out.println("Read content from file:\n" + readContent);

        // Ghi nội dung vào tệp, xóa nội dung cũ
        writeContentToFile(filePath, contentToWrite);
        System.out.println("Content written to file.");

        // Bổ sung nội dung mới vào cuối tệp
        String newContent = "\nThis is new content.";
        appendContentToFile(filePath, newContent);
        System.out.println("New content appended to file.");

        // Tìm kiếm tệp trong thư mục
        String folderPath = "C:\\Users\\Phan Tien Dat\\OneDrive - vnu.edu.vn\\Desktop\\Workspace\\inputOutput\\src\\main\\java\\org\\example";
        String fileNameToFind = "input.txt";
        File foundFile = findFileByName(folderPath, fileNameToFind);
        if (foundFile != null) {
            System.out.println("File found: " + foundFile.getAbsolutePath());
        } else {
            System.out.println("File not found in the specified folder.");
        }
    }
}
