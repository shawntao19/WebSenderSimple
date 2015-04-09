///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package websendersimple;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import org.json.JSONObject;
//
///**
// *
// * @author Administrator
// */
//public class CameraStringGenerator {
//
//    private int counter = 0;
//    private final int camTag;
//    private final int startNo;
//    private final int endNo;
//
//    public CameraStringGenerator(int tag, int startNo, int endNO) {
//        this.camTag = tag;
//        this.startNo = startNo;
//        this.endNo = endNO;
//    }
//
//    public List<String> generate() {
//        List<String> result = new ArrayList<>();
//        counter = startNo;
//        while (counter < endNo) {
//            JSONObject json = new JSONObject();
//            json.put("sn", getSn());
//            json.put("monitorNo", getBussinessNumber());
//            json.put("accNbr", getTel());
//            json.put("serialNumber", getDevSeq(camTag, counter));
//            json.put("location", getLocation());
//            json.put("enterpriseNo", getEnterpristNo());
//            json.put("category", 0);
//            result.add(json.toString());
//            counter++;
//        }
//        return result;
//    }
//
//    private String getTel() {
//        String camStr = String.valueOf(counter);
//        StringBuilder sb = new StringBuilder();
//        sb.append("154").append(camTag);
//        for (int i = camStr.length(); i < 7; i++) {
//            sb.append("0");
//        }
//        sb.append(camStr);
//        return sb.toString();
//    }
//
//    private String get7LenStr(int value) {
//        String str = String.valueOf(value);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 7 - str.length(); i++) {
//            sb.append("0");
//        }
//        sb.append(str);
//        return sb.toString();
//    }
//
//    private String getSn() {
//        Calendar c = Calendar.getInstance();
//        Date date = c.getTime();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
//        String dateString = formatter.format(date);
//        return dateString + get7LenStr(counter * 2);
//    }
//
//    private String getBussinessNumber() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("XDS050");
//        sb.append(String.valueOf(camTag));
//        sb.append(get7LenStr(counter));
//        return sb.toString();
//    }
//
//    private String getDevSeq(int tag, int number) {
//        StringBuilder sb = new StringBuilder();
//        String tagHead = Integer.toHexString(tag);
//        if (tagHead.length() < 2) {
//            sb.append("0");
//        }
//        sb.append(tagHead);
//        sb.append(":");
//
//        String numberTagStr = Integer.toHexString(number);
//        if (numberTagStr.length() % 2 == 1) {
//            numberTagStr = numberTagStr.replaceFirst(String.valueOf(numberTagStr.charAt(0)), "0" + numberTagStr.charAt(0));
//        }
//        int digit = numberTagStr.length();
//        for (int i = 0; i < 5 - digit / 2; i++) {
//            sb.append("00:");
//        }
//
//        for (int j = 0; j < digit; j += 2) {
//            if (j + 2 >= numberTagStr.length()) {
//                sb.append(numberTagStr.substring(j));
//            } else {
//                sb.append(numberTagStr.substring(j, j + 2));
//            }
//
//            if (j != digit - 2) {
//                sb.append(":");
//            }
//        }
//        return sb.toString();
//    }
//
//    private String getLocation() {
//        return "location-" + counter;
//    }
//
//    private String getEnterpristNo() {
//        return "XDB050000003";
//    }
//}
