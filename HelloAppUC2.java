public class HelloAppUC2 {

    public static void main(String[] args) {

        String name = (args.length > 0) ? args[0] : "Alice";
        System.out.println("Hello " + name);

    }

}