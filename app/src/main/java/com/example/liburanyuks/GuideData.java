package com.example.liburanyuks;


import java.util.ArrayList;

class GuideData {

    private static int[] guideImages={
            R.drawable.foto_bambang,
            R.drawable.foto_brojo,
            R.drawable.foto_carlos,
            R.drawable.foto_cici,
            R.drawable.foto_devi,
            R.drawable.foto_kamila,
            R.drawable.foto_meimei,
            R.drawable.foto_paijo,
            R.drawable.foto_susanti,
            R.drawable.foto_tejo
    };

    private static String[] guideShortName ={
            "Bambang",
            "Brojo",
            "Carlos",
            "Cici",
            "Devi",
            "Kamila",
            "Meimei",
            "Paijo",
            "Susanti",
            "Tejo"
    };

    private static String[] guideTitle={
            "Seorang Guide yang sangat suka mendaki gunung, banyak gunung di Indonesia yang sudah dia daki.",
            "Seorang Guide yang sangat tau tempat foto unik di sekitaran Jawa Tengah",
            "Seorang Guide yang sangat suka berselancar",
            "Seorang Guide yang tau tempat makan dan dia juga jago bahasa asing loh",
            "Seorang Guide yang suka naik gunung, dan penyangang binatang",
            "Seorang Guide yang suka surfing",
            "Seorang Guide yang suka photography hasil jepretannya bagus sekali loh",
            "Seorang Guide yang juga sekaligus selebgram untuk travelling",
            "Seorang Guide yang sangat menguasai daerah Sumatera",
            "Seorang Guide yang sangat suka dengan kondisi sosial dan budaya di tiap daerah"

    };

    private static String[] guideAge={
            "24",
            "26",
            "25",
            "23",
            "24",
            "25",
            "25",
            "26",
            "23",
            "25",
    };

    private static String[] guideDetail={
            "Tinggal di Jawa Timur, merupakan guide yang sangat handal di wilayahnya",
            "Tinggal di Jakarta, merupakan guide yang sering foto di tempat instagramable",
            "Tinggal di Jogja, merupakan guide yang handal dan tau tempat-tempat seru",
            "Tinggal di Bogor, merupakan guide yang handal dan tau tempat-tempat seru",
            "Tinggal di Bandung, merupakan guide yang handal dan tau tempat-tempat seru",
            "Tinggal di Padang, merupakan guide yang handal dan tau tempat-tempat seru",
            "Tinggal di Palembang, merupakan guide yang handal dan tau tempat-tempat seru",
            "Tinggal di Aceh, merupakan guide yang handal dan tau tempat-tempat seru",
            "Tinggal di Sulawesi Tengah, merupakan guide yang handal dan tau tempat-tempat seru",
            "Tinggal di Kalimantan Timur, merupakan guide yang handal dan tau tempat-tempat seru",
    };

    private static String[] guideLongName={
            "Bambang Gunanjar",
            "Brojo Jordy",
            "Valent Carlos",
            "Nur Cici Hadid",
            "Devi Suswita",
            "Kamila Komilah",
            "Xiao Meimei",
            "Charles Paijo",
            "Suci Susasanti",
            "Tejo Sutejo"

    };

    private static String[] guideGender={
            "Male",
            "Male",
            "Male",
            "Female",
            "Female",
            "Female",
            "Female",
            "Male",
            "Female",
            "Male"

    };

    private static  String[] guiderNumber={
            "0898-8800-2222",
            "0897-2345-3333",
            "0897-5337-3737",
            "0896-4849-4949",
            "0895-3984-4899",
            "0896-3833-3939",
            "0821-2939-4993",
            "0898-3837-4747",
            "0898-2837-3838",
            "0893-8342-9299",
    };

    static ArrayList<Guide> getListData(){
        ArrayList<Guide> list = new ArrayList<>();
        for (int position = 0; position < guideShortName.length; position++){
            Guide guide = new Guide();
            guide.setNamaGuide(guideShortName[position]);
            guide.setNamaPanjangGuide(guideLongName[position]);
            guide.setUmurGuide(guideAge[position]);
            guide.setTitleGuide(guideTitle[position]);
            guide.setDetailGuide(guideDetail[position]);
            guide.setGenderGuide(guideGender[position]);
            guide.setFotoGuide(guideImages[position]);
            guide.setNomer(guiderNumber[position]);
            list.add(guide);
        }
        return list;
    }

}
