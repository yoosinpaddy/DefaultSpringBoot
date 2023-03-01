package com.trichain.market.api.util;

import java.time.Instant;

public class MncTS {
    private final long ts;

    MncTS(){
        this.ts= Instant.now().toEpochMilli();
    }

    public long getTs() {
        return ts;
    }
}
