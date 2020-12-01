package com.liumeng.gaobo.java.zu;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        //构造一个目录对象表示c盘根目录
        Folder diskC = new Folder("C");

        //c盘根目录下有一个文件ImbaMalllog.txt
        diskC.addDir(new File("ImbaMalllog.txt"));

        //c盘目录下还有三个子目录windows,perflogs,program file
        Dir dirWin = new Folder("Windows");
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        //Perflogs目录
        Dir dirPer = new Folder("PerfLogs");
        //PerfLogs目录下有文件null.txt
        dirPer.addDir(new File("null.txt"));

        Dir dirPro = new Folder("Program File");
        dirPro.addDir(new File("ftp.txt"));
        diskC.addDir(dirPro);

        //打印出文件结构
        diskC.print();
    }
}
