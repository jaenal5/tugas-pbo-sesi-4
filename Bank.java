class Bank {

    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " 
                + rekeningTujuan + " di bank " + bankTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " 
                + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Berita: " + berita);
    }

    void sukuBunga() {
        System.out.println("Suku bunga standar adalah 3%");
    }
}