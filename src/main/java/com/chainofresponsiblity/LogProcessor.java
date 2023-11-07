package com.chainofresponsiblity;

public abstract class LogProcessor {
    private LogProcessor nextLogger;

    public LogProcessor(LogProcessor nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String type, String str) {
        if(nextLogger!=null){
            nextLogger.log(type, str);
        }
    }
}
