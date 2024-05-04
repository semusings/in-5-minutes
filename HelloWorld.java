public class HelloWorld {
    static String greeting = "Hello, World!";

    public static void main(String[] args) {
        System.out.println(String.format(":%s\n:%s\n:%s", HelloWorld.class.getName(), greeting,
                "Subscribe us on youtube.com/@semusings"));
    }
}