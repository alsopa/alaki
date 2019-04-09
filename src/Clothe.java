public class Clothe extends  Product{
    Clothekind clothekind;
    Material material;
    Sizee sizee;
    Brand brand;
    enum Clothekind{
        shirt , pants
    }
    enum Material{
        flax , jeans , cotton
    }
    enum Sizee {
        S , M , L , XL , XXL
    }
    enum Brand{
        polo , koton , holiday , hakoopian
    }


}
