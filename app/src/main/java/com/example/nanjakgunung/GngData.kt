package com.example.nanjakgunung

object GngData {
    private val gngNames = arrayOf(
        "Gunung Andong",
        "Gunung Argopuro",
        "Gunung Cikuray",
        "Gunung Ciremay",
        "Gunung Gede Pangrango",
        "Gunung Guntur",
        "Gunung Arjuno",
        "Gunung Lawu",
        "Gunung Merapi",
        "Gunung Merbabu",
        "Gunung Papandayan",
        "Gunung Salak",
        "Gunung Semeru",
        "Gunung Slamet"
    )

    private val gngDetails = arrayOf(
        "Gunung Andong adalah sebuah gunung bertipe perisai di Kabupaten Magelang, Jawa Tengah. Gunung ini belum pernah mempunyai aktivitas meletus. Gunung Andong terletak di antara Ngablak dan Tlogorjo, Grabag dan berketinggian sekitar 1.463 m. Gunung Andong merupakan salah satu dari beberapa gunung yang melingkari Magelang. Berdampingan dengan Gunung Telomoyo, gunung ini berada di perbatasan wilayah Salatiga, Semarang, dan Magelang.",
        "Gunung Argapura merupakan puncak tertinggi dari Pegunungan Iyang serta berada pada posisi di antara Gunung Semeru dan Gunung Raung. Ada beberapa puncak yang dimiliki oleh gunung ini. Puncak yang terkenal bernama Puncak Rengganis / Welirang (topografichen Dienst 1928). Sedangkan puncak tertingginya berada pada jarak ± 200 m di arah selatan puncak Rengganis. Puncak tertinggi ini bernama Argopuro dan ditandai dengan sebuah tugu ketinggian (triangulasi).\n" +
                "\n" +
                "Gunung Argopuro mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung. ",
        "Gunung Cikuray atau Cikurai adalah sebuah gunung bertipe Stratovolcano yang terletak di Dayeuhmanggung, Kabupaten Garut, Jawa Barat, Indonesia. Gunung Cikuray yang mempunyai ketinggian 2.821 meter di atas permukaan laut ini tidak mempunyai kawah aktif dan merupakan gunung tertinggi keempat di Jawa Barat setelah Gunung Ciremai, Gunung Pangrango dan Gunung Gede. Gunung ini berada di perbatasan kecamatan Bayongbong dari sini bisa naik melalui jalur Cilegug atau kampung Jambansari dekat markas HdG Team, Cikajang, Kiara Janggot dan Dayeuhmanggung. Iklim di daerah Gunung Cikuray dan sekitarnya dikategorikan sebagai daerah beriklim tropis basah (humid tropical climate). Curah hujan di sekitar Gunung Cikuray mencapai 3500-4000mm dengan kalkulasi bulan basah 9 bulan dan bulan kering 3 bulan dan juga variasi temperatur dari 10º C hingga 24º C.",
        "Gunung Ceremai (sering kali secara salah kaprah dinamakan \"Ciremai\") ( Latin: Gunung Ceremé) adalah gunung berapi kerucut yang secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Kuningan dan Kabupaten Majalengka, Provinsi Jawa Barat. Posisi geografis puncaknya terletak pada 6° 53' 30\" LS dan 108° 24' 00\" BT, dengan ketinggian 3.078 m di atas permukaan laut. Gunung ini merupakan gunung tertinggi di Jawa Barat",
        "Gunung Gede merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980. Gunung ini berada di dua wilayah kabupaten yaitu Kabupaten Cianjur dan Sukabumi, dengan ketinggian 1.000 - 2.958 m. dpl, dan berada pada lintang 106°51' - 107°02' BT dan 64°1' - 65°1 LS. Suhu rata-rata di puncak gunung Gede 18 °C dan di malam hari suhu puncak berkisar 5 °C, dengan curah hujan rata-rata 3.600 mm/tahun. Gerbang utama menuju gunung ini adalah dari Cibodas dan Cipanas.",
        "Gunung Guntur adalah sebuah gunung berapi bertipe stratovolcano yang terdapat di Sirnajaya, Tarogong Kaler, Kabupaten Garut, Jawa Barat, dan memiliki ketinggian 2.249 meter dpl. \n" + "Gunung Guntur pernah menjadi gunung berapi paling aktif di pulau Jawa pada dekade 1800 an. Tapi sejak itu aktivitasnya kembali menurun. Erupsinya pada umumnya disertai dengan lelehan lava, lapili dan objek material lainnya. Erupsi Gunung Guntur yang tercatat adalah pada tahun 1847, 1843, 1841, 1840, 1836, 1834-35, 1833, 1832, 1832, 1829, 1828, 1827, 1825, 1818, 1816, 1815, 1809, 1807, 1803, 1800, 1780, 1777, 1690. \n",
        "Gunung Arjuno (terkadang dieja Gunung Arjuna) adalah sebuah gunung berapi kerucut (istirahat) di Jawa Timur, Indonesia dengan ketinggian 3.339 m dpl. Gunung Arjuno secara administratif terletak di perbatasan Kota Batu, Kabupaten Malang, dan Kabupaten Pasuruan dan berada di bawah pengelolaan Taman Hutan Raya Raden Soerjo. Gunung Arjuno merupakan gunung tertinggi kedua di Jawa Timur setelah Gunung Semeru, serta menjadi yang tertinggi keempat di Pulau Jawa. Biasanya gunung ini dicapai dari tiga titik pendakian yang cukup dikenal yaitu dari Lawang, Tretes dan Batu. Nama Arjuno berasal dari salah satu tokoh pewayangan Mahabharata, Arjuna. ",
        "Gunung Lawu  terletak di Pulau Jawa, Indonesia, tepatnya di perbatasan Provinsi Jawa Tengah dan Jawa Timur. Gunung Lawu terletak di antara tiga kabupaten yaitu Kabupaten Karanganyar, Jawa Tengah, Kabupaten Ngawi, dan Kabupaten Magetan, Jawa Timur. Status gunung ini adalah gunung api \"istirahat\" (diperkirakan terahkir meletus pada tanggal 28 November 1885[3][4]) dan telah lama tidak aktif, terlihat dari rapatnya vegetasi serta puncaknya yang tererosi. Di lerengnya terdapat kepundan kecil yang masih mengeluarkan uap air (fumarol) dan belerang (solfatara). Gunung Lawu mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan hutan Ericaceous. Gunung Lawu adalah sumber inspirasi dari nama kereta api Argo Lawu, kereta api eksekutif yang melayani Solo Balapan-Gambir.",
        "Gunung Merapi (ketinggian puncak 2.930 mdpl, per 2010) adalah gunung berapi di bagian tengah Pulau Jawa dan merupakan salah satu gunung api teraktif di Indonesia. Lereng sisi selatan berada dalam administrasi Kabupaten Sleman, Daerah Istimewa Yogyakarta, dan sisanya berada dalam wilayah Provinsi Jawa Tengah, yaitu Kabupaten Magelang di sisi barat, Kabupaten Boyolali di sisi utara dan timur, serta Kabupaten Klaten di sisi tenggara. Kawasan hutan di sekitar puncaknya menjadi kawasan Taman Nasional Gunung Merapi sejak tahun 2004.",
        "Gunung Merbabu adalah gunung api yang bertipe Strato (lihat Gunung Berapi) yang terletak secara geografis pada 7,5° LS dan 110,4° BT. Secara administratif gunung ini berada di wilayah Kabupaten Magelang di lereng sebelah barat dan Kabupaten Boyolali di lereng sebelah timur dan selatan, Kabupaten Semarang di lereng sebelah utara, Provinsi Jawa Tengah.\n" +
                "\n" +
                "Gunung Merbabu dikenal melalui naskah-naskah masa pra-Islam sebagai Gunung Damalung atau Gunung Pam(a)rihan. Di lerengnya pernah terdapat pertapaan terkenal dan pernah disinggahi oleh Bujangga Manik pada abad ke-15. Menurut etimologi, \"merbabu\" berasal dari gabungan kata \"meru\" (gunung) dan \"abu\" (abu). Nama ini baru muncul pada catatan-catatan Belanda. ",
        "Gunung Papandayan adalah gunung api strato[2] yang terletak di Kabupaten Garut, Jawa Barat tepatnya di Kecamatan Cisurupan. Gunung dengan ketinggian 2665 meter di atas permukaan laut itu terletak sekitar 70 km sebelah tenggara Kota Bandung. \n" +
                "Pada Gunung Papandayan, terdapat beberapa kawah yang terkenal. Di antaranya Kawah Mas, Kawah Baru, Kawah Nangklak, dan Kawah Manuk. Kawah-kawah tersebut mengeluarkan uap dari sisi dalamnya. \n" +
                "Topografi di dalam kawasan curam, berbukit dan bergunung serta terdapat tebing yang terjal. Menurut kalisifikasi Schmidt dan Ferguson termasuk type iklim B, dengan curah hujan rata-rata 3.000 mm/thn, kelembaban udara 70 – 80 % dan temperatur 10 °C. \n",
        "Gunung Salak (dahulu disebut Gunung Sapto Argo) merupakan kompleks gunung berapi yang terletak di selatan Jakarta, di Pulau Jawa. Kawasan rangkaian gunung ini termasuk ke dalam wilayah Kabupaten Sukabumi dan Kabupaten Bogor, Jawa Barat. Pengelolaan kawasan hutannya semula berada di bawah Perum Perhutani Kesatuan Pemangkuan Hutan (KPH) Bogor, tetapi sejak 2003 menjadi wilayah perluasan Taman Nasional Gunung Halimun, dan dikelola sebagai Taman Nasional Gunung Halimun-Salak. \n" +
                "Gunung Salak berusia relatif tua sehingga memiliki beberapa puncak. Geoposisi puncak tertinggi gunung ini ialah 6°43' LS dan 106°44' BT dan dinamakan Puncak Salak I dengan ketinggian puncak 2.211 m dari permukaan laut (dpl.). \n" +
                "Banyak yang mengira asal nama \"Salak\" adalah dari tanaman salak, akan tetapi sesungguhnya berasal dari kata bahasa Sanskerta, salaka yang berarti \"perak\".",
        "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat[1]. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru. \n" +
                "Semeru mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung.",
        "Gunung Slamet (3.428 meter dpl.) adalah sebuah gunung berapi kerucut yang terdapat di Pulau Jawa, Indonesia. Gunung Slamet terletak di antara 5 kabupaten, yaitu Kabupaten Brebes, Kabupaten Banyumas, Kabupaten Purbalingga, Kabupaten Tegal, dan Kabupaten Pemalang, Provinsi Jawa Tengah. Gunung Slamet merupakan gunung tertinggi di Jawa Tengah serta kedua tertinggi di Pulau Jawa setelah Gunung Semeru. Kawah IV merupakan kawah terakhir yang masih aktif sampai sekarang, dan terakhir aktif hingga pada level siaga medio-2009."
    )

    private val gngImages = intArrayOf(
        R.drawable.andong,
        R.drawable.argopuro,
        R.drawable.cikuray,
        R.drawable.ciremai,
        R.drawable.gepe,
        R.drawable.guntur,
        R.drawable.gunung_arjuna,
        R.drawable.lawu,
        R.drawable.merapi,
        R.drawable.merbabu,
        R.drawable.papandayan,
        R.drawable.salak,
        R.drawable.semeru,
        R.drawable.slamet
    )

    private val gngHarga = arrayOf(
        "HTM : Rp. 10000",
        "HTM : Rp.20000 (Weekday)/ Rp.30000 (Weekend)",
        "HTM : RP. 15000",
        "HTM : Rp. 50000",
        "HTM : Rp. 30000",
        "HTM : Rp. 10000",
        "HTM : Rp. 10000",
        "HTM : Rp. 15000",
        "HTM : Rp. 17000",
        "HTM : Rp.15000",
        "HTM : Rp. 20000",
        "HTM : Rp. 22000",
        "HTM : Rp 35000",
        "HTM : Rp. 25000"
    )

    private val gngjalur = arrayOf(
        "– Basecamp -Pos 1 ditempuh dengan waktu 20 menit\n" +
                "– Pos 1 – Pos 2 (20 menit)\n" +
                "– Pos 2 – Puncak Jiwa (15 menit)\n" +
                "– Pos 2 – Makam (10 menit)\n" +
                "– Puncak Jiwa – Puncak Andong (2 menit)",
        "   - basecamp – mata air 1: 5 jam\n" +
                "   - Mata air 1 – mata air 2: 1,5 jam\n" +
                "   - Mata air 2 – Cikasur: 1,5 jam\n" +
                "   - Cikasur – Cisentor: 4 jam\n" +
                "   - Cisentor – Rawa Embik: 2 jam\n" +
                "   - Rawa Embik – Savana Lonceng: 2 jam\n" +
                "   - Savana Lonceng – Puncak Rengganis/Argopuro: 10 Menit\n" +
                "   - Savana Lonceng – cemara lima: 2 jam\n" +
                "   - Cemara lima – Danau Taman Hidup: 2 jam\n" +
                "   - Danau taman hidup – Bremi: 3 jam",
        "- Basecamp – Pos 1    : ± 15 menit\n" +
                "– Pos 1 – Pos 2       : ± 1 jam\n" +
                "– Pos 2 – Pos 3       : ± 2 jam\n" +
                "– Pos 3 – Pos 4       : ± 1 jam 45 menit\n" +
                "– Pos 4 – Pos 5       : ± 1 jam\n" +
                "– Pos 5 – Pos 6       : ± 2 jam\n" +
                "– Pos 6 – Pos 7       : ± 45 menit\n" +
                "– Pos 7 – Puncak      : ± 30 menit",
        "- Basecamp - Pos Cibunar\t: 50 menit\n" +
                "- Pos Cibunar - Leuwung Datar : 1 jam\n" +
                "- Leuweung Datar - Pos Kondang Amis : 20 menit\n" +
                "- Pos Kondang Amis - Kuburan Kuda : 2 jam 30 menit\n" +
                "- Kuburan Kuda - Pangalap : 1 jam 20 menit\n" +
                "- Pangalap - Tanjakan Seruni : 1 jam 30 menit\n" +
                "- Tanjakan Seruni - Bapa Tere : 2 jam\n" +
                "- Bapa Tere - Batu Lingga : 1 jam\n" +
                "- Batu Lingga - Sanggabuana 1 : 2 jam\n" +
                "- Sanggabuana 1 - Sanggabuana 2 : 15 menit\n" +
                "- Sanggabuana 2 - Pangasinan : 40 menit\n" +
                "- Pangasinan - Puncak Ciremai : 45 menit",
        "- Basecamp - Rawa Gayonggong : 1 jam\n" +
                "- Rawa Gayonggong - Pos Penancangan : 10 menit\n" +
                "- Pos Penancangan - Pos Rawa Denok 1 : 40 menit\n" +
                "- Pos Rawa Denok 1 - Rawa Denok 2 : 45 menit\n" +
                "- Rawa Denok 2 - Pos Batu Kukus 1 : 1 jam 10 menit\n" +
                "- Pos Batu Kukus 1 - Pos Batu Kukus 2 : 30 menit\n" +
                "- Pos Batu Kukus 2 - Pos Batu Kukus 3 : 15 menit\n" +
                "- Pos Batu Kukus 3 - Air Panas : 25 menit\n" +
                "- Air Panas - Pos Pemandangan : 5 menit\n" +
                "- Pos Pemandangan  - Pos Kandang Batu : 30 menit\n" +
                "- Pos Kandang Batu - Pos Kandang Badak : 1 jam\n" +
                "- Pos Kandang Badak - Puncak Pangrango : 2 jam \n" +
                "- Puncak Pangrango - Lembah Mandalawangi : 10 menit",
        "– Basecamp – Pos 1 : ± 1,5 jam\n" +
                "– Pos 1 – Pos 2 : ± 30 menit\n" +
                "– Pos 2 – Pos 3 : ± 30 menit\n" +
                "– Pos 3 – Pos 4 : ± 30 menit\n" +
                "– Pos 4 – Puncak I : ± 1,5 jam\n" +
                "– Puncak I – Puncak II : ± 45 menit\n" +
                "– Puncak II – Puncak III : ± 45 menit",
        "– Pos Tretes – Pet Bocor (30 menit)\n" +
                "– Pet Bocor – Kopkopan (2,5 jam)\n" +
                "– Kopkopan – Pondokan (4 jam)\n" +
                "– Pondokan – Lembah Kidang (30 menit) \n" +
                "– Lembah Kidang – Puncak Arjuno (5 jam)\n" +
                "– Puncak Arjuno – Lembah Kidang (3 jam)\n" +
                "– Lembah Kidang – Basecamp Tretes (6 jam)\n",
        "- Basecamp - Pos 1 : 30 menit\n" +
                "- Pos 1 - Pos 2 : 1 jam\n" +
                "- Pos 2 - Pos 3 : 1 jam 30 menit\n" +
                "- Pos 3 - Pos 4 : 1 jam 30 menit\n" +
                "- Pos 4 - Pos 5 : 30 menit\n" +
                "- Pos 5 _ Sendang Drajat : 15 menit\n" +
                "- Sendang Drajat - Hargo Dalem : 15 menit\n" +
                "- Hargo Dalem - Hargo Dumilah : 20 menit",
        "- Basecamp - Shelter 1 : 1 jam\n" +
                "- Shelter 1 - Pos 1 : 50 menit\n" +
                "- Pos 1 - Pos 2 : 2 jam\n" +
                "- Pos 2 - Pasar Bubrah : 1 jam\n" +
                "- Pasar Bubrah - Puncak : 1 jam",
        "- Basecamp - Pos 1 : 1 jam 30 menit\n" +
                "- Pos 1 - Pos 2 : 2 jam\n" +
                "- Pos 2 - Persimpangan : 2 jam\n" +
                "- Persimpangan - Puncak Kenteng Songo : 1 jam 30 menit\n" +
                "- Puncak Kenteng Songo - Puncak Syarif : 30 menit\n",
        "- Basecamp - Pondok Saladah : 2 jam 30 menit\n" +
                "- Pondok Saladah - Hutan Mati : 30 menit\n" +
                "- Hutan Mati - Puncak Tegal Alun : 1 jam",
        "- Basecamp – pintu rimba/Javana Spa : 1 jam\n" +
                "- Pintu Rimba – Simpang Bajuri : 2 jam\n" +
                "- Simpang Bajuri – puncak bayangan : 5.5 jam\n" +
                "- Puncak Bayangan – Puncak Manik : 1.5 jam\n",
        "- Basecamp - Pos 1 : 1 jam 40 menit\n" +
                "- Pos 1 - Pos 2 : 25 menit\n" +
                "- Pos 2 - Pos 3 : 30 menit\n" +
                "- Pos 3 - Pos 4 : 45 menit\n" +
                "- Pos 4 - Ranu Kumbolo : 25 menit\n" +
                "- Ranu Kumbolo - Cemoro Kandang : 1 jam\n" +
                "- Cemoro Kandang - Jambangan :  1 jam\n" +
                "- Jambangan - Kalimati : 1 jam\n" +
                "- Kalimati - Puncak : 4 jam 30 menit",
        "- Basecamp - Pos 1 : 1 jam\n" +
                "- Pos 1 - Pos 2 : 1 jam 30 menit\n" +
                "- Pos 2 - Pos 3 : 1 jam\n" +
                "- Pos 3 - Pos 4 : 40 menit\n" +
                "- Pos 4 - Pos 5 : 50 menit\n" +
                "- Pos 5 - Pos 6 : 20 menit\n" +
                "- Pos 6 - Pos 7 : 30 menit\n" +
                "- Pos 7 - Pos 8 : 30 menit\n" +
                "- Pos 8 - Plawangan : 15 menit\n" +
                "- Plawangan - Puncak : 1 jam 15 menit\n" +
                "- Puncak - Kawah : 20 menit"


    )
    val listData: ArrayList<Gng>
        get() {
            val list = arrayListOf<Gng>()
            for (position in gngNames.indices) {
                val gng = Gng()
                gng.name = gngNames[position]
                gng.detail = gngDetails[position]
                gng.jalur = gngjalur[position]
                gng.harga = gngHarga[position]
                gng.photo = gngImages[position]
                list.add(gng)
            }
            return list
        }
}