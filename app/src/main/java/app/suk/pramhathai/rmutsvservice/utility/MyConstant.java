package app.suk.pramhathai.rmutsvservice.utility;

/**
 * Created by DR-PC61059 on 8/11/2560.
 */

public class MyConstant {

    private String urlPostData = "http://androidthai.in.th/rmuts/addDataMaster.php";

    private String urlGatAllUser = "http://androidthai.in.th/rmuts/getAllDataMaster.php";

    private String urldeleteData = "http://androidthai.in.th/rmuts/deleteDataMaster.php";

    public String getUrldeleteData(){
        return  urldeleteData;
    }

    public String getUrlGatAllUser() {
        return urlGatAllUser;
    }

    public String getUrlPostData() {
        return urlPostData;
    }
}   //Main Class
