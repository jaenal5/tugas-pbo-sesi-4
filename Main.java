public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.transferUang(100000, "123456789");
        bank.transferUang(200000, "987654321", "Mandiri");
        bank.transferUang(300000, "111222333", "BRI", "Bayar kuliah");
        bank.sukuBunga();

        System.out.println("------------------");

        BankBNI bni = new BankBNI();
        bni.transferUang(150000, "222333444", "bebas");
        bni.sukuBunga();

        System.out.println("------------------");

        BankBCA bca = new BankBCA();
        bca.transferUang(250000, "555666777", "bebas");
        bca.sukuBunga();
    }
}