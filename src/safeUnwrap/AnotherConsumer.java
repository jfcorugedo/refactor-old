package safeUnwrap;

public class AnotherConsumer {

    public int getAmount(Model model){
        Model myModel = new Wrapper(model);

        return myModel.getAmount();
    }
}
