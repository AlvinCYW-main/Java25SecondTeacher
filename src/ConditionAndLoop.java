public class ConditionAndLoop {
    public static void main(String[] args) throws Exception {
        /*
         * 條件式
         * 
         * if (條件) {
         *     條件成立時執行的程式碼
         * } else {
         *     條件不成立時執行的程式碼
         * }
         */
        int a = 2;
        int b = 3;

        if((a <= b)) {
            System.out.println("a 的確 <= b");
        } else {
            System.out.println("a 沒有 <= b");
        }

        if((a ==  4) && (b == 3)) {
            System.out.println("a = 4 且 b = 3");
        } else {
            System.out.println("a != 2 或 b != 3");
        }

        if(((a ==  2) && (b == 3)) || (b == 4)) {
            System.out.println("條件成立");
        } else {
            System.out.println("條件不成立");
        }

        /*
         * else if
         * 
         * if (條件1) {
         *    條件1成立時執行的程式碼
         * } else if (條件2) {
         *    條件2成立時執行的程式碼
         * } else {
         *    條件1跟條件2都不成立時執行的程式碼
         * }
         */
        int c = 2;

        if(c == 2) {
            System.out.println("c : 2");
        } else if(a == 3) {
            System.out.println("c : 3");
        } else if(a == 4) {
            System.out.println("c : 4");
        } else {
            System.out.println("c 為2,3,4以外的數字");
        }

        /*
         * 簡化if else 寫法
         * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
         */
        int e = 2;
        int f = 3;

        String min = (e < f) ?  "E < F" :  "E > F";
        System.out.println(min);

        /*
         * 53,54 這兩行 效果等於以下寫法
         */
        // if(a < b) {
        //     System.out.println("A < B");
        // } else {
        //     System.out.println("B > A");
        // }

        
        /*
         * for 迴圈
         * for (初始值; 進入迴圈條件; 增量/減量) {
         *     條件成立時執行的程式碼
         * }
         */
        for(int index = 0; index <= 10; index ++) {
            System.out.println(index);
        }

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                if ( i!=j ){
                    System.out.print( i + "x" + j + "=" + i*j + " ");
                }               
            }
            System.out.println();                
        }

        for (int k=0; k<=4; k++){
            //System.err.print("-");
            for (int m=7; m>=(2*k+1); m-=2){
                System.err.print(" ");
                ;
            }
            for ( int l=1; l<=(2*k+1); l++){
                System.err.print("*");
            }
            System.out.println();
        }



        /*
         * for 迴圈 將array所有元素印出來範例
         * 元素長度可以用 array.length 取得
         * 可用Debug 觀察 index 的變化
         */
        int[] bingo = {7, 22, 89, 55};
        for(int index = 0; index < bingo.length; index ++) {
        //for(int index = 0; index <= bingo.length-1; index ++) {
            System.out.println(bingo[index]);
        }

        int summ = 0;
        for(int index = 0; index < bingo.length; index ++) {
        //for(int index = 0; index <= bingo.length-1; index ++) {
            summ += bingo[index];
        }
        System.out.println(summ);

        int maxx = 0;
        for(int index = 0; index < bingo.length; index ++) {
            if (bingo[index] >= maxx){
                maxx = bingo[index];
            }
        }
        System.out.println(maxx);
        

        /*
         * for 迴圈 減量範例
         * 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
         * 可用Debug 觀察 index 的變化
         */
        // for(int index = 10; index > 0; index --) {
        //     System.out.println(index);
        // }


        /*
         * for each 迴圈
         * for (資料型態 單一變數名稱 : 陣列變數名稱) {
         *     條件成立時執行的程式碼
         * }
         */
        String[] students = { "A1", "A2", "A3" };
        for (String stu : students) {
            System.out.println(stu);
        }


        /*
         * 105 ~ 108 這幾行 效果等於以下寫法
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (int index = 0; index <= students.length - 1; index++) {
        //     System.out.println(students[index]);
        // }

    }
}
