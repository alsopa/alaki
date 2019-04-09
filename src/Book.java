public class Book extends  Product {
    Genre gener;
    Publishers publishers;
    Language language;
    Writer writer;
    enum Genre{
        horror , comic , novel , Historical
    }
    enum Publishers {
        ofogh , sooremehr , iran , roozbahan
    }
    enum Language{
        persian , english , france , spanish
    }
    enum Writer{
        ostad_fazel_nazari , Charles_Dickens , ostadbozorg_nader_ebrahimi
    }

}
