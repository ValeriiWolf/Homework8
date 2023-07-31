public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] arrayInt = new int[12];
        for (int i = 0; i < 12; i++) {
            if (i < 3) {
                arrayInt[i] = i + 1;
            }
        }
        double[] arrayDouble = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrayDouble.length; i++) {
            int[] arrayInteger = {1, 2, 7, 10};
        }
    }

    public static void task2() {
        int[] arrayInt = new int[12];
        System.out.print("arrayInt = ");
        for (int i = 0; i < 12; i++) {
            if (i < 3) {
                arrayInt[i] = i + 1;
            }
            if (i < 11) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.print(arrayInt[i]);
            }
        }
        System.out.println("");
        double[] arrayDouble = {1.57, 7.654, 9.986};
        System.out.print("arrayDouble[] = ");
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i < arrayDouble.length - 1) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.print(arrayDouble[i]);

            }
        }
        System.out.println("");
        int[] arrayInteger = {1, 2, 7, 10};
        System.out.print("arrayInteger[] = ");
        for (int i = 0; i < arrayInteger.length; i++) {
            if (i < arrayInteger.length - 1) {
                System.out.print(arrayInteger[i] + ", ");
            } else {
                System.out.print(arrayInteger[i]);
            }
        }
        System.out.println("");
    }

    public static void task3() {
        int[] arrayInt = new int[12];
        System.out.print("arrayInt = ");
        for (int i = 11; i >= 0; i--) {
            if (i < 3 && i > 0) {
                arrayInt[i] = i + 1;
                System.out.print(arrayInt[i] + ", ");
            }
            if (i == 0) {
                arrayInt[i] = i + 1;
                System.out.print(arrayInt[i]);
            }
        }
        System.out.println("");
        double[] arrayDouble = {1.57, 7.654, 9.986};
        System.out.print("arrayDouble[] = ");
        for (int i = arrayDouble.length; i >= 0; i--) {
            if (i < arrayDouble.length && i != 0) {
                System.out.print(arrayDouble[i] + ", ");
            } else if (i == 0) {
                System.out.print(arrayDouble[0]);
            }
        }
        System.out.println("");
        int[] arrayInteger = {1, 2, 7, 10};
        System.out.print("arrayInteger[] = ");
        for (int i = arrayInteger.length; i >= 0; i--) {
            if (i < arrayInteger.length && i != 0) {
                System.out.print(arrayInteger[i] + ", ");
            } else if (i == 0) {
                System.out.print(arrayInteger[0]);
            }
        }
        System.out.println("");
    }
    public static void task4() {
        int[] arrayInt = new int[12];
        System.out.print("arrayInt = ");
        for (int i = 0; i < 12; i++) {
            if (i < 3) {
                arrayInt[i] = i + 1;
            }
            if(arrayInt[i]%2!=0&&arrayInt[i]!=0){
                arrayInt[i]=arrayInt[i]+1;
            }
            if (i < 11) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.print(arrayInt[i]);
            }
        }
        System.out.println("");
    }
}