package me.nikl.connectfour;

import me.nikl.gamebox.module.GameBoxModule;

public class ConnectFourModule extends GameBoxModule {
    public static final String CONNECT_FOUR = "connectfour";
    @Override
    public void onEnable() {
        registerGame(CONNECT_FOUR, ConnectFour.class, "cf");
    }

    @Override
    public void onDisable() {

    }
}
