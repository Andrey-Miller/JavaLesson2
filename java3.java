
public class java3 {
    public static void main(String[] args) {
    
    String string = "a".repeat(1000000);
    StringBuilder builder = new StringBuilder(string);
    
    long start1 = System.currentTimeMillis();
    string = string.replace("a", "A");
    System.out.println("Время замены методоми String = " + (System.currentTimeMillis() - start1) + " мс");

    long start2 = System.currentTimeMillis();
    for (int i = 0; i < builder.length(); i++) {
        builder.setCharAt(i, 'A');
    }
    System.out.println("Время замены методами StringBuilder = " + (System.currentTimeMillis() - start2) + " мс");
    }
            
}
 

