package ch.zhaw.iwi.devops.demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    private TicTacToe game;

    @BeforeEach
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testInitialBoardIsEmpty() {
        assertTrue(game.isBoardEmpty(), "Das Spielfeld sollte zu Beginn leer sein");
    }
}


