package mencariangkagenap;

/**
 *
 * @author User
 */
public class MencariAngkaGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mencariAngkaGenap();
    }

    public static void mencariAngkaGenap() {
        System.out.println("Angka genap dari 1 sampai 50 adalah:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
