public class Electric extends  Product{
    String color ;
    int power , warranty ;
    Energylabel energylabel;
    Brand brand;
    Electrickind electrickind;
    enum Electrickind{
        phone , laptop
    }
    enum Energylabel{
        APPP , APP , AP , A , B , C , D
    }
    enum Brand{
        samsung , apple , lg , microsoft
    }
}
