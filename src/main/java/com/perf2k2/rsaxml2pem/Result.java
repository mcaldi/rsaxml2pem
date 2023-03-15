package com.perf2k2.rsaxml2pem;

public class Result {
    private int keyType;
    private String content;

    public Result(int keyType, String content) {
        this.keyType = keyType;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public boolean isPrivateKey() {
        return keyType == 1;
    }
}
