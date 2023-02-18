package org.example.abstractFactory.factory;

import org.example.abstractFactory.manager.Manager;
import org.example.abstractFactory.manager.TennisManager;
import org.example.abstractFactory.player.Player;
import org.example.abstractFactory.player.TennisPlayer;

public class TennisStaffFactory implements StaffFactory{
    @Override
    public Manager createManager() {
        return new TennisManager();
    }

    @Override
    public Player createPlayer() {
        return new TennisPlayer();
    }
}
