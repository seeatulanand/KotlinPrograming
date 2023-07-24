public class MyJavaFile {
    public static void main(String[] args) {

        int sum = MyCustomKotlinFileName.addNumbers(3, 4);
        System.out.println("Printing sum from Java file :" + sum);
       int volume= MyCustomKotlinFileName.findVolume(3,10);
        System.out.println("Volume : "+ volume);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}
