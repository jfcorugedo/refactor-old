package safeUnwrap;

public class AnotherConsumer {

    public int getAmount(Model model){
        Model myModel = Wrapper.createWrapper(model);

        return myModel.getAmount();
    }
}
