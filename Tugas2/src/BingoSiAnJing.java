public class BingoSiAnJing {
    char bingo[] = {'B', 'I', 'N', 'G', 'O',};
        
    public BingoSiAnJing(int jumlahClap) {
        for(int j = 0; j < 3; j++) {
            for(int i = 0; i < bingo.length; i++) {
                if(i < jumlahClap) {
                    System.out.print("(clap)");
                }
                else {
                    System.out.print(bingo[i]);
                }

                if(i < bingo.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }

}
