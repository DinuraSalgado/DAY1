 class ReverseDiamond {

    public static void main(String[] ar) {

        int rows = 10;
        ReverseDiamond diamond = new ReverseDiamond();

        for(int i = 0; i < rows; i++)
            diamond.printLine(rows, i);

        for(int i = rows - 2; i >= 0; i--)
            diamond.printLine(rows, i);
    }



    private void printLine(int rows, int currRow) {

        for(int space = 1; space <= currRow; space++)
            System.out.print(" ");

        for(int star = 1; star < 2 * (rows - currRow); star++)
            System.out.print("*");

        System.out.println();
    }
}