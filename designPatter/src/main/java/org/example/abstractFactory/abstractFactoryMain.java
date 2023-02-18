package org.example.abstractFactory;

import org.example.abstractFactory.factory.SoccerStaffFactory;
import org.example.abstractFactory.factory.TennisStaffFactory;
import org.example.abstractFactory.manager.Manager;
import org.example.abstractFactory.player.Player;

public class abstractFactoryMain {
    public static void main(String[] args) {
        SoccerStaffFactory soccerStaffFactory = new SoccerStaffFactory();
        Manager manager = soccerStaffFactory.createManager();
        Player player = soccerStaffFactory.createPlayer();
        manager.print();
        player.print();

        TennisStaffFactory tennisStaffFactory = new TennisStaffFactory();
        Manager tennisManager = tennisStaffFactory.createManager();
        Player tennisPlayer = tennisStaffFactory.createPlayer();
        tennisManager.print();
        tennisPlayer.print();
    }
}
