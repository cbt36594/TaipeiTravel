package com.nevic.taipeitravel.model;

import com.google.gson.annotations.SerializedName;

public class SightseeingSpot {

    /**
     * info : 新北投站下車，沿中山路直走即可到達公車：216、218、223、230、266、602、小6、小7、小9、、小22、小25、小26至新北投站下車
     * stitle : 新北投溫泉區
     * xpostDate : 2016/07/07
     * longitude : 121.508447
     * REF_WP : 10
     * avBegin : 2010/02/14
     * langinfo : 10
     * MRT : 新北投
     * SERIAL_NO : 2011051800000061
     * RowNumber : 1
     * CAT1 : 景點
     * CAT2 : 養生溫泉
     * MEMO_TIME : 各業者不同，依據現場公告
     * POI : Y
     * file : http://www.travel.taipei/d_upload_ttn/sceneadmin/pic/11000848.jpghttp://www.travel.taipei/d_upload_ttn/sceneadmin/pic/11002891.jpghttp://www.travel.taipei/d_upload_ttn/sceneadmin/image/A0/B0/C0/D315/E70/F65/1e0951fb-069f-4b13-b5ca-2d09df1d3d90.JPGhttp://www.travel.taipei/d_upload_ttn/sceneadmin/image/A0/B0/C0/D260/E538/F274/e7d482ba-e3c0-40c3-87ef-3f2a1c93edfa.JPGhttp://www.travel.taipei/d_upload_ttn/sceneadmin/image/A0/B0/C0/D919/E767/F581/9ddde70e-55c2-4cf0-bd3d-7a8450582e55.jpghttp://www.travel.taipei/d_upload_ttn/sceneadmin/image/A0/B0/C1/D28/E891/F188/77a58890-7711-4ca2-aebe-4aa379726575.JPG
     * idpt : 臺北旅遊網
     * latitude : 25.137077
     * xbody : 北投溫泉從日據時代便有盛名，深受喜愛泡湯的日人自然不會錯過，瀧乃湯、星乃湯、鐵乃湯就是日本人依照溫泉的特性與療效給予的名稱，據說對皮膚病、神經過敏、氣喘、風濕等具有很好的療效，也因此成為了北部最著名的泡湯景點之一。新北投溫泉的泉源為大磺嘴溫泉，泉質屬硫酸鹽泉，PH值約為3~4之間，水質呈黃白色半透明，泉水溫度約為50-90℃，帶有些許的硫磺味 。目前北投的溫泉旅館、飯店、會館大部分集中於中山路、光明路沿線以及北投公園地熱谷附近，總計約有44家，每一家都各有其特色，多樣的溫泉水療以及遊憩設施，提供遊客泡湯養生，而鄰近的景點也是非常值得造訪，例如被列為三級古蹟的三寶吟松閣、星乃湯、瀧乃湯以及北投第一家溫泉旅館「天狗庵」，都有著深遠的歷史背景，而北投公園、北投溫泉博物館、北投文物館、地熱谷等，更是遊客必遊的景點，來到北投除了可以讓溫泉洗滌身心疲憊，也可以順便了解到北投溫泉豐富的人文歷史。
     * _id : 1
     * avEnd : 2016/07/07
     * address : 臺北市  北投區中山路、光明路沿線
     */

    @SerializedName("info")
    private String info;
    @SerializedName("stitle")
    private String stitle;
    @SerializedName("xpostDate")
    private String xpostDate;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("REF_WP")
    private String refWp;
    @SerializedName("avBegin")
    private String avBegin;
    @SerializedName("langinfo")
    private String langinfo;
    @SerializedName("MRT")
    private String mrt;
    @SerializedName("SERIAL_NO")
    private String serialNo;
    @SerializedName("RowNumber")
    private String RowNumber;
    @SerializedName("CAT1")
    private String cat1;
    @SerializedName("CAT2")
    private String cat2;
    @SerializedName("MEMO_TIME")
    private String memoTime;
    @SerializedName("POI")
    private String poi;
    @SerializedName("file")
    private String file;
    @SerializedName("idpt")
    private String idpt;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("xbody")
    private String xbody;
    @SerializedName("_id")
    private int id;
    @SerializedName("avEnd")
    private String avEnd;
    @SerializedName("address")
    private String address;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }

    public String getXpostDate() {
        return xpostDate;
    }

    public void setXpostDate(String xpostDate) {
        this.xpostDate = xpostDate;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRefWp() {
        return refWp;
    }

    public void setRefWp(String refWp) {
        this.refWp = refWp;
    }

    public String getAvBegin() {
        return avBegin;
    }

    public void setAvBegin(String avBegin) {
        this.avBegin = avBegin;
    }

    public String getLanginfo() {
        return langinfo;
    }

    public void setLanginfo(String langinfo) {
        this.langinfo = langinfo;
    }

    public String getMrt() {
        return mrt;
    }

    public void setMrt(String mrt) {
        this.mrt = mrt;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getRowNumber() {
        return RowNumber;
    }

    public void setRowNumber(String RowNumber) {
        this.RowNumber = RowNumber;
    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    public String getMemoTime() {
        return memoTime;
    }

    public void setMemoTime(String memoTime) {
        this.memoTime = memoTime;
    }

    public String getPoi() {
        return poi;
    }

    public void setPoi(String poi) {
        this.poi = poi;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getIdpt() {
        return idpt;
    }

    public void setIdpt(String idpt) {
        this.idpt = idpt;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getXbody() {
        return xbody;
    }

    public void setXbody(String xbody) {
        this.xbody = xbody;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvEnd() {
        return avEnd;
    }

    public void setAvEnd(String avEnd) {
        this.avEnd = avEnd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
