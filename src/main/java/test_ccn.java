import java.util.Scanner;

/**
 * 圈复杂度(代码规范)
 */
public class test_ccn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n < 0) {
            System.out.println(n+"小于0");
        } else if (n == 0) {
            System.out.println(n+"等于0");
        } else if (n>0 && n<5) {
            if (n == 1){
                System.out.println(n+"等于1");
            } else if (n == 2) {
                System.out.println(n+"等于2");
            } else if (n == 3) {
                System.out.println(n+"等于3");
            } else {
                System.out.println(n + "等于4");
            }
        } else if (n >= 5 &&n < 10) {
            if(n == 5) {
                System.out.println(n + "等于5");
            } else if (n == 6) {
                System.out.println(n + "等于6");
            } else if (n == 7) {
                System.out.println(n + "等于7");
            } else if (n == 8) {
                System.out.println(n + "等于8");
            } else {
                System.out.println(n + "等于9");
            }
        } else if (n >= 10 && n< 15) {
            if (n == 10){
                System.out.println(n + "等于10");
            } else if (n == 11) {
                System.out.println(n + "等于11");
            } else if (n == 12) {
                System.out.println(n+ "等于12");
            } else if (n == 13) {
                System.out.println(n+ "等于13");
            } else {
                System.out.println(n+ "等于14");
            }
        } else {
            if (n == 15) {
                System.out.println(n+ "等于15");
            } else if (n == 16) {
                System.out.println(n+ "等于16");
            } else if (n == 17) {
                System.out.println(n+ "等于17");
            } else if (n == 18) {
                System.out.println(n+ "等于18");
            } else if (n == 19) {
                System.out.println(n+ "等于19");
            } else if (n == 20) {
                System.out.println(n+ "等于20");
            } else {
                System.out.println(n+ "大于20");
            }
        }

    }
}
