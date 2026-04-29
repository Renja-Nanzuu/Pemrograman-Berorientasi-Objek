public class GudangToko {
    public static ManageBarang[] listBarang = {
        new ManageBarang("a001","Buku",3000),
        new ManageBarang("a002","Pensil",4000),
        new ManageBarang("a003","Pulpen",5000)
    };
    
    public static ManageBarang cariBarang(String kode) {
        for (ManageBarang barang : listBarang) {
            if (barang.kode.equals(kode)) {
                return barang;
            }
        }
        return null;
    }
}
