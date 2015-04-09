/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websendersimple;

/**
 *
 * @author Administrator
 */
public class TestString {

    public static String createFinancial = "{\"sn\":\"1012\",\"financeNo\":\"XDJ050000012\",\"registrationNumber\""
            + ":\"1012\",\"corpName\":\"012金融机构\",\"category\":2,\"provinceCode\":\"50\",\"email\""
            + ":\"15300001012@189.cn\",\"mobilePhoneNumber\":\"15300001012\"}";
//    public static String removeFinancial="{\"sn\":\"1000000030026\",\"financeNo\":\"XDJ050000005\"}";
    public static String createEnterprise = "{\"sn\":\"2004\",\"enterpriseNo\":\"XDB050000004\",\"registrationNumber\""
            + ":\"2004\",\"corpName\":\"004有限公司\",\"financeNo\":\"XDJ050000003\",\"mobilePhoneNumber\""
            + ":\"15300002004\",\"email\":\"15300002004@189.cn\",\"provinceCode\":\"50\"}";
//    public static String removeEnterprise="{\"sn\":\"2000000030022\",\"enterpriseNo\":\"XDB050000001\"}";

    public static String createMonitor = "{\"sn\":\"3004\",\"monitorNo\":\"XDS05000000004\","
            + "\"serialNumber\":\"00:90:B0:1A:D6:04\",\"location\":\"中国电信重庆金融基地04\",\"enterpriseNo\""
            + ":\"XDB050000003\",\"category\":0}";

    public static String removeMonitor = "{\"sn\":\"4004\",\"monitorNo\":\"XDS05000000004\"}";

    public static String createKDMonitoring = "{\"customerCertCategory\":\"1\",\"registrationNumber\":\"\","
            + "\"customerCertNo\":\"500222198401016640\",\"financeName\":\"\",\"installerPhone\":"
            + "\"18983361110\",\"customerName\":\"罗\",\"monitorLocation\":\"重庆市渝北区龙塔街道城区新牌坊一路157号附近麦可药房右边门市\","
            + "\"installerName\":\"13320261806\",\"corpName\":\"\",\"mobilePhoneNumber\":"
            + "\"13320261806\",\"branchTelecom\":\"1000\",\"packgeCategory\":\"2\","
            + "\"devBusinessNo\":\"DXB000069\",\"sn\":\"ECF20150403000005\",\"email\":"
            + "\"\",\"customerNo\":\"2023086998593000\"}";

    public static String modifyKDBusiness = "{\"financeName\":\"重庆it支撑中心\",\"packgeCategory\":\"1\","
            + "\"mobilePhoneNumber\":\"13399883339\",\"devBusinessNo\":\"DXB000069\",\"sn\":"
            + "\"ECF20150403000012\"}";

    public static String deleteKDMonitoring = "{\"mobilePhoneNumber\":\"18983390816\",\"devBusinessNo\":\"DXB000069\","
            + "\"sn\":\"ECF20150407000003\"}";

    public static String modifyKDService = "{\"mobilePhoneNumber\":\"18983390816\",\"devBusinessNo\":\"DXB000069\","
            + "\"sn\":\"ECF20150407000003\",\"serviceCategory\":\"1\"}";
}
