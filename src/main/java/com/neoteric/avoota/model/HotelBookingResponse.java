package com.neoteric.avoota.model;

import java.util.List;

public class HotelBookingResponse {


    private HotelInfo hInfo;
    private String bookingId;
    private List<Alert> alerts;
    private Query query;
    private boolean isPriceChanged;
    private Status status;
    private List<Error> errors;
}
