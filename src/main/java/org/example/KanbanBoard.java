package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Data representation of all data needed in the KanbanBoard application
 */

public class KanbanBoard {
  List<Card> cardData = new ArrayList<Card>();
  List<Release> releaseData = new ArrayList<Release>();


  public KanbanBoard(){}

  public List<Card> setCardData(Card card){
    this.cardData.add(card);
    return this.cardData;
  }
  
  public List<Card> addCardToKanbanBoard(Card card){
    this.cardData.add(card);
    return this.cardData;
  }



}
