package module2;

public class NameEncoderDecoder {
    public String encode(String name){
        return "NOTFORYOU" + name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o","4")
                .replace("a", "5") + "YESNOTFORYOU";
    }

    public String decode(String name){
        name = name.substring(9,name.length()-12);
        return name
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4","o")
                .replace("5", "a");
    }

    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();

        String nameEncode = names.encode("Crab");
        System.out.println("names.nameEncode(\"Crab\") = " + nameEncode);

        String nameDecode = names.decode("NOTFORYOUCr5bYESNOTFORYOU");
        System.out.println("names.nameDecode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + nameDecode);

        String nameDecode2 = names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("names.nameDecode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + nameDecode2);
    }
}
