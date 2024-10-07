//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s1="To be or not to be";
        System.out.println(s1.contains("be"));
        System.out.println("\uD83D\uDE03");
        System.out.println("\uD83D\uDE02");
        System.out.println("\uD83D\uDC4D");
        String text = "ПрИкЛаДоВиЙ РяДок";
        String result = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        System.out.println(result);
    }
}