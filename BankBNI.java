class BankBNI extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku bunga BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = 5000;

        System.out.println("Transfer Rp" + jumlah + " ke rekening " 
                + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Biaya transfer: Rp" + biaya);
    }
}