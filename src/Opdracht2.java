public class Opdracht2 {

    static String text = "Dit is een text met \" en ** en ?? " + "en allerlei andere niet wenselijke tekens zoals ® etc.";

    public static void main(String[] args) {

        System.out.println("Before: " + text);//print op scherm wat de tekst ervoor was
        String replacer = regexCheck();
        System.out.println(replacer);

    }

    private static String regexCheck() { //hier word de string vervangen door regex. alleen woorden komen erin door \\w

        System.out.print("After: ");
        text = text.replaceAll("\\W", " ");

        return text;
    }

}
