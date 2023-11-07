package com.chainofresponsiblity;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String type, String str) {
        if (type.equals("debug")) {
            System.out.println(str);
        } else {
            super.log(type, str);
        }
    }
}
