public class Main
{
    public static void main(String[] args)
    {
        int sayi1=266;
        int sayi2=2599;
        int sayi3=277;
        int enBuyuk=sayi1;

        if(enBuyuk<sayi2)
        {
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3)
        {
            enBuyuk=sayi3;
        }
        System.out.println("En büyük= "+enBuyuk);
    }
}