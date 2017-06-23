package safeUnwrap;

public class AnotherConsumer {

    public int getAmount(Model model){
        Model myModel =  model;

        return myModel.getAmount();
    }
}
