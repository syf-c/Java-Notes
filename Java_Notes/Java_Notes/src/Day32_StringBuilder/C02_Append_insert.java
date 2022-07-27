package Day32_StringBuilder;

public class C02_Append_insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java daha ne yapsin");
        
        sb.append("?");
        System.out.println("sb = " + sb); //sb = Java daha ne yapsin?

        //append istedigimiz stringi en sona ekler ve herseyi string olarak ekliyor concat metodu yapiyor

    //    sb.append(5);
     //   System.out.println("sb = " + sb); //sb = Java daha ne yapsin?5

    //    sb.append(true);
    //    System.out.println("sb = " + sb); //sb = Java daha ne yapsin?5true

        sb.insert(4," herseyi dusunmus");
        System.out.println("sb = " + sb); //sb = Java herseyi dusunmus  daha ne yapsin?

        /* *******************************************************
        araya birsey eklemek icin append yerine insert kullanmak lazim
         ******************************************************** */
        System.out.println(sb.insert(22,"valla valla",5,11));

    }
}
