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

    public void addRelease(String releaseName) {
        canbanReleases.add(new CanbanRelease(releaseName));
    }

    public String getCardsInRelease(String releaseName) {
        String cards = "";
        for (CanbanRelease canbanRelease : canbanReleases) {
            if (canbanRelease.releaseNumber.equals(releaseName)) {
                cards = canbanRelease.canbanCards.toString();
            }
        }
        return cards;
    }

    public String getCardsTodo() {
        ArrayList<CanbanCard> todos = new ArrayList<>();
        for (CanbanCard canbanCard : canbanCards) {
            if (canbanCard.getStatus().equals(CanbanCardStatus.TODO)) {
                todos.add(canbanCard);
            }
        }
        return String.valueOf(todos);
    }

    public String getCardsInProgress() {
        ArrayList<CanbanCard> inprogress = new ArrayList<>();
        for (CanbanCard canbanCard : canbanCards) {
            if (canbanCard.getStatus().equals(CanbanCardStatus.PROCESSING)) {
                inprogress.add(canbanCard);
            }
        }
        return String.valueOf(inprogress);
    }

    public String getCardsDone() {
        ArrayList<CanbanCard> dones = new ArrayList<>();
        for (CanbanCard canbanCard : canbanCards) {
            if (canbanCard.getStatus().equals(CanbanCardStatus.DONE)) {
                dones.add(canbanCard);
            }
        }
        return String.valueOf(dones);
    }

    public String listRelease() {
        return String.valueOf(canbanReleases);
    }
}
