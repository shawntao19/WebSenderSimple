////
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package websendersimple;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.URL;
//import java.net.URLConnection;
//import java.net.URLEncoder;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author Administrator
// */
//public class VsmeraCreater {
//
//    public static void main(String[] args) throws IOException {
//        String url = "http://61.161.127.167:8081/ceeInter/resource/createMonitor";
//        CameraStringGenerator c=new CameraStringGenerator(5,0,4999);
//        List<String> results=c.generate();
//        for(String s:results){
//            sendPost(url,URLEncoder.encode(s, "UTF-8"));
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Sendder.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//
//    public static String sendPost(String url, String param) {
//        PrintWriter out = null;
//        BufferedReader in = null;
//    
//        String result = "";
//        try {
//            URL realUrl = new URL(url);
//            // 打开和URL之间的连接
//            URLConnection conn = realUrl.openConnection();
//            // 设置通用的请求属性
//            
//            conn.setRequestProperty("Content-Type", "application/json");
//            // 发送POST请求必须设置如下两行
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            // 获取URLConnection对象对应的输出流
//            out = new PrintWriter(conn.getOutputStream());
//            // 发送请求参数
//            out.print(param);
//            // flush输出流的缓冲
//            out.flush();
//            // 定义BufferedReader输入流来读取URL的响应
//            
//            
//            in = new BufferedReader(
//                    new InputStreamReader(conn.getInputStream(),"utf-8"));
//            String resultStr;
//            while ((resultStr = in.readLine()) != null) {
////                resultStr=new String(line.getBytes(),"utf-8");
//                System.out.println("resultStr:"+resultStr);
//            }
//            
//        } catch (Exception e) {
//            System.out.println("发送 POST 请求出现异常！" + e);
//            e.printStackTrace();
//        } //使用finally块来关闭输出流、输入流
//        finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//                if (in != null) {
//                    in.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return result;
//    }
//}
