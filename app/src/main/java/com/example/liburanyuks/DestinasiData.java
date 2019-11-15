package com.example.liburanyuks;

import java.util.ArrayList;

class DestinasiData {

    private static String[] namaDetinasi={
            "Masjid Baiturrahman",
            "Candi Borobudur",
            "Danau Toba",
            "Gunung Bromo",
            "Jam Gadang",
            "Kepulauan Derawan",
            "Karimun Jawa",
            "Raja Ampat",
            "Tana Toraja",
            "Goa Gong"
    };

    private static String[] kotaDestinasi={
            "Banda Aceh",
            "Magelan, Jawa Tengah",
            "Medan, Sumatera Utara",
            "Jawa Timur",
            "Padang, Sumatera Barat",
            "Kalimantan Timur",
            "Jepara",
            "Papua Barat",
            "Sulawesi Selatan",
            "Jawa Timur"
    };

    private static String[] tentangDestinasi={
            "Masjid yang megah berdiri, disaat terjadinya tsunami di Aceh masjid ini tetap berdiri kokoh, dan sekarang menjadi objek wisata",
            "Candi terbesar se-Asia Tenggara, sudah menjadi keajaiban dunia ke-7, dan objek wisata di Jawa tengah yang populer",
            "Danau yang tercipta karena erupsi gunung tambora, dan sekarang menjadi destinasi wisata Sumatera Utara",
            "Gunung yang aktif di Indonesia dengan menyanjikan pemandangan yang bagus, dan menjadi trip naik gunung favorit",
            "Salah satu icon di Sumatera Barat dimana arsitektur mesin jamnya hanya ada 2 di dunia yaitu 1 berada di Inggris dan satu di Indonesia",
            "Kepulauan Derawan adalah sebuah kepulauan yang berada di Kabupaten Berau, Kalimantan Timur. Di kepulauan ini terdapat sejumlah objek wisata bahari menawan, salah satunya Taman Bawah Laut yang diminati wisatawan mancanegara terutama para penyelam kelas dunia.",
            "Kepulauan ini ditetapkan sebagai salah satu taman nasional Indonesia pada tahun 2001 oleh Negara. Kepualaun ini merupakan bagian dari salah satu kecamatan di Jepara dan berjarak cukup jauh, yaitu 83 KM di bagian utara kota Jepara utama.",
            "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat",
            "Kabupaten Tana Toraja adalah kabupaten di Provinsi Sulawesi Selatan, dengan ibu kota kabupaten bernama Makale. Tana Toraja merupakan sebuah daerah di Sulawesi Selatan yang sudah tersohor namanya dengan keindahan pemandangan yang mengagumkan dan kaya akan tradisi budaya yang terkenal hingga manca negara. ",
            "Pacitan dianugerahi keindahan bawah tanah yang mempesona berupa gua-gua kapur yang dihiasi stalaktit dan stalakmit. Gua yang paling terkenal dan paling indah adalah Gua Gong"
    };

    private static String[] hotelDestinasi= {
            "Hotel A - Luxury",
            "Hotel B - Glamour",
            "Hotel C - Fancy",
            "Hotel D - Wow",
            "Hotel E - Mewah",
            "Hotel F - Bagus",
            "Hotel G - Top",
            "Hotel H - Best",
            "Hotel I - Fix",
            "Hotel J - Kuy"
    };

    private static String[] paketDestinasi={
            "Rp 1.500.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 800.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 2.000.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 800.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 900.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 1.000.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 1.200.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 1.100.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 700.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)",
            "Rp 750.000,- (2 Kamar Tidur, AC, 1 Kamar Mandi, Tv, Kulkas)"

    };

    private static String[] detailDestinasi= {
            "Di tengah porak porandanya pusat ibu kota Aceh itu, Masjid Raya Baiturrahman ikon kebanggaan masyarakat Aceh ini, masih berdiri kokoh. Meski di sekelilingnya dipenuhi lumpur dan puing-puing reruntuhan akibat hanyut dibawa air. Masjid ini, menjadi saksi bisu keganasan gelombang tsunami menggulung bumi Serambi Makkah.\n",
            "Candi Borobudur merupakan salah satu Candi terbesar di Indonesia. Candi borobudur merupakan salah satu Candi Buddha yang terletak di Magelang, provinsi Jawa Tengah. Candi Borobudur terletak kurang lebih 40 km di sebelah barat laut kota jogja.",
            "Danau Toba adalah danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Berapi Super. Danau ini memiliki panjang 100 kilometer (62 mil), lebar 30 kilometer (19 mi), dan kedalaman 1600 meter (5200 ft).",
            "Gunung Bromo (dari bahasa Sanskerta: Brahma, salah seorang Dewa Utama dalam agama Hindu) atau dalam bahasa Tengger dieja \"Brama\", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia.",
            "Jam Gadang adalah nama untuk menara jam yang terletak di pusat kota Bukittinggi, Sumatra Barat, Indonesia. Menara jam ini memiliki jam dengan ukuran besar di empat sisinya sehingga dinamakan Jam Gadang, sebutan bahasa Minangkabau yang berarti.",
            "Kepulauan Derawan adalah sebuah kepulauan yang berada di Kabupaten Berau, Kalimantan Timur. Di kepulauan ini terdapat sejumlah objek wisata bahari menawan, salah satunya Taman Bawah Laut yang diminati wisatawan mancanegara terutama para penyelam kelas dunia.",
            "Terletak di 83 kilometer utara Jepara, kamu mesti membelah Laut Jawa untuk sampai ke Karimunjawa. Dari Jakarta, kamu bisa naik KA Tawang Jaya yang berangkat dari Stasiun Pasar Senen ke Stasiun Semarang Poncol dengan Rp170.000 (kelas ekonomi, berangkat pukul 06.55). Sampai Semarang, kamu masih harus meneruskan perjalanan ke Pelabuhan Kartini Jepara.",
            "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung (Vogelkoop) Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat, Provinsi Papua Barat.",
            "Suku Toraja yang mendiami daerah pegunungan di kawasan ini masih mempertahankan gaya hidup yang khas dan masih menunjukkan gaya hidup Austronesia yang asli dan mirip dengan budaya Nias.",
            "Memasuki goa Gong, anda akan disambut formasi stalaktit dan stalakmit yang indah. Dibantu penerangan yang cukup anda dapat masuk lebih dalam dan menyusuri lorong gua sepanjang 256 meter."
    };

    private static  int[] destinasiImages = {
            R.drawable.masjis_darussalam,
            R.drawable.candi_borobudur,
            R.drawable.danau_toba,
            R.drawable.gunung_bromo,
            R.drawable.jam_gadang,
            R.drawable.kepulauan_derawan,
            R.drawable.karimun_jawa,
            R.drawable.raja_ampat_fix,
            R.drawable.tana_toraja,
            R.drawable.goa_gong
    };




    private static int[] rating ={
            5,
            3,
            3,
            4,
            4,
            3,
            5,
            4,
            5,
            3

    };


    static ArrayList<Destinasi> getListDataDestinasi(){
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position < namaDetinasi.length; position++){
            Destinasi destinasi= new Destinasi();
            destinasi.setName(namaDetinasi[position]);
            destinasi.setKotaDestinasi(kotaDestinasi[position]);
            destinasi.setTentangDestinasi(tentangDestinasi[position]);
            destinasi.setHotelDestinasi(hotelDestinasi[position]);
            destinasi.setPaketDestinasi(paketDestinasi[position]);
            destinasi.setDetailDestinasi(detailDestinasi[position]);
            destinasi.setRating(rating[position]);
            destinasi.setFotoDestinasi(destinasiImages[position]);
            list.add(destinasi);
        }
        return list;
    }
}
