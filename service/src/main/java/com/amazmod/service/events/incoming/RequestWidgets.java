package com.amazmod.service.events.incoming;

import com.huami.watch.transport.DataBundle;

public class RequestWidgets {

    private DataBundle dataBundle;

    public RequestWidgets(DataBundle dataBundle) {
        this.dataBundle = dataBundle;
    }

    public DataBundle getDataBundle() {
        return dataBundle;
    }
}