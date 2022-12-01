package com.kenzie.unit.one.project.conferencelink;

import com.kenzie.unit.one.project.models.EventDto;
import com.kenzie.unit.one.project.models.VideoConferenceLinkDto;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import static java.lang.String.format;

public class ZoomConferenceLinkHandler implements ConferenceLinkHandler{
    @Override
    public void join(String meetingCode) {
        try {
            Desktop.getDesktop().browse(new URL(format("https://zoom.us/j/%s",
                    meetingCode)).toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
