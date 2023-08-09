package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    static List<Categories> listCategories = new ArrayList<>();
    static List<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("************SHOP MANAGEMENT***************");
            System.out.println("1. Quản lý danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Demo.catalogMenu(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn 1-3");
            }
        } while (true);
    }

    public static void catalogMenu(Scanner scanner) {
        boolean isExit = true;
        do {
            System.out.println("*****************CATALOG MANAGEMENT***************");
            System.out.println("1. Thêm danh mục");
            System.out.println("2. Hiên thị danh mục");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    isExit = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        } while (isExit);
    }

    public static void productManu(Scanner scanner) {
        boolean isExit = true;
        do {
            System.out.println("*****************CATALOG MANAGEMENT***************");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiên thị sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    //B1: Khởi tạo đối tượng product thêm mới: Product productNew = new Product();
                    //B2:Nhập thông tin sản phẩm áo sơ mi polo: productNew.inputData()
                    //B3: Cho chọn sản phẩm thuộc danh mục nào - Hiển thị các danh mục theo menu để người dùng chọn
                    System.out.println("********CATALOG***********");
                    for (int i = 0; i < listCategories.size(); i++) {
                        System.out.printf("%d. %s\n",i+1,listCategories.get(i).getCatalogName());
                    }
                    System.out.println("Chọn danh mục: ");
                    int choiceCatalog = Integer.parseInt(scanner.nextLine());
                    //Mã danh mục mà chọn = listCategories.get[choiceCatalog-1].getCatalogId
                    //set mã danh mục vào thuộc tính catalogId của đối tượng Product đang nhập dữ liệu
                    //productNew.setCatalogId(catalogId)
                    //B4. add sản phẩm vào listProduct
                    //listProduct.add(productNew)
                    break;
                case 2:
                    break;
                case 3:
                    isExit = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        } while (isExit);
    }
}
