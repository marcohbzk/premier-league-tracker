package com.pl.premier_zone.player;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDataLoader {

    @Autowired
    private PlayerRepository playerRepository;

    @PostConstruct
    public void addTestData(){
        // Only add test data if db is empty
        if (playerRepository.count() == 0){
            System.out.println("=== ADDING TEST DATA ===");

            Player testPlayer = new Player(
                    "Bukayo Saka", "England", "Forward", 22, 38, 36, 3240.0, 14.0, 8.0, 0.0, 2.0, 0.0, 12.5, 7.2, "Arsenal"
            );
            playerRepository.save(testPlayer);

            Player testPlayer2 = new Player(
                    "Erling Haaland", "Norway", "Forward", 23, 35, 34,
                    3060.0, 36.0, 8.0, 3.0, 3.0, 0.0, 34.2, 6.8, "Manchester City"
            );
            playerRepository.save(testPlayer2);

            System.out.println("=== ADDED " + playerRepository.count() + " TEST PLAYERS ===");
        }
    }
}
