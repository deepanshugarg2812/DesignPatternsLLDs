package com.chainofresponsiblity;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String type, String str) {
        if (type.equals("info")) {
            System.out.println(str);
        } else {
            super.log(type, str);
        }
    }
}
