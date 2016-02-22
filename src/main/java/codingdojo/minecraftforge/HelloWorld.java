package codingdojo.minecraftforge;

public class HelloWorld {

    String s1 = "some string";

    int index = 1;



//    String

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.printMessage("hello world");
    }


    public void printMessage(String message) {
        System.out.println(message);
    }

}
