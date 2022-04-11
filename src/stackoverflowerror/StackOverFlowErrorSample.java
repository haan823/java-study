package stackoverflowerror;

public class StackOverFlowErrorSample {
    public static void main(String[] args) {
        StackOverFlowErrorSample stackOverFlowErrorSample = new StackOverFlowErrorSample();
        stackOverFlowErrorSample.recursiveMethod(0);
    }

    private void recursiveMethod(int cnt) {
        System.out.println(cnt);
        recursiveMethod(cnt + 1);
    }
}
