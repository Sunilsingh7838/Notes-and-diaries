public
class StarPrint {
    public static
    void main(String[] args) {
        // 3x3 star print

//        right angled triangle
//        System.out.println(" right angled triangle");
//        for (int i = 0; i<4; i++){
//            for (int j =0; j<i+1; j++){
//                System.out.print(" * ");
//            }
//
//            System.out.println();
//        }

        //inverted rightangled trinagle
//        System.out.println("inverted rightangled trinagle");
//        for (int i =0; i<4; i++){
//            for (int j =0;j<i+1; j++){
//                System.out.print("   ");
//            }
//            for (int k = 4;k>i;k--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


//        left angled right triangle
//        System.out.println("left angled right triangle");
//        for (int i =0; i<4; i++){
//            for (int j =0; j<4-i; j++){
//                System.out.print("   ");
//            }
//            for (int k =0; k<i+1; k++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        //inverted left angled triagle
//        System.out.println("inverted right triagle");
//        for (int i =0; i<4; i++){
//            for (int j = 0; j<4-i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // pyramid
//        System.out.println("pyramid");
//        for (int i = 0; i<4; i++){
//            for (int j =0; j<4-i; j++){
//                System.out.print("   ");
//            }
//            for (int k =0; k<i+1; k++){
//                System.out.print(" * ");
//            }
//            for (int l =0; l<i; l++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //inverted pyramid
//        System.out.println("inverted pyramid");
//        for (int i =0;i<4;i++){
//            for (int j = 0; j<i+1; j++){
//            System.out.print("   ");
//            }
//            for (int k = 4; k>i ; k--){
//                System.out.print(" * ");
//            }
//            for (int l = 3;l>i; l--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        // Daimond ( pyramid + inverted pyramid)
        System.out.println("Daimond ( pyramid + inverted pyramid)");
        for (int i = 0; i<5; i++){
            for (int j = 4; j>i; j--){
                System.out.print("  ");
            }
            for (int k = 0; k<i+1;k++){
                System.out.print("* ");
            }
            for (int l = 0; l<i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //System.out.println("* * * * * * * * *");
        for (int i = 0; i<4; i++){
            for (int j =0; j<i+1; j++){
                System.out.print("  ");
            }
            for (int k =4;k>i; k--){
                System.out.print("* ");
            }
            for (int l = 4;l>i+1;l--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
