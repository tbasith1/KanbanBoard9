package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Data representation of all data needed in the KanbanBoard application
 */

public class CanbanBoard {
  List<CanbanCard> cardData = new ArrayList<CanbanCard>();
  List<CanbanRelease> releaseData = new ArrayList<CanbanRelease>();

  public CanbanBoard(){}

  public void setCanbanCardData(List<CanbanCard> cards){
    this.cardData = cards;
  }
  public List<CanbanCard> getCanbanCardData(){
    return this.cardData;
  }
  public void setCanbanReleaseData(List<CanbanRelease> releases){
    this.releaseData = releases;
  }
  public List<CanbanRelease> getCanbanReleaseData(){
    return this.releaseData;
  }
  





}
