package org.example;

import java.util.List;

public class CanbanRelease {
    String releaseNumber;
    public List<CanbanCard> canbanCards;

    public CanbanRelease(String releaseName) {
        this.releaseNumber = releaseName;
    }
}
