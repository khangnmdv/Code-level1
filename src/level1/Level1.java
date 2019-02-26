
package level1;

import java.util.Scanner;


/**
 *
 * @author KhangIT
 */
public class Level1 {

    public static void main(String[] args) {
        // tổng mảng số nguyên
        tinhTong();
        
        // tính dãy số fibon
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.println("10 số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }   
        System.out.println();
    }
    
    static int tinhTong(){
        int [] mang= {1,2,3,4,5};
        int tong = 0;
        for(int i = 0; i < mang.length; i ++){
            tong = tong + mang[i];
        }
        System.out.print("Tổng là mảng số nguyên là: "+tong);
        System.out.println();
        return tong;
    }
    
    static int fibonacci(int n) {   
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    
    
}
