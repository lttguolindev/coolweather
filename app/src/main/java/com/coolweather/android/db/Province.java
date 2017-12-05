package com.coolweather.android.db;

/**
 * Created by lenovo on 2017/12/3.
 */

public class Province {
    private int id;
    private String provinceName;
    private int provonceCode;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProvinceName()
    {
        return provinceName;
    }

    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }

    public int getProvonceCode()
    {
        return provonceCode;
    }

    public void setProvonceCode(int provonceCode)
    {
        this.provonceCode = provonceCode;
    }

    public static void save() {
    }
}
