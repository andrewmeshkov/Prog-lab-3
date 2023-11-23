package com.company;

import java.util.ArrayList;

public interface InterfaceCharacter {
    ArrayList<Action> actions = new ArrayList<Action>();
    String getName();
    Place getPlace();
    boolean addAction(Action action);
}
