package org.example;

import java.util.Date;
import java.util.UUID;

enum CanbanCardStatus {
    TODO,
    PROCESSING,
    DONE
}

public class CanbanCard {
    private UUID uuid;
    private int numberInOrder;

    private CanbanCardStatus status;

    private String title;
    private String description;
    private Date lastEditedDate;


    private void addCardToRelease(CanbanRelease canbanRelease) {

    }


    public CanbanCard(UUID uuid, int numberInOrder, CanbanCardStatus status, String title, String description, Date lastEditedDate) {
        this.uuid = uuid;
        this.numberInOrder = numberInOrder;
        this.status = status;
        this.title = title;
        this.description = description;
        this.lastEditedDate = lastEditedDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getNumberInOrder() {
        return numberInOrder;
    }

    public void setNumberInOrder(int numberInOrder) {
        this.numberInOrder = numberInOrder;
    }

    public CanbanCardStatus getStatus() {
        return status;
    }

    public void setStatus(CanbanCardStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastEditedDate() {
        return lastEditedDate;
    }

    public void setLastEditedDate(Date lastEditedDate) {
        this.lastEditedDate = lastEditedDate;
    }
}

