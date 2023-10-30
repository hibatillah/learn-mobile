package com.example.belajarrecyclerview

class SumberData {
    companion object {
        fun buatSedData(): ArrayList<ListObjDosen> {
            val list = ArrayList<ListObjDosen>()

            list.add(
                ListObjDosen(
                    "Anggy Trisnadoli, S.S.T., M.T.",
                    "Web Programming",
                    "https://pcr.ac.id/assets/images/pegawai/ATD20211215072942.JPG",
                    "128906",
                    "Framework Enterprise",
                    "105"
                )
            )
            list.add(
                ListObjDosen(
                    "Dr.Dadang Syarif Sihabudin Sahid, S.Si,M.Sc.",
                    "IT Project Management",
                    "https://pcr.ac.id/assets/images/pegawai/DDS20211215072937.jpg",
                    "007504",
                    "Konsep Teknolog Informasi",
                    "101"
                )
            )
            list.add(
                ListObjDosen(
                    "Satria Perdana Arifin, S.T.,M.T.I",
                    "Computer Networking and Security",
                    "https://pcr.ac.id/assets/images/pegawai/SPA20211215072819.JPG",
                    "118402",
                    "Big Data",
                    "104"
                )
            )
            list.add(
                ListObjDosen(
                    "Muhammad Mahrus Zain, S.S.T., M.T.I.",
                    "Application Development, Data Science",
                    "https://pcr.ac.id/assets/images/pegawai/MMZ20211215073029.JPG",
                    "169318",
                    "Management Project TI",
                    "310"
                )
            )
            list.add(
                ListObjDosen(
                    "Mutia Sari Zulvi, S.S.T., M.M.S.I",
                    "Data Engineering",
                    "https://pcr.ac.id/assets/images/pegawai/MSZ20211215073022.jpg",
                    "169206",
                    "Customer Relationship Management",
                    "310"
                )
            )
            list.add(
                ListObjDosen(
                    "Nina Fadilah Najwa, S.Kom., M.Kom",
                    "Information System Management",
                    "https://pcr.ac.id/assets/images/pegawai/NFN20211215073035.JPG",
                    "199403",
                    "Enterprise Resource Planning",
                    "107"
                )
            )
            list.add(
                ListObjDosen(
                    "Dr. Yohana Dewi Lulu Widyasari, S.Si.,M.T.",
                    "Discreate Mathematic",
                    "https://pcr.ac.id/assets/images/pegawai/YDL20211215073042.jpg",
                    "007717",
                    "Data Science",
                    "311"
                )
            )
            return list
        }
    }
}