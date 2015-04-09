/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websendersimple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class WebSenderSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // TODO code application logic here
        String url = "http://192.168.102.87:8080/resource/createMonitor";
        String url1 = "http://192.168.102.87:8080/resource/createKDMonitoring";
        String url2 = "http://192.168.102.87:8080/resource/modifyKDBusiness";
        String url3 = "http://192.168.102.87:8080/resource/modifyKDService";
        String url4 = "http://192.168.102.87:8080/resource/deleteKDMonitoring";
//        CameraStringGenerator c = new CameraStringGenerator(6, 3736, 4999);
//        List<String> results = c.generate();
//        for (String s : results) {
        String s1 = TestString.createKDMonitoring;
        String s2 = TestString.modifyKDBusiness;
        String s3 = TestString.modifyKDService;
        String s4 = TestString.deleteKDMonitoring;
        
//        sendPost(url1, URLEncoder.encode(s1, "UTF-8"));
//        System.out.println(s1);

//        sendPost(url2, URLEncoder.encode(s2, "UTF-8"));
//        System.out.println(s2);

//        sendPost(url3, URLEncoder.encode(s3, "UTF-8"));
//        System.out.println(s3);
//        
        sendPost(url4, URLEncoder.encode(s4, "UTF-8"));
        System.out.println(s4);
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
//            Logger.getLogger(Sendder.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("42");
        }
    }

    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;

        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("Content-Type", "application/json");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String resultStr;
            while ((resultStr = in.readLine()) != null) {
                System.out.println("resultStr:" + resultStr);
            }
        } catch (IOException e) {
//            logger.log(Level.INFO, null, e);
            System.out.println("74");
        } //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
//                logger.log(Level.INFO, null, ex);
                System.out.println("86");
            }
        }
        return result;
    }
}
