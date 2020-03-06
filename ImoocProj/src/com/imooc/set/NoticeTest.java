package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎", "管理员", new Date());
        Notice notice2 = new Notice(2, "按时交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        ArrayList<Notice> noticeList = new ArrayList<Notice>();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);
//        for(Notice n : noticeList){
//            System.out.println(n.getTitle());
//        }

        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ", " + noticeList.get(i).getTitle());
        }
        System.out.println("************************");
        //在第一条公告后面添加一条新公告
        Notice notice4 = new Notice(4, "在线编辑器", "administration", new Date());
        noticeList.add(1, notice4);
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ", " + noticeList.get(i).getId());
        }
        noticeList.remove(2);
        System.out.println("************************");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ", " + noticeList.get(i).getId());
        }
        System.out.println("************************");
        //修改title值
        notice4.setTitle("JAVA在线编辑器");
        noticeList.set(1, notice4);
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ", " + noticeList.get(i).getTitle());
        }
        System.out.println("************************");
    }
}
