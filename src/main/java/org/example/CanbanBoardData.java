package org.example;

import java.util.ArrayList;
import java.util.List;

public class CanbanBoardData {
    private List<CanbanCard> canbanCards = new ArrayList<>();
    private List<CanbanRelease> canbanReleases = new ArrayList<>();


    public List<CanbanCard> getCards(String arg) {
        if (arg.equals("*")) {
            return canbanCards;
        }
        return new ArrayList<CanbanCard>();
    }
}
