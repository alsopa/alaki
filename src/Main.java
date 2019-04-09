import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<Product> allwehave = new ArrayList<Product>();
    void printproduct(Product p){
        System.out.println(p.id + "    ");
        System.out.println(p.name + "    ");
        System.out.println(p.priceout + "    ");
        if(p.kind == Product.Kind.book){
            Book now = (Book)(p);
            System.out.println(now.writer + "    ");
            System.out.println(now.publishers + "    ");
            System.out.println(now.gener + "    ");
            System.out.println(now.language + "    ");
        }
        if(p.kind == Product.Kind.electric){
            Electric now = (Electric)p;
            System.out.println(now.electrickind + "    ");
            System.out.println(now.color + "    ");
            System.out.println("POWER(W) : " + now.power + "    ");
            System.out.println("WARRANTY(month) : " + now.warranty + "    ");
            System.out.println("ENERGYLABLE : " + now.energylabel + "   ");
            System.out.println("BRAND : " + now.brand + "   ");
            if(now.electrickind == Electric.Electrickind.phone ){
                Phone myphone = (Phone)(now);
                System.out.println("STORAGE : " + myphone.storage);
                System.out.println("OS : " + myphone.os + "    ");
            }
            if(now.electrickind == Electric.Electrickind.laptop ){
                Laptop mylaptop = (Laptop)now;
                System.out.println("CPU : " + mylaptop.cpu);
                System.out.println("GPU : " + mylaptop.gpu);
            }
        }
        if(p.kind == Product.Kind.clothe){
            Clothe now = (Clothe)p;
            System.out.println(now.clothekind + "   ");
            System.out.println(now.material + "    ");
            System.out.println(now.sizee + "    ");
            System.out.println(now.brand + "    ");
            if(now.clothekind == Clothe.Clothekind.shirt ){
                Shirt myshirt = (Shirt)now;
                System.out.println(myshirt.sleeve+ "   ");
                System.out.println(myshirt.kindofshirt + "    ");
            }
            if(now.clothekind == Clothe.Clothekind.pants ){
                Pants mypants = (Pants)now;
                System.out.println(mypants.legkind + "  ");
            }
        }
        System.out.println(p.explanation);
    }
    void showmenu(){
        for(Object element : allwehave)printproduct((Product) element);
    }
    void creatproduct(){
        Product now= new Product();
        Scanner cin = new Scanner(System.in);
        System.out.println("HELLO LET'S CREATE A NEW PRODUCT PLEASE ENTER THE NAME OF PRODUCT");
        now.name= cin.nextLine();
        System.out.println("now enter the id of your product");
        now.id=cin.nextLong();
        System.out.println("tnx now enter the purchase price");
        now.pricein=cin.nextLong();
        System.out.println("tnx now enter the sales price");
        now.priceout=cin.nextLong();
        System.out.println("now set the kind of your product please enter the number of your choice" + " \n" + "1) clothe 2)electric 3)book");
        int kindnum; kindnum=cin.nextInt();
        if(kindnum==1){
            now.kind = Product.Kind.clothe;
            Clothe nowclothe = (Clothe) now;
            System.out.println("our new product is a clothe so let's set the material of it enter the number\n" + "1)flax  2)jeans 3)cotton");
            int matnum; matnum=cin.nextInt();
            if(matnum == 1) nowclothe.material = Clothe.Material.flax;
            if(matnum == 2) nowclothe.material = Clothe.Material.jeans;
            if(matnum == 3) nowclothe.material = Clothe.Material.cotton;
            System.out.println("ok now tell me the size please Enter the number\n" + "1)S 2)M 3)L 4)XL 5)XXL");
            int sizeenum=cin.nextInt();
            if(sizeenum==1) nowclothe.sizee=Clothe.Sizee.S;
            if(sizeenum==2) nowclothe.sizee=Clothe.Sizee.M;
            if(sizeenum==3) nowclothe.sizee=Clothe.Sizee.L;
            if(sizeenum==4) nowclothe.sizee=Clothe.Sizee.XL;
            if(sizeenum==5) nowclothe.sizee=Clothe.Sizee.XXL;
            System.out.println("whats the brand ??? please enter the number \n" + "1)polo 2)koton 3)holiday 4)hakoopian");
            int brandnum = cin.nextInt();
            if(brandnum==1) nowclothe.brand=Clothe.Brand.polo;
            if(brandnum==2) nowclothe.brand=Clothe.Brand.koton;
            if(brandnum==3) nowclothe.brand=Clothe.Brand.holiday;
            if(brandnum==4) nowclothe.brand=Clothe.Brand.hakoopian;
            System.out.println("it's shirt or pants enter 1 for shirt 2 for pants ??? ");
            int clothekindnum=cin.nextInt();
            if(clothekindnum== 1){
                nowclothe.clothekind = Clothe.Clothekind.shirt;
                Shirt nowshirt = (Shirt)nowclothe;
                System.out.println("ok the sleev of our shirt is short or long enter 1 for short and 2 for long ");
                int sleevenum = cin.nextInt();
                if(sleevenum==1) nowshirt.sleeve=Shirt.Sleeve.sshort;
                if(sleevenum==2) nowshirt.sleeve=Shirt.Sleeve.llong;
                System.out.println("our shirt is classic or sport 1 for classic and 2 for sport ");
                int shirtkindnum = cin.nextInt();
                if (shirtkindnum == 1) nowshirt.kindofshirt = Shirt.Kindofshirt.classic;
                if (shirtkindnum == 2) nowshirt.kindofshirt = Shirt.Kindofshirt.sport;
                allwehave.add(nowshirt);
                //finishfunc
            }
            if(clothekindnum== 2){
                nowclothe.clothekind = Clothe.Clothekind.pants;
                Pants nowpants =(Pants)nowclothe;
                System.out.println("tell me about our pants leg 1 means it's Loose and 2 means simple");
                int pantsnum = cin.nextInt();
                if(pantsnum == 1) nowpants.legkind = Pants.Legkind.Loose;
                if(pantsnum == 2) nowpants.legkind = Pants.Legkind.simple;
                allwehave.add(nowpants);
            }
        }
        if(kindnum==2){
            now.kind = Product.Kind.electric;
        }
        if(kindnum==3){
            now.kind = Product.Kind.book;
        }

        //expolation
    }
    public static void main(String[] args) {
    }
}

