package org.example.abstractFactory.factory;

import org.example.abstractFactory.manager.Manager;
import org.example.abstractFactory.player.Player;

public interface StaffFactory {
    Manager createManager();

    Player createPlayer();
}
