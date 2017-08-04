package com.springaction.knights;

import java.io.PrintStream;

/**
 * Created by kelvin on 17/8/1.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }
    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
