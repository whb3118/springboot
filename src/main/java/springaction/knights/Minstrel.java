package springaction.knights;

import java.io.PrintStream;

/**
 * Created by kelvin on 17/8/4.
 */
public class Minstrel {
    private PrintStream stream;
    public Minstrel(PrintStream stream){
        this.stream = stream;
    }
    public void singBeforeQuest(){
        stream.println("Fa la la, the knight is so brave!");
    }
    public void singAfterQuest(){
        stream.println("Tee hee hee, the brave knight " + "did embark on a quest");
    }
}
