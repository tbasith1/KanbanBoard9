package org.example;

import java.util.ArrayList;
import java.util.List;

public class CanbanBoardData {
    private List<CanbanCard> canbanCard = new ArrayList<CanbanCard>();
    private List<CanbanRelease> canbanRelease = new ArrayList<CanbanRelease>();


    public CanbanBoardData(){}

    public List<CanbanCard> getCards(String arg) {
        if (arg.equals("*")) {
            return canbanCard;
        }
        return new ArrayList<CanbanCard>();
    }

    public List<CanbanCard> getCanbanCard(){
      return this.canbanCard;
    }
    public void setCanbanCard(CanbanCard card){
      this.canbanCard.add(card);
    }
    public void setCanbanCard(List<CanbanCard> card){
      this.canbanCard = card;
    }

    public void addCard(CanbanCard card){
      this.canbanCard.add(card);
    }
    public void deleteAllCards(){
      this.canbanCard.clear();
    }

    public List<CanbanRelease> getCanbanRelease(){
      return this.canbanRelease;
    }
    public void setCanbanRelease(List<CanbanRelease> release){
      this.canbanRelease = release;
    }
    public void getCanbanRelease(CanbanRelease release){
      this.canbanRelease.add(release);
    }
    public void addRelease(CanbanRelease release){
      this.canbanRelease.add(release);
    }
    public void deleteAllReleases(){
      this.canbanRelease.clear();
    }

}
