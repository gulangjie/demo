package com.example.demo.knightQuest;

import java.io.PrintStream;

/**
 * 吟游诗人，记录颂扬屠龙勇士的光辉事迹
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la ala, the knight is so brave! 啊哈哈，看看这个骑士是多么的勇敢啊！");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee, the brave knight" + " did embark on a quest! 嘻嘻，勇敢的骑士踏上了征途!");
    }

}
