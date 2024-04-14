package BehavioralPatterns.Strategy;

public class Context {
    IOption option;

    public void setOption(IOption option) {
        this.option = option;
    }

    public void showOption(String s1, String s2) {
        option.myOption(s1, s2);
    }
}