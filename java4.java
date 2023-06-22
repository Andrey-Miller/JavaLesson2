public class java4 {
    public static void main(String[] args) {
    String str = ".3 + 1.56 = ";
    String[] values = str.split(" ");
    double result = Double.parseDouble(values[0]) + Double.parseDouble(values[2]);
    System.out.println(str + result);          
    }      
}

