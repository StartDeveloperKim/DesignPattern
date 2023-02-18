package org.example.abstractFactory.factory;

import org.example.abstractFactory.manager.Manager;
import org.example.abstractFactory.manager.SoccerManager;
import org.example.abstractFactory.player.Player;
import org.example.abstractFactory.player.SoccerPlayer;

public class SoccerStaffFactory implements StaffFactory{
    @Override
    public Manager createManager() {
        return new SoccerManager();
    }

    @Override
    public Player createPlayer() {
        return new SoccerPlayer();
    }
}
