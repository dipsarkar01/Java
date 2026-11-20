public class arrayChangeValues {
    public static void main(String[] args) {
        String[] cars = {"BMW","Koenigsegg","Rolls Royse","Nissan"};
        cars[1]="Tata";
        System.out.println(cars[1]);
        int[] myNum={10,20,30,40,50,60,70,80,90,100};
        myNum[1]=69;
        System.out.println(myNum[1]);
        System.out.println(cars.length);
        System.out.println(myNum.length);
        String[] flowers =new String[3];
        flowers[0]="Lotus";
        flowers[1]="Rose";
        flowers[2]="Lily";
        System.out.println(flowers[0]);
        System.out.println(flowers[2]);
        System.out.println(flowers.length);
    }
}