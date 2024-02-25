package Others;

import java.util.Arrays;

public class ValidSudoku {

    public static boolean chekRow(char[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1; i++) {
            if(nums[i]=='.') continue;
            if(nums[i]==nums[i+1]) return false;
        }

        return true;

    }

    public static boolean chekBoard(char[][] board){
        //row
        for (int i = 0; i < 9; i++) {
            char[] c;
            c=board[i].clone();
            if(chekRow(c)==false) return  false;
        }
        //colm

        //colmm
        char[][] new_bord = new char[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                new_bord[row][col]=board[col][row];//insert
            }
        }
        for (int i = 0; i < 9; i++) {
            char[] c;
            c=new_bord[i].clone();
            if(chekRow(c)==false) return  false;
        }

        char[][] new_board=new char[9][9];
        int row=0,col=0;
        for (int i = 0; i < board.length; i+=3) {
            row=i;
            for (int j = 0; j < board.length; j+=3) {
                col=0;
                for (int k = i; k <i+3 ; k++) {
                    for (int l = j; l <j+3 ; l++) {
//                        System.out.print("\t"+row+""+col+"="+k+""+l);
                        new_board[row][col]=board[k][l];
                        col++;
                    }
                }
                row++;
                System.out.println();
            }

        }

//codition


        for (int i = 0; i < 9; i++) {
            char[] c;
            c=new_board[i].clone();
            if(chekRow(c)==false) return  false;
        }




        return true;
    }
    public static void main(String[] args) {
        char[][] board ={
                {'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(chekBoard(board));
//        System.out.println("Checking the row :- "+checkRow(board));
//        System.out.println(Arrays.toString(board[0]));

//        char[][] new_board=new char[9][9];
//        int row=0,col=0;
//        for (int i = 0; i < board.length; i+=3) {
//
//          row=i;
//            for (int j = 0; j < board.length; j+=3) {
//                col=0;
//                for (int k = i; k <i+3 ; k++) {
//                    for (int l = j; l <j+3 ; l++) {
////                        System.out.print("\t"+row+""+col+"="+k+""+l);
//                        new_board[row][col]=board[k][l];
//                        col++;
//                    }
//                }
//                row++;
//                System.out.println();
//            }
//
//        }
//        for (char[] element: board){
//            System.out.println(Arrays.toString(element));
////        }element
//        for (char[] element: new_board){
//            System.out.println(Arrays.toString(element));
//        }
    }
}
