package safeUnwrap;

public class AnotherConsumer {

    public int getAmount(Model model){
        Model myModel = (Wrapper) model;

        return myModel.getAmount();
    }
}
