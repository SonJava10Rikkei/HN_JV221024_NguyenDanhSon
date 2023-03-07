package rikkei;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100]; // Khai báo mảng 1 chiều gồm 100 phần tử số nguyên
        int n = 0; // Khai báo biến n để lưu số lượng phần tử thực tế của mảng
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím");
            System.out.println("2. In ra giá trị các phần tử trong mảng");
            System.out.println("3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng");
            System.out.println("4. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("6. In ra mảng đảo ngược");
            System.out.println("7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng");
            System.out.println("8. Sắp xếp mảng tăng dần ");
            System.out.println("9. Thoát chương trình");
            System.out.print("\nVui lòng nhập lựa chọn của bạn (1-9): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                    Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím
                    System.out.print("Nhập số lượng phần tử của mảng: ");
                    n = scanner.nextInt();

                    // Nhập giá trị cho từng phần tử trong mảng
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Đã nhập thành công " + n + " phần tử vào mảng.");
                    break;
                case 2:
//                   Hiển thị giá trị các phần tử mảng
                    System.out.println("\nCác phần tử của mảng là: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n------------------------------");
                    break;
                case 3:
//                   Tính tổng và in ra các phần tử có giá trị lẻ trong mảng
                    int sum3 = 0;
                    System.out.println("Các phần tử có chỉ số lẻ trong mảng là: ");
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.print(arr[i] + " ");
                            sum3 += arr[i];
                        }
                    }
                    System.out.println(" --> Tổng các phần tử có chỉ số lẻ trong mảng là: " + sum3);
                    System.out.println("\n------------------------------");
                    break;
                case 4:
//                    In giá trị max và min của các phần tử trong mảng
                    int max = arr[0];
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Giá trị lớn nhất trong mảng là " + max);
                    System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
                    System.out.println("\n------------------------------");
                    break;
                case 5:
//                    Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng
                    // Khai báo biến đếm số lượng phần tử chia hết cho 2 và 3
                    int countDivisibleBy2And3 = 0;
                    // Duyệt từng phần tử trong mảng
                    for (int i = 0; i < n; i++) {
                        // Nếu phần tử vừa chia hết cho 2 và cũng chia hết cho 3
                        if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                            // Tăng biến đếm countDivisibleBy2And3 lên 1
                            countDivisibleBy2And3++;
                        }
                    }
                    // In ra số lượng phần tử vừa chia hết cho 2 và cũng chia hết cho 3
                    System.out.println("Số lượng phần tử vừa chia hết cho 2 và cũng chia hết cho 3 trong mảng là: " + countDivisibleBy2And3);
                    break;

                case 6:
//                   In ra mảng đảo ngược
                    for (int i = 0, j = n - 1; i < j; i++, j--) {
                        /*Tạo biến temp và tiến hành hoán đổi phần tử*/
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    System.out.println(Arrays.toString(arr));
                    break;
                case 7:
//                    In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng
                    System.out.print("--> Các nguyên tố trong trong mảng là : \n");
                    int sum8 = 0;
                    for (int i = 0; i < n; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                            sum8 += i;
                        }
                    }
                    System.out.println("\n--> Tổng số các phần tử nguyên tố trong mảng bằng: " + sum8);
                    System.out.println("------------------------------");
                    break;
                case 8:
//            Sắp xếp mảng tăng dần
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("--> Mảng sau khi sắp xếp tăng dần:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n------------------------------");
                    break;
                case 9:
//                     Thoát chương trình
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình! ");
                    System.exit(0);
                default:
                    System.out.println("\n ! Lựa chọn không hợp lệ, vui lòng chọn lại.! \n");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
