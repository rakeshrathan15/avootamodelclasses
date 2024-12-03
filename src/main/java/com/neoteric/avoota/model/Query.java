package com.neoteric.avoota.model;

import java.util.List;

public class Query {
    private String checkinDate;
    private String checkoutDate;
    private List<RoomInfo> roomInfo;
    private SearchCriteria searchCriteria;
    private SearchPreferences searchPreferences;
    private String searchId;
    private boolean isSearchCompleted;
}
