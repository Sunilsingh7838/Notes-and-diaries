public
class star_patterns {
    public static
    void main(String[] args) {
        // 11x4 star print
        System.out.println("Rectangle");
        for (int i = 0; i <= 3; i++) {
            System.out.println("******************");
        }
        System.out.println();

        System.out.println("left handed right angled triangle");
        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Right handed right-angled triangle");
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pyramid");

        for (int i = 0; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = 0; l <= i - 1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Counting pyramid");
        //             1
//                    222
//                   33333
//                  4444444
//                 555555555

        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(i + 1);
            }
            for (int l = 0; l <= i - 1; l++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

//        1
//       212
//      32123
//     4321234
//    543212345

//       counting pyramid
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("_");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print(k);
            }
//            for (int k = i+1; k >= 1; k--) {
//                System.out.print(k );
//            }

            System.out.println();
        }
    }
}
