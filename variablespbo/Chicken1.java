public class Chicken1 {
    public static void main(String[] args) {

        // Skenario 1
        // Telur Per Ayam = 5, Jumlah Ayam = 3;

        int chicken1, egg1, simpan1;
        int scenario1;
        int predator1;

        simpan1 = 0; chicken1 = 3; egg1 = 5;

        scenario1 = chicken1 * egg1;
        simpan1 = simpan1 + scenario1;

        System.out.println("scan 1");
        System.out.println("pada hari senin : "+simpan1);
        chicken1++;
        scenario1 = chicken1 * egg1;
        simpan1 = simpan1 + scenario1;
        System.out.println("\n"+"pada hari selasa : "+simpan1);
        predator1 = 2;
        chicken1 =  chicken1 / predator1;
        scenario1 = chicken1 * egg1;
        simpan1 = simpan1 + scenario1;
        System.out.println("\n"+"pada hari rabu : "+simpan1);

        System.out.println("=================================================================");
        //Skenario 2
        //Telur Per Ayam = 4, Jumlah Ayam = 8

        int chicken2, egg2, simpan2;
        int scenario2;
        int predator2;

        simpan2 = 0; chicken2 = 8; egg2 = 4;

        scenario2 = chicken2 * egg2;
        simpan2 = simpan2 + scenario2;

        System.out.println("scan 2");
        System.out.println("pada hari senin : "+simpan2);
        chicken2++;
        scenario2 = chicken2 * egg2;
        simpan2 = simpan2 + scenario2;
        System.out.println("\n"+"pada hari selasa : "+simpan2);
        predator2 = 2;
        chicken2 =  chicken2 / predator2;
        scenario2 = chicken2 * egg2;
        simpan2 = simpan2 + scenario2;
        System.out.println("\n"+"pada hari rabu : "+simpan2);

    }

}
