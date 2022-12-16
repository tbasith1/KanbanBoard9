package org.example;

import java.util.Date;

public class TestOperations {


  public TestOperations(){

  }


  public void testify(String path){
    //add new card
    CanbanCard card1 = new CanbanCard(1, CanbanCardStatus.TODO, "Test card 1", "This is the testcard one", new Date());
    CanbanCard card2 = new CanbanCard(2, CanbanCardStatus.TODO, "Test card 2", "This is the testcard two", new Date());
    CanbanCard card3 = new CanbanCard(3, CanbanCardStatus.PROCESSING, "Test card 3", "This is the testcard three", new Date());
    CanbanCard card4 = new CanbanCard(4, CanbanCardStatus.TODO, "Test card 4", "This is the testcard four", new Date());


    //persist to yaml
    CanbanBoardData cbd = new CanbanBoardData();
    cbd.addCard(card1);
    cbd.addCard(card2);
    cbd.addCard(card3);
    cbd.addCard(card4);
    DataPersistor.saveCanbanBoardData(path, cbd);



  }
  




  
}
