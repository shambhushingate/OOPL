import java.util.*;

class Examine {
    private static int count = 0;

    public void EvenOrOdd(int n) {
        if (n % 2 == 0 || n == 0) {
            System.out.print("\n  " + n);
            count++;
        } else {
            System.out.print("\t\t " + n);
        }
    }

    public void isPrime(int n) {
        for (int i = 2; i <= (n / 2) + 1; i++) {
            if ((n == 0 || n == 1 || n % i == 0) && n != 2) {
                System.out.print("\n   " + n);
                break;
            } else {
                System.out.print("\t\t " + n);
                count++;
            }
        }
    }

    public void checkIntArray(int choice) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Array Size : ");
        int size = input.nextInt();
        int n;
        System.out.print("\nEnter " + size + " array elements : ");
        for (int i = 0; i < size; i++) {
            n = input.nextInt();
            array.add(n);
        }
        count = 0;
        Iterator<Integer> it = array.iterator();
        if (choice == 1) {
            System.out.print("\nEven No.\tOdd No.\n");
            while (it.hasNext()) {
                EvenOrOdd((int) it.next());
            }
            System.out.print("\nNo. of Even elements in ArrayList : " + count + "\nnNo. of Odd elements in ArrayList : "
                    + (size - count));
        } else {
            System.out.print("\nNon-Prime No.\tPrime No.\n");
            while (it.hasNext()) {
                isPrime((int) it.next());
            }
            System.out.print("\nNo. of Prime elements in ArrayList : " + count);
        }
    }

    public void isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder(s);
        if (s.equals(s1.reverse().toString())) {
            System.out.print("\n  " + s);
            count++;
        } else {
            System.out.print("\t\t " + s);
        }
    }

    public void checkStringArray() {
        ArrayList<String> array = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Array Size : ");
        int size = input.nextInt();
        String n;
        System.out.print("\nEnter " + size + " array strings : ");
        for (int i = 0; i < size; i++) {
            n = input.next();
            array.add(n);
        }
        count = 0;
        Iterator<String> it = array.iterator();
        System.out.print("\nPalindrome\tNon-Palindrome\n");
        while (it.hasNext()) {
            isPalindrome((String) it.next());
        }
        System.out.print("\n\nNo. of Palindrome strings in ArrayList : " + count);
    }
}

public class GenericTemplate {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Examine generic = new Examine();
        while (true) {
            System.out.print("\n\nCheck : \t1. Even or Odd  \t2. Prime\t3. Palindrome\n\t\t\tEnter Operation : ");
            int choice = input.nextInt();
            if (choice == 3) {
                generic.checkStringArray();
            } else {
                generic.checkIntArray(choice);
            }
        }
    }
}
