package com.judy.sessionclustering.common;

public class SingleApiResponse extends ApiResponse {

    public SingleApiResponse(Object data) {
        this.data = data;
    }

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
