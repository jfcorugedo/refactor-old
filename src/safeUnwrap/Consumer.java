package safeUnwrap;

public class Consumer {

    public String getColor(Model model){
        Model myModel = new Wrapper(model);

        return myModel.getWrapped().getColor();
    }
}
