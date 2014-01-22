package PrototypePattern;

public class AdvTemplate
{
    private String advSubject = "xx银行国庆信用卡抽奖";

    private String advContext = "抽奖活动通知:....";

    public final String getAdvSubject()
    {
        return advSubject;
    }

    public final void setAdvSubject(String advSubject)
    {
        this.advSubject = advSubject;
    }

    public final String getAdvContext()
    {
        return advContext;
    }

    public final void setAdvContext(String advContext)
    {
        this.advContext = advContext;
    }

}
