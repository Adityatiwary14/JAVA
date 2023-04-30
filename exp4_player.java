import javax.sound.sampled.SourceDataLine;

// Write a program in Java to create a Player class. Inherit the classes Cricket _Player,Football _Player and Hockey_ Player from Player class.
class player{
    void plays(){
        System.out.println("One of the most played game.");
    }
}
class cricket_player extends player{
    void totalplayers(){
        System.out.println("cricket consist of 11 players");
    }
}
class football_player extends player{
    void totalplayers(){
        System.out.println("football consist of 11 players");
    }
}
class hockey_player extends player{
    void totalplayers(){
        System.out.println("hockey consist of 11 players");
    }
}
public class exp4_player {
    public static void main(String[] args) {
        cricket_player c=new cricket_player();
        football_player f=new football_player();
        hockey_player h= new hockey_player();
        c.totalplayers();
        c.plays();
        f.totalplayers();
        f.plays();
        h.totalplayers();
        h.plays();
    }
}