package java_basics.chap7;

public class Test {
    private static int findMin(String[] a) {
        int min = Integer.MAX_VALUE;
        for (String s : a) {
            try {
                int x = Integer.parseInt(s);
                
                if (x < 0) {
                    throw new HandleException(x);
                }
                if (x < min) {
                    min = x;
                }
            } catch (NumberFormatException e) {
                System.out.println("element cannot be converted to int: " + e.getMessage());
            } catch (HandleException e) {
                System.out.println("element should be ignored: " + e.getMessage());
            }
        }
        return min;
    }
    public static void main(String[] args) {
        String[] t = { "16", "2x", "36", "-64" };
        System.out.println(findMin(t));
    }
}
