package com.kenzie.unit.one.project.conferencelink;

import static java.lang.String.format;

public class ConferenceLinkContext {
    private ConferenceLinkHandler handler;

    public ConferenceLinkContext(String conferenceLinkType){
        if(conferenceLinkType.equalsIgnoreCase("google")){
            this.handler = new GoogleConferenceLinkHandler();
        }
        if(conferenceLinkType.equalsIgnoreCase("zoom")){
            this.handler = new ZoomConferenceLinkHandler();
        }
    }

    public void join(String meetingCode) {
        handler.join(meetingCode);
    }
}
