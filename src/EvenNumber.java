public class EvenNumber {
    public static void main(String[] args) {
        int count = 0; // This will hold the count of even numbers

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even numbers between 1 and 100: " + count);
    }
}
