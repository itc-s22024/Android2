package jp.ac.it_college.std.s22024.weather_report_compose

import kotlinx.serialization.Serializable

@Serializable
data class CityData(
    val name: String,
    val cityid: String
)

val citylist = listOf(
    CityData("北海道(札幌)", "2130037"),
    CityData("青森", "2130658"),
    CityData("岩手(盛岡)", "2111834"),
    CityData("宮城(仙台)", "2111149"),
    CityData("秋田", "2113719"),
    CityData("山形", "2110556"),
    CityData("福島", "2112923"),
    CityData("茨城(水戸)", "2111901"),
    CityData("栃木(宇都宮)", "1849053"),
    CityData("群馬(前橋)", "1857843"),
    CityData("埼玉(さいたま)", "1853226"),
    CityData("千葉", "2113014"),
    CityData("東京", "1850144"),
    CityData("神奈川(横浜)", "1848354"),
    CityData("新潟", "1855431"),
    CityData("富山", "1849876"),
    CityData("石川(金沢)", "1860243"),
    CityData("福井", "1863985"),
    CityData("山梨(甲府)", "1859100"),
    CityData("長野", "1856215"),
    CityData("岐阜", "1863641"),
    CityData("静岡", "1851717"),
    CityData("愛知(名古屋)", "1865694"),
    CityData("三重(津)", "1849796"),
    CityData("滋賀(大津)", "1853574"),
    CityData("京都", "1857910"),
    CityData("大阪", "1853909"),
    CityData("兵庫", "1859171"),
    CityData("奈良", "1855612"),
    CityData("和歌山", "1926004"),
    CityData("鳥取", "1849892"),
    CityData("島根(松江)", "1857550"),
    CityData("岡山", "1854383"),
    CityData("広島", "1862415"),
    CityData("山口", "1848689"),
    CityData("徳島", "1850158"),
    CityData("香川(高松)", "1851100"),
    CityData("愛媛(松山)", "1926099"),
    CityData("高知", "1859146"),
    CityData("福岡", "1863967"),
    CityData("佐賀", "1853303"),
    CityData("長崎", "1856177"),
    CityData("熊本", "1858421"),
    CityData("大分", "1854487"),
    CityData("宮崎", "1856717"),
    CityData("鹿児島", "1860827"),
    CityData("沖縄(那覇)", "1856035"),
)