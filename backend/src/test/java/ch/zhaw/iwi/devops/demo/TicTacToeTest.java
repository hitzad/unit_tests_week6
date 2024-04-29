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
    @Test
    public void testPlayerXStartsFirst() {
        assertEquals('X', game.getCurrentPlayer(), "Spieler X sollte den ersten Zug machen");
    }
    @Test
    public void testPlayersAlternateTurns() {
        game.makeMove(0, 0); // Spieler X zieht
        assertEquals('O', game.getCurrentPlayer(), "Spieler O sollte als nächstes dran sein");
    }
    @Test
    public void testValidMove() {
        // Überprüft, ob das Setzen eines Symbols in ein leeres Feld erfolgreich ist
        boolean moveMade = game.makeMove(0, 0);
        assertTrue(moveMade, "Das Setzen eines Symbols in ein leeres Feld sollte erfolgreich sein");
    }
    @Test
    public void testInvalidMove() {
        // Erster Zug sollte erfolgreich sein
        assertTrue(game.makeMove(0, 0), "Erster Zug auf ein leeres Feld sollte erfolgreich sein");

        // Zweiter Zug auf das gleiche Feld sollte fehlschlagen
        assertFalse(game.makeMove(0, 0), "Weiterer Zug auf besetztes Feld sollte fehlschlagen");
    }
    @Test
    public void testWinConditionHorizontal() {
        game.makeMove(0, 0); // X
        game.makeMove(1, 0); // O
        game.makeMove(0, 1); // X
        game.makeMove(1, 1); // O
        assertFalse(game.checkWin(), "Noch sollte niemand gewonnen haben"); // Erst prüfen, dass noch kein Gewinn vorliegt
        game.makeMove(0, 2); // X gewinnt horizontal auf Reihe 0
        assertTrue(game.checkWin(), "Spieler X sollte gewonnen haben"); // Überprüfen, ob der Gewinn erkannt wird
    }
}