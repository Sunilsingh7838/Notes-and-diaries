public
class diamond {
    public static
    void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * (3 - i) - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
