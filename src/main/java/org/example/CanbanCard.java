package org.example;

import java.util.Date;
import java.util.UUID;

public class CanbanCard {
    private UUID uuid;
    private int numberInOrder;

    private CanbanCardStatus status;

    private String title;
    private String description;
    private Date lastEditedDate;


    private void addCardToRelease(CanbanRelease canbanRelease){

    }
}

enum CanbanCardStatus{
    TODO,
    PROCESSING,
    DONE
}