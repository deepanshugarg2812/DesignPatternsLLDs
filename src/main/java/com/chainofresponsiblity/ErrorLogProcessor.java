package com.chainofresponsiblity;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String type, String str) {
        if (type.equals("error")) {
            System.out.println(str);
        } else {
            super.log(type, str);
        }
    }
}
