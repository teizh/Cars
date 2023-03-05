public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    class MyClass {
        public void main(String[] args) {
            private int countResult() {
                int a = 1;
                try {
                    a=  a + 1;
                    a = a / 0;
                    return a;
                } catch (Exception e) {
                    a = a + 3;
                } finally {
                    a++;
                }
                return a;
            }
        }


}