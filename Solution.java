import java.util.Scanner;

//public class Solution {
    //KiKi和BoBo玩 “井”字棋。也就是在九宫格中，只要任意行、列，或者任意对角线上面出现三个连续相同的棋子，就能获胜。请根据棋盘状态，判断当前输赢。
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[][] str = new String[3][3];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                str[i][j] = sc.next();
//            }
//
//        }
//        boolean win = false;
//        String winner = null;
          //判断输赢
//        int i = 0;
          //行
//        for(i = 0; i < 3; i++) {
//            if (str[0][i].equals(str[1][i]) && str[1][i].equals(str[2][i])) {
//                win = true;
//                winner = str[1][i];
//            }
//        }
          //列
//        for(i = 0; i < 3; i++) {
//            if (str[i][0].equals(str[i][1]) && str[i][1].equals(str[i][2])) {
//                win = true;
//                winner = str[i][0];
//            }
//        }
          //对角
//        if (str[0][0].equals(str[1][1]) && str[1][1].equals(str[2][2])) {
//            win = true;
//            winner = str[0][0];
//        }
//        if (str[0][2].equals(str[1][1]) && str[1][1].equals(str[2][0])) {
//            win = true;
//            winner = str[0][2];
//        }
//
//        if (win) {
//            switch (winner) {
//                case "K":
//                    System.out.println("KiKi Win!");
//                    break;
//                case "B":
//                    System.out.println("BoBo Win!");
//                    break;
//            }
//        }else{
//            System.out.println("No winner!");
//        }
//    }
//}
    //打印杨辉三角
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        for(int i = 0; i < n; i++){
//            //arr[i] = new int[i + 1];
//            arr[i][0] = arr[i][i] = 1;
//            if(i > 1){
//                for(int j = 1; j <= i; j++){
//                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
//                }
//            }
//        }
//        for(int i = 0; i < n; i++){
//            //打印空格
//            for(int j = 0; j < n - i; j++){
//                System.out.print("  ");
//            }
//            //打印矩阵
//            for(int j = 0; j <= i; j++){
//                System.out.print(arr[i][j] + "   ");
//            }
//            System.out.println();
//        }
//    }


    //KiKi有一个矩阵，他想知道转置后的矩阵（将矩阵的行列互换得到的新矩阵称为转置矩阵），请编程帮他解答
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr = new int[n][m];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
//        }
//    }

    //KiKi想知道一个n阶方矩是否为上三角矩阵，请帮他编程判定。上三角矩阵即主对角线以下的元素都为0的矩阵，主对角线为从矩阵的左上角至右下角的连线。
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        boolean a = true;
//        for(int i = 1; i < n; i++){
//            for(int j = 0; j < i; j++){
//                if(arr[i][j] != 0){
//                    a = false;
//                }
//            }
//        }
//        if(a){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//    }


//    第一行包含两个整数n和m，表示两个矩阵包含n行m列，用空格分隔。
//
//    从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第一个矩阵中的元素。
//
//    从n+2行到2n+1，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第二个矩阵中的元素。
//            1 < n,m < 10
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr1 = new int[n][m];
//        int[][] arr2 = new int[n][m];
//        boolean a = true;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                arr2[i][j] = sc.nextInt();
//                if(arr2[i][j] != arr1[i][j]){
//                    a = false;
//                }
//            }
//        }
//        if(a){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//    }


    //第一行包含两个整数n和m，表示这个方阵队列包含n行m列。从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示方阵中的所有人的身高（保证输入身高都不相同）
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int max = 0,a = 0, b = 0;
//            int[][] arr = new int[n][m];
//            for(int i = 0; i < n; i++){
//                for(int j = 0; j < m; j++){
//                    arr[i][j] = sc.nextInt();
//                    if(arr[i][j] > max){
//                        max = arr[i][j];
//                        a = i+1;
//                        b = j+1;
//                    }
//                }
//            }
//            System.out.println(a +" " + b);
//        }
//    }

    //给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
    //
    //请返回 nums 的动态和。
//    public int[] runningSum(int[] nums) {
//        int n = nums.length;
//        for(int i = 1; i < n; i++){
//            nums[i] += nums[i -1];
//
//        }
//        return nums;
//    }


    //两数之和
//    public int[] twoSum(int[] nums, int target) {
//        int[] ret = new int[2];
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; i++){
//                if(nums[i] + nums[j] == target){
//                    ret[0] = i;
//                    ret[1] = j;
//                    return ret;
//                    //return i,j;
//                }
//            }
//        }
//        return null;
//    }
//    public int[] twoSum(int[] nums, int target) {
//        //int ret[] = new int[2];
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }
//
//}

