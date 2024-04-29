package ch.zhaw.iwi.devops.demo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    private TicTacToe game;

    @Before
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testInitialBoardIsEmpty() {
        assertTrue("Das Spielfeld sollte zu Beginn leer sein", game.isBoardEmpty());
    }
